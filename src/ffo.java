import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ffo extends fdb {
   private static final vf a = vf.c("structure_block.structure_name");
   private static final vf b = vf.c("structure_block.position");
   private static final vf c = vf.c("structure_block.size");
   private static final vf k = vf.c("structure_block.integrity");
   private static final vf l = vf.c("structure_block.custom_data");
   private static final vf m = vf.c("structure_block.include_entities");
   private static final vf n = vf.c("structure_block.detect_size");
   private static final vf o = vf.c("structure_block.show_air");
   private static final vf p = vf.c("structure_block.show_boundingbox");
   private static final ImmutableList<dkr> q = ImmutableList.copyOf(dkr.values());
   private static final ImmutableList<dkr> r = q.stream().filter($$0 -> $$0 != dkr.d).collect(ImmutableList.toImmutableList());
   private final dij t;
   private dbm u = dbm.a;
   private ddc v = ddc.a;
   private dkr w = dkr.d;
   private boolean x;
   private boolean y;
   private boolean z;
   private exp A;
   private exp B;
   private exp C;
   private exp D;
   private exp E;
   private exp F;
   private exp G;
   private exp H;
   private exp I;
   private exp J;
   private exg K;
   private exg L;
   private exg M;
   private exg N;
   private exg O;
   private exg P;
   private exg Q;
   private exn<Boolean> R;
   private exn<dbm> S;
   private exn<Boolean> T;
   private exn<Boolean> U;
   private final DecimalFormat V = new DecimalFormat("0.0###");

   public ffo(dij $$0) {
      super(vf.c(cws.pa.h()));
      this.t = $$0;
      this.V.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void n() {
      if (this.a(dij.a.a)) {
         this.f.a(null);
      }
   }

   private void D() {
      this.t.a(this.u);
      this.t.a(this.v);
      this.t.a(this.w);
      this.t.a(this.x);
      this.t.d(this.y);
      this.t.e(this.z);
      this.f.a(null);
   }

   @Override
   protected void aN_() {
      this.d(exg.a(ve.d, $$0x -> this.n()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(exg.a(ve.e, $$0x -> this.D()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.u = this.t.l();
      this.v = this.t.m();
      this.w = this.t.x();
      this.x = this.t.y();
      this.y = this.t.G();
      this.z = this.t.H();
      this.K = this.d(exg.a(vf.c("structure_block.button.save"), $$0x -> {
         if (this.t.x() == dkr.a) {
            this.a(dij.a.b);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.L = this.d(exg.a(vf.c("structure_block.button.load"), $$0x -> {
         if (this.t.x() == dkr.b) {
            this.a(dij.a.c);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.d(
         exn.<dkr>a($$0x -> vf.c("structure_block.mode." + $$0x.c()))
            .a(r, q)
            .a()
            .a(this.w)
            .a(this.g / 2 - 4 - 150, 185, 50, 20, vf.b("MODE"), ($$0x, $$1x) -> {
               this.t.a($$1x);
               this.a($$1x);
            })
      );
      this.Q = this.d(exg.a(vf.c("structure_block.button.detect_size"), $$0x -> {
         if (this.t.x() == dkr.a) {
            this.a(dij.a.d);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 120, 50, 20).a());
      this.R = this.d(exn.b(!this.t.y()).a().a(this.g / 2 + 4 + 100, 160, 50, 20, m, ($$0x, $$1x) -> this.t.a(!$$1x)));
      this.S = this.d(exn.<dbm>a(dbm::b).a(dbm.values()).a().a(this.u).a(this.g / 2 - 20, 185, 40, 20, vf.b("MIRROR"), ($$0x, $$1x) -> this.t.a($$1x)));
      this.T = this.d(exn.b(this.t.G()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, o, ($$0x, $$1x) -> this.t.d($$1x)));
      this.U = this.d(exn.b(this.t.H()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, p, ($$0x, $$1x) -> this.t.e($$1x)));
      this.M = this.d(exg.a(vf.b("0"), $$0x -> {
         this.t.a(ddc.a);
         this.E();
      }).a(this.g / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.N = this.d(exg.a(vf.b("90"), $$0x -> {
         this.t.a(ddc.b);
         this.E();
      }).a(this.g / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.O = this.d(exg.a(vf.b("180"), $$0x -> {
         this.t.a(ddc.c);
         this.E();
      }).a(this.g / 2 + 1 + 20, 185, 40, 20).a());
      this.P = this.d(exg.a(vf.b("270"), $$0x -> {
         this.t.a(ddc.d);
         this.E();
      }).a(this.g / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.A = new exp(this.i, this.g / 2 - 152, 40, 300, 20, vf.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !ffo.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.A.f(128);
      this.A.a(this.t.d());
      this.e(this.A);
      hx $$0 = this.t.g();
      this.B = new exp(this.i, this.g / 2 - 152, 80, 80, 20, vf.c("structure_block.position.x"));
      this.B.f(15);
      this.B.a(Integer.toString($$0.u()));
      this.e(this.B);
      this.C = new exp(this.i, this.g / 2 - 72, 80, 80, 20, vf.c("structure_block.position.y"));
      this.C.f(15);
      this.C.a(Integer.toString($$0.v()));
      this.e(this.C);
      this.D = new exp(this.i, this.g / 2 + 8, 80, 80, 20, vf.c("structure_block.position.z"));
      this.D.f(15);
      this.D.a(Integer.toString($$0.w()));
      this.e(this.D);
      jb $$1 = this.t.k();
      this.E = new exp(this.i, this.g / 2 - 152, 120, 80, 20, vf.c("structure_block.size.x"));
      this.E.f(15);
      this.E.a(Integer.toString($$1.u()));
      this.e(this.E);
      this.F = new exp(this.i, this.g / 2 - 72, 120, 80, 20, vf.c("structure_block.size.y"));
      this.F.f(15);
      this.F.a(Integer.toString($$1.v()));
      this.e(this.F);
      this.G = new exp(this.i, this.g / 2 + 8, 120, 80, 20, vf.c("structure_block.size.z"));
      this.G.f(15);
      this.G.a(Integer.toString($$1.w()));
      this.e(this.G);
      this.H = new exp(this.i, this.g / 2 - 152, 120, 80, 20, vf.c("structure_block.integrity.integrity"));
      this.H.f(15);
      this.H.a(this.V.format((double)this.t.z()));
      this.e(this.H);
      this.I = new exp(this.i, this.g / 2 - 72, 120, 80, 20, vf.c("structure_block.integrity.seed"));
      this.I.f(31);
      this.I.a(Long.toString(this.t.A()));
      this.e(this.I);
      this.J = new exp(this.i, this.g / 2 - 152, 120, 240, 20, vf.c("structure_block.custom_data"));
      this.J.f(128);
      this.J.a(this.t.w());
      this.e(this.J);
      this.E();
      this.a(this.w);
      this.c(this.A);
   }

   @Override
   public void a(evi $$0, int $$1, int $$2) {
      String $$3 = this.A.a();
      String $$4 = this.B.a();
      String $$5 = this.C.a();
      String $$6 = this.D.a();
      String $$7 = this.E.a();
      String $$8 = this.F.a();
      String $$9 = this.G.a();
      String $$10 = this.H.a();
      String $$11 = this.I.a();
      String $$12 = this.J.a();
      this.b($$0, $$1, $$2);
      this.A.a($$3);
      this.B.a($$4);
      this.C.a($$5);
      this.D.a($$6);
      this.E.a($$7);
      this.F.a($$8);
      this.G.a($$9);
      this.H.a($$10);
      this.I.a($$11);
      this.J.a($$12);
   }

   private void E() {
      this.M.j = true;
      this.N.j = true;
      this.O.j = true;
      this.P.j = true;
      switch (this.t.m()) {
         case a:
            this.M.j = false;
            break;
         case c:
            this.O.j = false;
            break;
         case d:
            this.P.j = false;
            break;
         case b:
            this.N.j = false;
      }
   }

   private void a(dkr $$0) {
      this.A.g(false);
      this.B.g(false);
      this.C.g(false);
      this.D.g(false);
      this.E.g(false);
      this.F.g(false);
      this.G.g(false);
      this.H.g(false);
      this.I.g(false);
      this.J.g(false);
      this.K.k = false;
      this.L.k = false;
      this.Q.k = false;
      this.R.k = false;
      this.S.k = false;
      this.M.k = false;
      this.N.k = false;
      this.O.k = false;
      this.P.k = false;
      this.T.k = false;
      this.U.k = false;
      switch ($$0) {
         case a:
            this.A.g(true);
            this.B.g(true);
            this.C.g(true);
            this.D.g(true);
            this.E.g(true);
            this.F.g(true);
            this.G.g(true);
            this.K.k = true;
            this.Q.k = true;
            this.R.k = true;
            this.T.k = true;
            break;
         case b:
            this.A.g(true);
            this.B.g(true);
            this.C.g(true);
            this.D.g(true);
            this.H.g(true);
            this.I.g(true);
            this.L.k = true;
            this.R.k = true;
            this.S.k = true;
            this.M.k = true;
            this.N.k = true;
            this.O.k = true;
            this.P.k = true;
            this.U.k = true;
            this.E();
            break;
         case c:
            this.A.g(true);
            break;
         case d:
            this.J.g(true);
      }
   }

   private boolean a(dij.a $$0) {
      hx $$1 = new hx(this.c(this.B.a()), this.c(this.C.a()), this.c(this.D.a()));
      jb $$2 = new jb(this.c(this.E.a()), this.c(this.F.a()), this.c(this.G.a()));
      float $$3 = this.b(this.H.a());
      long $$4 = this.a(this.I.a());
      this.f
         .J()
         .b(new afa(this.t.aB_(), $$0, this.t.x(), this.A.a(), $$1, $$2, this.t.l(), this.t.m(), this.J.a(), this.t.y(), this.t.G(), this.t.H(), $$3, $$4));
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
   public void aE_() {
      this.D();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.n();
         return true;
      }
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dkr $$4 = this.t.x();
      $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      if ($$4 != dkr.d) {
         $$0.b(this.i, a, this.g / 2 - 153, 30, 10526880);
         this.A.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dkr.b || $$4 == dkr.a) {
         $$0.b(this.i, b, this.g / 2 - 153, 70, 10526880);
         this.B.a($$0, $$1, $$2, $$3);
         this.C.a($$0, $$1, $$2, $$3);
         this.D.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, m, this.g / 2 + 154 - this.i.a(m), 150, 10526880);
      }

      if ($$4 == dkr.a) {
         $$0.b(this.i, c, this.g / 2 - 153, 110, 10526880);
         this.E.a($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, n, this.g / 2 + 154 - this.i.a(n), 110, 10526880);
         $$0.b(this.i, o, this.g / 2 + 154 - this.i.a(o), 70, 10526880);
      }

      if ($$4 == dkr.b) {
         $$0.b(this.i, k, this.g / 2 - 153, 110, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, p, this.g / 2 + 154 - this.i.a(p), 70, 10526880);
      }

      if ($$4 == dkr.d) {
         $$0.b(this.i, l, this.g / 2 - 153, 110, 10526880);
         this.J.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.i, $$4.a(), this.g / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean k() {
      return false;
   }
}
