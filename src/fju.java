import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fju extends fhh {
   private static final vu a = vu.c("structure_block.structure_name");
   private static final vu b = vu.c("structure_block.position");
   private static final vu c = vu.c("structure_block.size");
   private static final vu k = vu.c("structure_block.integrity");
   private static final vu l = vu.c("structure_block.custom_data");
   private static final vu m = vu.c("structure_block.include_entities");
   private static final vu n = vu.c("structure_block.detect_size");
   private static final vu o = vu.c("structure_block.show_air");
   private static final vu p = vu.c("structure_block.show_boundingbox");
   private static final ImmutableList<dol> q = ImmutableList.copyOf(dol.values());
   private static final ImmutableList<dol> r = q.stream().filter($$0 -> $$0 != dol.d).collect(ImmutableList.toImmutableList());
   private final dlw t;
   private dey u = dey.a;
   private dgo v = dgo.a;
   private dol w = dol.d;
   private boolean x;
   private boolean y;
   private boolean z;
   private fbr A;
   private fbr B;
   private fbr C;
   private fbr D;
   private fbr E;
   private fbr F;
   private fbr G;
   private fbr H;
   private fbr I;
   private fbr J;
   private fbi K;
   private fbi L;
   private fbi M;
   private fbi N;
   private fbi O;
   private fbi P;
   private fbi Q;
   private fbp<Boolean> R;
   private fbp<dey> S;
   private fbp<Boolean> T;
   private fbp<Boolean> U;
   private final DecimalFormat V = new DecimalFormat("0.0###");

   public fju(dlw $$0) {
      super(vu.c(dae.pa.g()));
      this.t = $$0;
      this.V.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void o() {
      if (this.a(dlw.a.a)) {
         this.f.a(null);
      }
   }

   private void E() {
      this.t.a(this.u);
      this.t.a(this.v);
      this.t.a(this.w);
      this.t.a(this.x);
      this.t.d(this.y);
      this.t.e(this.z);
      this.f.a(null);
   }

   @Override
   protected void aO_() {
      this.c((fbi)fbi.a(vt.d, $$0x -> this.o()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fbi)fbi.a(vt.e, $$0x -> this.E()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.u = this.t.k();
      this.v = this.t.l();
      this.w = this.t.t();
      this.x = this.t.u();
      this.y = this.t.C();
      this.z = this.t.D();
      this.K = this.c((fbi)fbi.a(vu.c("structure_block.button.save"), $$0x -> {
         if (this.t.t() == dol.a) {
            this.a(dlw.a.b);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.L = this.c((fbi)fbi.a(vu.c("structure_block.button.load"), $$0x -> {
         if (this.t.t() == dol.b) {
            this.a(dlw.a.c);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fbp.<dol>a($$0x -> vu.c("structure_block.mode." + $$0x.c()))
            .a(r, q)
            .a()
            .a(this.w)
            .a(this.g / 2 - 4 - 150, 185, 50, 20, vu.b("MODE"), ($$0x, $$1x) -> {
               this.t.a($$1x);
               this.a($$1x);
            })
      );
      this.Q = this.c((fbi)fbi.a(vu.c("structure_block.button.detect_size"), $$0x -> {
         if (this.t.t() == dol.a) {
            this.a(dlw.a.d);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 120, 50, 20).a());
      this.R = this.c(fbp.b(!this.t.u()).a().a(this.g / 2 + 4 + 100, 160, 50, 20, m, ($$0x, $$1x) -> this.t.a(!$$1x)));
      this.S = this.c(fbp.<dey>a(dey::b).a(dey.values()).a().a(this.u).a(this.g / 2 - 20, 185, 40, 20, vu.b("MIRROR"), ($$0x, $$1x) -> this.t.a($$1x)));
      this.T = this.c(fbp.b(this.t.C()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, o, ($$0x, $$1x) -> this.t.d($$1x)));
      this.U = this.c(fbp.b(this.t.D()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, p, ($$0x, $$1x) -> this.t.e($$1x)));
      this.M = this.c((fbi)fbi.a(vu.b("0"), $$0x -> {
         this.t.a(dgo.a);
         this.H();
      }).a(this.g / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.N = this.c((fbi)fbi.a(vu.b("90"), $$0x -> {
         this.t.a(dgo.b);
         this.H();
      }).a(this.g / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.O = this.c((fbi)fbi.a(vu.b("180"), $$0x -> {
         this.t.a(dgo.c);
         this.H();
      }).a(this.g / 2 + 1 + 20, 185, 40, 20).a());
      this.P = this.c((fbi)fbi.a(vu.b("270"), $$0x -> {
         this.t.a(dgo.d);
         this.H();
      }).a(this.g / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.A = new fbr(this.i, this.g / 2 - 152, 40, 300, 20, vu.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fju.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.A.f(128);
      this.A.a(this.t.c());
      this.d(this.A);
      ib $$0 = this.t.f();
      this.B = new fbr(this.i, this.g / 2 - 152, 80, 80, 20, vu.c("structure_block.position.x"));
      this.B.f(15);
      this.B.a(Integer.toString($$0.u()));
      this.d(this.B);
      this.C = new fbr(this.i, this.g / 2 - 72, 80, 80, 20, vu.c("structure_block.position.y"));
      this.C.f(15);
      this.C.a(Integer.toString($$0.v()));
      this.d(this.C);
      this.D = new fbr(this.i, this.g / 2 + 8, 80, 80, 20, vu.c("structure_block.position.z"));
      this.D.f(15);
      this.D.a(Integer.toString($$0.w()));
      this.d(this.D);
      jg $$1 = this.t.j();
      this.E = new fbr(this.i, this.g / 2 - 152, 120, 80, 20, vu.c("structure_block.size.x"));
      this.E.f(15);
      this.E.a(Integer.toString($$1.u()));
      this.d(this.E);
      this.F = new fbr(this.i, this.g / 2 - 72, 120, 80, 20, vu.c("structure_block.size.y"));
      this.F.f(15);
      this.F.a(Integer.toString($$1.v()));
      this.d(this.F);
      this.G = new fbr(this.i, this.g / 2 + 8, 120, 80, 20, vu.c("structure_block.size.z"));
      this.G.f(15);
      this.G.a(Integer.toString($$1.w()));
      this.d(this.G);
      this.H = new fbr(this.i, this.g / 2 - 152, 120, 80, 20, vu.c("structure_block.integrity.integrity"));
      this.H.f(15);
      this.H.a(this.V.format((double)this.t.v()));
      this.d(this.H);
      this.I = new fbr(this.i, this.g / 2 - 72, 120, 80, 20, vu.c("structure_block.integrity.seed"));
      this.I.f(31);
      this.I.a(Long.toString(this.t.w()));
      this.d(this.I);
      this.J = new fbr(this.i, this.g / 2 - 152, 120, 240, 20, vu.c("structure_block.custom_data"));
      this.J.f(128);
      this.J.a(this.t.s());
      this.d(this.J);
      this.H();
      this.a(this.w);
   }

   @Override
   protected void aF_() {
      this.b(this.A);
   }

   @Override
   public void a(ezi $$0, int $$1, int $$2) {
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

   private void H() {
      this.M.j = true;
      this.N.j = true;
      this.O.j = true;
      this.P.j = true;
      switch (this.t.l()) {
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

   private void a(dol $$0) {
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
            this.H();
            break;
         case c:
            this.A.g(true);
            break;
         case d:
            this.J.g(true);
      }
   }

   private boolean a(dlw.a $$0) {
      ib $$1 = new ib(this.c(this.B.a()), this.c(this.C.a()), this.c(this.D.a()));
      jg $$2 = new jg(this.c(this.E.a()), this.c(this.F.a()), this.c(this.G.a()));
      float $$3 = this.b(this.H.a());
      long $$4 = this.a(this.I.a());
      this.f
         .L()
         .b(new agq(this.t.aC_(), $$0, this.t.t(), this.A.a(), $$1, $$2, this.t.k(), this.t.l(), this.J.a(), this.t.u(), this.t.C(), this.t.D(), $$3, $$4));
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
         this.o();
         return true;
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dol $$4 = this.t.t();
      $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      if ($$4 != dol.d) {
         $$0.b(this.i, a, this.g / 2 - 153, 30, 10526880);
         this.A.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dol.b || $$4 == dol.a) {
         $$0.b(this.i, b, this.g / 2 - 153, 70, 10526880);
         this.B.a($$0, $$1, $$2, $$3);
         this.C.a($$0, $$1, $$2, $$3);
         this.D.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, m, this.g / 2 + 154 - this.i.a(m), 150, 10526880);
      }

      if ($$4 == dol.a) {
         $$0.b(this.i, c, this.g / 2 - 153, 110, 10526880);
         this.E.a($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, n, this.g / 2 + 154 - this.i.a(n), 110, 10526880);
         $$0.b(this.i, o, this.g / 2 + 154 - this.i.a(o), 70, 10526880);
      }

      if ($$4 == dol.b) {
         $$0.b(this.i, k, this.g / 2 - 153, 110, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, p, this.g / 2 + 154 - this.i.a(p), 70, 10526880);
      }

      if ($$4 == dol.d) {
         $$0.b(this.i, l, this.g / 2 - 153, 110, 10526880);
         this.J.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.i, $$4.a(), this.g / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean m() {
      return false;
   }
}
