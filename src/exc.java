import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class exc extends euq {
   private static final sw a = sw.c("structure_block.structure_name");
   private static final sw b = sw.c("structure_block.position");
   private static final sw c = sw.c("structure_block.size");
   private static final sw k = sw.c("structure_block.integrity");
   private static final sw l = sw.c("structure_block.custom_data");
   private static final sw m = sw.c("structure_block.include_entities");
   private static final sw n = sw.c("structure_block.detect_size");
   private static final sw o = sw.c("structure_block.show_air");
   private static final sw p = sw.c("structure_block.show_boundingbox");
   private static final ImmutableList<ddl> q = ImmutableList.copyOf(ddl.values());
   private static final ImmutableList<ddl> r = q.stream().filter($$0 -> $$0 != ddl.d).collect(ImmutableList.toImmutableList());
   private final dba s;
   private cui t = cui.a;
   private cvz u = cvz.a;
   private ddl v = ddl.d;
   private boolean w;
   private boolean x;
   private boolean y;
   private epr z;
   private epr A;
   private epr C;
   private epr D;
   private epr E;
   private epr F;
   private epr G;
   private epr H;
   private epr I;
   private epr J;
   private epi K;
   private epi L;
   private epi M;
   private epi N;
   private epi O;
   private epi P;
   private epi Q;
   private epp<Boolean> R;
   private epp<cui> S;
   private epp<Boolean> T;
   private epp<Boolean> U;
   private final DecimalFormat V = new DecimalFormat("0.0###");

   public exc(dba $$0) {
      super(sw.c(cpo.pa.f()));
      this.s = $$0;
      this.V.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   @Override
   public void f() {
      this.z.a();
      this.A.a();
      this.C.a();
      this.D.a();
      this.E.a();
      this.F.a();
      this.G.a();
      this.H.a();
      this.I.a();
      this.J.a();
   }

   private void l() {
      if (this.a(dba.a.a)) {
         this.f.a(null);
      }
   }

   private void B() {
      this.s.a(this.t);
      this.s.a(this.u);
      this.s.a(this.v);
      this.s.a(this.w);
      this.s.d(this.x);
      this.s.e(this.y);
      this.f.a(null);
   }

   @Override
   protected void b() {
      this.d(epi.a(sv.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(epi.a(sv.e, $$0x -> this.B()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.t = this.s.v();
      this.u = this.s.w();
      this.v = this.s.y();
      this.w = this.s.z();
      this.x = this.s.H();
      this.y = this.s.I();
      this.K = this.d(epi.a(sw.c("structure_block.button.save"), $$0x -> {
         if (this.s.y() == ddl.a) {
            this.a(dba.a.b);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.L = this.d(epi.a(sw.c("structure_block.button.load"), $$0x -> {
         if (this.s.y() == ddl.b) {
            this.a(dba.a.c);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.d(
         epp.<ddl>a($$0x -> sw.c("structure_block.mode." + $$0x.c()))
            .a(r, q)
            .a()
            .a(this.v)
            .a(this.g / 2 - 4 - 150, 185, 50, 20, sw.b("MODE"), ($$0x, $$1x) -> {
               this.s.a($$1x);
               this.a($$1x);
            })
      );
      this.Q = this.d(epi.a(sw.c("structure_block.button.detect_size"), $$0x -> {
         if (this.s.y() == ddl.a) {
            this.a(dba.a.d);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 120, 50, 20).a());
      this.R = this.d(epp.b(!this.s.z()).a().a(this.g / 2 + 4 + 100, 160, 50, 20, m, ($$0x, $$1x) -> this.s.a(!$$1x)));
      this.S = this.d(epp.<cui>a(cui::b).a(cui.values()).a().a(this.t).a(this.g / 2 - 20, 185, 40, 20, sw.b("MIRROR"), ($$0x, $$1x) -> this.s.a($$1x)));
      this.T = this.d(epp.b(this.s.H()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, o, ($$0x, $$1x) -> this.s.d($$1x)));
      this.U = this.d(epp.b(this.s.I()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, p, ($$0x, $$1x) -> this.s.e($$1x)));
      this.M = this.d(epi.a(sw.b("0"), $$0x -> {
         this.s.a(cvz.a);
         this.C();
      }).a(this.g / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.N = this.d(epi.a(sw.b("90"), $$0x -> {
         this.s.a(cvz.b);
         this.C();
      }).a(this.g / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.O = this.d(epi.a(sw.b("180"), $$0x -> {
         this.s.a(cvz.c);
         this.C();
      }).a(this.g / 2 + 1 + 20, 185, 40, 20).a());
      this.P = this.d(epi.a(sw.b("270"), $$0x -> {
         this.s.a(cvz.d);
         this.C();
      }).a(this.g / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.z = new epr(this.i, this.g / 2 - 152, 40, 300, 20, sw.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !exc.this.a(this.b(), $$0, this.v()) ? false : super.a($$0, $$1);
         }
      };
      this.z.m(128);
      this.z.a(this.s.d());
      this.e(this.z);
      gu $$0 = this.s.i();
      this.A = new epr(this.i, this.g / 2 - 152, 80, 80, 20, sw.c("structure_block.position.x"));
      this.A.m(15);
      this.A.a(Integer.toString($$0.u()));
      this.e(this.A);
      this.C = new epr(this.i, this.g / 2 - 72, 80, 80, 20, sw.c("structure_block.position.y"));
      this.C.m(15);
      this.C.a(Integer.toString($$0.v()));
      this.e(this.C);
      this.D = new epr(this.i, this.g / 2 + 8, 80, 80, 20, sw.c("structure_block.position.z"));
      this.D.m(15);
      this.D.a(Integer.toString($$0.w()));
      this.e(this.D);
      hz $$1 = this.s.j();
      this.E = new epr(this.i, this.g / 2 - 152, 120, 80, 20, sw.c("structure_block.size.x"));
      this.E.m(15);
      this.E.a(Integer.toString($$1.u()));
      this.e(this.E);
      this.F = new epr(this.i, this.g / 2 - 72, 120, 80, 20, sw.c("structure_block.size.y"));
      this.F.m(15);
      this.F.a(Integer.toString($$1.v()));
      this.e(this.F);
      this.G = new epr(this.i, this.g / 2 + 8, 120, 80, 20, sw.c("structure_block.size.z"));
      this.G.m(15);
      this.G.a(Integer.toString($$1.w()));
      this.e(this.G);
      this.H = new epr(this.i, this.g / 2 - 152, 120, 80, 20, sw.c("structure_block.integrity.integrity"));
      this.H.m(15);
      this.H.a(this.V.format((double)this.s.A()));
      this.e(this.H);
      this.I = new epr(this.i, this.g / 2 - 72, 120, 80, 20, sw.c("structure_block.integrity.seed"));
      this.I.m(31);
      this.I.a(Long.toString(this.s.B()));
      this.e(this.I);
      this.J = new epr(this.i, this.g / 2 - 152, 120, 240, 20, sw.c("structure_block.custom_data"));
      this.J.m(128);
      this.J.a(this.s.x());
      this.e(this.J);
      this.C();
      this.a(this.v);
      this.c(this.z);
   }

   @Override
   public void a(enn $$0, int $$1, int $$2) {
      String $$3 = this.z.b();
      String $$4 = this.A.b();
      String $$5 = this.C.b();
      String $$6 = this.D.b();
      String $$7 = this.E.b();
      String $$8 = this.F.b();
      String $$9 = this.G.b();
      String $$10 = this.H.b();
      String $$11 = this.I.b();
      String $$12 = this.J.b();
      this.b($$0, $$1, $$2);
      this.z.a($$3);
      this.A.a($$4);
      this.C.a($$5);
      this.D.a($$6);
      this.E.a($$7);
      this.F.a($$8);
      this.G.a($$9);
      this.H.a($$10);
      this.I.a($$11);
      this.J.a($$12);
   }

   private void C() {
      this.M.r = true;
      this.N.r = true;
      this.O.r = true;
      this.P.r = true;
      switch (this.s.w()) {
         case a:
            this.M.r = false;
            break;
         case c:
            this.O.r = false;
            break;
         case d:
            this.P.r = false;
            break;
         case b:
            this.N.r = false;
      }
   }

   private void a(ddl $$0) {
      this.z.e(false);
      this.A.e(false);
      this.C.e(false);
      this.D.e(false);
      this.E.e(false);
      this.F.e(false);
      this.G.e(false);
      this.H.e(false);
      this.I.e(false);
      this.J.e(false);
      this.K.s = false;
      this.L.s = false;
      this.Q.s = false;
      this.R.s = false;
      this.S.s = false;
      this.M.s = false;
      this.N.s = false;
      this.O.s = false;
      this.P.s = false;
      this.T.s = false;
      this.U.s = false;
      switch ($$0) {
         case a:
            this.z.e(true);
            this.A.e(true);
            this.C.e(true);
            this.D.e(true);
            this.E.e(true);
            this.F.e(true);
            this.G.e(true);
            this.K.s = true;
            this.Q.s = true;
            this.R.s = true;
            this.T.s = true;
            break;
         case b:
            this.z.e(true);
            this.A.e(true);
            this.C.e(true);
            this.D.e(true);
            this.H.e(true);
            this.I.e(true);
            this.L.s = true;
            this.R.s = true;
            this.S.s = true;
            this.M.s = true;
            this.N.s = true;
            this.O.s = true;
            this.P.s = true;
            this.U.s = true;
            this.C();
            break;
         case c:
            this.z.e(true);
            break;
         case d:
            this.J.e(true);
      }
   }

   private boolean a(dba.a $$0) {
      gu $$1 = new gu(this.c(this.A.b()), this.c(this.C.b()), this.c(this.D.b()));
      hz $$2 = new hz(this.c(this.E.b()), this.c(this.F.b()), this.c(this.G.b()));
      float $$3 = this.b(this.H.b());
      long $$4 = this.a(this.I.b());
      this.f
         .I()
         .a(new aat(this.s.p(), $$0, this.s.y(), this.z.b(), $$1, $$2, this.s.v(), this.s.w(), this.J.b(), this.s.z(), this.s.H(), this.s.I(), $$3, $$4));
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
   public void aw_() {
      this.B();
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
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      ddl $$4 = this.s.y();
      $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      if ($$4 != ddl.d) {
         $$0.b(this.i, a, this.g / 2 - 153, 30, 10526880);
         this.z.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == ddl.b || $$4 == ddl.a) {
         $$0.b(this.i, b, this.g / 2 - 153, 70, 10526880);
         this.A.a($$0, $$1, $$2, $$3);
         this.C.a($$0, $$1, $$2, $$3);
         this.D.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, m, this.g / 2 + 154 - this.i.a(m), 150, 10526880);
      }

      if ($$4 == ddl.a) {
         $$0.b(this.i, c, this.g / 2 - 153, 110, 10526880);
         this.E.a($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, n, this.g / 2 + 154 - this.i.a(n), 110, 10526880);
         $$0.b(this.i, o, this.g / 2 + 154 - this.i.a(o), 70, 10526880);
      }

      if ($$4 == ddl.b) {
         $$0.b(this.i, k, this.g / 2 - 153, 110, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, p, this.g / 2 + 154 - this.i.a(p), 70, 10526880);
      }

      if ($$4 == ddl.d) {
         $$0.b(this.i, l, this.g / 2 - 153, 110, 10526880);
         this.J.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.i, $$4.a(), this.g / 2 - 153, 174, 10526880);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean az_() {
      return false;
   }
}
