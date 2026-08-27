import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dax extends czn {
   public static final String a = "SkullOwner";
   public static final String b = "note_block_sound";
   @Nullable
   private static alg c;
   @Nullable
   private static MinecraftSessionService d;
   @Nullable
   private static Executor e;
   @Nullable
   private GameProfile f;
   @Nullable
   private acq g;
   private int h;
   private boolean i;

   public dax(gu $$0, dcb $$1) {
      super(czp.p, $$0, $$1);
   }

   public static void a(adh $$0, Executor $$1) {
      c = $$0.e();
      d = $$0.b();
      e = $$1;
   }

   public static void c() {
      c = null;
      d = null;
      e = null;
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (this.f != null) {
         qr $$1 = new qr();
         rd.a($$1, this.f);
         $$0.a("SkullOwner", $$1);
      }

      if (this.g != null) {
         $$0.a("note_block_sound", this.g.toString());
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("SkullOwner", 10)) {
         this.a(rd.a($$0.p("SkullOwner")));
      } else if ($$0.b("ExtraType", 8)) {
         String $$1 = $$0.l("ExtraType");
         if (!aps.b($$1)) {
            this.a(new GameProfile(null, $$1));
         }
      }

      if ($$0.b("note_block_sound", 8)) {
         this.g = acq.a($$0.l("note_block_sound"));
      }
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, dax $$3) {
      if ($$0.B($$1)) {
         $$3.i = true;
         $$3.h++;
      } else {
         $$3.i = false;
      }
   }

   public float a(float $$0) {
      return this.i ? (float)this.h + $$0 : (float)this.h;
   }

   @Nullable
   public GameProfile d() {
      return this.f;
   }

   @Nullable
   public acq f() {
      return this.g;
   }

   public uz g() {
      return uz.a(this);
   }

   @Override
   public qr ao_() {
      return this.o();
   }

   public void a(@Nullable GameProfile $$0) {
      synchronized (this) {
         this.f = $$0;
      }

      this.i();
   }

   private void i() {
      a(this.f, $$0 -> {
         this.f = $$0;
         this.e();
      });
   }

   public static void a(@Nullable GameProfile $$0, Consumer<GameProfile> $$1) {
      if ($$0 != null && !aps.b($$0.getName()) && (!$$0.isComplete() || !$$0.getProperties().containsKey("textures")) && c != null && d != null) {
         c.a($$0.getName(), $$2 -> ac.f().execute(() -> ac.a($$2, $$1xxx -> {
                  Property $$2xx = (Property)Iterables.getFirst($$1xxx.getProperties().get("textures"), null);
                  if ($$2xx == null) {
                     MinecraftSessionService $$3 = d;
                     if ($$3 == null) {
                        return;
                     }

                     $$1xxx = $$3.fillProfileProperties($$1xxx, true);
                  }

                  GameProfile $$4 = $$1xxx;
                  Executor $$5 = e;
                  if ($$5 != null) {
                     $$5.execute(() -> {
                        alg $$2xxx = c;
                        if ($$2xxx != null) {
                           $$2xxx.a($$4);
                           $$1.accept($$4);
                        }
                     });
                  }
               }, () -> {
                  Executor $$2xx = e;
                  if ($$2xx != null) {
                     $$2xx.execute(() -> $$1.accept($$0));
                  }
               })));
      } else {
         $$1.accept($$0);
      }
   }
}
