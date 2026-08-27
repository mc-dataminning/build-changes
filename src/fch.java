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

public class fch extends fcc {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final vb a = vb.c("title.credits");
   public static final frw b = new frw(new agt("textures/gui/title/background/panorama"));
   private static final agt l = new agt("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private exl m;
   private ewh n;
   @Nullable
   private esc o;
   private final fsk p = new fsk(b);
   private final boolean q;
   private long r;
   @Nullable
   private fch.a t;
   private final ewy u;

   public fch() {
      this(false);
   }

   public fch(boolean $$0) {
      this($$0, null);
   }

   public fch(boolean $$0, @Nullable ewy $$1) {
      super(vb.c("narrator.screen.title"));
      this.q = $$0;
      this.u = Objects.requireNonNullElseGet($$1, () -> new ewy(false));
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

   public static CompletableFuture<Void> a(gdp $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(ewy.a, $$1), $$0.a(ewy.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aP_() {
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

      exm $$4 = this.d(ewl.a(20, $$0x -> this.f.a(new fbl(this, this.f.m, this.f.ad())), true));
      $$4.b(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(ewh.a(vb.c("menu.options"), $$0x -> this.f.a(new fbt(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(ewh.a(vb.c("menu.quit"), $$0x -> this.f.p()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      exm $$5 = this.d(ewl.b(20, $$0x -> this.f.a(new fao(this, this.f.m)), true));
      $$5.b(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new exf($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new faz(this)), this.i));
      if (this.o == null) {
         this.o = new esc();
      }

      if (this.l()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.ae()) {
         this.t = new fch.a(this.i, exa.a(this.i, vb.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(ewh.a(vb.c("menu.singleplayer"), $$0x -> this.f.a(new fgy(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      vb $$2 = this.C();
      boolean $$3 = $$2 == null;
      exs $$4 = $$2 != null ? exs.a($$2) : null;
      this.d(ewh.a(vb.c("menu.multiplayer"), $$0x -> {
         fcc $$1x = (fcc)(this.f.m.v ? new ffa(this) : new ffc(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).i = $$3;
      this.d(ewh.a(vb.c("menu.online"), $$0x -> this.E()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).i = $$3;
   }

   @Nullable
   private vb C() {
      if (this.f.C()) {
         return null;
      } else if (this.f.F()) {
         return vb.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.E();
         if ($$0 != null) {
            return $$0.expires() != null ? vb.c("title.multiplayer.disabled.banned.temporary") : vb.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return vb.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.D();
      this.d(ewh.a(vb.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.w().a("Demo_World", () -> this.f.a(this));
         } else {
            this.f.w().a("Demo_World", MinecraftServer.e, dow.b, dye::a, this);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         ewh.a(
               vb.c("menu.resetdemo"),
               $$0x -> {
                  efu $$1x = this.f.l();

                  try (efu.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.k()) {
                        this.f
                           .a(
                              new fav(
                                 this::c,
                                 vb.c("selectWorld.deleteQuestion"),
                                 vb.a("selectWorld.deleteWarning", MinecraftServer.e.a()),
                                 vb.c("selectWorld.deleteButton"),
                                 va.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     eyo.a(this.f, "Demo_World");
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
         try (efu.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.k();
         }

         return var2;
      } catch (IOException var6) {
         eyo.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void E() {
      this.f.a(new epo(this));
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      if (this.r == 0L && this.q) {
         this.r = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.r) / 1000.0F : 1.0F;
      this.p.a($$3, aty.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)aty.f(aty.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? aty.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.u.a($$0, this.g, $$5);
      int $$6 = aty.f($$5 * 255.0F) << 24;
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

         if (euk.e().a()) {
            $$7 = $$7 + geu.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (eyc $$8 : this.i()) {
            if ($$8 instanceof ewf) {
               ((ewf)$$8).a($$5);
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
   public void b(evw $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.o.a($$0, $$1, $$2);
   }

   @Override
   public void aG_() {
      if (this.o != null) {
         this.o.aG_();
      }
   }

   @Override
   public void aH_() {
      super.aH_();
      if (this.o != null) {
         this.o.aH_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (efu.c $$1 = this.f.l().e("Demo_World")) {
            $$1.i();
         } catch (IOException var7) {
            eyo.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(evu a, exa b, int c, int d) {
      public void a(evw $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
