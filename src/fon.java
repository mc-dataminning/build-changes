import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fon extends hrc {
   static final Logger c = LogUtils.getLogger();
   private static final xg C = xg.c("mco.selectServer.create");
   private static final xg D = xg.c("mco.selectServer.create.subtitle");
   private static final xg E = xg.c("mco.configure.world.switch.slot");
   private static final xg F = xg.c("mco.configure.world.switch.slot.subtitle");
   private static final xg G = xg.c("mco.reset.world.generate");
   private static final xg H = xg.c("mco.reset.world.title");
   private static final xg I = xg.c("mco.reset.world.warning");
   public static final xg a = xg.c("mco.create.world.reset.title");
   private static final xg J = xg.c("mco.reset.world.resetting.screen.title");
   private static final xg K = xg.c("mco.reset.world.template");
   private static final xg L = xg.c("mco.reset.world.adventure");
   private static final xg M = xg.c("mco.reset.world.experience");
   private static final xg N = xg.c("mco.reset.world.inspiration");
   private final fzq O;
   private final fmr P;
   private final xg Q;
   private final int R;
   private final xg S;
   private static final alr T = alr.b("textures/gui/realms/upload.png");
   private static final alr U = alr.b("textures/gui/realms/adventure.png");
   private static final alr V = alr.b("textures/gui/realms/survival_spawn.png");
   private static final alr W = alr.b("textures/gui/realms/new_world.png");
   private static final alr X = alr.b("textures/gui/realms/experience.png");
   private static final alr Y = alr.b("textures/gui/realms/inspiration.png");
   fni Z;
   fni aa;
   fni ab;
   fni ac;
   public final int b;
   @Nullable
   private final fpq ad;
   private final Runnable ae;
   private final fxm af = new fxm(this);

   private fon(fzq $$0, fmr $$1, int $$2, xg $$3, xg $$4, int $$5, xg $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fon(fzq $$0, fmr $$1, int $$2, xg $$3, xg $$4, int $$5, xg $$6, @Nullable fpq $$7, Runnable $$8) {
      super($$3);
      this.O = $$0;
      this.P = $$1;
      this.b = $$2;
      this.Q = $$4;
      this.R = $$5;
      this.S = $$6;
      this.ad = $$7;
      this.ae = $$8;
   }

   public static fon a(fzq $$0, fmr $$1, fpq $$2, Runnable $$3) {
      return new fon($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fon a(fzq $$0, int $$1, fmr $$2, Runnable $$3) {
      return new fon($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fon a(fzq $$0, fmr $$1, Runnable $$2) {
      return new fon($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aT_() {
      fxq $$0 = this.af.a(fxq.d());
      $$0.c().a(9 / 3);
      $$0.a(new fvf(this.l, this.p), fxp::b);
      $$0.a(new fvf(this.Q, this.p).b(this.R), fxp::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            flq $$0 = flq.a();

            try {
               fni $$1 = $$0.a(1, 10, fmr.d.a);
               fni $$2 = $$0.a(1, 10, fmr.d.c);
               fni $$3 = $$0.a(1, 10, fmr.d.d);
               fni $$4 = $$0.a(1, 10, fmr.d.e);
               fon.this.m.execute(() -> {
                  fon.this.Z = $$1;
                  fon.this.aa = $$2;
                  fon.this.ab = $$3;
                  fon.this.ac = $$4;
               });
            } catch (fnm var6) {
               fon.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fxl $$1 = this.af.c(new fxl());
      fxl.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fon.a(this.m.h, G, W, $$0x -> flw.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fon.a(this.m.h, foo.a, T, $$0x -> this.m.a(new foo(this.ad, this.P.a, this.b, this))));
      $$2.a(new fon.a(this.m.h, K, V, $$0x -> this.m.a(new fop(K, this::a, fmr.d.a, this.Z))));
      $$2.a(fxr.b(16), 3);
      $$2.a(new fon.a(this.m.h, L, U, $$0x -> this.m.a(new fop(L, this::a, fmr.d.c, this.aa))));
      $$2.a(new fon.a(this.m.h, M, X, $$0x -> this.m.a(new fop(M, this::a, fmr.d.d, this.ab))));
      $$2.a(new fon.a(this.m.h, N, Y, $$0x -> this.m.a(new fop(N, this::a, fmr.d.e, this.ac))));
      this.af.b(fty.a(xf.k, $$0x -> this.aQ_()).a());
      this.af.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public xg i() {
      return xf.a(this.n(), this.Q);
   }

   @Override
   public void aQ_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fnh $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fpr($$0, this.P.a, this.S, this.ae));
      }

      fll.g();
   }

   private void a(fpo $$0) {
      List<fpo> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fpv(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fog(this.O, $$1.toArray(new fpo[0])));
   }

   class a extends fty {
      private static final alr b = alr.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alr v;

      a(final fti $$0, final xg $$1, final alr $$2, final fty.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(ftk $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = ayh.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gry::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gry::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fon.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
