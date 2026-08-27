import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdz extends cfg implements bpj, cfk {
   private static final aii<Integer> b = ail.a(cdz.class, aik.b);
   private static final aii<Integer> c = ail.a(cdz.class, aik.b);
   private static final aii<Integer> d = ail.a(cdz.class, aik.b);
   private static final List<aii<Integer>> e = ImmutableList.of(b, c, d);
   private static final aii<Integer> bV = ail.a(cdz.class, aik.b);
   private static final int bW = 220;
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final float[] bZ = new float[2];
   private final float[] ca = new float[2];
   private final int[] cb = new int[2];
   private final int[] cc = new int[2];
   private int cd;
   private final aox ce = (aox)new aox(this.Q_(), bmb.a.f, bmb.b.a).a(true);
   private static final Predicate<box> cf = $$0 -> !$$0.ai().a(auh.y) && $$0.fB();
   private static final bzn cg = bzn.a().a(20.0).a(cf);

   public cdz(bol<? extends cdz> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new buu(this, 10, false);
      this.t(this.eL());
      this.bK = 50;
   }

   @Override
   protected byi b(cwe $$0) {
      byg $$1 = new byg(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bP.a(0, new cdz.a());
      this.bP.a(2, new bwt(this, 1.0, 40, 20.0F));
      this.bP.a(5, new bxg(this, 1.0));
      this.bP.a(6, new bwc(this, cia.class, 8.0F));
      this.bP.a(7, new bwp(this));
      this.bQ.a(1, new bxm(this));
      this.bQ.a(2, new bxn<>(this, box.class, 0, false, false, cf));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, 0);
      this.am.a(c, 0);
      this.am.a(d, 0);
      this.am.a(bV, 0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Invul", this.A());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.t($$0.h("Invul"));
      if (this.ae()) {
         this.ce.a(this.Q_());
      }
   }

   @Override
   public void b(@Nullable vs $$0) {
      super.b($$0);
      this.ce.a(this.Q_());
   }

   @Override
   protected ato y() {
      return atp.BO;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.BR;
   }

   @Override
   protected ato n_() {
      return atp.BQ;
   }

   @Override
   public void d_() {
      eov $$0 = this.dm().d(1.0, 0.6, 1.0);
      if (!this.dJ().B && this.u(0) > 0) {
         bof $$1 = this.dJ().a(this.u(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dq() < $$1.dq() || !this.a() && this.dq() < $$1.dq() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new eov($$0.c, $$2, $$0.e);
            eov $$3 = new eov($$1.do() - this.do(), 0.0, $$1.du() - this.du());
            if ($$3.i() > 9.0) {
               eov $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)awm.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.d_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.ca[$$5] = this.bY[$$5];
         this.bZ[$$5] = this.bX[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.u($$6 + 1);
         bof $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dJ().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.v($$6 + 1);
            double $$10 = this.w($$6 + 1);
            double $$11 = this.x($$6 + 1);
            double $$12 = $$8.do() - $$9;
            double $$13 = $$8.ds() - $$10;
            double $$14 = $$8.du() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(awm.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(awm.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bX[$$6] = this.a(this.bX[$$6], $$17, 40.0F);
            this.bY[$$6] = this.a(this.bY[$$6], $$16, 10.0F);
         } else {
            this.bY[$$6] = this.a(this.bY[$$6], this.aV, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.v($$19);
         double $$21 = this.w($$19);
         double $$22 = this.x($$19);
         float $$23 = 0.3F * this.dY();
         this.dJ().a(kb.ab, $$20 + this.af.k() * (double)$$23, $$21 + this.af.k() * (double)$$23, $$22 + this.af.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dJ().z.a(4) == 0) {
            this.dJ().a(kb.v, $$20 + this.af.k() * (double)$$23, $$21 + this.af.k() * (double)$$23, $$22 + this.af.k() * (double)$$23, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.A() > 0) {
         float $$24 = 3.3F * this.dY();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dJ().a(kb.v, this.do() + this.af.k(), this.dq() + (double)(this.af.i() * $$24), this.du() + this.af.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void aa() {
      if (this.A() > 0) {
         int $$0 = this.A() - 1;
         this.ce.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dJ().a(this, this.do(), this.ds(), this.du(), 7.0F, false, cwe.a.c);
            if (!this.aU()) {
               this.dJ().b(1023, this.dj(), 0);
            }
         }

         this.t($$0);
         if (this.ag % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.aa();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ag >= this.cb[$$1 - 1]) {
               this.cb[$$1 - 1] = this.ag + 10 + this.af.a(10);
               if ((this.dJ().aj() == bmi.c || this.dJ().aj() == bmi.d) && this.cc[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = awm.a(this.af, this.do() - 10.0, this.do() + 10.0);
                  double $$5 = awm.a(this.af, this.dq() - 5.0, this.dq() + 5.0);
                  double $$6 = awm.a(this.af, this.du() - 10.0, this.du() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.cc[$$1 - 1] = 0;
               }

               int $$7 = this.u($$1);
               if ($$7 > 0) {
                  box $$8 = (box)this.dJ().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((bof)$$8) > 900.0) && this.D($$8)) {
                     this.a($$1 + 1, $$8);
                     this.cb[$$1 - 1] = this.ag + 40 + this.af.a(20);
                     this.cc[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<box> $$9 = this.dJ().a(box.class, cg, this, this.cE().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     box $$10 = $$9.get(this.af.a($$9.size()));
                     this.a($$1, $$10.aj());
                  }
               }
            }
         }

         if (this.q() != null) {
            this.a(0, this.q().aj());
         } else {
            this.a(0, 0);
         }

         if (this.cd > 0) {
            this.cd--;
            if (this.cd == 0 && this.dJ().Z().b(cwa.c)) {
               boolean $$11 = false;
               int $$12 = awm.d(this.dd() / 2.0F + 1.0F);
               int $$13 = awm.d(this.de());

               for (ib $$14 : ib.b(this.dn() - $$12, this.dp(), this.dt() - $$12, this.dn() + $$12, this.dp() + $$13, this.dt() + $$12)) {
                  dme $$15 = this.dJ().a_($$14);
                  if (d($$15)) {
                     $$11 = this.dJ().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dJ().a(null, 1022, this.dj(), 0);
               }
            }
         }

         if (this.ag % 20 == 0) {
            this.c(1.0F);
         }

         this.ce.a(this.eu() / this.eL());
      }
   }

   public static boolean d(dme $$0) {
      return !$$0.i() && !$$0.a(aue.aD);
   }

   @Override
   public void u() {
      this.t(220);
      this.ce.a(0.0F);
      this.t(this.eL() / 3.0F);
   }

   @Override
   public void a(dme $$0, eov $$1) {
   }

   @Override
   public void c(apb $$0) {
      super.c($$0);
      this.ce.a($$0);
   }

   @Override
   public void d(apb $$0) {
      super.d($$0);
      this.ce.b($$0);
   }

   private double v(int $$0) {
      if ($$0 <= 0) {
         return this.do();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = awm.b($$1);
         return this.do() + (double)$$2 * 1.3 * (double)this.dY();
      }
   }

   private double w(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dq() + (double)($$1 * this.dY());
   }

   private double x(int $$0) {
      if ($$0 <= 0) {
         return this.du();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = awm.a($$1);
         return this.du() + (double)$$2 * 1.3 * (double)this.dY();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = awm.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, box $$1) {
      this.a($$0, $$1.do(), $$1.dq() + (double)$$1.cF() * 0.5, $$1.du(), $$0 == 0 && this.af.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aU()) {
         this.dJ().a(null, 1024, this.dj(), 0);
      }

      double $$5 = this.v($$0);
      double $$6 = this.w($$0);
      double $$7 = this.x($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      cjh $$11 = new cjh(this.dJ(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dJ().b($$11);
   }

   @Override
   public void a(box $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(aug.u) || $$0.d() instanceof cdz) {
         return false;
      } else if (this.A() > 0 && !$$0.a(aug.e)) {
         return false;
      } else {
         if (this.a()) {
            bof $$2 = $$0.c();
            if ($$2 instanceof cig) {
               return false;
            }
         }

         bof $$3 = $$0.d();
         if ($$3 != null && $$3.ai().a(auh.y)) {
            return false;
         } else {
            if (this.cd <= 0) {
               this.cd = 20;
            }

            for (int $$4 = 0; $$4 < this.cc.length; $$4++) {
               this.cc[$$4] = this.cc[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(bne $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cel $$3 = this.a(cpt.uo);
      if ($$3 != null) {
         $$3.B();
      }
   }

   @Override
   public void dv() {
      if (this.dJ().aj() == bmi.a && this.Y()) {
         this.am();
      } else {
         this.bc = 0;
      }
   }

   @Override
   public boolean b(bns $$0, @Nullable bof $$1) {
      return false;
   }

   public static bqd.a w() {
      return cfg.gr().a(bqe.n, 300.0).a(bqe.o, 0.6F).a(bqe.h, 0.6F).a(bqe.i, 40.0).a(bqe.a, 4.0);
   }

   public float b(int $$0) {
      return this.bY[$$0];
   }

   public float c(int $$0) {
      return this.bX[$$0];
   }

   public int A() {
      return this.am.b(bV);
   }

   public void t(int $$0) {
      this.am.b(bV, $$0);
   }

   public int u(int $$0) {
      return this.am.b(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.am.b(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.eu() <= this.eL() / 2.0F;
   }

   @Override
   protected boolean n(bof $$0) {
      return false;
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Override
   public boolean c(bns $$0) {
      return $$0.a(bnu.t) ? false : super.c($$0);
   }

   class a extends bvu {
      public a() {
         this.a(EnumSet.of(bvu.a.a, bvu.a.c, bvu.a.b));
      }

      @Override
      public boolean a() {
         return cdz.this.A() > 0;
      }
   }
}
