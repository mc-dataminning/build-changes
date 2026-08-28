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

public class fof extends fod {
   private static final Logger a = LogUtils.getLogger();
   private static final wz b = wz.c("narrator.screen.title");
   private static final wz c = wz.c("title.credits");
   private static final String r = "Demo_World";
   private static final float s = 2000.0F;
   @Nullable
   private fjq u;
   private fim v;
   @Nullable
   private fef w;
   private float x = 1.0F;
   private boolean y;
   private long z;
   private final fjd A;

   public fof() {
      this(false);
   }

   public fof(boolean $$0) {
      this($$0, null);
   }

   public fof(boolean $$0, @Nullable fjd $$1) {
      super(b);
      this.y = $$0;
      this.A = Objects.requireNonNullElseGet($$1, () -> new fjd(false));
   }

   private boolean m() {
      return this.w != null;
   }

   @Override
   public void e() {
      if (this.m()) {
         this.w.e();
      }
   }

   public static CompletableFuture<Void> a(gqm $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(fjd.a, $$1), $$0.a(fjd.c, $$1), $$0.a(gfb.a, $$1), d.a($$0, $$1));
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   @Override
   protected void aT_() {
      if (this.u == null) {
         this.u = this.l.aJ().a();
      }

      int $$0 = this.o.a(c);
      int $$1 = this.m - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.n / 4 + 48;
      if (this.l.K()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      fjr $$4 = this.c(fiq.a(20, $$0x -> this.l.a(new frd(this, this.l.m, this.l.ag())), true));
      $$4.c(this.m / 2 - 124, $$3 + 72 + 12);
      this.c(fim.a(wz.c("menu.options"), $$0x -> this.l.a(new frg(this, this.l.m))).a(this.m / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(fim.a(wz.c("menu.quit"), $$0x -> this.l.q()).a(this.m / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      fjr $$5 = this.c(fiq.b(20, $$0x -> this.l.a(new fra(this, this.l.m)), true));
      $$5.c(this.m / 2 + 104, $$3 + 72 + 12);
      this.c(new fjk($$1, this.n - 10, $$0, 10, c, $$0x -> this.l.a(new fnf(this)), this.o));
      if (this.w == null) {
         this.w = new fef();
      }

      if (this.m()) {
         this.w.b(this.l, this.m, this.n);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(fim.a(wz.c("menu.singleplayer"), $$0x -> this.l.a(new fti(this))).a(this.m / 2 - 100, $$0, 200, 20).a());
      wz $$2 = this.C();
      boolean $$3 = $$2 == null;
      fjx $$4 = $$2 != null ? fjx.a($$2) : null;
      this.c(fim.a(wz.c("menu.multiplayer"), $$0x -> {
         fod $$1x = (fod)(this.l.m.v ? new fqt(this) : new fqu(this));
         this.l.a($$1x);
      }).a(this.m / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(fim.a(wz.c("menu.online"), $$0x -> this.l.a(new fbt(this))).a(this.m / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private wz C() {
      if (this.l.F()) {
         return null;
      } else if (this.l.I()) {
         return wz.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.l.H();
         if ($$0 != null) {
            return $$0.expires() != null ? wz.c("title.multiplayer.disabled.banned.temporary") : wz.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return wz.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.D();
      this.c(fim.a(wz.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.l.x().a("Demo_World", () -> this.l.a(this));
         } else {
            this.l.x().a("Demo_World", MinecraftServer.d, dzw.b, ejh::a, this);
         }
      }).a(this.m / 2 - 100, $$0, 200, 20).a());
      this.v = this.c(
         fim.a(
               wz.c("menu.resetdemo"),
               $$0x -> {
                  erf $$1x = this.l.m();

                  try (erf.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.l
                           .a(
                              new fnb(
                                 this::c,
                                 wz.c("selectWorld.deleteQuestion"),
                                 wz.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 wz.c("selectWorld.deleteButton"),
                                 wy.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fku.a(this.l, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.m / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.v.j = $$2;
   }

   private boolean D() {
      try {
         boolean var2;
         try (erf.c $$0 = this.l.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         fku.a(this.l, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      if (this.z == 0L && this.y) {
         this.z = ad.c();
      }

      float $$4 = 1.0F;
      if (this.y) {
         float $$5 = (float)(ad.c() - this.z) / 2000.0F;
         if ($$5 > 1.0F) {
            this.y = false;
            this.x = 1.0F;
         } else {
            $$5 = ayo.a($$5, 0.0F, 1.0F);
            $$4 = ayo.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
            this.x = ayo.b($$5, 0.0F, 0.5F, 0.0F, 1.0F);
         }

         this.b($$4);
      }

      this.a($$0, $$3);
      int $$6 = ayo.f($$4 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         super.a($$0, $$1, $$2, $$3);
         this.A.a($$0, this.m, $$4);
         if (this.u != null && !this.l.m.c().c()) {
            this.u.a($$0, this.m, this.o, $$6);
         }

         String $$7 = "Minecraft " + ab.b().c();
         if (this.l.K()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.l.j()) ? "" : "/" + this.l.j());
         }

         if (fgo.e().a()) {
            $$7 = $$7 + grr.a("menu.modded");
         }

         $$0.b(this.o, $$7, 2, this.n - 10, 16777215 | $$6);
         if (this.m() && $$4 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.w.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void b(float $$0) {
      for (fki $$1 : this.aK_()) {
         if ($$1 instanceof fik $$2) {
            $$2.a($$0);
         }
      }
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   protected void a(fhz $$0, float $$1) {
      e.a($$0, this.m, this.n, this.x, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.m() && this.w.a($$0, $$1, $$2);
   }

   @Override
   public void j() {
      if (this.w != null) {
         this.w.j();
      }
   }

   @Override
   public void aL_() {
      super.aL_();
      if (this.w != null) {
         this.w.aL_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (erf.c $$1 = this.l.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            fku.b(this.l, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.l.a(this);
   }
}
