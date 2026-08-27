import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class dea extends dcq {
   public static final String a = "SkullOwner";
   public static final String b = "note_block_sound";
   @Nullable
   private static any c;
   @Nullable
   private static MinecraftSessionService d;
   @Nullable
   private static Executor e;
   private static final Executor f = $$0 -> {
      Executor $$1 = e;
      if ($$1 != null) {
         $$1.execute($$0);
      }
   };
   @Nullable
   private GameProfile g;
   @Nullable
   private aeu h;
   private int i;
   private boolean j;

   public dea(gw $$0, dfe $$1) {
      super(dcs.p, $$0, $$1);
   }

   public static void a(afm $$0, Executor $$1) {
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
   protected void b(qu $$0) {
      super.b($$0);
      if (this.g != null) {
         qu $$1 = new qu();
         rg.a($$1, this.g);
         $$0.a("SkullOwner", $$1);
      }

      if (this.h != null) {
         $$0.a("note_block_sound", this.h.toString());
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("SkullOwner", 10)) {
         this.a(rg.a($$0.p("SkullOwner")));
      } else if ($$0.b("ExtraType", 8)) {
         String $$1 = $$0.l("ExtraType");
         if (!asl.b($$1)) {
            this.a(new GameProfile(ac.d, $$1));
         }
      }

      if ($$0.b("note_block_sound", 8)) {
         this.h = aeu.a($$0.l("note_block_sound"));
      }
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, dea $$3) {
      if ($$2.b(czs.a) && $$2.c(czs.a)) {
         $$3.j = true;
         $$3.i++;
      } else {
         $$3.j = false;
      }
   }

   public float a(float $$0) {
      return this.j ? (float)this.i + $$0 : (float)this.i;
   }

   @Nullable
   public GameProfile d() {
      return this.g;
   }

   @Nullable
   public aeu f() {
      return this.h;
   }

   public xa g() {
      return xa.a(this);
   }

   @Override
   public qu an_() {
      return this.o();
   }

   public void a(@Nullable GameProfile $$0) {
      synchronized (this) {
         this.g = $$0;
      }

      this.i();
   }

   private void i() {
      if (this.g != null && !ac.b(this.g.getName()) && !c(this.g)) {
         a(this.g.getName()).thenAcceptAsync($$0 -> {
            this.g = $$0.orElse(this.g);
            this.e();
         }, f);
      } else {
         this.e();
      }
   }

   @Nullable
   public static GameProfile d(qu $$0) {
      if ($$0.b("SkullOwner", 10)) {
         return rg.a($$0.p("SkullOwner"));
      } else {
         if ($$0.b("SkullOwner", 8)) {
            String $$1 = $$0.l("SkullOwner");
            if (!ac.b($$1)) {
               $$0.r("SkullOwner");
               a($$0, $$1);
            }
         }

         return null;
      }
   }

   public static void e(qu $$0) {
      String $$1 = $$0.l("SkullOwner");
      if (!ac.b($$1)) {
         a($$0, $$1);
      }
   }

   private static void a(qu $$0, String $$1) {
      a($$1).thenAccept($$2 -> $$0.a("SkullOwner", rg.a(new qu(), $$2.orElse(new GameProfile(ac.d, $$1)))));
   }

   private static CompletableFuture<Optional<GameProfile>> a(String $$0) {
      any $$1 = c;
      return $$1 == null
         ? CompletableFuture.completedFuture(Optional.empty())
         : $$1.b($$0)
            .thenCompose($$0x -> $$0x.isPresent() ? b((GameProfile)$$0x.get()) : CompletableFuture.completedFuture(Optional.empty()))
            .thenApplyAsync($$0x -> {
               any $$1x = c;
               if ($$1x != null) {
                  $$0x.ifPresent($$1x::a);
                  return $$0x;
               } else {
                  return Optional.empty();
               }
            }, f);
   }

   private static CompletableFuture<Optional<GameProfile>> b(GameProfile $$0) {
      return c($$0) ? CompletableFuture.completedFuture(Optional.of($$0)) : CompletableFuture.supplyAsync(() -> {
         MinecraftSessionService $$1 = d;
         if ($$1 != null) {
            ProfileResult $$2 = $$1.fetchProfile($$0.getId(), true);
            return $$2 == null ? Optional.of($$0) : Optional.of($$2.profile());
         } else {
            return Optional.empty();
         }
      }, ac.f());
   }

   private static boolean c(GameProfile $$0) {
      return $$0.getProperties().containsKey("textures");
   }
}
