import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cma extends cnj implements cnn {
   private static final akg<Integer> a = akk.a(cma.class, aki.b);
   private static final akg<Integer> b = akk.a(cma.class, aki.b);
   private static final akg<Integer> c = akk.a(cma.class, aki.b);
   private static final List<akg<Integer>> d = ImmutableList.of(a, b, c);
   private static final akg<Integer> bE = akk.a(cma.class, aki.b);
   private static final int bF = 220;
   private final float[] bG = new float[2];
   private final float[] bH = new float[2];
   private final float[] bI = new float[2];
   private final float[] bJ = new float[2];
   private final int[] bK = new int[2];
   private final int[] bL = new int[2];
   private int bM;
   private final arj bN = (arj)new arj(this.m_(), btg.a.f, btg.b.a).a(true);
   private static final chg.a bO = ($$0, $$1) -> !$$0.aq().a(axd.y) && $$0.fL();
   private static final chg bP = chg.a().a(20.0).a(bO);

   public cma(bwb<? extends cma> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new ccn(this, 10, false);
      this.d(this.eT());
      this.bw = 50;
   }

   @Override
   protected cgb b(dhp $$0) {
      cfz $$1 = new cfz(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bB.a(0, new cma.a());
      this.bB.a(2, new cem(this, 1.0, 40, 20.0F));
      this.bB.a(5, new cez(this, 1.0));
      this.bB.a(6, new cdv(this, cqi.class, 8.0F));
      this.bB.a(7, new cei(this));
      this.bC.a(1, new cff(this));
      this.bC.a(2, new cfg<>(this, bwr.class, 0, false, false, bO));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(bE, 0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Invul", this.t());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.h_()) {
         this.bN.a(this.m_());
      }
   }

   @Override
   public void b(@Nullable wv $$0) {
      super.b($$0);
      this.bN.a(this.m_());
   }

   @Override
   protected awj u() {
      return awk.Dw;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.Dz;
   }

   @Override
   protected awj l_() {
      return awk.Dy;
   }

   @Override
   public void k_() {
      fcu $$0 = this.dy().d(1.0, 0.6, 1.0);
      if (!this.dV().C && this.c(0) > 0) {
         bvs $$1 = this.dV().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dC() < $$1.dC() || !this.x() && this.dC() < $$1.dC() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new fcu($$0.d, $$2, $$0.f);
            fcu $$3 = new fcu($$1.dA() - this.dA(), 0.0, $$1.dG() - this.dG());
            if ($$3.j() > 9.0) {
               fcu $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.i($$0);
      if ($$0.j() > 0.05) {
         this.w((float)azk.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.k_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bJ[$$5] = this.bH[$$5];
         this.bI[$$5] = this.bG[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bvs $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dV().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.r($$6 + 1);
            double $$10 = this.s($$6 + 1);
            double $$11 = this.t($$6 + 1);
            double $$12 = $$8.dA() - $$9;
            double $$13 = $$8.dE() - $$10;
            double $$14 = $$8.dG() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(azk.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azk.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bG[$$6] = this.a(this.bG[$$6], $$17, 40.0F);
            this.bH[$$6] = this.a(this.bH[$$6], $$16, 10.0F);
         } else {
            this.bH[$$6] = this.a(this.bH[$$6], this.aU, 10.0F);
         }
      }

      boolean $$18 = this.x();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.r($$19);
         double $$21 = this.s($$19);
         double $$22 = this.t($$19);
         float $$23 = 0.3F * this.ek();
         this.dV().a(lv.ah, $$20 + this.ae.k() * (double)$$23, $$21 + this.ae.k() * (double)$$23, $$22 + this.ae.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dV().A.a(4) == 0) {
            this.dV()
               .a(
                  lo.a(lv.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.ae.k() * (double)$$23,
                  $$21 + this.ae.k() * (double)$$23,
                  $$22 + this.ae.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.t() > 0) {
         float $$24 = 3.3F * this.ek();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dV()
               .a(lo.a(lv.u, 0.7F, 0.7F, 0.9F), this.dA() + this.ae.k(), this.dC() + (double)(this.ae.i() * $$24), this.dG() + this.ae.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(arn $$0) {
      if (this.t() > 0) {
         int $$1 = this.t() - 1;
         this.bN.a(1.0F - (float)$$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dA(), this.dE(), this.dG(), 7.0F, false, dhp.a.c);
            if (!this.bb()) {
               $$0.b(1023, this.dv(), 0);
            }
         }

         this.b($$1);
         if (this.af % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.a($$0);

         for (int $$2 = 1; $$2 < 3; $$2++) {
            if (this.af >= this.bK[$$2 - 1]) {
               this.bK[$$2 - 1] = this.af + 10 + this.ae.a(10);
               if (($$0.an() == btn.c || $$0.an() == btn.d) && this.bL[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = azk.a(this.ae, this.dA() - 10.0, this.dA() + 10.0);
                  double $$6 = azk.a(this.ae, this.dC() - 5.0, this.dC() + 5.0);
                  double $$7 = azk.a(this.ae, this.dG() - 10.0, this.dG() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.bL[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  bwr $$9 = (bwr)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((bvs)$$9) > 900.0) && this.E($$9)) {
                     this.a($$2 + 1, $$9);
                     this.bK[$$2 - 1] = this.af + 40 + this.ae.a(20);
                     this.bL[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<bwr> $$10 = $$0.a(bwr.class, bP, this, this.cR().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     bwr $$11 = $$10.get(this.ae.a($$10.size()));
                     this.a($$2, $$11.ar());
                  }
               }
            }
         }

         if (this.f() != null) {
            this.a(0, this.f().ar());
         } else {
            this.a(0, 0);
         }

         if (this.bM > 0) {
            this.bM--;
            if (this.bM == 0 && $$0.O().c(dhl.c)) {
               boolean $$12 = false;
               int $$13 = azk.d(this.dq() / 2.0F + 1.0F);
               int $$14 = azk.d(this.dr());

               for (jj $$15 : jj.b(this.dz() - $$13, this.dB(), this.dF() - $$13, this.dz() + $$13, this.dB() + $$14, this.dF() + $$13)) {
                  dym $$16 = $$0.a_($$15);
                  if (c($$16)) {
                     $$12 = $$0.a($$15, true, this) || $$12;
                  }
               }

               if ($$12) {
                  $$0.a(null, 1022, this.dv(), 0);
               }
            }
         }

         if (this.af % 20 == 0) {
            this.c(1.0F);
         }

         this.bN.a(this.eF() / this.eT());
      }
   }

   public static boolean c(dym $$0) {
      return !$$0.l() && !$$0.a(awz.aH);
   }

   @Override
   public void j() {
      this.b(220);
      this.bN.a(0.0F);
      this.d(this.eT() / 3.0F);
   }

   @Override
   public void a(dym $$0, fcu $$1) {
   }

   @Override
   public void d(aro $$0) {
      super.d($$0);
      this.bN.a($$0);
   }

   @Override
   public void e(aro $$0) {
      super.e($$0);
      this.bN.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dA();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azk.b($$1);
         return this.dA() + (double)$$2 * 1.3 * (double)this.ek();
      }
   }

   private double s(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dC() + (double)($$1 * this.ek());
   }

   private double t(int $$0) {
      if ($$0 <= 0) {
         return this.dG();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azk.a($$1);
         return this.dG() + (double)$$2 * 1.3 * (double)this.ek();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azk.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bwr $$1) {
      this.a($$0, $$1.dA(), $$1.dC() + (double)$$1.cS() * 0.5, $$1.dG(), $$0 == 0 && this.ae.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.bb()) {
         this.dV().a(null, 1024, this.dv(), 0);
      }

      double $$5 = this.r($$0);
      double $$6 = this.s($$0);
      double $$7 = this.t($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      fcu $$11 = new fcu($$8, $$9, $$10);
      crp $$12 = new crp(this.dV(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dV().b($$12);
   }

   @Override
   public void a(bwr $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(axb.t) || $$1.d() instanceof cma) {
         return false;
      } else if (this.t() > 0 && !$$1.a(axb.d)) {
         return false;
      } else {
         if (this.x()) {
            bvs $$3 = $$1.c();
            if ($$3 instanceof cqp || $$3 instanceof crt) {
               return false;
            }
         }

         bvs $$4 = $$1.d();
         if ($$4 != null && $$4.aq().a(axd.y)) {
            return false;
         } else {
            if (this.bM <= 0) {
               this.bM = 20;
            }

            for (int $$5 = 0; $$5 < this.bL.length; $$5++) {
               this.bL[$$5] = this.bL[$$5] + 3;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arn $$0, buh $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cmn $$3 = this.a($$0, cyc.vv);
      if ($$3 != null) {
         $$3.t();
      }
   }

   @Override
   public void dH() {
      if (this.dV().an() == btn.a && this.aa()) {
         this.at();
      } else {
         this.bc = 0;
      }
   }

   @Override
   public boolean b(buw $$0, @Nullable bvs $$1) {
      return false;
   }

   public static bxw.a m() {
      return cnj.gt().a(bxx.s, 300.0).a(bxx.v, 0.6F).a(bxx.l, 0.6F).a(bxx.m, 40.0).a(bxx.a, 4.0);
   }

   public float[] n() {
      return this.bH;
   }

   public float[] q() {
      return this.bG;
   }

   public int t() {
      return this.al.a(bE);
   }

   public void b(int $$0) {
      this.al.a(bE, $$0);
   }

   public int c(int $$0) {
      return this.al.a(d.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.al.a(d.get($$0), $$1);
   }

   public boolean x() {
      return this.eF() <= this.eT() / 2.0F;
   }

   @Override
   protected boolean o(bvs $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(buw $$0) {
      return $$0.a(buy.t) ? false : super.b($$0);
   }

   class a extends cdn {
      public a() {
         this.a(EnumSet.of(cdn.a.a, cdn.a.c, cdn.a.b));
      }

      @Override
      public boolean b() {
         return cma.this.t() > 0;
      }
   }
}
