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

public class eyj extends eye {
   private static final Logger c = LogUtils.getLogger();
   private static final String k = "Demo_World";
   public static final tl a = tl.c("title.credits");
   public static final fno b = new fno(new aez("textures/gui/title/background/panorama"));
   private static final aez l = new aez("textures/gui/title/background/panorama_overlay.png");
   @Nullable
   private eto m;
   private esk n;
   @Nullable
   private eoi o;
   private final foc p = new foc(b);
   private final boolean q;
   private long s;
   @Nullable
   private eyj.a t;
   private final etb u;

   public eyj() {
      this(false);
   }

   public eyj(boolean $$0) {
      this($$0, null);
   }

   public eyj(boolean $$0, @Nullable etb $$1) {
      super(tl.c("narrator.screen.title"));
      this.q = $$0;
      this.u = Objects.requireNonNullElseGet($$1, () -> new etb(false));
   }

   private boolean l() {
      return this.o != null;
   }

   @Override
   public void c() {
      if (this.l()) {
         this.o.c();
      }

      this.f.aS().a(this);
   }

   public static CompletableFuture<Void> a(fzb $$0, Executor $$1) {
      return CompletableFuture.allOf($$0.a(etb.a, $$1), $$0.a(etb.c, $$1), $$0.a(l, $$1), b.a($$0, $$1));
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   protected void aH_() {
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

      etp $$4 = this.d(eso.a(20, $$0x -> this.f.a(new exo(this, this.f.m, this.f.ae())), true));
      $$4.b(this.g / 2 - 124, $$3 + 72 + 12);
      this.d(esk.a(tl.c("menu.options"), $$0x -> this.f.a(new exw(this, this.f.m))).a(this.g / 2 - 100, $$3 + 72 + 12, 98, 20).a());
      this.d(esk.a(tl.c("menu.quit"), $$0x -> this.f.q()).a(this.g / 2 + 2, $$3 + 72 + 12, 98, 20).a());
      etp $$5 = this.d(eso.b(20, $$0x -> this.f.a(new ewr(this, this.f.m)), true));
      $$5.b(this.g / 2 + 104, $$3 + 72 + 12);
      this.d(new eti($$1, this.h - 10, $$0, 10, a, $$0x -> this.f.a(new exc(this)), this.i));
      if (this.o == null) {
         this.o = new eoi();
      }

      if (this.l()) {
         this.o.b(this.f, this.g, this.h);
      }

      if (!this.f.af()) {
         this.t = new eyj.a(this.i, etd.a(this.i, tl.c("title.32bit.deprecation"), 350, 2), this.g / 2, $$3 - 24);
      }
   }

   private void a(int $$0, int $$1) {
      this.d(esk.a(tl.c("menu.singleplayer"), $$0x -> this.f.a(new fcz(this))).a(this.g / 2 - 100, $$0, 200, 20).a());
      tl $$2 = this.D();
      boolean $$3 = $$2 == null;
      etv $$4 = $$2 != null ? etv.a($$2) : null;
      this.d(esk.a(tl.c("menu.multiplayer"), $$0x -> {
         eye $$1x = (eye)(this.f.m.v ? new fbb(this) : new fbd(this));
         this.f.a($$1x);
      }).a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20).a($$4).a()).i = $$3;
      this.d(esk.a(tl.c("menu.online"), $$0x -> this.F()).a(this.g / 2 - 100, $$0 + $$1 * 2, 200, 20).a($$4).a()).i = $$3;
   }

   @Nullable
   private tl D() {
      if (this.f.D()) {
         return null;
      } else if (this.f.G()) {
         return tl.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.f.F();
         if ($$0 != null) {
            return $$0.expires() != null ? tl.c("title.multiplayer.disabled.banned.temporary") : tl.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return tl.c("title.multiplayer.disabled");
         }
      }
   }

   private void b(int $$0, int $$1) {
      boolean $$2 = this.E();
      this.d(esk.a(tl.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.f.y().a(this, "Demo_World");
         } else {
            this.f.y().a("Demo_World", MinecraftServer.f, dlk.b, dus::a);
         }
      }).a(this.g / 2 - 100, $$0, 200, 20).a());
      this.n = this.d(
         esk.a(
               tl.c("menu.resetdemo"),
               $$0x -> {
                  eca $$1x = this.f.l();

                  try (eca.c $$2x = $$1x.e("Demo_World")) {
                     ecb $$3 = $$2x.d();
                     if ($$3 != null) {
                        this.f
                           .a(
                              new ewy(
                                 this::c,
                                 tl.c("selectWorld.deleteQuestion"),
                                 tl.a("selectWorld.deleteWarning", $$3.b()),
                                 tl.c("selectWorld.deleteButton"),
                                 tk.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     eur.a(this.f, "Demo_World");
                     c.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.g / 2 - 100, $$0 + $$1 * 1, 200, 20)
            .a()
      );
      this.n.i = $$2;
   }

   private boolean E() {
      try {
         boolean var2;
         try (eca.c $$0 = this.f.l().e("Demo_World")) {
            var2 = $$0.d() != null;
         }

         return var2;
      } catch (IOException var6) {
         eur.a(this.f, "Demo_World");
         c.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   private void F() {
      this.f.a(new elu(this));
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      if (this.s == 0L && this.q) {
         this.s = ac.b();
      }

      float $$4 = this.q ? (float)(ac.b() - this.s) / 1000.0F : 1.0F;
      this.p.a($$3, asb.a($$4, 0.0F, 1.0F));
      RenderSystem.enableBlend();
      $$0.a(1.0F, 1.0F, 1.0F, this.q ? (float)asb.f(asb.a($$4, 0.0F, 1.0F)) : 1.0F);
      $$0.a(l, 0, 0, this.g, this.h, 0.0F, 0.0F, 16, 128, 16, 128);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      float $$5 = this.q ? asb.a($$4 - 1.0F, 0.0F, 1.0F) : 1.0F;
      this.u.a($$0, this.g, $$5);
      int $$6 = asb.f($$5 * 255.0F) << 24;
      if (($$6 & -67108864) != 0) {
         if (this.t != null) {
            this.t.a($$0, $$6);
         }

         if (this.m != null) {
            this.m.a($$0, this.g, this.i, $$6);
         }

         String $$7 = "Minecraft " + aa.b().c();
         if (this.f.I()) {
            $$7 = $$7 + " Demo";
         } else {
            $$7 = $$7 + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i());
         }

         if (eqp.e().a()) {
            $$7 = $$7 + gag.a("menu.modded");
         }

         $$0.b(this.i, $$7, 2, this.h - 10, 16777215 | $$6);

         for (euf $$8 : this.i()) {
            if ($$8 instanceof esi) {
               ((esi)$$8).a($$5);
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
   public void b(erz $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.o.a($$0, $$1, $$2);
   }

   @Override
   public void h() {
      if (this.o != null) {
         this.o.h();
      }
   }

   @Override
   public void aA_() {
      super.aA_();
      if (this.o != null) {
         this.o.aA_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (eca.c $$1 = this.f.l().e("Demo_World")) {
            $$1.g();
         } catch (IOException var7) {
            eur.b(this.f, "Demo_World");
            c.warn("Failed to delete demo world", var7);
         }
      }

      this.f.a(this);
   }

   static record a(erx a, etd b, int c, int d) {
      public void a(erz $$0, int $$1) {
         this.b.a($$0, this.c, this.d, 9, 2, 2097152 | Math.min($$1, 1426063360));
         this.b.a($$0, this.c, this.d, 9, 16777215 | $$1);
      }
   }
}
