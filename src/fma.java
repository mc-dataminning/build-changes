import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fma extends fjo {
   private static final wg a = wg.c("structure_block.structure_name");
   private static final wg b = wg.c("structure_block.position");
   private static final wg c = wg.c("structure_block.size");
   private static final wg d = wg.c("structure_block.integrity");
   private static final wg o = wg.c("structure_block.custom_data");
   private static final wg p = wg.c("structure_block.include_entities");
   private static final wg q = wg.c("structure_block.detect_size");
   private static final wg r = wg.c("structure_block.show_air");
   private static final wg s = wg.c("structure_block.show_boundingbox");
   private static final ImmutableList<dqj> u = ImmutableList.copyOf(dqj.values());
   private static final ImmutableList<dqj> v = u.stream().filter($$0 -> $$0 != dqj.d).collect(ImmutableList.toImmutableList());
   private final dnu w;
   private dgu x = dgu.a;
   private dik y = dik.a;
   private dqj z = dqj.d;
   private boolean A;
   private boolean B;
   private boolean C;
   private fdy D;
   private fdy E;
   private fdy F;
   private fdy G;
   private fdy H;
   private fdy I;
   private fdy J;
   private fdy K;
   private fdy L;
   private fdy M;
   private fdp N;
   private fdp O;
   private fdp P;
   private fdp Q;
   private fdp R;
   private fdp S;
   private fdp T;
   private fdw<Boolean> U;
   private fdw<dgu> V;
   private fdw<Boolean> W;
   private fdw<Boolean> X;
   private final DecimalFormat Y = new DecimalFormat("0.0###");

   public fma(dnu $$0) {
      super(wg.c(dca.pa.g()));
      this.w = $$0;
      this.Y.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(dnu.a.a)) {
         this.j.a(null);
      }
   }

   private void C() {
      this.w.a(this.x);
      this.w.a(this.y);
      this.w.a(this.z);
      this.w.a(this.A);
      this.w.d(this.B);
      this.w.e(this.C);
      this.j.a(null);
   }

   @Override
   protected void aN_() {
      this.c((fdp)fdp.a(wf.d, $$0x -> this.m()).a(this.k / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fdp)fdp.a(wf.e, $$0x -> this.C()).a(this.k / 2 + 4, 210, 150, 20).a());
      this.x = this.w.k();
      this.y = this.w.l();
      this.z = this.w.u();
      this.A = this.w.v();
      this.B = this.w.D();
      this.C = this.w.E();
      this.N = this.c((fdp)fdp.a(wg.c("structure_block.button.save"), $$0x -> {
         if (this.w.u() == dqj.a) {
            this.a(dnu.a.b);
            this.j.a(null);
         }
      }).a(this.k / 2 + 4 + 100, 185, 50, 20).a());
      this.O = this.c((fdp)fdp.a(wg.c("structure_block.button.load"), $$0x -> {
         if (this.w.u() == dqj.b) {
            this.a(dnu.a.c);
            this.j.a(null);
         }
      }).a(this.k / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fdw.<dqj>a($$0x -> wg.c("structure_block.mode." + $$0x.c()))
            .a(v, u)
            .a()
            .a(this.z)
            .a(this.k / 2 - 4 - 150, 185, 50, 20, wg.b("MODE"), ($$0x, $$1x) -> {
               this.w.a($$1x);
               this.a($$1x);
            })
      );
      this.T = this.c((fdp)fdp.a(wg.c("structure_block.button.detect_size"), $$0x -> {
         if (this.w.u() == dqj.a) {
            this.a(dnu.a.d);
            this.j.a(null);
         }
      }).a(this.k / 2 + 4 + 100, 120, 50, 20).a());
      this.U = this.c(fdw.b(!this.w.v()).a().a(this.k / 2 + 4 + 100, 160, 50, 20, p, ($$0x, $$1x) -> this.w.a(!$$1x)));
      this.V = this.c(fdw.<dgu>a(dgu::b).a(dgu.values()).a().a(this.x).a(this.k / 2 - 20, 185, 40, 20, wg.b("MIRROR"), ($$0x, $$1x) -> this.w.a($$1x)));
      this.W = this.c(fdw.b(this.w.D()).a().a(this.k / 2 + 4 + 100, 80, 50, 20, r, ($$0x, $$1x) -> this.w.d($$1x)));
      this.X = this.c(fdw.b(this.w.E()).a().a(this.k / 2 + 4 + 100, 80, 50, 20, s, ($$0x, $$1x) -> this.w.e($$1x)));
      this.P = this.c((fdp)fdp.a(wg.b("0"), $$0x -> {
         this.w.a(dik.a);
         this.D();
      }).a(this.k / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.Q = this.c((fdp)fdp.a(wg.b("90"), $$0x -> {
         this.w.a(dik.b);
         this.D();
      }).a(this.k / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.R = this.c((fdp)fdp.a(wg.b("180"), $$0x -> {
         this.w.a(dik.c);
         this.D();
      }).a(this.k / 2 + 1 + 20, 185, 40, 20).a());
      this.S = this.c((fdp)fdp.a(wg.b("270"), $$0x -> {
         this.w.a(dik.d);
         this.D();
      }).a(this.k / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.D = new fdy(this.m, this.k / 2 - 152, 40, 300, 20, wg.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fma.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.D.f(128);
      this.D.a(this.w.c());
      this.d(this.D);
      ib $$0 = this.w.f();
      this.E = new fdy(this.m, this.k / 2 - 152, 80, 80, 20, wg.c("structure_block.position.x"));
      this.E.f(15);
      this.E.a(Integer.toString($$0.u()));
      this.d(this.E);
      this.F = new fdy(this.m, this.k / 2 - 72, 80, 80, 20, wg.c("structure_block.position.y"));
      this.F.f(15);
      this.F.a(Integer.toString($$0.v()));
      this.d(this.F);
      this.G = new fdy(this.m, this.k / 2 + 8, 80, 80, 20, wg.c("structure_block.position.z"));
      this.G.f(15);
      this.G.a(Integer.toString($$0.w()));
      this.d(this.G);
      jg $$1 = this.w.j();
      this.H = new fdy(this.m, this.k / 2 - 152, 120, 80, 20, wg.c("structure_block.size.x"));
      this.H.f(15);
      this.H.a(Integer.toString($$1.u()));
      this.d(this.H);
      this.I = new fdy(this.m, this.k / 2 - 72, 120, 80, 20, wg.c("structure_block.size.y"));
      this.I.f(15);
      this.I.a(Integer.toString($$1.v()));
      this.d(this.I);
      this.J = new fdy(this.m, this.k / 2 + 8, 120, 80, 20, wg.c("structure_block.size.z"));
      this.J.f(15);
      this.J.a(Integer.toString($$1.w()));
      this.d(this.J);
      this.K = new fdy(this.m, this.k / 2 - 152, 120, 80, 20, wg.c("structure_block.integrity.integrity"));
      this.K.f(15);
      this.K.a(this.Y.format((double)this.w.w()));
      this.d(this.K);
      this.L = new fdy(this.m, this.k / 2 - 72, 120, 80, 20, wg.c("structure_block.integrity.seed"));
      this.L.f(31);
      this.L.a(Long.toString(this.w.x()));
      this.d(this.L);
      this.M = new fdy(this.m, this.k / 2 - 152, 120, 240, 20, wg.c("structure_block.custom_data"));
      this.M.f(128);
      this.M.a(this.w.t());
      this.d(this.M);
      this.D();
      this.a(this.z);
   }

   @Override
   protected void aD_() {
      this.b(this.D);
   }

   @Override
   public void a(fbp $$0, int $$1, int $$2) {
      String $$3 = this.D.a();
      String $$4 = this.E.a();
      String $$5 = this.F.a();
      String $$6 = this.G.a();
      String $$7 = this.H.a();
      String $$8 = this.I.a();
      String $$9 = this.J.a();
      String $$10 = this.K.a();
      String $$11 = this.L.a();
      String $$12 = this.M.a();
      this.b($$0, $$1, $$2);
      this.D.a($$3);
      this.E.a($$4);
      this.F.a($$5);
      this.G.a($$6);
      this.H.a($$7);
      this.I.a($$8);
      this.J.a($$9);
      this.K.a($$10);
      this.L.a($$11);
      this.M.a($$12);
   }

   private void D() {
      this.P.j = true;
      this.Q.j = true;
      this.R.j = true;
      this.S.j = true;
      switch (this.w.l()) {
         case a:
            this.P.j = false;
            break;
         case c:
            this.R.j = false;
            break;
         case d:
            this.S.j = false;
            break;
         case b:
            this.Q.j = false;
      }
   }

   private void a(dqj $$0) {
      this.D.g(false);
      this.E.g(false);
      this.F.g(false);
      this.G.g(false);
      this.H.g(false);
      this.I.g(false);
      this.J.g(false);
      this.K.g(false);
      this.L.g(false);
      this.M.g(false);
      this.N.k = false;
      this.O.k = false;
      this.T.k = false;
      this.U.k = false;
      this.V.k = false;
      this.P.k = false;
      this.Q.k = false;
      this.R.k = false;
      this.S.k = false;
      this.W.k = false;
      this.X.k = false;
      switch ($$0) {
         case a:
            this.D.g(true);
            this.E.g(true);
            this.F.g(true);
            this.G.g(true);
            this.H.g(true);
            this.I.g(true);
            this.J.g(true);
            this.N.k = true;
            this.T.k = true;
            this.U.k = true;
            this.W.k = true;
            break;
         case b:
            this.D.g(true);
            this.E.g(true);
            this.F.g(true);
            this.G.g(true);
            this.K.g(true);
            this.L.g(true);
            this.O.k = true;
            this.U.k = true;
            this.V.k = true;
            this.P.k = true;
            this.Q.k = true;
            this.R.k = true;
            this.S.k = true;
            this.X.k = true;
            this.D();
            break;
         case c:
            this.D.g(true);
            break;
         case d:
            this.M.g(true);
      }
   }

   private boolean a(dnu.a $$0) {
      ib $$1 = new ib(this.c(this.E.a()), this.c(this.F.a()), this.c(this.G.a()));
      jg $$2 = new jg(this.c(this.H.a()), this.c(this.I.a()), this.c(this.J.a()));
      float $$3 = this.b(this.K.a());
      long $$4 = this.a(this.L.a());
      this.j
         .L()
         .b(new ahc(this.w.aA_(), $$0, this.w.u(), this.D.a(), $$1, $$2, this.w.k(), this.w.l(), this.M.a(), this.w.v(), this.w.D(), this.w.E(), $$3, $$4));
      return true;
   }

   private long a(String $$0) {
      try {
         return Long.valueOf($$0);
      } catch (NumberFormatException var3) {
         return 0L;
      }
   }

   private float b(String $$0) {
      try {
         return Float.valueOf($$0);
      } catch (NumberFormatException var3) {
         return 1.0F;
      }
   }

   private int c(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   @Override
   public void d() {
      this.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.m();
         return true;
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dqj $$4 = this.w.u();
      $$0.a(this.m, this.i, this.k / 2, 10, 16777215);
      if ($$4 != dqj.d) {
         $$0.b(this.m, a, this.k / 2 - 153, 30, 10526880);
         this.D.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dqj.b || $$4 == dqj.a) {
         $$0.b(this.m, b, this.k / 2 - 153, 70, 10526880);
         this.E.a($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
         $$0.b(this.m, p, this.k / 2 + 154 - this.m.a(p), 150, 10526880);
      }

      if ($$4 == dqj.a) {
         $$0.b(this.m, c, this.k / 2 - 153, 110, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         this.J.a($$0, $$1, $$2, $$3);
         $$0.b(this.m, q, this.k / 2 + 154 - this.m.a(q), 110, 10526880);
         $$0.b(this.m, r, this.k / 2 + 154 - this.m.a(r), 70, 10526880);
      }

      if ($$4 == dqj.b) {
         $$0.b(this.m, d, this.k / 2 - 153, 110, 10526880);
         this.K.a($$0, $$1, $$2, $$3);
         this.L.a($$0, $$1, $$2, $$3);
         $$0.b(this.m, s, this.k / 2 + 154 - this.m.a(s), 70, 10526880);
      }

      if ($$4 == dqj.d) {
         $$0.b(this.m, o, this.k / 2 - 153, 110, 10526880);
         this.M.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.m, $$4.a(), this.k / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean k() {
      return false;
   }
}
