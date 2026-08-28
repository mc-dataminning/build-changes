import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fpp extends fnl {
   private static final wu a = wu.c("structure_block.structure_name");
   private static final wu b = wu.c("structure_block.position");
   private static final wu c = wu.c("structure_block.size");
   private static final wu q = wu.c("structure_block.integrity");
   private static final wu r = wu.c("structure_block.custom_data");
   private static final wu s = wu.c("structure_block.include_entities");
   private static final wu u = wu.c("structure_block.detect_size");
   private static final wu v = wu.c("structure_block.show_air");
   private static final wu w = wu.c("structure_block.show_boundingbox");
   private static final ImmutableList<dtv> x = ImmutableList.copyOf(dtv.values());
   private static final ImmutableList<dtv> y = x.stream().filter($$0 -> $$0 != dtv.d).collect(ImmutableList.toImmutableList());
   private final drg z;
   private dkf A = dkf.a;
   private dlv B = dlv.a;
   private dtv C = dtv.d;
   private boolean D;
   private boolean E;
   private boolean F;
   private fid G;
   private fid H;
   private fid I;
   private fid J;
   private fid K;
   private fid L;
   private fid M;
   private fid N;
   private fid O;
   private fid P;
   private fhu Q;
   private fhu R;
   private fhu S;
   private fhu T;
   private fhu U;
   private fhu V;
   private fhu W;
   private fib<Boolean> X;
   private fib<dkf> Y;
   private fib<Boolean> Z;
   private fib<Boolean> aa;
   private final DecimalFormat ab = new DecimalFormat("0.0###");

   public fpp(drg $$0) {
      super(wu.c(dfk.pa.g()));
      this.z = $$0;
      this.ab.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(drg.a.a)) {
         this.l.a(null);
      }
   }

   private void D() {
      this.z.a(this.A);
      this.z.a(this.B);
      this.z.a(this.C);
      this.z.a(this.D);
      this.z.d(this.E);
      this.z.e(this.F);
      this.l.a(null);
   }

   @Override
   protected void aP_() {
      this.c((fhu)fhu.a(wt.d, $$0x -> this.m()).a(this.m / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fhu)fhu.a(wt.e, $$0x -> this.D()).a(this.m / 2 + 4, 210, 150, 20).a());
      this.A = this.z.k();
      this.B = this.z.l();
      this.C = this.z.v();
      this.D = this.z.w();
      this.E = this.z.E();
      this.F = this.z.F();
      this.Q = this.c((fhu)fhu.a(wu.c("structure_block.button.save"), $$0x -> {
         if (this.z.v() == dtv.a) {
            this.a(drg.a.b);
            this.l.a(null);
         }
      }).a(this.m / 2 + 4 + 100, 185, 50, 20).a());
      this.R = this.c((fhu)fhu.a(wu.c("structure_block.button.load"), $$0x -> {
         if (this.z.v() == dtv.b) {
            this.a(drg.a.c);
            this.l.a(null);
         }
      }).a(this.m / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fib.<dtv>a($$0x -> wu.c("structure_block.mode." + $$0x.c()))
            .a(y, x)
            .a()
            .a(this.C)
            .a(this.m / 2 - 4 - 150, 185, 50, 20, wu.b("MODE"), ($$0x, $$1x) -> {
               this.z.a($$1x);
               this.a($$1x);
            })
      );
      this.W = this.c((fhu)fhu.a(wu.c("structure_block.button.detect_size"), $$0x -> {
         if (this.z.v() == dtv.a) {
            this.a(drg.a.d);
            this.l.a(null);
         }
      }).a(this.m / 2 + 4 + 100, 120, 50, 20).a());
      this.X = this.c(fib.b(!this.z.w()).a().a(this.m / 2 + 4 + 100, 160, 50, 20, s, ($$0x, $$1x) -> this.z.a(!$$1x)));
      this.Y = this.c(fib.<dkf>a(dkf::b).a(dkf.values()).a().a(this.A).a(this.m / 2 - 20, 185, 40, 20, wu.b("MIRROR"), ($$0x, $$1x) -> this.z.a($$1x)));
      this.Z = this.c(fib.b(this.z.E()).a().a(this.m / 2 + 4 + 100, 80, 50, 20, v, ($$0x, $$1x) -> this.z.d($$1x)));
      this.aa = this.c(fib.b(this.z.F()).a().a(this.m / 2 + 4 + 100, 80, 50, 20, w, ($$0x, $$1x) -> this.z.e($$1x)));
      this.S = this.c((fhu)fhu.a(wu.b("0"), $$0x -> {
         this.z.a(dlv.a);
         this.E();
      }).a(this.m / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.T = this.c((fhu)fhu.a(wu.b("90"), $$0x -> {
         this.z.a(dlv.b);
         this.E();
      }).a(this.m / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.U = this.c((fhu)fhu.a(wu.b("180"), $$0x -> {
         this.z.a(dlv.c);
         this.E();
      }).a(this.m / 2 + 1 + 20, 185, 40, 20).a());
      this.V = this.c((fhu)fhu.a(wu.b("270"), $$0x -> {
         this.z.a(dlv.d);
         this.E();
      }).a(this.m / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.G = new fid(this.o, this.m / 2 - 152, 40, 300, 20, wu.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fpp.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.G.f(128);
      this.G.a(this.z.c());
      this.d(this.G);
      ja $$0 = this.z.f();
      this.H = new fid(this.o, this.m / 2 - 152, 80, 80, 20, wu.c("structure_block.position.x"));
      this.H.f(15);
      this.H.a(Integer.toString($$0.u()));
      this.d(this.H);
      this.I = new fid(this.o, this.m / 2 - 72, 80, 80, 20, wu.c("structure_block.position.y"));
      this.I.f(15);
      this.I.a(Integer.toString($$0.v()));
      this.d(this.I);
      this.J = new fid(this.o, this.m / 2 + 8, 80, 80, 20, wu.c("structure_block.position.z"));
      this.J.f(15);
      this.J.a(Integer.toString($$0.w()));
      this.d(this.J);
      ke $$1 = this.z.j();
      this.K = new fid(this.o, this.m / 2 - 152, 120, 80, 20, wu.c("structure_block.size.x"));
      this.K.f(15);
      this.K.a(Integer.toString($$1.u()));
      this.d(this.K);
      this.L = new fid(this.o, this.m / 2 - 72, 120, 80, 20, wu.c("structure_block.size.y"));
      this.L.f(15);
      this.L.a(Integer.toString($$1.v()));
      this.d(this.L);
      this.M = new fid(this.o, this.m / 2 + 8, 120, 80, 20, wu.c("structure_block.size.z"));
      this.M.f(15);
      this.M.a(Integer.toString($$1.w()));
      this.d(this.M);
      this.N = new fid(this.o, this.m / 2 - 152, 120, 80, 20, wu.c("structure_block.integrity.integrity"));
      this.N.f(15);
      this.N.a(this.ab.format((double)this.z.x()));
      this.d(this.N);
      this.O = new fid(this.o, this.m / 2 - 72, 120, 80, 20, wu.c("structure_block.integrity.seed"));
      this.O.f(31);
      this.O.a(Long.toString(this.z.y()));
      this.d(this.O);
      this.P = new fid(this.o, this.m / 2 - 152, 120, 240, 20, wu.c("structure_block.custom_data"));
      this.P.f(128);
      this.P.a(this.z.u());
      this.d(this.P);
      this.E();
      this.a(this.C);
   }

   @Override
   protected void aE_() {
      this.b(this.G);
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void a(ffw $$0, int $$1, int $$2) {
      String $$3 = this.G.a();
      String $$4 = this.H.a();
      String $$5 = this.I.a();
      String $$6 = this.J.a();
      String $$7 = this.K.a();
      String $$8 = this.L.a();
      String $$9 = this.M.a();
      String $$10 = this.N.a();
      String $$11 = this.O.a();
      String $$12 = this.P.a();
      this.b($$0, $$1, $$2);
      this.G.a($$3);
      this.H.a($$4);
      this.I.a($$5);
      this.J.a($$6);
      this.K.a($$7);
      this.L.a($$8);
      this.M.a($$9);
      this.N.a($$10);
      this.O.a($$11);
      this.P.a($$12);
   }

   private void E() {
      this.S.j = true;
      this.T.j = true;
      this.U.j = true;
      this.V.j = true;
      switch (this.z.l()) {
         case a:
            this.S.j = false;
            break;
         case c:
            this.U.j = false;
            break;
         case d:
            this.V.j = false;
            break;
         case b:
            this.T.j = false;
      }
   }

   private void a(dtv $$0) {
      this.G.g(false);
      this.H.g(false);
      this.I.g(false);
      this.J.g(false);
      this.K.g(false);
      this.L.g(false);
      this.M.g(false);
      this.N.g(false);
      this.O.g(false);
      this.P.g(false);
      this.Q.k = false;
      this.R.k = false;
      this.W.k = false;
      this.X.k = false;
      this.Y.k = false;
      this.S.k = false;
      this.T.k = false;
      this.U.k = false;
      this.V.k = false;
      this.Z.k = false;
      this.aa.k = false;
      switch ($$0) {
         case a:
            this.G.g(true);
            this.H.g(true);
            this.I.g(true);
            this.J.g(true);
            this.K.g(true);
            this.L.g(true);
            this.M.g(true);
            this.Q.k = true;
            this.W.k = true;
            this.X.k = true;
            this.Z.k = true;
            break;
         case b:
            this.G.g(true);
            this.H.g(true);
            this.I.g(true);
            this.J.g(true);
            this.N.g(true);
            this.O.g(true);
            this.R.k = true;
            this.X.k = true;
            this.Y.k = true;
            this.S.k = true;
            this.T.k = true;
            this.U.k = true;
            this.V.k = true;
            this.aa.k = true;
            this.E();
            break;
         case c:
            this.G.g(true);
            break;
         case d:
            this.P.g(true);
      }
   }

   private boolean a(drg.a $$0) {
      ja $$1 = new ja(this.c(this.H.a()), this.c(this.I.a()), this.c(this.J.a()));
      ke $$2 = new ke(this.c(this.K.a()), this.c(this.L.a()), this.c(this.M.a()));
      float $$3 = this.b(this.N.a());
      long $$4 = this.a(this.O.a());
      this.l
         .L()
         .b(new aht(this.z.az_(), $$0, this.z.v(), this.G.a(), $$1, $$2, this.z.k(), this.z.l(), this.P.a(), this.z.w(), this.z.E(), this.z.F(), $$3, $$4));
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
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dtv $$4 = this.z.v();
      $$0.a(this.o, this.k, this.m / 2, 10, 16777215);
      if ($$4 != dtv.d) {
         $$0.b(this.o, a, this.m / 2 - 153, 30, 10526880);
         this.G.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dtv.b || $$4 == dtv.a) {
         $$0.b(this.o, b, this.m / 2 - 153, 70, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         this.J.a($$0, $$1, $$2, $$3);
         $$0.b(this.o, s, this.m / 2 + 154 - this.o.a(s), 150, 10526880);
      }

      if ($$4 == dtv.a) {
         $$0.b(this.o, c, this.m / 2 - 153, 110, 10526880);
         this.K.a($$0, $$1, $$2, $$3);
         this.L.a($$0, $$1, $$2, $$3);
         this.M.a($$0, $$1, $$2, $$3);
         $$0.b(this.o, u, this.m / 2 + 154 - this.o.a(u), 110, 10526880);
         $$0.b(this.o, v, this.m / 2 + 154 - this.o.a(v), 70, 10526880);
      }

      if ($$4 == dtv.b) {
         $$0.b(this.o, q, this.m / 2 - 153, 110, 10526880);
         this.N.a($$0, $$1, $$2, $$3);
         this.O.a($$0, $$1, $$2, $$3);
         $$0.b(this.o, w, this.m / 2 + 154 - this.o.a(w), 70, 10526880);
      }

      if ($$4 == dtv.d) {
         $$0.b(this.o, r, this.m / 2 - 153, 110, 10526880);
         this.P.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.o, $$4.a(), this.m / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean k() {
      return false;
   }
}
