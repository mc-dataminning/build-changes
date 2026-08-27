import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fdh extends fau {
   private static final ur a = ur.c("structure_block.structure_name");
   private static final ur b = ur.c("structure_block.position");
   private static final ur c = ur.c("structure_block.size");
   private static final ur k = ur.c("structure_block.integrity");
   private static final ur l = ur.c("structure_block.custom_data");
   private static final ur m = ur.c("structure_block.include_entities");
   private static final ur n = ur.c("structure_block.detect_size");
   private static final ur o = ur.c("structure_block.show_air");
   private static final ur p = ur.c("structure_block.show_boundingbox");
   private static final ImmutableList<dis> q = ImmutableList.copyOf(dis.values());
   private static final ImmutableList<dis> r = q.stream().filter($$0 -> $$0 != dis.d).collect(ImmutableList.toImmutableList());
   private final dgr t;
   private czw u = czw.a;
   private dbm v = dbm.a;
   private dis w = dis.d;
   private boolean x;
   private boolean y;
   private boolean z;
   private evi A;
   private evi B;
   private evi C;
   private evi D;
   private evi E;
   private evi F;
   private evi G;
   private evi H;
   private evi I;
   private evi J;
   private euz K;
   private euz L;
   private euz M;
   private euz N;
   private euz O;
   private euz P;
   private euz Q;
   private evg<Boolean> R;
   private evg<czw> S;
   private evg<Boolean> T;
   private evg<Boolean> U;
   private final DecimalFormat V = new DecimalFormat("0.0###");

   public fdh(dgr $$0) {
      super(ur.c(cvc.pa.h()));
      this.t = $$0;
      this.V.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void l() {
      if (this.a(dgr.a.a)) {
         this.f.a(null);
      }
   }

   private void C() {
      this.t.a(this.u);
      this.t.a(this.v);
      this.t.a(this.w);
      this.t.a(this.x);
      this.t.d(this.y);
      this.t.e(this.z);
      this.f.a(null);
   }

   @Override
   protected void aP_() {
      this.d(euz.a(uq.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(euz.a(uq.e, $$0x -> this.C()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.u = this.t.v();
      this.v = this.t.w();
      this.w = this.t.y();
      this.x = this.t.z();
      this.y = this.t.H();
      this.z = this.t.I();
      this.K = this.d(euz.a(ur.c("structure_block.button.save"), $$0x -> {
         if (this.t.y() == dis.a) {
            this.a(dgr.a.b);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.L = this.d(euz.a(ur.c("structure_block.button.load"), $$0x -> {
         if (this.t.y() == dis.b) {
            this.a(dgr.a.c);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.d(
         evg.<dis>a($$0x -> ur.c("structure_block.mode." + $$0x.c()))
            .a(r, q)
            .a()
            .a(this.w)
            .a(this.g / 2 - 4 - 150, 185, 50, 20, ur.b("MODE"), ($$0x, $$1x) -> {
               this.t.a($$1x);
               this.a($$1x);
            })
      );
      this.Q = this.d(euz.a(ur.c("structure_block.button.detect_size"), $$0x -> {
         if (this.t.y() == dis.a) {
            this.a(dgr.a.d);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 120, 50, 20).a());
      this.R = this.d(evg.b(!this.t.z()).a().a(this.g / 2 + 4 + 100, 160, 50, 20, m, ($$0x, $$1x) -> this.t.a(!$$1x)));
      this.S = this.d(evg.<czw>a(czw::b).a(czw.values()).a().a(this.u).a(this.g / 2 - 20, 185, 40, 20, ur.b("MIRROR"), ($$0x, $$1x) -> this.t.a($$1x)));
      this.T = this.d(evg.b(this.t.H()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, o, ($$0x, $$1x) -> this.t.d($$1x)));
      this.U = this.d(evg.b(this.t.I()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, p, ($$0x, $$1x) -> this.t.e($$1x)));
      this.M = this.d(euz.a(ur.b("0"), $$0x -> {
         this.t.a(dbm.a);
         this.D();
      }).a(this.g / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.N = this.d(euz.a(ur.b("90"), $$0x -> {
         this.t.a(dbm.b);
         this.D();
      }).a(this.g / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.O = this.d(euz.a(ur.b("180"), $$0x -> {
         this.t.a(dbm.c);
         this.D();
      }).a(this.g / 2 + 1 + 20, 185, 40, 20).a());
      this.P = this.d(euz.a(ur.b("270"), $$0x -> {
         this.t.a(dbm.d);
         this.D();
      }).a(this.g / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.A = new evi(this.i, this.g / 2 - 152, 40, 300, 20, ur.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fdh.this.a(this.a(), $$0, this.f()) ? false : super.a($$0, $$1);
         }
      };
      this.A.l(128);
      this.A.a(this.t.d());
      this.e(this.A);
      ht $$0 = this.t.i();
      this.B = new evi(this.i, this.g / 2 - 152, 80, 80, 20, ur.c("structure_block.position.x"));
      this.B.l(15);
      this.B.a(Integer.toString($$0.u()));
      this.e(this.B);
      this.C = new evi(this.i, this.g / 2 - 72, 80, 80, 20, ur.c("structure_block.position.y"));
      this.C.l(15);
      this.C.a(Integer.toString($$0.v()));
      this.e(this.C);
      this.D = new evi(this.i, this.g / 2 + 8, 80, 80, 20, ur.c("structure_block.position.z"));
      this.D.l(15);
      this.D.a(Integer.toString($$0.w()));
      this.e(this.D);
      iw $$1 = this.t.j();
      this.E = new evi(this.i, this.g / 2 - 152, 120, 80, 20, ur.c("structure_block.size.x"));
      this.E.l(15);
      this.E.a(Integer.toString($$1.u()));
      this.e(this.E);
      this.F = new evi(this.i, this.g / 2 - 72, 120, 80, 20, ur.c("structure_block.size.y"));
      this.F.l(15);
      this.F.a(Integer.toString($$1.v()));
      this.e(this.F);
      this.G = new evi(this.i, this.g / 2 + 8, 120, 80, 20, ur.c("structure_block.size.z"));
      this.G.l(15);
      this.G.a(Integer.toString($$1.w()));
      this.e(this.G);
      this.H = new evi(this.i, this.g / 2 - 152, 120, 80, 20, ur.c("structure_block.integrity.integrity"));
      this.H.l(15);
      this.H.a(this.V.format((double)this.t.A()));
      this.e(this.H);
      this.I = new evi(this.i, this.g / 2 - 72, 120, 80, 20, ur.c("structure_block.integrity.seed"));
      this.I.l(31);
      this.I.a(Long.toString(this.t.B()));
      this.e(this.I);
      this.J = new evi(this.i, this.g / 2 - 152, 120, 240, 20, ur.c("structure_block.custom_data"));
      this.J.l(128);
      this.J.a(this.t.x());
      this.e(this.J);
      this.D();
      this.a(this.w);
      this.c(this.A);
   }

   @Override
   public void a(etd $$0, int $$1, int $$2) {
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

   private void D() {
      this.M.i = true;
      this.N.i = true;
      this.O.i = true;
      this.P.i = true;
      switch (this.t.w()) {
         case a:
            this.M.i = false;
            break;
         case c:
            this.O.i = false;
            break;
         case d:
            this.P.i = false;
            break;
         case b:
            this.N.i = false;
      }
   }

   private void a(dis $$0) {
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
      this.K.j = false;
      this.L.j = false;
      this.Q.j = false;
      this.R.j = false;
      this.S.j = false;
      this.M.j = false;
      this.N.j = false;
      this.O.j = false;
      this.P.j = false;
      this.T.j = false;
      this.U.j = false;
      switch ($$0) {
         case a:
            this.A.g(true);
            this.B.g(true);
            this.C.g(true);
            this.D.g(true);
            this.E.g(true);
            this.F.g(true);
            this.G.g(true);
            this.K.j = true;
            this.Q.j = true;
            this.R.j = true;
            this.T.j = true;
            break;
         case b:
            this.A.g(true);
            this.B.g(true);
            this.C.g(true);
            this.D.g(true);
            this.H.g(true);
            this.I.g(true);
            this.L.j = true;
            this.R.j = true;
            this.S.j = true;
            this.M.j = true;
            this.N.j = true;
            this.O.j = true;
            this.P.j = true;
            this.U.j = true;
            this.D();
            break;
         case c:
            this.A.g(true);
            break;
         case d:
            this.J.g(true);
      }
   }

   private boolean a(dgr.a $$0) {
      ht $$1 = new ht(this.c(this.B.a()), this.c(this.C.a()), this.c(this.D.a()));
      iw $$2 = new iw(this.c(this.E.a()), this.c(this.F.a()), this.c(this.G.a()));
      float $$3 = this.b(this.H.a());
      long $$4 = this.a(this.I.a());
      this.f
         .I()
         .b(new aec(this.t.p(), $$0, this.t.y(), this.A.a(), $$1, $$2, this.t.v(), this.t.w(), this.J.a(), this.t.z(), this.t.H(), this.t.I(), $$3, $$4));
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
   public void aF_() {
      this.C();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.l();
         return true;
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dis $$4 = this.t.y();
      $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      if ($$4 != dis.d) {
         $$0.b(this.i, a, this.g / 2 - 153, 30, 10526880);
         this.A.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dis.b || $$4 == dis.a) {
         $$0.b(this.i, b, this.g / 2 - 153, 70, 10526880);
         this.B.a($$0, $$1, $$2, $$3);
         this.C.a($$0, $$1, $$2, $$3);
         this.D.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, m, this.g / 2 + 154 - this.i.a(m), 150, 10526880);
      }

      if ($$4 == dis.a) {
         $$0.b(this.i, c, this.g / 2 - 153, 110, 10526880);
         this.E.a($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, n, this.g / 2 + 154 - this.i.a(n), 110, 10526880);
         $$0.b(this.i, o, this.g / 2 + 154 - this.i.a(o), 70, 10526880);
      }

      if ($$4 == dis.b) {
         $$0.b(this.i, k, this.g / 2 - 153, 110, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, p, this.g / 2 + 154 - this.i.a(p), 70, 10526880);
      }

      if ($$4 == dis.d) {
         $$0.b(this.i, l, this.g / 2 - 153, 110, 10526880);
         this.J.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.i, $$4.a(), this.g / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean j() {
      return false;
   }
}
