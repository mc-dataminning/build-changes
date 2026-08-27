import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fep extends fcc {
   private static final vb a = vb.c("structure_block.structure_name");
   private static final vb b = vb.c("structure_block.position");
   private static final vb c = vb.c("structure_block.size");
   private static final vb k = vb.c("structure_block.integrity");
   private static final vb l = vb.c("structure_block.custom_data");
   private static final vb m = vb.c("structure_block.include_entities");
   private static final vb n = vb.c("structure_block.detect_size");
   private static final vb o = vb.c("structure_block.show_air");
   private static final vb p = vb.c("structure_block.show_boundingbox");
   private static final ImmutableList<djz> q = ImmutableList.copyOf(djz.values());
   private static final ImmutableList<djz> r = q.stream().filter($$0 -> $$0 != djz.d).collect(ImmutableList.toImmutableList());
   private final dhr t;
   private dav u = dav.a;
   private dcl v = dcl.a;
   private djz w = djz.d;
   private boolean x;
   private boolean y;
   private boolean z;
   private ewq A;
   private ewq B;
   private ewq C;
   private ewq D;
   private ewq E;
   private ewq F;
   private ewq G;
   private ewq H;
   private ewq I;
   private ewq J;
   private ewh K;
   private ewh L;
   private ewh M;
   private ewh N;
   private ewh O;
   private ewh P;
   private ewh Q;
   private ewo<Boolean> R;
   private ewo<dav> S;
   private ewo<Boolean> T;
   private ewo<Boolean> U;
   private final DecimalFormat V = new DecimalFormat("0.0###");

   public fep(dhr $$0) {
      super(vb.c(cwb.pa.h()));
      this.t = $$0;
      this.V.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void l() {
      if (this.a(dhr.a.a)) {
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
      this.d(ewh.a(va.d, $$0x -> this.l()).a(this.g / 2 - 4 - 150, 210, 150, 20).a());
      this.d(ewh.a(va.e, $$0x -> this.C()).a(this.g / 2 + 4, 210, 150, 20).a());
      this.u = this.t.l();
      this.v = this.t.m();
      this.w = this.t.x();
      this.x = this.t.y();
      this.y = this.t.G();
      this.z = this.t.H();
      this.K = this.d(ewh.a(vb.c("structure_block.button.save"), $$0x -> {
         if (this.t.x() == djz.a) {
            this.a(dhr.a.b);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.L = this.d(ewh.a(vb.c("structure_block.button.load"), $$0x -> {
         if (this.t.x() == djz.b) {
            this.a(dhr.a.c);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 185, 50, 20).a());
      this.d(
         ewo.<djz>a($$0x -> vb.c("structure_block.mode." + $$0x.c()))
            .a(r, q)
            .a()
            .a(this.w)
            .a(this.g / 2 - 4 - 150, 185, 50, 20, vb.b("MODE"), ($$0x, $$1x) -> {
               this.t.a($$1x);
               this.a($$1x);
            })
      );
      this.Q = this.d(ewh.a(vb.c("structure_block.button.detect_size"), $$0x -> {
         if (this.t.x() == djz.a) {
            this.a(dhr.a.d);
            this.f.a(null);
         }
      }).a(this.g / 2 + 4 + 100, 120, 50, 20).a());
      this.R = this.d(ewo.b(!this.t.y()).a().a(this.g / 2 + 4 + 100, 160, 50, 20, m, ($$0x, $$1x) -> this.t.a(!$$1x)));
      this.S = this.d(ewo.<dav>a(dav::b).a(dav.values()).a().a(this.u).a(this.g / 2 - 20, 185, 40, 20, vb.b("MIRROR"), ($$0x, $$1x) -> this.t.a($$1x)));
      this.T = this.d(ewo.b(this.t.G()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, o, ($$0x, $$1x) -> this.t.d($$1x)));
      this.U = this.d(ewo.b(this.t.H()).a().a(this.g / 2 + 4 + 100, 80, 50, 20, p, ($$0x, $$1x) -> this.t.e($$1x)));
      this.M = this.d(ewh.a(vb.b("0"), $$0x -> {
         this.t.a(dcl.a);
         this.D();
      }).a(this.g / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.N = this.d(ewh.a(vb.b("90"), $$0x -> {
         this.t.a(dcl.b);
         this.D();
      }).a(this.g / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.O = this.d(ewh.a(vb.b("180"), $$0x -> {
         this.t.a(dcl.c);
         this.D();
      }).a(this.g / 2 + 1 + 20, 185, 40, 20).a());
      this.P = this.d(ewh.a(vb.b("270"), $$0x -> {
         this.t.a(dcl.d);
         this.D();
      }).a(this.g / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.A = new ewq(this.i, this.g / 2 - 152, 40, 300, 20, vb.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fep.this.a(this.a(), $$0, this.f()) ? false : super.a($$0, $$1);
         }
      };
      this.A.l(128);
      this.A.a(this.t.d());
      this.e(this.A);
      hv $$0 = this.t.g();
      this.B = new ewq(this.i, this.g / 2 - 152, 80, 80, 20, vb.c("structure_block.position.x"));
      this.B.l(15);
      this.B.a(Integer.toString($$0.u()));
      this.e(this.B);
      this.C = new ewq(this.i, this.g / 2 - 72, 80, 80, 20, vb.c("structure_block.position.y"));
      this.C.l(15);
      this.C.a(Integer.toString($$0.v()));
      this.e(this.C);
      this.D = new ewq(this.i, this.g / 2 + 8, 80, 80, 20, vb.c("structure_block.position.z"));
      this.D.l(15);
      this.D.a(Integer.toString($$0.w()));
      this.e(this.D);
      iz $$1 = this.t.k();
      this.E = new ewq(this.i, this.g / 2 - 152, 120, 80, 20, vb.c("structure_block.size.x"));
      this.E.l(15);
      this.E.a(Integer.toString($$1.u()));
      this.e(this.E);
      this.F = new ewq(this.i, this.g / 2 - 72, 120, 80, 20, vb.c("structure_block.size.y"));
      this.F.l(15);
      this.F.a(Integer.toString($$1.v()));
      this.e(this.F);
      this.G = new ewq(this.i, this.g / 2 + 8, 120, 80, 20, vb.c("structure_block.size.z"));
      this.G.l(15);
      this.G.a(Integer.toString($$1.w()));
      this.e(this.G);
      this.H = new ewq(this.i, this.g / 2 - 152, 120, 80, 20, vb.c("structure_block.integrity.integrity"));
      this.H.l(15);
      this.H.a(this.V.format((double)this.t.z()));
      this.e(this.H);
      this.I = new ewq(this.i, this.g / 2 - 72, 120, 80, 20, vb.c("structure_block.integrity.seed"));
      this.I.l(31);
      this.I.a(Long.toString(this.t.A()));
      this.e(this.I);
      this.J = new ewq(this.i, this.g / 2 - 152, 120, 240, 20, vb.c("structure_block.custom_data"));
      this.J.l(128);
      this.J.a(this.t.w());
      this.e(this.J);
      this.D();
      this.a(this.w);
      this.c(this.A);
   }

   @Override
   public void a(euk $$0, int $$1, int $$2) {
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
      switch (this.t.m()) {
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

   private void a(djz $$0) {
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

   private boolean a(dhr.a $$0) {
      hv $$1 = new hv(this.c(this.B.a()), this.c(this.C.a()), this.c(this.D.a()));
      iz $$2 = new iz(this.c(this.E.a()), this.c(this.F.a()), this.c(this.G.a()));
      float $$3 = this.b(this.H.a());
      long $$4 = this.a(this.I.a());
      this.f
         .I()
         .b(new aen(this.t.aB_(), $$0, this.t.x(), this.A.a(), $$1, $$2, this.t.l(), this.t.m(), this.J.a(), this.t.y(), this.t.G(), this.t.H(), $$3, $$4));
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
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      djz $$4 = this.t.x();
      $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      if ($$4 != djz.d) {
         $$0.b(this.i, a, this.g / 2 - 153, 30, 10526880);
         this.A.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == djz.b || $$4 == djz.a) {
         $$0.b(this.i, b, this.g / 2 - 153, 70, 10526880);
         this.B.a($$0, $$1, $$2, $$3);
         this.C.a($$0, $$1, $$2, $$3);
         this.D.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, m, this.g / 2 + 154 - this.i.a(m), 150, 10526880);
      }

      if ($$4 == djz.a) {
         $$0.b(this.i, c, this.g / 2 - 153, 110, 10526880);
         this.E.a($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, n, this.g / 2 + 154 - this.i.a(n), 110, 10526880);
         $$0.b(this.i, o, this.g / 2 + 154 - this.i.a(o), 70, 10526880);
      }

      if ($$4 == djz.b) {
         $$0.b(this.i, k, this.g / 2 - 153, 110, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         $$0.b(this.i, p, this.g / 2 + 154 - this.i.a(p), 70, 10526880);
      }

      if ($$4 == djz.d) {
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
