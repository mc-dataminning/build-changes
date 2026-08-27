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

public class ffj extends ffe {
   private static final Logger c = LogUtils.getLogger();
   private static final vq k = vq.c("narrator.screen.title");
   public static final vq a = vq.c("title.credits");
   public static final fva b = new fva(new aiy("textures/gui/title/background/panorama"));
   private static final aiy l = new aiy("textures/gui/title/background/panorama_overlay.png");
   private static final String m = "Demo_World";
   @Nullable
   private fal n;
   private ezh o;
   @Nullable
   private euz p;
   private final fvo q = new fvo(b);
   private final boolean r;
   private long t;
   @Nullable
   private ffj.a u;
   private final ezy v;

   public ffj() {
      this(false);
   }

   public ffj(boolean $$0) {
      this($$0, null);
   }

   public ffj(boolean $$0, @Nullable ezy $$1) {
      super(k);
      this.r = $$0;
      this.v = Objects.requireNonNullElseGet($$1, () -> new ezy(false));
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

   public static CompletableFuture<Void> a(ggv $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(ezy.a, $$1), $$0.a(ezy.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
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

      fam $$4 = this.d(ezl.a(20, $$0x -> this.f.a(new fen(this, this.f.m, this.f.ae())), true));
      $$4.c(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(ezh.a(vq.c("menu.options"), $$0x -> this.f.a(new fev(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(ezh.a(vq.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      fam $$5 = this.d(ezl.b(20, $$0x -> this.f.a(new fdq(this, this.f.m)), true));
      $$5.c(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new faf($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new feb(this)), this.i));
      if (this.p == null) {
         this.p = new euz();
      }

      if (this.o()) {
         this.p.b(this.f, this.g, this.h);
      }

      if (!this.f.af()) {
         this.u = new ffj.a(this.i, faa.a(this.i, vq.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(ezh.a(vq.c("menu.singleplayer"), $$0x -> this.f.a(new fka(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      vq $$2 = this.E();
      boolean $$3 = $$2 == null;
      fas $$4 = $$2 != null ? fas.a($$2) : null;
      this.d(ezh.a(vq.c("menu.multiplayer"), $$0x -> {
         ffe $$1x = (ffe)(this.f.m.v ? new fic(this) : new fie(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.d(ezh.a(vq.c("menu.online"), $$0x -> this.f.a(new esl(this))).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private vq E() {
      if (this.f.D()) {
         return null;
      } else if (this.f.G()) {
         return vq.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.F();
         if ($$0 != null) {
            return $$0.expires() != null ? vq.c("title.multiplayer.disabled.banned.temporary") : vq.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return vq.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.H();
      this.d(ezh.a(vq.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.w().a("Demo_World", MinecraftServer.d, drm.b, eau::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.o = this.d(
         ezh.a(
               vq.c("menu.resetdemo"),
               $$0x -> {
                  eil $$1x = this.f.l();

                  try (eil.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new fdx(
                                 this::c,
                                 vq.c("selectWorld.deleteQuestion"),
                                 vq.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 vq.c("selectWorld.deleteButton"),
                                 vp.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     fbp.a(this.f, "Demo_World");
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
         try (eil.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         fbp.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      if (this.t == 0L && this.r) {
         this.t = ac.b();
      }

      float $$4 = this.r ? (float)(ac.b() - this.t) / 1000.0F : 1.0F;
      this.q.a($$3, awh.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.r ? (float)awh.f(awh.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.r ? awh.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.v.a($$0, this.g, $$5);
      int $$6 = awh.f($$5 * 255.0F) << 24;
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

         if (exh.e().a()) {
            $$7 = $$7 + ghz.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (fbd $$8 : this.l()) {
            if ($$8 instanceof ezf) {
               ((ezf)$$8).a($$5);
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
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
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
         try (eil.c $$1 = this.f.l().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            fbp.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(eys a, faa b, int c, int d) {
      public void a(eyu $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
