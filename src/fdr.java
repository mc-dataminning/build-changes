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

public class fdr extends fdm {
   private static final Logger c = LogUtils.getLogger();
   private static final vg k = vg.c("narrator.screen.title");
   public static final vg a = vg.c("title.credits");
   public static final fth b = new fth(new ahh("textures/gui/title/background/panorama"));
   private static final ahh l = new ahh("textures/gui/title/background/panorama_overlay.png");
   private static final String m = "Demo_World";
   @Nullable
   private eyv n;
   private exr o;
   @Nullable
   private etj p;
   private final ftv q = new ftv(b);
   private final boolean r;
   private long t;
   @Nullable
   private fdr.a u;
   private final eyi v;

   public fdr() {
      this(false);
   }

   public fdr(boolean $$0) {
      this($$0, null);
   }

   public fdr(boolean $$0, @Nullable eyi $$1) {
      super(k);
      this.r = $$0;
      this.v = Objects.requireNonNullElseGet($$1, () -> new eyi(false));
   }

   private boolean o() {
      return this.p != null;
   }

   @Override
   public void e() {
      if (this.o()) {
         this.p.e();
      }

      this.f.aS().a(this);
   }

   public static CompletableFuture<Void> a(gfc $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(eyi.a, $$1), $$0.a(eyi.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean aN_() {
      return false;
   }

   @Override
   protected void aP_() {
      if (this.n == null) {
         this.n = this.f.aI().a();
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

      eyw $$4 = this.d(exv.a(20, $$0x -> this.f.a(new fcv(this, this.f.m, this.f.ae())), true));
      $$4.c(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(exr.a(vg.c("menu.options"), $$0x -> this.f.a(new fdd(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(exr.a(vg.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      eyw $$5 = this.d(exv.b(20, $$0x -> this.f.a(new fby(this, this.f.m)), true));
      $$5.c(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new eyp($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new fcj(this)), this.i));
      if (this.p == null) {
         this.p = new etj();
      }

      if (this.o()) {
         this.p.b(this.f, this.g, this.h);
      }

      if (!this.f.af()) {
         this.u = new fdr.a(this.i, eyk.a(this.i, vg.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(exr.a(vg.c("menu.singleplayer"), $$0x -> this.f.a(new fii(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      vg $$2 = this.E();
      boolean $$3 = $$2 == null;
      ezc $$4 = $$2 != null ? ezc.a($$2) : null;
      this.d(exr.a(vg.c("menu.multiplayer"), $$0x -> {
         fdm $$1x = (fdm)(this.f.m.v ? new fgk(this) : new fgm(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.d(exr.a(vg.c("menu.online"), $$0x -> this.f.a(new eqv(this))).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private vg E() {
      if (this.f.D()) {
         return null;
      } else if (this.f.G()) {
         return vg.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.F();
         if ($$0 != null) {
            return $$0.expires() != null ? vg.c("title.multiplayer.disabled.banned.temporary") : vg.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return vg.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.H();
      this.d(exr.a(vg.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.w().a("Demo_World", MinecraftServer.e, dpw.b, dze::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.o = this.d(
         exr.a(
               vg.c("menu.resetdemo"),
               $$0x -> {
                  egv $$1x = this.f.l();

                  try (egv.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new fcf(
                                 this::c,
                                 vg.c("selectWorld.deleteQuestion"),
                                 vg.a("selectWorld.deleteWarning", MinecraftServer.e.a()),
                                 vg.c("selectWorld.deleteButton"),
                                 vf.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     ezy.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.o.j = $$2;
   }

   private boolean H() {
      try {
         boolean var2;
         try (egv.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         ezy.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      if (this.t == 0L && this.r) {
         this.t = ac.b();
      }

      float $$4 = this.r ? (float)(ac.b() - this.t) / 1000.0F : 1.0F;
      this.q.a($$3, aup.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.r ? (float)aup.f(aup.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.r ? aup.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.v.a($$0, this.g, $$5);
      int $$6 = aup.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.u != null) {
            this.u.a($$0, $$6);
         }

         if (this.n != null && !this.f.m.c().c()) {
            this.n.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.I()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i());
         }

         if (evr.e().a()) {
            $$7 = $$7 + ggg.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (ezm $$8 : this.l()) {
            if ($$8 instanceof exp) {
               ((exp)$$8).a($$5);
            }
         }

         super.a($$0, $$1, $$2, $$3);
         if (this.o() && $$5 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.p.a($$0, $$1, $$2, $$3);
         }
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.o() && this.p.a($$0, $$1, $$2);
   }

   @Override
   public void k() {
      if (this.p != null) {
         this.p.k();
      }
   }

   @Override
   public void aH_() {
      super.aH_();
      if (this.p != null) {
         this.p.aH_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (egv.c $$1 = this.f.l().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            ezy.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(exc a, eyk b, int c, int d) {
      public void a(exe $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
