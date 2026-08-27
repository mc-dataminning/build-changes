import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fou extends fon {
   private static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("narrator.screen.title");
   private static final xe c = xe.c("title.credits");
   private static final String d = "Demo_World";
   private static final float r = 2000.0F;
   @Nullable
   private fjr s;
   private fin u;
   @Nullable
   private feb v;
   private float w = 1.0F;
   private boolean x;
   private long y;
   @Nullable
   private fou.a z;
   private final fje A;

   public fou() {
      this(false);
   }

   public fou(boolean $$0) {
      this($$0, null);
   }

   public fou(boolean $$0, @Nullable fje $$1) {
      super(b);
      this.x = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fje(false));
   }

   private boolean B() {
      return this.v != null;
   }

   @Override
   public void e() {
      if (this.B()) {
         this.v.e();
      }

      this.m.aV().a(this);
   }

   public static CompletableFuture<Void> a(gqz $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fje.a, $$1), $$0.a(gfi.a, $$1), e.a($$0, $$1));
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aN_() {
      if (this.s == null) {
         this.s = this.m.aL().a();
      }

      int $$0 = this.p.a(c);
      int $$1 = this.n - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.o / 4 + 48;
      if (this.m.K()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      fjs $$4 = this.c(fir.a(20, $$0x -> this.m.a(new fnv(this, this.m.m, this.m.ag())), true));
      $$4.c(this.n / 2 - 124, $$3 + 72 + 12);
      this.c(fin.a(xe.c("menu.options"), $$0x -> this.m.a(new fod(this, this.m.m))).a(this.n / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(fin.a(xe.c("menu.quit"), $$0x -> this.m.q()).a(this.n / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      fjs $$5 = this.c(fir.b(20, $$0x -> this.m.a(new fmx(this, this.m.m)), true));
      $$5.c(this.n / 2 + 104, $$3 + 72 + 12);
      this.c(new fjl($$1, this.o - 10, $$0, 10, c, $$0x -> this.m.a(new fni(this)), this.p));
      if (this.v == null) {
         this.v = new feb();
      }

      if (this.B()) {
         this.v.b(this.m, this.n, this.o);
      }

      if (!this.m.ah()) {
         this.z = new fou.a(this.p, fjg.a(this.p, xe.c("title.32bit.deprecation"), 350, 2), this.n / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(fin.a(xe.c("menu.singleplayer"), $$0x -> this.m.a(new ftn(this))).a(this.n / 2 - 100, $$0, 200, 20).a());
      xe $$2 = this.C();
      boolean $$3 = $$2 == null;
      fjy $$4 = $$2 != null ? fjy.a($$2) : null;
      this.c(fin.a(xe.c("menu.multiplayer"), $$0x -> {
         fon $$1x = (fon)(this.m.m.v ? new frp(this) : new frr(this));
         this.m.a($$1x);
      }).a(this.n / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(fin.a(xe.c("menu.online"), $$0x -> this.m.a(new fbn(this))).a(this.n / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private xe C() {
      if (this.m.F()) {
         return null;
      } else if (this.m.I()) {
         return xe.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.m.H();
         if ($$0 != null) {
            return $$0.expires() != null ? xe.c("title.multiplayer.disabled.banned.temporary") : xe.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return xe.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.D();
      this.c(fin.a(xe.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.m.x().a("Demo_World", () -> this.m.a(this));
         } else {
            this.m.x().a("Demo_World", MinecraftServer.d, dzs.b, ejj::a, this);
         }
      }).a(this.n / 2 - 100, $$0, 200, 20).a());
      this.u = this.c(
         fin.a(
               xe.c("menu.resetdemo"),
               $$0x -> {
                  erf $$1x = this.m.m();

                  try (erf.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.m
                           .a(
                              new fne(
                                 this::c,
                                 xe.c("selectWorld.deleteQuestion"),
                                 xe.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 xe.c("selectWorld.deleteButton"),
                                 xd.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fkv.a(this.m, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.n / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.u.j = $$2;
   }

   private boolean D() {
      try {
         boolean var2;
         try (erf.c $$0 = this.m.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fkv.a(this.m, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      if (this.y == 0L && this.x) {
         this.y = ad.b();
      }

      float $$4 = 1.0F;
      if (this.x) {
         float $$5 = (float)(ad.b() - this.y) / 2000.0F;
         if ($$5 > 1.0F) {
            this.x = false;
            this.w = 1.0F;
         } else {
            $$5 = aym.a($$5, 0.0F, 1.0F);
            $$4 = aym.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.w = aym.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);

            for (fkj $$6 : this.aE_()) {
               if ($$6 instanceof fil $$7) {
                  $$7.a($$4);
               }
            }
         }
      }

      this.a($$0, $$3);
      int $$8 = aym.f($$4 * 255.0F) << 24;
      if (($$8 & -67108864) != 0) {
         super.a($$0, $$1, $$2, $$3);
         this.A.a($$0, this.n, $$4);
         if (this.z != null) {
            this.z.a($$0, $$8);
         }

         if (this.s != null && !this.m.m.c().c()) {
            this.s.a($$0, this.n, this.p, $$8);
         }

         String $$9 = "Minecraft " + ab.b().c();
         if (this.m.K()) {
            $$9 = $$9 + " Demo";
         } else {
            $$9 = $$9 + ("release".equalsIgnoreCase(this.m.j()) ? "" : "/" + this.m.j());
         }

         if (fgj.e().a()) {
            $$9 = $$9 + gse.a("menu.modded");
         }

         $$0.b(this.p, $$9, 2, this.o - 10, 16777215 | $$8);
         if (this.B() && $$4 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.v.a($$0, $$1, $$2, $$3);
         }
      }
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fia $$0, float $$1) {
      f.a($$0, this.n, this.o, this.w, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.B() && this.v.a($$0, $$1, $$2);
   }

   @Override
   public void j() {
      if (this.v != null) {
         this.v.j();
      }
   }

   @Override
   public void aF_() {
      super.aF_();
      if (this.v != null) {
         this.v.aF_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (erf.c $$1 = this.m.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fkv.b(this.m, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.m.a(this);
   }

   static record a(fhy a, fjg b, int c, int d) {
      public void a(fia $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
