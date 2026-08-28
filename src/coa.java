import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class coa extends cpk implements cpo {
   private static final aku<Integer> a = aky.a(coa.class, akw.b);
   private static final aku<Integer> b = aky.a(coa.class, akw.b);
   private static final aku<Integer> c = aky.a(coa.class, akw.b);
   private static final List<aku<Integer>> d = ImmutableList.of(a, b, c);
   private static final aku<Integer> e = aky.a(coa.class, akw.b);
   private static final int f = 220;
   private static final int bI = 0;
   private final float[] bJ = new float[2];
   private final float[] bK = new float[2];
   private final float[] bL = new float[2];
   private final float[] bM = new float[2];
   private final int[] bN = new int[2];
   private final int[] bO = new int[2];
   private int bP;
   private final arx bQ = (arx)new arx(this.P_(), bus.a.f, bus.b.a).a(true);
   private static final ciu.a bR = ($$0, $$1) -> !$$0.an().a(axq.y) && $$0.fM();
   private static final ciu bS = ciu.a().a(20.0).a(bR);

   public coa(bxn<? extends coa> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new ceb(this, 10, false);
      this.d(this.eU());
      this.bA = 50;
   }

   @Override
   protected chp b(dkj $$0) {
      chn $$1 = new chn(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   protected void C() {
      this.bF.a(0, new coa.a());
      this.bF.a(2, new cga(this, 1.0, 40, 20.0F));
      this.bF.a(5, new cgn(this, 1.0));
      this.bF.a(6, new cfj(this, csi.class, 8.0F));
      this.bF.a(7, new cfw(this));
      this.bG.a(1, new cgt(this));
      this.bG.a(2, new cgu<>(this, byf.class, 0, false, false, bR));
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(e, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Invul", this.gv());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.b($$0.b("Invul", 0));
      if (this.g_()) {
         this.bQ.a(this.P_());
      }
   }

   @Override
   public void b(@Nullable xg $$0) {
      super.b($$0);
      this.bQ.a(this.P_());
   }

   @Override
   protected awx s() {
      return awy.DC;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.DF;
   }

   @Override
   protected awx j_() {
      return awy.DE;
   }

   @Override
   public void d_() {
      fgc $$0 = this.dy().d(1.0, 0.6, 1.0);
      if (!this.dV().C && this.c(0) > 0) {
         bxe $$1 = this.dV().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dC() < $$1.dC() || !this.gw() && this.dC() < $$1.dC() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new fgc($$0.d, $$2, $$0.f);
            fgc $$3 = new fgc($$1.dA() - this.dA(), 0.0, $$1.dG() - this.dG());
            if ($$3.j() > 9.0) {
               fgc $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.i($$0);
      if ($$0.j() > 0.05) {
         this.w((float)azz.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.d_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bM[$$5] = this.bK[$$5];
         this.bL[$$5] = this.bJ[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bxe $$8 = null;
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
            float $$16 = (float)(azz.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(azz.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bJ[$$6] = this.a(this.bJ[$$6], $$17, 40.0F);
            this.bK[$$6] = this.a(this.bK[$$6], $$16, 10.0F);
         } else {
            this.bK[$$6] = this.a(this.bK[$$6], this.aV, 10.0F);
         }
      }

      boolean $$18 = this.gw();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.r($$19);
         double $$21 = this.s($$19);
         double $$22 = this.t($$19);
         float $$23 = 0.3F * this.el();
         this.dV().a(lz.ah, $$20 + this.ae.k() * (double)$$23, $$21 + this.ae.k() * (double)$$23, $$22 + this.ae.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dV().A.a(4) == 0) {
            this.dV()
               .a(
                  ls.a(lz.u, 0.7F, 0.7F, 0.5F),
                  $$20 + this.ae.k() * (double)$$23,
                  $$21 + this.ae.k() * (double)$$23,
                  $$22 + this.ae.k() * (double)$$23,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.gv() > 0) {
         float $$24 = 3.3F * this.el();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dV()
               .a(ls.a(lz.u, 0.7F, 0.7F, 0.9F), this.dA() + this.ae.k(), this.dC() + (double)(this.ae.i() * $$24), this.dG() + this.ae.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(asb $$0) {
      if (this.gv() > 0) {
         int $$1 = this.gv() - 1;
         this.bQ.a(1.0F - (float)$$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dA(), this.dE(), this.dG(), 7.0F, false, dkj.a.c);
            if (!this.ba()) {
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
            if (this.af >= this.bN[$$2 - 1]) {
               this.bN[$$2 - 1] = this.af + 10 + this.ae.a(10);
               if (($$0.an() == buz.c || $$0.an() == buz.d) && this.bO[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = azz.a(this.ae, this.dA() - 10.0, this.dA() + 10.0);
                  double $$6 = azz.a(this.ae, this.dC() - 5.0, this.dC() + 5.0);
                  double $$7 = azz.a(this.ae, this.dG() - 10.0, this.dG() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.bO[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  byf $$9 = (byf)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((bxe)$$9) > 900.0) && this.E($$9)) {
                     this.a($$2 + 1, $$9);
                     this.bN[$$2 - 1] = this.af + 40 + this.ae.a(20);
                     this.bO[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<byf> $$10 = $$0.a(byf.class, bS, this, this.cR().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     byf $$11 = $$10.get(this.ae.a($$10.size()));
                     this.a($$2, $$11.ao());
                  }
               }
            }
         }

         if (this.e() != null) {
            this.a(0, this.e().ao());
         } else {
            this.a(0, 0);
         }

         if (this.bP > 0) {
            this.bP--;
            if (this.bP == 0 && $$0.O().c(dkf.d)) {
               boolean $$12 = false;
               int $$13 = azz.d(this.dq() / 2.0F + 1.0F);
               int $$14 = azz.d(this.dr());

               for (iw $$15 : iw.b(this.dz() - $$13, this.dB(), this.dF() - $$13, this.dz() + $$13, this.dB() + $$14, this.dF() + $$13)) {
                  ebq $$16 = $$0.a_($$15);
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

         this.bQ.a(this.eG() / this.eU());
      }
   }

   public static boolean c(ebq $$0) {
      return !$$0.l() && !$$0.a(axn.aH);
   }

   @Override
   public void m() {
      this.b(220);
      this.bQ.a(0.0F);
      this.d(this.eU() / 3.0F);
   }

   @Override
   public void a(ebq $$0, fgc $$1) {
   }

   @Override
   public void d(asc $$0) {
      super.d($$0);
      this.bQ.a($$0);
   }

   @Override
   public void e(asc $$0) {
      super.e($$0);
      this.bQ.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dA();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = azz.b($$1);
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
         float $$2 = azz.a($$1);
         return this.dG() + (double)$$2 * 1.3 * (double)this.el();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azz.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, byf $$1) {
      this.a($$0, $$1.dA(), $$1.dC() + (double)$$1.cS() * 0.5, $$1.dG(), $$0 == 0 && this.ae.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.ba()) {
         this.dV().a(null, 1024, this.dv(), 0);
      }

      double $$5 = this.r($$0);
      double $$6 = this.s($$0);
      double $$7 = this.t($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      fgc $$11 = new fgc($$8, $$9, $$10);
      cts $$12 = new cts(this.dV(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dV().b($$12);
   }

   @Override
   public void a(byf $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(axo.t) || $$1.d() instanceof coa) {
         return false;
      } else if (this.gv() > 0 && !$$1.a(axo.d)) {
         return false;
      } else {
         if (this.gw()) {
            bxe $$3 = $$1.c();
            if ($$3 instanceof csq || $$3 instanceof ctw) {
               return false;
            }
         }

         bxe $$4 = $$1.d();
         if ($$4 != null && $$4.an().a(axq.y)) {
            return false;
         } else {
            if (this.bP <= 0) {
               this.bP = 20;
            }

            for (int $$5 = 0; $$5 < this.bO.length; $$5++) {
               this.bO[$$5] = this.bO[$$5] + 3;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(asb $$0, bvt $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      coo $$3 = this.a($$0, dao.vC);
      if ($$3 != null) {
         $$3.s();
      }
   }

   @Override
   public void dH() {
      if (this.dV().an() == buz.a && this.Z()) {
         this.aq();
      } else {
         this.bd = 0;
      }
   }

   @Override
   public boolean b(bwi $$0, @Nullable bxe $$1) {
      return false;
   }

   public static bzk.a p() {
      return cpk.gA().a(bzl.s, 300.0).a(bzl.v, 0.6F).a(bzl.l, 0.6F).a(bzl.m, 40.0).a(bzl.a, 4.0);
   }

   public float[] u() {
      return this.bK;
   }

   public float[] gu() {
      return this.bJ;
   }

   public int gv() {
      return this.al.a(e);
   }

   public void b(int $$0) {
      this.al.a(e, $$0);
   }

   public int c(int $$0) {
      return this.al.a(d.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.al.a(d.get($$0), $$1);
   }

   public boolean gw() {
      return this.eG() <= this.eU() / 2.0F;
   }

   @Override
   protected boolean o(bxe $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(bwi $$0) {
      return $$0.a(bwk.t) ? false : super.b($$0);
   }

   class a extends cfb {
      public a() {
         this.a(EnumSet.of(cfb.a.a, cfb.a.c, cfb.a.b));
      }

      @Override
      public boolean b() {
         return coa.this.gv() > 0;
      }
   }
}
