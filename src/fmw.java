import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmw extends hpj {
   static final Logger c = LogUtils.getLogger();
   private static final wy C = wy.c("mco.selectServer.create");
   private static final wy D = wy.c("mco.selectServer.create.subtitle");
   private static final wy E = wy.c("mco.configure.world.switch.slot");
   private static final wy F = wy.c("mco.configure.world.switch.slot.subtitle");
   private static final wy G = wy.c("mco.reset.world.generate");
   private static final wy H = wy.c("mco.reset.world.title");
   private static final wy I = wy.c("mco.reset.world.warning");
   public static final wy a = wy.c("mco.create.world.reset.title");
   private static final wy J = wy.c("mco.reset.world.resetting.screen.title");
   private static final wy K = wy.c("mco.reset.world.template");
   private static final wy L = wy.c("mco.reset.world.adventure");
   private static final wy M = wy.c("mco.reset.world.experience");
   private static final wy N = wy.c("mco.reset.world.inspiration");
   private final fyb O;
   private final fla P;
   private final wy Q;
   private final int R;
   private final wy S;
   private static final alg T = alg.b("textures/gui/realms/upload.png");
   private static final alg U = alg.b("textures/gui/realms/adventure.png");
   private static final alg V = alg.b("textures/gui/realms/survival_spawn.png");
   private static final alg W = alg.b("textures/gui/realms/new_world.png");
   private static final alg X = alg.b("textures/gui/realms/experience.png");
   private static final alg Y = alg.b("textures/gui/realms/inspiration.png");
   flr Z;
   flr aa;
   flr ab;
   flr ac;
   public final int b;
   @Nullable
   private final fny ad;
   private final Runnable ae;
   private final fvx af = new fvx(this);

   private fmw(fyb $$0, fla $$1, int $$2, wy $$3, wy $$4, int $$5, wy $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fmw(fyb $$0, fla $$1, int $$2, wy $$3, wy $$4, int $$5, wy $$6, @Nullable fny $$7, Runnable $$8) {
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

   public static fmw a(fyb $$0, fla $$1, fny $$2, Runnable $$3) {
      return new fmw($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fmw a(fyb $$0, int $$1, fla $$2, Runnable $$3) {
      return new fmw($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fmw a(fyb $$0, fla $$1, Runnable $$2) {
      return new fmw($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aO_() {
      fwb $$0 = this.af.a(fwb.d());
      $$0.c().a(9 / 3);
      $$0.a(new ftq(this.l, this.p), fwa::b);
      $$0.a(new ftq(this.Q, this.p).b(this.R), fwa::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fjz $$0 = fjz.a();

            try {
               flr $$1 = $$0.a(1, 10, fla.d.a);
               flr $$2 = $$0.a(1, 10, fla.d.c);
               flr $$3 = $$0.a(1, 10, fla.d.d);
               flr $$4 = $$0.a(1, 10, fla.d.e);
               fmw.this.m.execute(() -> {
                  fmw.this.Z = $$1;
                  fmw.this.aa = $$2;
                  fmw.this.ab = $$3;
                  fmw.this.ac = $$4;
               });
            } catch (flv var6) {
               fmw.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fvw $$1 = this.af.c(new fvw());
      fvw.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fmw.a(this.m.h, G, W, $$0x -> fkf.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fmw.a(this.m.h, fmx.a, T, $$0x -> this.m.a(new fmx(this.ad, this.P.a, this.b, this))));
      $$2.a(new fmw.a(this.m.h, K, V, $$0x -> this.m.a(new fmy(K, this::a, fla.d.a, this.Z))));
      $$2.a(fwc.b(16), 3);
      $$2.a(new fmw.a(this.m.h, L, U, $$0x -> this.m.a(new fmy(L, this::a, fla.d.c, this.aa))));
      $$2.a(new fmw.a(this.m.h, M, X, $$0x -> this.m.a(new fmy(M, this::a, fla.d.d, this.ab))));
      $$2.a(new fmw.a(this.m.h, N, Y, $$0x -> this.m.a(new fmy(N, this::a, fla.d.e, this.ac))));
      this.af.b(fsj.a(wx.k, $$0x -> this.aL_()).a());
      this.af.a($$1x -> {
         fsh var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public wy i() {
      return wx.a(this.n(), this.Q);
   }

   @Override
   public void aL_() {
      this.m.a(this.O);
   }

   private void a(@Nullable flq $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fnz($$0, this.P.a, this.S, this.ae));
      }

      fju.g();
   }

   private void a(fnw $$0) {
      List<fnw> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fod(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fmp(this.O, $$1.toArray(new fnw[0])));
   }

   class a extends fsj {
      private static final alg b = alg.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alg v;

      a(final frt $$0, final wy $$1, final alg $$2, final fsj.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(frv $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = axw.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gqk::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gqk::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fmw.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
