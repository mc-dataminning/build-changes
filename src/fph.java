import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fph extends fnd {
   private static final wu a = wu.c("structure_block.structure_name");
   private static final wu b = wu.c("structure_block.position");
   private static final wu c = wu.c("structure_block.size");
   private static final wu q = wu.c("structure_block.integrity");
   private static final wu r = wu.c("structure_block.custom_data");
   private static final wu s = wu.c("structure_block.include_entities");
   private static final wu u = wu.c("structure_block.detect_size");
   private static final wu v = wu.c("structure_block.show_air");
   private static final wu w = wu.c("structure_block.show_boundingbox");
   private static final ImmutableList<dtr> x = ImmutableList.copyOf(dtr.values());
   private static final ImmutableList<dtr> y = x.stream().filter($$0 -> $$0 != dtr.d).collect(ImmutableList.toImmutableList());
   private final drc z;
   private dkc A = dkc.a;
   private dls B = dls.a;
   private dtr C = dtr.d;
   private boolean D;
   private boolean E;
   private boolean F;
   private fhv G;
   private fhv H;
   private fhv I;
   private fhv J;
   private fhv K;
   private fhv L;
   private fhv M;
   private fhv N;
   private fhv O;
   private fhv P;
   private fhm Q;
   private fhm R;
   private fhm S;
   private fhm T;
   private fhm U;
   private fhm V;
   private fhm W;
   private fht<Boolean> X;
   private fht<dkc> Y;
   private fht<Boolean> Z;
   private fht<Boolean> aa;
   private final DecimalFormat ab = new DecimalFormat("0.0###");

   public fph(drc $$0) {
      super(wu.c(dfh.pa.g()));
      this.z = $$0;
      this.ab.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(drc.a.a)) {
         this.l.a(null);
      }
   }

   private void E() {
      this.z.a(this.A);
      this.z.a(this.B);
      this.z.a(this.C);
      this.z.a(this.D);
      this.z.d(this.E);
      this.z.e(this.F);
      this.l.a(null);
   }

   @Override
   protected void aO_() {
      this.c((fhm)fhm.a(wt.d, $$0x -> this.m()).a(this.m / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fhm)fhm.a(wt.e, $$0x -> this.E()).a(this.m / 2 + 4, 210, 150, 20).a());
      this.A = this.z.k();
      this.B = this.z.l();
      this.C = this.z.v();
      this.D = this.z.w();
      this.E = this.z.E();
      this.F = this.z.F();
      this.Q = this.c((fhm)fhm.a(wu.c("structure_block.button.save"), $$0x -> {
         if (this.z.v() == dtr.a) {
            this.a(drc.a.b);
            this.l.a(null);
         }
      }).a(this.m / 2 + 4 + 100, 185, 50, 20).a());
      this.R = this.c((fhm)fhm.a(wu.c("structure_block.button.load"), $$0x -> {
         if (this.z.v() == dtr.b) {
            this.a(drc.a.c);
            this.l.a(null);
         }
      }).a(this.m / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fht.<dtr>a($$0x -> wu.c("structure_block.mode." + $$0x.c()))
            .a(y, x)
            .a()
            .a(this.C)
            .a(this.m / 2 - 4 - 150, 185, 50, 20, wu.b("MODE"), ($$0x, $$1x) -> {
               this.z.a($$1x);
               this.a($$1x);
            })
      );
      this.W = this.c((fhm)fhm.a(wu.c("structure_block.button.detect_size"), $$0x -> {
         if (this.z.v() == dtr.a) {
            this.a(drc.a.d);
            this.l.a(null);
         }
      }).a(this.m / 2 + 4 + 100, 120, 50, 20).a());
      this.X = this.c(fht.b(!this.z.w()).a().a(this.m / 2 + 4 + 100, 160, 50, 20, s, ($$0x, $$1x) -> this.z.a(!$$1x)));
      this.Y = this.c(fht.<dkc>a(dkc::b).a(dkc.values()).a().a(this.A).a(this.m / 2 - 20, 185, 40, 20, wu.b("MIRROR"), ($$0x, $$1x) -> this.z.a($$1x)));
      this.Z = this.c(fht.b(this.z.E()).a().a(this.m / 2 + 4 + 100, 80, 50, 20, v, ($$0x, $$1x) -> this.z.d($$1x)));
      this.aa = this.c(fht.b(this.z.F()).a().a(this.m / 2 + 4 + 100, 80, 50, 20, w, ($$0x, $$1x) -> this.z.e($$1x)));
      this.S = this.c((fhm)fhm.a(wu.b("0"), $$0x -> {
         this.z.a(dls.a);
         this.F();
      }).a(this.m / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.T = this.c((fhm)fhm.a(wu.b("90"), $$0x -> {
         this.z.a(dls.b);
         this.F();
      }).a(this.m / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.U = this.c((fhm)fhm.a(wu.b("180"), $$0x -> {
         this.z.a(dls.c);
         this.F();
      }).a(this.m / 2 + 1 + 20, 185, 40, 20).a());
      this.V = this.c((fhm)fhm.a(wu.b("270"), $$0x -> {
         this.z.a(dls.d);
         this.F();
      }).a(this.m / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.G = new fhv(this.o, this.m / 2 - 152, 40, 300, 20, wu.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fph.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.G.f(128);
      this.G.a(this.z.c());
      this.d(this.G);
      ja $$0 = this.z.f();
      this.H = new fhv(this.o, this.m / 2 - 152, 80, 80, 20, wu.c("structure_block.position.x"));
      this.H.f(15);
      this.H.a(Integer.toString($$0.u()));
      this.d(this.H);
      this.I = new fhv(this.o, this.m / 2 - 72, 80, 80, 20, wu.c("structure_block.position.y"));
      this.I.f(15);
      this.I.a(Integer.toString($$0.v()));
      this.d(this.I);
      this.J = new fhv(this.o, this.m / 2 + 8, 80, 80, 20, wu.c("structure_block.position.z"));
      this.J.f(15);
      this.J.a(Integer.toString($$0.w()));
      this.d(this.J);
      ke $$1 = this.z.j();
      this.K = new fhv(this.o, this.m / 2 - 152, 120, 80, 20, wu.c("structure_block.size.x"));
      this.K.f(15);
      this.K.a(Integer.toString($$1.u()));
      this.d(this.K);
      this.L = new fhv(this.o, this.m / 2 - 72, 120, 80, 20, wu.c("structure_block.size.y"));
      this.L.f(15);
      this.L.a(Integer.toString($$1.v()));
      this.d(this.L);
      this.M = new fhv(this.o, this.m / 2 + 8, 120, 80, 20, wu.c("structure_block.size.z"));
      this.M.f(15);
      this.M.a(Integer.toString($$1.w()));
      this.d(this.M);
      this.N = new fhv(this.o, this.m / 2 - 152, 120, 80, 20, wu.c("structure_block.integrity.integrity"));
      this.N.f(15);
      this.N.a(this.ab.format((double)this.z.x()));
      this.d(this.N);
      this.O = new fhv(this.o, this.m / 2 - 72, 120, 80, 20, wu.c("structure_block.integrity.seed"));
      this.O.f(31);
      this.O.a(Long.toString(this.z.y()));
      this.d(this.O);
      this.P = new fhv(this.o, this.m / 2 - 152, 120, 240, 20, wu.c("structure_block.custom_data"));
      this.P.f(128);
      this.P.a(this.z.u());
      this.d(this.P);
      this.F();
      this.a(this.C);
   }

   @Override
   protected void aD_() {
      this.b(this.G);
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2) {
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

   private void F() {
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

   private void a(dtr $$0) {
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
            this.F();
            break;
         case c:
            this.G.g(true);
            break;
         case d:
            this.P.g(true);
      }
   }

   private boolean a(drc.a $$0) {
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
      this.E();
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
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dtr $$4 = this.z.v();
      $$0.a(this.o, this.k, this.m / 2, 10, 16777215);
      if ($$4 != dtr.d) {
         $$0.b(this.o, a, this.m / 2 - 153, 30, 10526880);
         this.G.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dtr.b || $$4 == dtr.a) {
         $$0.b(this.o, b, this.m / 2 - 153, 70, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         this.J.a($$0, $$1, $$2, $$3);
         $$0.b(this.o, s, this.m / 2 + 154 - this.o.a(s), 150, 10526880);
      }

      if ($$4 == dtr.a) {
         $$0.b(this.o, c, this.m / 2 - 153, 110, 10526880);
         this.K.a($$0, $$1, $$2, $$3);
         this.L.a($$0, $$1, $$2, $$3);
         this.M.a($$0, $$1, $$2, $$3);
         $$0.b(this.o, u, this.m / 2 + 154 - this.o.a(u), 110, 10526880);
         $$0.b(this.o, v, this.m / 2 + 154 - this.o.a(v), 70, 10526880);
      }

      if ($$4 == dtr.b) {
         $$0.b(this.o, q, this.m / 2 - 153, 110, 10526880);
         this.N.a($$0, $$1, $$2, $$3);
         this.O.a($$0, $$1, $$2, $$3);
         $$0.b(this.o, w, this.m / 2 + 154 - this.o.a(w), 70, 10526880);
      }

      if ($$4 == dtr.d) {
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
