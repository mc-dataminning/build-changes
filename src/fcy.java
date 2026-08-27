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

public class fcy extends fct {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final vd a = vd.c("title.credits");
   public static final fsn b = new fsn(new ahd("textures/gui/title/background/panorama"));
   private static final ahd l = new ahd("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private eyc m;
   private ewy n;
   @Nullable
   private ess o;
   private final ftb p = new ftb(b);
   private final boolean q;
   private long r;
   @Nullable
   private fcy.a t;
   private final exp u;

   public fcy() {
      this(false);
   }

   public fcy(boolean $$0) {
      this($$0, null);
   }

   public fcy(boolean $$0, @Nullable exp $$1) {
      super(vd.c("narrator.screen.title"));
      this.q = $$0;
      this.u = Objects.requireNonNullElseGet($$1, () -> new exp(false));
   }

   private boolean n() {
      return this.o != null;
   }

   @Override
   public void d() {
      if (this.n()) {
         this.o.d();
      }

      this.f.aR().a(this);
   }

   public static CompletableFuture<Void> a(geg $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(exp.a, $$1), $$0.a(exp.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
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
         this.m = this.f.aH().a();
      }

      int $$0 = this.i.a(a);
      int $$1 = this.g - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.h / 4 + 48;
      if (this.f.H()) {
         this.b($$3, 24);
      } else {
         this.a($$3, 24);
      }

      eyd $$4 = this.d(exc.a(20, $$0x -> this.f.a(new fcc(this, this.f.m, this.f.ad())), true));
      $$4.c(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(ewy.a(vd.c("menu.options"), $$0x -> this.f.a(new fck(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(ewy.a(vd.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      eyd $$5 = this.d(exc.b(20, $$0x -> this.f.a(new fbf(this, this.f.m)), true));
      $$5.c(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new exw($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new fbq(this)), this.i));
      if (this.o == null) {
         this.o = new ess();
      }

      if (this.n()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.ae()) {
         this.t = new fcy.a(this.i, exr.a(this.i, vd.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(ewy.a(vd.c("menu.singleplayer"), $$0x -> this.f.a(new fhp(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      vd $$2 = this.C();
      boolean $$3 = $$2 == null;
      eyj $$4 = $$2 != null ? eyj.a($$2) : null;
      this.d(ewy.a(vd.c("menu.multiplayer"), $$0x -> {
         fct $$1x = (fct)(this.f.m.v ? new ffr(this) : new fft(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).j = $$3;
      this.d(ewy.a(vd.c("menu.online"), $$0x -> this.E()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).j = $$3;
   }

   @Nullable
   private vd C() {
      if (this.f.C()) {
         return null;
      } else if (this.f.F()) {
         return vd.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.E();
         if ($$0 != null) {
            return $$0.expires() != null ? vd.c("title.multiplayer.disabled.banned.temporary") : vd.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return vd.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.D();
      this.d(ewy.a(vd.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.w().a("Demo_World", MinecraftServer.e, dph.b, dyp::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         ewy.a(
               vd.c("menu.resetdemo"),
               $$0x -> {
                  egf $$1x = this.f.l();

                  try (egf.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new fbm(
                                 this::c,
                                 vd.c("selectWorld.deleteQuestion"),
                                 vd.a("selectWorld.deleteWarning", MinecraftServer.e.a()),
                                 vd.c("selectWorld.deleteButton"),
                                 vc.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     ezf.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.n.j = $$2;
   }

   private boolean D() {
      try {
         boolean var2;
         try (egf.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         ezf.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void E() {
      this.f.a(new eqe(this));
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      if (this.r == 0L && this.q) {
         this.r = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.r) / 1000.0F : 1.0F;
      this.p.a($$3, aui.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)aui.f(aui.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? aui.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.u.a($$0, this.g, $$5);
      int $$6 = aui.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.t != null) {
            this.t.a($$0, $$6);
         }

         if (this.m != null && !this.f.m.c().c()) {
            this.m.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.H()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i());
         }

         if (eva.e().a()) {
            $$7 = $$7 + gfl.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (eyt $$8 : this.l()) {
            if ($$8 instanceof eww) {
               ((eww)$$8).a($$5);
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
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
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
         try (egf.c $$1 = this.f.l().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            ezf.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(ewk a, exr b, int c, int d) {
      public void a(ewm $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
