import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class frw extends fpt {
   private static final xd a = xd.c("structure_block.structure_name");
   private static final xd b = xd.c("structure_block.position");
   private static final xd c = xd.c("structure_block.size");
   private static final xd d = xd.c("structure_block.integrity");
   private static final xd s = xd.c("structure_block.custom_data");
   private static final xd u = xd.c("structure_block.include_entities");
   private static final xd v = xd.c("structure_block.detect_size");
   private static final xd w = xd.c("structure_block.show_air");
   private static final xd x = xd.c("structure_block.show_boundingbox");
   private static final ImmutableList<dvk> y = ImmutableList.copyOf(dvk.values());
   private static final ImmutableList<dvk> z = y.stream().filter($$0 -> $$0 != dvk.d).collect(ImmutableList.toImmutableList());
   private final dsv A;
   private dls B = dls.a;
   private dnj C = dnj.a;
   private dvk D = dvk.d;
   private boolean E;
   private boolean F;
   private boolean G;
   private fkj H;
   private fkj I;
   private fkj J;
   private fkj K;
   private fkj L;
   private fkj M;
   private fkj N;
   private fkj O;
   private fkj P;
   private fkj Q;
   private fka R;
   private fka S;
   private fka T;
   private fka U;
   private fka V;
   private fka W;
   private fka X;
   private fkh<Boolean> Y;
   private fkh<dls> Z;
   private fkh<Boolean> aa;
   private fkh<Boolean> ab;
   private final DecimalFormat ac = new DecimalFormat("0.0###");

   public frw(dsv $$0) {
      super(xd.c(dgx.pa.g()));
      this.A = $$0;
      this.ac.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(dsv.a.a)) {
         this.m.a(null);
      }
   }

   private void D() {
      this.A.a(this.B);
      this.A.a(this.C);
      this.A.a(this.D);
      this.A.a(this.E);
      this.A.d(this.F);
      this.A.e(this.G);
      this.m.a(null);
   }

   @Override
   protected void aT_() {
      this.c((fka)fka.a(xc.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fka)fka.a(xc.e, $$0x -> this.D()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.B = this.A.k();
      this.C = this.A.t();
      this.D = this.A.v();
      this.E = this.A.w();
      this.F = this.A.E();
      this.G = this.A.F();
      this.R = this.c((fka)fka.a(xd.c("structure_block.button.save"), $$0x -> {
         if (this.A.v() == dvk.a) {
            this.a(dsv.a.b);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.S = this.c((fka)fka.a(xd.c("structure_block.button.load"), $$0x -> {
         if (this.A.v() == dvk.b) {
            this.a(dsv.a.c);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fkh.<dvk>a($$0x -> xd.c("structure_block.mode." + $$0x.c()))
            .a(z, y)
            .a()
            .a(this.D)
            .a(this.n / 2 - 4 - 150, 185, 50, 20, xd.b("MODE"), ($$0x, $$1x) -> {
               this.A.a($$1x);
               this.a($$1x);
            })
      );
      this.X = this.c((fka)fka.a(xd.c("structure_block.button.detect_size"), $$0x -> {
         if (this.A.v() == dvk.a) {
            this.a(dsv.a.d);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 120, 50, 20).a());
      this.Y = this.c(fkh.b(!this.A.w()).a().a(this.n / 2 + 4 + 100, 160, 50, 20, u, ($$0x, $$1x) -> this.A.a(!$$1x)));
      this.Z = this.c(fkh.<dls>a(dls::b).a(dls.values()).a().a(this.B).a(this.n / 2 - 20, 185, 40, 20, xd.b("MIRROR"), ($$0x, $$1x) -> this.A.a($$1x)));
      this.aa = this.c(fkh.b(this.A.E()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, w, ($$0x, $$1x) -> this.A.d($$1x)));
      this.ab = this.c(fkh.b(this.A.F()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, x, ($$0x, $$1x) -> this.A.e($$1x)));
      this.T = this.c((fka)fka.a(xd.b("0"), $$0x -> {
         this.A.a(dnj.a);
         this.E();
      }).a(this.n / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.U = this.c((fka)fka.a(xd.b("90"), $$0x -> {
         this.A.a(dnj.b);
         this.E();
      }).a(this.n / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.V = this.c((fka)fka.a(xd.b("180"), $$0x -> {
         this.A.a(dnj.c);
         this.E();
      }).a(this.n / 2 + 1 + 20, 185, 40, 20).a());
      this.W = this.c((fka)fka.a(xd.b("270"), $$0x -> {
         this.A.a(dnj.d);
         this.E();
      }).a(this.n / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.H = new fkj(this.p, this.n / 2 - 152, 40, 300, 20, xd.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !frw.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.H.f(128);
      this.H.a(this.A.c());
      this.d(this.H);
      je $$0 = this.A.f();
      this.I = new fkj(this.p, this.n / 2 - 152, 80, 80, 20, xd.c("structure_block.position.x"));
      this.I.f(15);
      this.I.a(Integer.toString($$0.u()));
      this.d(this.I);
      this.J = new fkj(this.p, this.n / 2 - 72, 80, 80, 20, xd.c("structure_block.position.y"));
      this.J.f(15);
      this.J.a(Integer.toString($$0.v()));
      this.d(this.J);
      this.K = new fkj(this.p, this.n / 2 + 8, 80, 80, 20, xd.c("structure_block.position.z"));
      this.K.f(15);
      this.K.a(Integer.toString($$0.w()));
      this.d(this.K);
      ki $$1 = this.A.j();
      this.L = new fkj(this.p, this.n / 2 - 152, 120, 80, 20, xd.c("structure_block.size.x"));
      this.L.f(15);
      this.L.a(Integer.toString($$1.u()));
      this.d(this.L);
      this.M = new fkj(this.p, this.n / 2 - 72, 120, 80, 20, xd.c("structure_block.size.y"));
      this.M.f(15);
      this.M.a(Integer.toString($$1.v()));
      this.d(this.M);
      this.N = new fkj(this.p, this.n / 2 + 8, 120, 80, 20, xd.c("structure_block.size.z"));
      this.N.f(15);
      this.N.a(Integer.toString($$1.w()));
      this.d(this.N);
      this.O = new fkj(this.p, this.n / 2 - 152, 120, 80, 20, xd.c("structure_block.integrity.integrity"));
      this.O.f(15);
      this.O.a(this.ac.format((double)this.A.x()));
      this.d(this.O);
      this.P = new fkj(this.p, this.n / 2 - 72, 120, 80, 20, xd.c("structure_block.integrity.seed"));
      this.P.f(31);
      this.P.a(Long.toString(this.A.y()));
      this.d(this.P);
      this.Q = new fkj(this.p, this.n / 2 - 152, 120, 240, 20, xd.c("structure_block.custom_data"));
      this.Q.f(128);
      this.Q.a(this.A.u());
      this.d(this.Q);
      this.E();
      this.a(this.D);
   }

   @Override
   protected void aI_() {
      this.b(this.H);
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void a(fib $$0, int $$1, int $$2) {
      String $$3 = this.H.a();
      String $$4 = this.I.a();
      String $$5 = this.J.a();
      String $$6 = this.K.a();
      String $$7 = this.L.a();
      String $$8 = this.M.a();
      String $$9 = this.N.a();
      String $$10 = this.O.a();
      String $$11 = this.P.a();
      String $$12 = this.Q.a();
      this.b($$0, $$1, $$2);
      this.H.a($$3);
      this.I.a($$4);
      this.J.a($$5);
      this.K.a($$6);
      this.L.a($$7);
      this.M.a($$8);
      this.N.a($$9);
      this.O.a($$10);
      this.P.a($$11);
      this.Q.a($$12);
   }

   private void E() {
      this.T.j = true;
      this.U.j = true;
      this.V.j = true;
      this.W.j = true;
      switch (this.A.t()) {
         case a:
            this.T.j = false;
            break;
         case c:
            this.V.j = false;
            break;
         case d:
            this.W.j = false;
            break;
         case b:
            this.U.j = false;
      }
   }

   private void a(dvk $$0) {
      this.H.g(false);
      this.I.g(false);
      this.J.g(false);
      this.K.g(false);
      this.L.g(false);
      this.M.g(false);
      this.N.g(false);
      this.O.g(false);
      this.P.g(false);
      this.Q.g(false);
      this.R.k = false;
      this.S.k = false;
      this.X.k = false;
      this.Y.k = false;
      this.Z.k = false;
      this.T.k = false;
      this.U.k = false;
      this.V.k = false;
      this.W.k = false;
      this.aa.k = false;
      this.ab.k = false;
      switch ($$0) {
         case a:
            this.H.g(true);
            this.I.g(true);
            this.J.g(true);
            this.K.g(true);
            this.L.g(true);
            this.M.g(true);
            this.N.g(true);
            this.R.k = true;
            this.X.k = true;
            this.Y.k = true;
            this.aa.k = true;
            break;
         case b:
            this.H.g(true);
            this.I.g(true);
            this.J.g(true);
            this.K.g(true);
            this.O.g(true);
            this.P.g(true);
            this.S.k = true;
            this.Y.k = true;
            this.Z.k = true;
            this.T.k = true;
            this.U.k = true;
            this.V.k = true;
            this.W.k = true;
            this.ab.k = true;
            this.E();
            break;
         case c:
            this.H.g(true);
            break;
         case d:
            this.Q.g(true);
      }
   }

   private boolean a(dsv.a $$0) {
      je $$1 = new je(this.c(this.I.a()), this.c(this.J.a()), this.c(this.K.a()));
      ki $$2 = new ki(this.c(this.L.a()), this.c(this.M.a()), this.c(this.N.a()));
      float $$3 = this.b(this.O.a());
      long $$4 = this.a(this.P.a());
      this.m
         .L()
         .b(new aik(this.A.aD_(), $$0, this.A.v(), this.H.a(), $$1, $$2, this.A.k(), this.A.t(), this.Q.a(), this.A.w(), this.A.E(), this.A.F(), $$3, $$4));
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
      this.D();
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
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dvk $$4 = this.A.v();
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if ($$4 != dvk.d) {
         $$0.b(this.p, a, this.n / 2 - 153, 30, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dvk.b || $$4 == dvk.a) {
         $$0.b(this.p, b, this.n / 2 - 153, 70, 10526880);
         this.I.a($$0, $$1, $$2, $$3);
         this.J.a($$0, $$1, $$2, $$3);
         this.K.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, u, this.n / 2 + 154 - this.p.a(u), 150, 10526880);
      }

      if ($$4 == dvk.a) {
         $$0.b(this.p, c, this.n / 2 - 153, 110, 10526880);
         this.L.a($$0, $$1, $$2, $$3);
         this.M.a($$0, $$1, $$2, $$3);
         this.N.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, v, this.n / 2 + 154 - this.p.a(v), 110, 10526880);
         $$0.b(this.p, w, this.n / 2 + 154 - this.p.a(w), 70, 10526880);
      }

      if ($$4 == dvk.b) {
         $$0.b(this.p, d, this.n / 2 - 153, 110, 10526880);
         this.O.a($$0, $$1, $$2, $$3);
         this.P.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, x, this.n / 2 + 154 - this.p.a(x), 70, 10526880);
      }

      if ($$4 == dvk.d) {
         $$0.b(this.p, s, this.n / 2 - 153, 110, 10526880);
         this.Q.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.p, $$4.a(), this.n / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean k() {
      return false;
   }
}
