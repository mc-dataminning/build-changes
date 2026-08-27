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

public class fbe extends faz {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final uv a = uv.c("title.credits");
   public static final fqn b = new fqn(new agm("textures/gui/title/background/panorama"));
   private static final agm l = new agm("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private ewi m;
   private eve n;
   @Nullable
   private era o;
   private final frb p = new frb(b);
   private final boolean q;
   private long r;
   @Nullable
   private fbe.a t;
   private final evv u;

   public fbe() {
      this(false);
   }

   public fbe(boolean $$0) {
      this($$0, null);
   }

   public fbe(boolean $$0, @Nullable evv $$1) {
      super(uv.c("narrator.screen.title"));
      this.q = $$0;
      this.u = Objects.requireNonNullElseGet($$1, () -> new evv(false));
   }

   private boolean l() {
      return this.o != null;
   }

   @Override
   public void d() {
      if (this.l()) {
         this.o.d();
      }

      this.f.aR().a(this);
   }

   public static CompletableFuture<Void> a(gca $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(evv.a, $$1), $$0.a(evv.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected void aQ_() {
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

      ewj $$4 = this.d(evi.a(20, $$0x -> this.f.a(new fai(this, this.f.m, this.f.ad())), true));
      $$4.b(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(eve.a(uv.c("menu.options"), $$0x -> this.f.a(new faq(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(eve.a(uv.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      ewj $$5 = this.d(evi.b(20, $$0x -> this.f.a(new ezl(this, this.f.m)), true));
      $$5.b(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new ewc($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new ezw(this)), this.i));
      if (this.o == null) {
         this.o = new era();
      }

      if (this.l()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.ae()) {
         this.t = new fbe.a(this.i, evx.a(this.i, uv.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(eve.a(uv.c("menu.singleplayer"), $$0x -> this.f.a(new ffv(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      uv $$2 = this.C();
      boolean $$3 = $$2 == null;
      ewp $$4 = $$2 != null ? ewp.a($$2) : null;
      this.d(eve.a(uv.c("menu.multiplayer"), $$0x -> {
         faz $$1x = (faz)(this.f.m.v ? new fdx(this) : new fdz(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).i = $$3;
      this.d(eve.a(uv.c("menu.online"), $$0x -> this.E()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).i = $$3;
   }

   @Nullable
   private uv C() {
      if (this.f.C()) {
         return null;
      } else if (this.f.F()) {
         return uv.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.E();
         if ($$0 != null) {
            return $$0.expires() != null ? uv.c("title.multiplayer.disabled.banned.temporary") : uv.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return uv.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.D();
      this.d(eve.a(uv.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.w().a("Demo_World", MinecraftServer.e, dnu.b, dxc::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         eve.a(
               uv.c("menu.resetdemo"),
               $$0x -> {
                  ees $$1x = this.f.l();

                  try (ees.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new ezs(
                                 this::c,
                                 uv.c("selectWorld.deleteQuestion"),
                                 uv.a("selectWorld.deleteWarning", MinecraftServer.e.a()),
                                 uv.c("selectWorld.deleteButton"),
                                 uu.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     exl.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.n.i = $$2;
   }

   private boolean D() {
      try {
         boolean var2;
         try (ees.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         exl.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void E() {
      this.f.a(new eom(this));
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      if (this.r == 0L && this.q) {
         this.r = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.r) / 1000.0F : 1.0F;
      this.p.a($$3, atq.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)atq.f(atq.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? atq.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.u.a($$0, this.g, $$5);
      int $$6 = atq.f($$5 * 255.0F) << 24;
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

         if (eti.e().a()) {
            $$7 = $$7 + gdf.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (ewz $$8 : this.i()) {
            if ($$8 instanceof evc) {
               ((evc)$$8).a($$5);
            }
         }

         super.a($$0, $$1, $$2, $$3);
         if (this.l() && $$5 >= 1.0F) {
            RenderSystem.enableDepthTest();
            this.o.a($$0, $$1, $$2, $$3);
         }
      }
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.o.a($$0, $$1, $$2);
   }

   @Override
   public void aH_() {
      if (this.o != null) {
         this.o.aH_();
      }
   }

   @Override
   public void aI_() {
      super.aI_();
      if (this.o != null) {
         this.o.aI_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (ees.c $$1 = this.f.l().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            exl.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(eur a, evx b, int c, int d) {
      public void a(eut $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
