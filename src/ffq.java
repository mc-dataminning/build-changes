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

public class ffq extends ffl {
   private static final Logger c = LogUtils.getLogger();
   private static final vq k = vq.c("narrator.screen.title");
   public static final vq a = vq.c("title.credits");
   public static final fvh b = new fvh(new aiy("textures/gui/title/background/panorama"));
   private static final aiy l = new aiy("textures/gui/title/background/panorama_overlay.png");
   private static final String m = "Demo_World";
   @Nullable
   private fas n;
   private ezo o;
   @Nullable
   private evg p;
   private final fvv q = new fvv(b);
   private final boolean r;
   private long t;
   @Nullable
   private ffq.a u;
   private final faf v;

   public ffq() {
      this(false);
   }

   public ffq(boolean $$0) {
      this($$0, null);
   }

   public ffq(boolean $$0, @Nullable faf $$1) {
      super(k);
      this.r = $$0;
      this.v = Objects.requireNonNullElseGet($$1, () -> new faf(false));
   }

   private boolean o() {
      return this.p != null;
   }

   @Override
   public void e() {
      if (this.o()) {
         this.p.e();
      }

      this.f.aT().a(this);
   }

   public static CompletableFuture<Void> a(ghc $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(faf.a, $$1), $$0.a(faf.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean aO_() {
      return false;
   }

   @Override
   protected void aQ_() {
      if (this.n == null) {
         this.n = this.f.aJ().a();
      }

      int $$0 = this.i.a(a);
      int $$1 = this.g - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      if (this.f.J()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      fat $$4 = this.c(ezs.a(20, $$0x -> this.f.a(new feu(this, this.f.m, this.f.af())), true));
      $$4.c(this.g / 2 - 124, $$3 + 72 + 12);
      this.c(ezo.a(vq.c("menu.options"), $$0x -> this.f.a(new ffc(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.c(ezo.a(vq.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      fat $$5 = this.c(ezs.b(20, $$0x -> this.f.a(new fdx(this, this.f.m)), true));
      $$5.c(this.g / 2 + 104, $$3 + 72 + 12);
      this.c(new fam($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new fei(this)), this.i));
      if (this.p == null) {
         this.p = new evg();
      }

      if (this.o()) {
         this.p.b(this.f, this.g, this.h);
      }

      if (!this.f.ag()) {
         this.u = new ffq.a(this.i, fah.a(this.i, vq.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.c(ezo.a(vq.c("menu.singleplayer"), $$0x -> this.f.a(new fkh(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      vq $$2 = this.E();
      boolean $$3 = $$2 == null;
      faz $$4 = $$2 != null ? faz.a($$2) : null;
      this.c(ezo.a(vq.c("menu.multiplayer"), $$0x -> {
         ffl $$1x = (ffl)(this.f.m.v ? new fij(this) : new fil(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.c(ezo.a(vq.c("menu.online"), $$0x -> this.f.a(new ess(this))).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private vq E() {
      if (this.f.E()) {
         return null;
      } else if (this.f.H()) {
         return vq.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.G();
         if ($$0 != null) {
            return $$0.expires() != null ? vq.c("title.multiplayer.disabled.banned.temporary") : vq.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return vq.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.H();
      this.c(ezo.a(vq.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.w().a("Demo_World", MinecraftServer.d, drt.b, ebb::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.o = this.c(
         ezo.a(
               vq.c("menu.resetdemo"),
               $$0x -> {
                  eis $$1x = this.f.l();

                  try (eis.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new fee(
                                 this::c,
                                 vq.c("selectWorld.deleteQuestion"),
                                 vq.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 vq.c("selectWorld.deleteButton"),
                                 vp.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fbw.a(this.f, "Demo_World");
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
         try (eis.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         fbw.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      if (this.t == 0L && this.r) {
         this.t = ac.b();
      }

      float $$4 = this.r ? (float)(ac.b() - this.t) / 1000.0F : 1.0F;
      this.q.a($$3, awi.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.r ? (float)awi.f(awi.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.r ? awi.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.v.a($$0, this.g, $$5);
      int $$6 = awi.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.u != null) {
            this.u.a($$0, $$6);
         }

         if (this.n != null && !this.f.m.c().c()) {
            this.n.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.J()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i());
         }

         if (exo.e().a()) {
            $$7 = $$7 + gig.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (fbk $$8 : this.l()) {
            if ($$8 instanceof ezm) {
               ((ezm)$$8).a($$5);
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
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
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
   public void aI_() {
      super.aI_();
      if (this.p != null) {
         this.p.aI_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (eis.c $$1 = this.f.l().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            fbw.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(eyz a, fah b, int c, int d) {
      public void a(ezb $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
