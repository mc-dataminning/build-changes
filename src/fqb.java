import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fqb extends fnx {
   private static final wy a = wy.c("structure_block.structure_name");
   private static final wy b = wy.c("structure_block.position");
   private static final wy c = wy.c("structure_block.size");
   private static final wy q = wy.c("structure_block.integrity");
   private static final wy r = wy.c("structure_block.custom_data");
   private static final wy s = wy.c("structure_block.include_entities");
   private static final wy u = wy.c("structure_block.detect_size");
   private static final wy v = wy.c("structure_block.show_air");
   private static final wy w = wy.c("structure_block.show_boundingbox");
   private static final ImmutableList<duk> x = ImmutableList.copyOf(duk.values());
   private static final ImmutableList<duk> y = x.stream().filter($$0 -> $$0 != duk.d).collect(ImmutableList.toImmutableList());
   private final drv z;
   private dkt A = dkt.a;
   private dmk B = dmk.a;
   private duk C = duk.d;
   private boolean D;
   private boolean E;
   private boolean F;
   private fip G;
   private fip H;
   private fip I;
   private fip J;
   private fip K;
   private fip L;
   private fip M;
   private fip N;
   private fip O;
   private fip P;
   private fig Q;
   private fig R;
   private fig S;
   private fig T;
   private fig U;
   private fig V;
   private fig W;
   private fin<Boolean> X;
   private fin<dkt> Y;
   private fin<Boolean> Z;
   private fin<Boolean> aa;
   private final DecimalFormat ab = new DecimalFormat("0.0###");

   public fqb(drv $$0) {
      super(wy.c(dfy.pa.g()));
      this.z = $$0;
      this.ab.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(drv.a.a)) {
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
      this.c((fig)fig.a(wx.d, $$0x -> this.m()).a(this.m / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fig)fig.a(wx.e, $$0x -> this.D()).a(this.m / 2 + 4, 210, 150, 20).a());
      this.A = this.z.k();
      this.B = this.z.l();
      this.C = this.z.v();
      this.D = this.z.w();
      this.E = this.z.E();
      this.F = this.z.F();
      this.Q = this.c((fig)fig.a(wy.c("structure_block.button.save"), $$0x -> {
         if (this.z.v() == duk.a) {
            this.a(drv.a.b);
            this.l.a(null);
         }
      }).a(this.m / 2 + 4 + 100, 185, 50, 20).a());
      this.R = this.c((fig)fig.a(wy.c("structure_block.button.load"), $$0x -> {
         if (this.z.v() == duk.b) {
            this.a(drv.a.c);
            this.l.a(null);
         }
      }).a(this.m / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fin.<duk>a($$0x -> wy.c("structure_block.mode." + $$0x.c()))
            .a(y, x)
            .a()
            .a(this.C)
            .a(this.m / 2 - 4 - 150, 185, 50, 20, wy.b("MODE"), ($$0x, $$1x) -> {
               this.z.a($$1x);
               this.a($$1x);
            })
      );
      this.W = this.c((fig)fig.a(wy.c("structure_block.button.detect_size"), $$0x -> {
         if (this.z.v() == duk.a) {
            this.a(drv.a.d);
            this.l.a(null);
         }
      }).a(this.m / 2 + 4 + 100, 120, 50, 20).a());
      this.X = this.c(fin.b(!this.z.w()).a().a(this.m / 2 + 4 + 100, 160, 50, 20, s, ($$0x, $$1x) -> this.z.a(!$$1x)));
      this.Y = this.c(fin.<dkt>a(dkt::b).a(dkt.values()).a().a(this.A).a(this.m / 2 - 20, 185, 40, 20, wy.b("MIRROR"), ($$0x, $$1x) -> this.z.a($$1x)));
      this.Z = this.c(fin.b(this.z.E()).a().a(this.m / 2 + 4 + 100, 80, 50, 20, v, ($$0x, $$1x) -> this.z.d($$1x)));
      this.aa = this.c(fin.b(this.z.F()).a().a(this.m / 2 + 4 + 100, 80, 50, 20, w, ($$0x, $$1x) -> this.z.e($$1x)));
      this.S = this.c((fig)fig.a(wy.b("0"), $$0x -> {
         this.z.a(dmk.a);
         this.E();
      }).a(this.m / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.T = this.c((fig)fig.a(wy.b("90"), $$0x -> {
         this.z.a(dmk.b);
         this.E();
      }).a(this.m / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.U = this.c((fig)fig.a(wy.b("180"), $$0x -> {
         this.z.a(dmk.c);
         this.E();
      }).a(this.m / 2 + 1 + 20, 185, 40, 20).a());
      this.V = this.c((fig)fig.a(wy.b("270"), $$0x -> {
         this.z.a(dmk.d);
         this.E();
      }).a(this.m / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.G = new fip(this.o, this.m / 2 - 152, 40, 300, 20, wy.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fqb.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.G.f(128);
      this.G.a(this.z.c());
      this.d(this.G);
      jd $$0 = this.z.f();
      this.H = new fip(this.o, this.m / 2 - 152, 80, 80, 20, wy.c("structure_block.position.x"));
      this.H.f(15);
      this.H.a(Integer.toString($$0.u()));
      this.d(this.H);
      this.I = new fip(this.o, this.m / 2 - 72, 80, 80, 20, wy.c("structure_block.position.y"));
      this.I.f(15);
      this.I.a(Integer.toString($$0.v()));
      this.d(this.I);
      this.J = new fip(this.o, this.m / 2 + 8, 80, 80, 20, wy.c("structure_block.position.z"));
      this.J.f(15);
      this.J.a(Integer.toString($$0.w()));
      this.d(this.J);
      kh $$1 = this.z.j();
      this.K = new fip(this.o, this.m / 2 - 152, 120, 80, 20, wy.c("structure_block.size.x"));
      this.K.f(15);
      this.K.a(Integer.toString($$1.u()));
      this.d(this.K);
      this.L = new fip(this.o, this.m / 2 - 72, 120, 80, 20, wy.c("structure_block.size.y"));
      this.L.f(15);
      this.L.a(Integer.toString($$1.v()));
      this.d(this.L);
      this.M = new fip(this.o, this.m / 2 + 8, 120, 80, 20, wy.c("structure_block.size.z"));
      this.M.f(15);
      this.M.a(Integer.toString($$1.w()));
      this.d(this.M);
      this.N = new fip(this.o, this.m / 2 - 152, 120, 80, 20, wy.c("structure_block.integrity.integrity"));
      this.N.f(15);
      this.N.a(this.ab.format((double)this.z.x()));
      this.d(this.N);
      this.O = new fip(this.o, this.m / 2 - 72, 120, 80, 20, wy.c("structure_block.integrity.seed"));
      this.O.f(31);
      this.O.a(Long.toString(this.z.y()));
      this.d(this.O);
      this.P = new fip(this.o, this.m / 2 - 152, 120, 240, 20, wy.c("structure_block.custom_data"));
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
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void a(fgi $$0, int $$1, int $$2) {
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

   private void a(duk $$0) {
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

   private boolean a(drv.a $$0) {
      jd $$1 = new jd(this.c(this.H.a()), this.c(this.I.a()), this.c(this.J.a()));
      kh $$2 = new kh(this.c(this.K.a()), this.c(this.L.a()), this.c(this.M.a()));
      float $$3 = this.b(this.N.a());
      long $$4 = this.a(this.O.a());
      this.l
         .L()
         .b(new ahz(this.z.az_(), $$0, this.z.v(), this.G.a(), $$1, $$2, this.z.k(), this.z.l(), this.P.a(), this.z.w(), this.z.E(), this.z.F(), $$3, $$4));
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
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      duk $$4 = this.z.v();
      $$0.a(this.o, this.k, this.m / 2, 10, 16777215);
      if ($$4 != duk.d) {
         $$0.b(this.o, a, this.m / 2 - 153, 30, 10526880);
         this.G.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == duk.b || $$4 == duk.a) {
         $$0.b(this.o, b, this.m / 2 - 153, 70, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         this.J.a($$0, $$1, $$2, $$3);
         $$0.b(this.o, s, this.m / 2 + 154 - this.o.a(s), 150, 10526880);
      }

      if ($$4 == duk.a) {
         $$0.b(this.o, c, this.m / 2 - 153, 110, 10526880);
         this.K.a($$0, $$1, $$2, $$3);
         this.L.a($$0, $$1, $$2, $$3);
         this.M.a($$0, $$1, $$2, $$3);
         $$0.b(this.o, u, this.m / 2 + 154 - this.o.a(u), 110, 10526880);
         $$0.b(this.o, v, this.m / 2 + 154 - this.o.a(v), 70, 10526880);
      }

      if ($$4 == duk.b) {
         $$0.b(this.o, q, this.m / 2 - 153, 110, 10526880);
         this.N.a($$0, $$1, $$2, $$3);
         this.O.a($$0, $$1, $$2, $$3);
         $$0.b(this.o, w, this.m / 2 + 154 - this.o.a(w), 70, 10526880);
      }

      if ($$4 == duk.d) {
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
