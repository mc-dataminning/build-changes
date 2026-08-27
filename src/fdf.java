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

public class fdf extends fda {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final vf a = vf.c("title.credits");
   public static final fsu b = new fsu(new ahg("textures/gui/title/background/panorama"));
   private static final ahg l = new ahg("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private eyj m;
   private exf n;
   @Nullable
   private esz o;
   private final fti p = new fti(b);
   private final boolean q;
   private long r;
   @Nullable
   private fdf.a t;
   private final exw u;

   public fdf() {
      this(false);
   }

   public fdf(boolean $$0) {
      this($$0, null);
   }

   public fdf(boolean $$0, @Nullable exw $$1) {
      super(vf.c("narrator.screen.title"));
      this.q = $$0;
      this.u = Objects.requireNonNullElseGet($$1, () -> new exw(false));
   }

   private boolean n() {
      return this.o != null;
   }

   @Override
   public void d() {
      if (this.n()) {
         this.o.d();
      }

      this.f.aS().a(this);
   }

   public static CompletableFuture<Void> a(gen $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(exw.a, $$1), $$0.a(exw.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Override
   protected void aN_() {
      if (this.m == null) {
         this.m = this.f.aI().a();
      }

      int $$0 = this.i.a(a);
      int $$1 = this.g - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      if (this.f.I()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      eyk $$4 = this.d(exj.a(20, $$0x -> this.f.a(new fcj(this, this.f.m, this.f.ae())), true));
      $$4.c(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(exf.a(vf.c("menu.options"), $$0x -> this.f.a(new fcr(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(exf.a(vf.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      eyk $$5 = this.d(exj.b(20, $$0x -> this.f.a(new fbm(this, this.f.m)), true));
      $$5.c(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new eyd($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new fbx(this)), this.i));
      if (this.o == null) {
         this.o = new esz();
      }

      if (this.n()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.af()) {
         this.t = new fdf.a(this.i, exy.a(this.i, vf.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(exf.a(vf.c("menu.singleplayer"), $$0x -> this.f.a(new fhw(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      vf $$2 = this.D();
      boolean $$3 = $$2 == null;
      eyq $$4 = $$2 != null ? eyq.a($$2) : null;
      this.d(exf.a(vf.c("menu.multiplayer"), $$0x -> {
         fda $$1x = (fda)(this.f.m.v ? new ffy(this) : new fga(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.d(exf.a(vf.c("menu.online"), $$0x -> this.H()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private vf D() {
      if (this.f.D()) {
         return null;
      } else if (this.f.G()) {
         return vf.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.F();
         if ($$0 != null) {
            return $$0.expires() != null ? vf.c("title.multiplayer.disabled.banned.temporary") : vf.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return vf.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.E();
      this.d(exf.a(vf.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.w().a("Demo_World", MinecraftServer.e, dpn.b, dyv::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         exf.a(
               vf.c("menu.resetdemo"),
               $$0x -> {
                  egl $$1x = this.f.l();

                  try (egl.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new fbt(
                                 this::c,
                                 vf.c("selectWorld.deleteQuestion"),
                                 vf.a("selectWorld.deleteWarning", MinecraftServer.e.a()),
                                 vf.c("selectWorld.deleteButton"),
                                 ve.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     ezm.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.n.j = $$2;
   }

   private boolean E() {
      try {
         boolean var2;
         try (egl.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         ezm.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void H() {
      this.f.a(new eql(this));
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      if (this.r == 0L && this.q) {
         this.r = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.r) / 1000.0F : 1.0F;
      this.p.a($$3, aun.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)aun.f(aun.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? aun.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.u.a($$0, this.g, $$5);
      int $$6 = aun.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.t != null) {
            this.t.a($$0, $$6);
         }

         if (this.m != null && !this.f.m.c().c()) {
            this.m.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.I()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i());
         }

         if (evh.e().a()) {
            $$7 = $$7 + gfr.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (eza $$8 : this.l()) {
            if ($$8 instanceof exd) {
               ((exd)$$8).a($$5);
            }
         }

         super.a($$0, $$1, $$2, $$3);
         if (this.n() && $$5 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.o.a($$0, $$1, $$2, $$3);
         }
      }
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.n() && this.o.a($$0, $$1, $$2);
   }

   @Override
   public void j() {
      if (this.o != null) {
         this.o.j();
      }
   }

   @Override
   public void aF_() {
      super.aF_();
      if (this.o != null) {
         this.o.aF_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (egl.c $$1 = this.f.l().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            ezm.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(ewr a, exy b, int c, int d) {
      public void a(ewt $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
