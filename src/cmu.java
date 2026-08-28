import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cmu extends cod implements coh {
   private static final akj<Integer> a = akn.a(cmu.class, akl.b);
   private static final akj<Integer> b = akn.a(cmu.class, akl.b);
   private static final akj<Integer> c = akn.a(cmu.class, akl.b);
   private static final List<akj<Integer>> d = ImmutableList.of(a, b, c);
   private static final akj<Integer> bG = akn.a(cmu.class, akl.b);
   private static final int bH = 220;
   private final float[] bI = new float[2];
   private final float[] bJ = new float[2];
   private final float[] bK = new float[2];
   private final float[] bL = new float[2];
   private final int[] bM = new int[2];
   private final int[] bN = new int[2];
   private int bO;
   private final arm bP = (arm)new arm(this.m_(), btt.a.f, btt.b.a).a(true);
   private static final cht.a bQ = ($$0, $$1) -> !$$0.aq().a(axf.y) && $$0.fM();
   private static final cht bR = cht.a().a(20.0).a(bQ);

   public cmu(bwo<? extends cmu> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cda(this, 10, false);
      this.d(this.eU());
      this.by = 50;
   }

   @Override
   protected cgo b(dja $$0) {
      cgm $$1 = new cgm(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bD.a(0, new cmu.a());
      this.bD.a(2, new cez(this, 1.0, 40, 20.0F));
      this.bD.a(5, new cfm(this, 1.0));
      this.bD.a(6, new cei(this, crc.class, 8.0F));
      this.bD.a(7, new cev(this));
      this.bE.a(1, new cfs(this));
      this.bE.a(2, new cft<>(this, bxe.class, 0, false, false, bQ));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(bG, 0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Invul", this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.h_()) {
         this.bP.a(this.m_());
      }
   }

   @Override
   public void b(@Nullable wy $$0) {
      super.b($$0);
      this.bP.a(this.m_());
   }

   @Override
   protected awm u() {
      return awn.DC;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.DF;
   }

   @Override
   protected awm l_() {
      return awn.DE;
   }

   @Override
   public void k_() {
      feq $$0 = this.dy().d(1.0, 0.6, 1.0);
      if (!this.dV().C && this.c(0) > 0) {
         bwf $$1 = this.dV().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dC() < $$1.dC() || !this.x() && this.dC() < $$1.dC() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new feq($$0.d, $$2, $$0.f);
            feq $$3 = new feq($$1.dA() - this.dA(), 0.0, $$1.dG() - this.dG());
            if ($$3.j() > 9.0) {
               feq $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.i($$0);
      if ($$0.j() > 0.05) {
         this.w((float)azm.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.k_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bL[$$5] = this.bJ[$$5];
         this.bK[$$5] = this.bI[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bwf $$8 = null;
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
            float $$16 = (float)(azm.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azm.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bI[$$6] = this.a(this.bI[$$6], $$17, 40.0F);
            this.bJ[$$6] = this.a(this.bJ[$$6], $$16, 10.0F);
         } else {
            this.bJ[$$6] = this.a(this.bJ[$$6], this.aV, 10.0F);
         }
      }

      boolean $$18 = this.x();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.r($$19);
         double $$21 = this.s($$19);
         double $$22 = this.t($$19);
         float $$23 = 0.3F * this.el();
         this.dV().a(lx.ah, $$20 + this.ae.k() * (double)$$23, $$21 + this.ae.k() * (double)$$23, $$22 + this.ae.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dV().A.a(4) == 0) {
            this.dV()
               .a(
                  lq.a(lx.u, 0.7F, 0.7F, 0.5F),
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
         float $$24 = 3.3F * this.el();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dV()
               .a(lq.a(lx.u, 0.7F, 0.7F, 0.9F), this.dA() + this.ae.k(), this.dC() + (double)(this.ae.i() * $$24), this.dG() + this.ae.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(arq $$0) {
      if (this.t() > 0) {
         int $$1 = this.t() - 1;
         this.bP.a(1.0F - (float)$$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dA(), this.dE(), this.dG(), 7.0F, false, dja.a.c);
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
            if (this.af >= this.bM[$$2 - 1]) {
               this.bM[$$2 - 1] = this.af + 10 + this.ae.a(10);
               if (($$0.an() == bua.c || $$0.an() == bua.d) && this.bN[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = azm.a(this.ae, this.dA() - 10.0, this.dA() + 10.0);
                  double $$6 = azm.a(this.ae, this.dC() - 5.0, this.dC() + 5.0);
                  double $$7 = azm.a(this.ae, this.dG() - 10.0, this.dG() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.bN[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  bxe $$9 = (bxe)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((bwf)$$9) > 900.0) && this.E($$9)) {
                     this.a($$2 + 1, $$9);
                     this.bM[$$2 - 1] = this.af + 40 + this.ae.a(20);
                     this.bN[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<bxe> $$10 = $$0.a(bxe.class, bR, this, this.cR().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     bxe $$11 = $$10.get(this.ae.a($$10.size()));
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

         if (this.bO > 0) {
            this.bO--;
            if (this.bO == 0 && $$0.O().c(diw.d)) {
               boolean $$12 = false;
               int $$13 = azm.d(this.dq() / 2.0F + 1.0F);
               int $$14 = azm.d(this.dr());

               for (iu $$15 : iu.b(this.dz() - $$13, this.dB(), this.dF() - $$13, this.dz() + $$13, this.dB() + $$14, this.dF() + $$13)) {
                  eah $$16 = $$0.a_($$15);
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

         this.bP.a(this.eG() / this.eU());
      }
   }

   public static boolean c(eah $$0) {
      return !$$0.l() && !$$0.a(axc.aH);
   }

   @Override
   public void j() {
      this.b(220);
      this.bP.a(0.0F);
      this.d(this.eU() / 3.0F);
   }

   @Override
   public void a(eah $$0, feq $$1) {
   }

   @Override
   public void d(arr $$0) {
      super.d($$0);
      this.bP.a($$0);
   }

   @Override
   public void e(arr $$0) {
      super.e($$0);
      this.bP.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dA();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azm.b($$1);
         return this.dA() + (double)$$2 * 1.3 * (double)this.el();
      }
   }

   private double s(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dC() + (double)($$1 * this.el());
   }

   private double t(int $$0) {
      if ($$0 <= 0) {
         return this.dG();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azm.a($$1);
         return this.dG() + (double)$$2 * 1.3 * (double)this.el();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azm.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bxe $$1) {
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
      feq $$11 = new feq($$8, $$9, $$10);
      csm $$12 = new csm(this.dV(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dV().b($$12);
   }

   @Override
   public void a(bxe $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(axd.t) || $$1.d() instanceof cmu) {
         return false;
      } else if (this.t() > 0 && !$$1.a(axd.d)) {
         return false;
      } else {
         if (this.x()) {
            bwf $$3 = $$1.c();
            if ($$3 instanceof crk || $$3 instanceof csq) {
               return false;
            }
         }

         bwf $$4 = $$1.d();
         if ($$4 != null && $$4.aq().a(axf.y)) {
            return false;
         } else {
            if (this.bO <= 0) {
               this.bO = 20;
            }

            for (int $$5 = 0; $$5 < this.bN.length; $$5++) {
               this.bN[$$5] = this.bN[$$5] + 3;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arq $$0, buu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cnh $$3 = this.a($$0, czh.vC);
      if ($$3 != null) {
         $$3.t();
      }
   }

   @Override
   public void dH() {
      if (this.dV().an() == bua.a && this.aa()) {
         this.at();
      } else {
         this.bd = 0;
      }
   }

   @Override
   public boolean b(bvj $$0, @Nullable bwf $$1) {
      return false;
   }

   public static byj.a m() {
      return cod.gu().a(byk.s, 300.0).a(byk.v, 0.6F).a(byk.l, 0.6F).a(byk.m, 40.0).a(byk.a, 4.0);
   }

   public float[] n() {
      return this.bJ;
   }

   public float[] q() {
      return this.bI;
   }

   public int t() {
      return this.al.a(bG);
   }

   public void b(int $$0) {
      this.al.a(bG, $$0);
   }

   public int c(int $$0) {
      return this.al.a(d.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.al.a(d.get($$0), $$1);
   }

   public boolean x() {
      return this.eG() <= this.eU() / 2.0F;
   }

   @Override
   protected boolean o(bwf $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(bvj $$0) {
      return $$0.a(bvl.t) ? false : super.b($$0);
   }

   class a extends cea {
      public a() {
         this.a(EnumSet.of(cea.a.a, cea.a.c, cea.a.b));
      }

      @Override
      public boolean b() {
         return cmu.this.t() > 0;
      }
   }
}
