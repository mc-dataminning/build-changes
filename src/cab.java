import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cab extends cbi implements blt, cbm {
   private static final afo<Integer> b = afr.a(cab.class, afq.b);
   private static final afo<Integer> c = afr.a(cab.class, afq.b);
   private static final afo<Integer> d = afr.a(cab.class, afq.b);
   private static final List<afo<Integer>> e = ImmutableList.of(b, c, d);
   private static final afo<Integer> bT = afr.a(cab.class, afq.b);
   private static final int bU = 220;
   private final float[] bV = new float[2];
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final int[] bZ = new int[2];
   private final int[] ca = new int[2];
   private int cb;
   private final amb cc = (amb)new amb(this.P_(), bin.a.f, bin.b.a).a(true);
   private static final Predicate<blg> cd = $$0 -> $$0.eT() != bll.b && $$0.fA();
   private static final bvs ce = bvs.a().a(20.0).a(cd);

   public cab(bku<? extends cab> $$0, csa $$1) {
      super($$0, $$1);
      this.bL = new brb(this, 10, false);
      this.c(this.eN());
      this.bJ = 50;
   }

   @Override
   protected bup b(csa $$0) {
      bun $$1 = new bun(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bO.a(0, new cab.a());
      this.bO.a(2, new bta(this, 1.0, 40, 20.0F));
      this.bO.a(5, new btn(this, 1.0));
      this.bO.a(6, new bsj(this, cdu.class, 8.0F));
      this.bO.a(7, new bsw(this));
      this.bP.a(1, new btt(this));
      this.bP.a(2, new btu<>(this, blg.class, 0, false, false, cd));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, 0);
      this.an.a(c, 0);
      this.an.a(d, 0);
      this.an.a(bT, 0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Invul", this.A());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ae()) {
         this.cc.a(this.P_());
      }
   }

   @Override
   public void b(@Nullable ur $$0) {
      super.b($$0);
      this.cc.a(this.P_());
   }

   @Override
   protected aqq y() {
      return aqr.AP;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.AS;
   }

   @Override
   protected aqq m_() {
      return aqr.AR;
   }

   @Override
   public void c_() {
      eju $$0 = this.dq().d(1.0, 0.6, 1.0);
      if (!this.dN().B && this.t(0) > 0) {
         bkq $$1 = this.dN().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.du() < $$1.du() || !this.a() && this.du() < $$1.du() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new eju($$0.c, $$2, $$0.e);
            eju $$3 = new eju($$1.ds() - this.ds(), 0.0, $$1.dy() - this.dy());
            if ($$3.i() > 9.0) {
               eju $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)atm.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.c_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bY[$$5] = this.bW[$$5];
         this.bX[$$5] = this.bV[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         bkq $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dN().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.ds() - $$9;
            double $$13 = $$8.dw() - $$10;
            double $$14 = $$8.dy() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(atm.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(atm.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bV[$$6] = this.a(this.bV[$$6], $$17, 40.0F);
            this.bW[$$6] = this.a(this.bW[$$6], $$16, 10.0F);
         } else {
            this.bW[$$6] = this.a(this.bW[$$6], this.aU, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.u($$19);
         double $$21 = this.v($$19);
         double $$22 = this.w($$19);
         this.dN().a(js.Z, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.dN().z.a(4) == 0) {
            this.dN().a(js.v, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.A() > 0) {
         for (int $$23 = 0; $$23 < 3; $$23++) {
            this.dN().a(js.v, this.ds() + this.ag.k(), this.du() + (double)(this.ag.i() * 3.3F), this.dy() + this.ag.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void Z() {
      if (this.A() > 0) {
         int $$0 = this.A() - 1;
         this.cc.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dN().a(this, this.ds(), this.dw(), this.dy(), 7.0F, false, csa.a.c);
            if (!this.aU()) {
               this.dN().b(1023, this.dn(), 0);
            }
         }

         this.s($$0);
         if (this.ah % 10 == 0) {
            this.b(10.0F);
         }
      } else {
         super.Z();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ah >= this.bZ[$$1 - 1]) {
               this.bZ[$$1 - 1] = this.ah + 10 + this.ag.a(10);
               if ((this.dN().aj() == biu.c || this.dN().aj() == biu.d) && this.ca[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = atm.a(this.ag, this.ds() - 10.0, this.ds() + 10.0);
                  double $$5 = atm.a(this.ag, this.du() - 5.0, this.du() + 5.0);
                  double $$6 = atm.a(this.ag, this.dy() - 10.0, this.dy() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ca[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  blg $$8 = (blg)this.dN().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((bkq)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.bZ[$$1 - 1] = this.ah + 40 + this.ag.a(20);
                     this.ca[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<blg> $$9 = this.dN().a(blg.class, ce, this, this.cH().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     blg $$10 = $$9.get(this.ag.a($$9.size()));
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

         if (this.cb > 0) {
            this.cb--;
            if (this.cb == 0 && this.dN().Y().b(crw.c)) {
               int $$11 = atm.a(this.du());
               int $$12 = atm.a(this.ds());
               int $$13 = atm.a(this.dy());
               boolean $$14 = false;

               for (int $$15 = -1; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 3; $$17++) {
                        int $$18 = $$12 + $$15;
                        int $$19 = $$11 + $$17;
                        int $$20 = $$13 + $$16;
                        ht $$21 = new ht($$18, $$19, $$20);
                        dhi $$22 = this.dN().a_($$21);
                        if (d($$22)) {
                           $$14 = this.dN().a($$21, true, this) || $$14;
                        }
                     }
                  }
               }

               if ($$14) {
                  this.dN().a(null, 1022, this.dn(), 0);
               }
            }
         }

         if (this.ah % 20 == 0) {
            this.b(1.0F);
         }

         this.cc.a(this.ew() / this.eN());
      }
   }

   public static boolean d(dhi $$0) {
      return !$$0.i() && !$$0.a(arg.aD);
   }

   @Override
   public void u() {
      this.s(220);
      this.cc.a(0.0F);
      this.c(this.eN() / 3.0F);
   }

   @Override
   public void a(dhi $$0, eju $$1) {
   }

   @Override
   public void c(amf $$0) {
      super.c($$0);
      this.cc.a($$0);
   }

   @Override
   public void d(amf $$0) {
      super.d($$0);
      this.cc.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.ds();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = atm.b($$1);
         return this.ds() + (double)$$2 * 1.3;
      }
   }

   private double v(int $$0) {
      return $$0 <= 0 ? this.du() + 3.0 : this.du() + 2.2;
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dy();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = atm.a($$1);
         return this.dy() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = atm.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, blg $$1) {
      this.a($$0, $$1.ds(), $$1.du() + (double)$$1.cI() * 0.5, $$1.dy(), $$0 == 0 && this.ag.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aU()) {
         this.dN().a(null, 1024, this.dn(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      cez $$11 = new cez(this.dN(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dN().b($$11);
   }

   @Override
   public void a(blg $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(ari.t) || $$0.d() instanceof cab) {
         return false;
      } else if (this.A() > 0 && !$$0.a(ari.d)) {
         return false;
      } else {
         if (this.a()) {
            bkq $$2 = $$0.c();
            if ($$2 instanceof cea) {
               return false;
            }
         }

         bkq $$3 = $$0.d();
         if ($$3 != null && !($$3 instanceof cdu) && $$3 instanceof blg && ((blg)$$3).eT() == this.eT()) {
            return false;
         } else {
            if (this.cb <= 0) {
               this.cb = 20;
            }

            for (int $$4 = 0; $$4 < this.ca.length; $$4++) {
               this.ca[$$4] = this.ca[$$4] + 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(bjo $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      can $$3 = this.a(clm.uk);
      if ($$3 != null) {
         $$3.B();
      }
   }

   @Override
   public void dz() {
      if (this.dN().aj() == biu.a && this.X()) {
         this.am();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bkd $$0, @Nullable bkq $$1) {
      return false;
   }

   public static bml.a w() {
      return cbi.gl().a(bmm.l, 300.0).a(bmm.m, 0.6F).a(bmm.f, 0.6F).a(bmm.g, 40.0).a(bmm.a, 4.0);
   }

   public float b(int $$0) {
      return this.bW[$$0];
   }

   public float c(int $$0) {
      return this.bV[$$0];
   }

   public int A() {
      return this.an.b(bT);
   }

   public void s(int $$0) {
      this.an.b(bT, $$0);
   }

   public int t(int $$0) {
      return this.an.b(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.an.b(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.ew() <= this.eN() / 2.0F;
   }

   @Override
   public bll eT() {
      return bll.b;
   }

   @Override
   protected boolean o(bkq $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public boolean c(bkd $$0) {
      return $$0.c() == bkf.t ? false : super.c($$0);
   }

   class a extends bsb {
      public a() {
         this.a(EnumSet.of(bsb.a.a, bsb.a.c, bsb.a.b));
      }

      @Override
      public boolean a() {
         return cab.this.A() > 0;
      }
   }
}
