import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class clj extends cms implements cmw {
   private static final ajx<Integer> a = akb.a(clj.class, ajz.b);
   private static final ajx<Integer> b = akb.a(clj.class, ajz.b);
   private static final ajx<Integer> c = akb.a(clj.class, ajz.b);
   private static final List<ajx<Integer>> d = ImmutableList.of(a, b, c);
   private static final ajx<Integer> bF = akb.a(clj.class, ajz.b);
   private static final int bG = 220;
   private final float[] bH = new float[2];
   private final float[] bI = new float[2];
   private final float[] bJ = new float[2];
   private final float[] bK = new float[2];
   private final int[] bL = new int[2];
   private final int[] bM = new int[2];
   private int bN;
   private final aqz bO = (aqz)new aqz(this.m_(), bso.a.f, bso.b.a).a(true);
   private static final cgp.a bP = ($$0, $$1) -> !$$0.aq().a(awt.y) && $$0.fO();
   private static final cgp bQ = cgp.a().a(20.0).a(bP);

   public clj(bvi<? extends clj> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new cbw(this, 10, false);
      this.d(this.eS());
      this.bx = 50;
   }

   @Override
   protected cfk b(dgz $$0) {
      cfi $$1 = new cfi(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bC.a(0, new clj.a());
      this.bC.a(2, new cdv(this, 1.0, 40, 20.0F));
      this.bC.a(5, new cei(this, 1.0));
      this.bC.a(6, new cde(this, cpr.class, 8.0F));
      this.bC.a(7, new cdr(this));
      this.bD.a(1, new ceo(this));
      this.bD.a(2, new cep<>(this, bvy.class, 0, false, false, bP));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(bF, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Invul", this.t());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.h_()) {
         this.bO.a(this.m_());
      }
   }

   @Override
   public void b(@Nullable wp $$0) {
      super.b($$0);
      this.bO.a(this.m_());
   }

   @Override
   protected avz u() {
      return awa.Dw;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.Dz;
   }

   @Override
   protected avz l_() {
      return awa.Dy;
   }

   @Override
   public void k_() {
      fbx $$0 = this.dx().d(1.0, 0.6, 1.0);
      if (!this.dU().C && this.c(0) > 0) {
         bva $$1 = this.dU().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dB() < $$1.dB() || !this.x() && this.dB() < $$1.dB() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new fbx($$0.d, $$2, $$0.f);
            fbx $$3 = new fbx($$1.dz() - this.dz(), 0.0, $$1.dF() - this.dF());
            if ($$3.j() > 9.0) {
               fbx $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.i($$0);
      if ($$0.j() > 0.05) {
         this.w((float)ayz.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.k_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bK[$$5] = this.bI[$$5];
         this.bJ[$$5] = this.bH[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bva $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dU().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.r($$6 + 1);
            double $$10 = this.s($$6 + 1);
            double $$11 = this.t($$6 + 1);
            double $$12 = $$8.dz() - $$9;
            double $$13 = $$8.dD() - $$10;
            double $$14 = $$8.dF() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(ayz.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(ayz.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bH[$$6] = this.a(this.bH[$$6], $$17, 40.0F);
            this.bI[$$6] = this.a(this.bI[$$6], $$16, 10.0F);
         } else {
            this.bI[$$6] = this.a(this.bI[$$6], this.aV, 10.0F);
         }
      }

      boolean $$18 = this.x();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.r($$19);
         double $$21 = this.s($$19);
         double $$22 = this.t($$19);
         float $$23 = 0.3F * this.ej();
         this.dU().a(lt.ah, $$20 + this.ae.k() * (double)$$23, $$21 + this.ae.k() * (double)$$23, $$22 + this.ae.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dU().A.a(4) == 0) {
            this.dU()
               .a(
                  lm.a(lt.u, 0.7F, 0.7F, 0.5F),
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
         float $$24 = 3.3F * this.ej();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dU()
               .a(lm.a(lt.u, 0.7F, 0.7F, 0.9F), this.dz() + this.ae.k(), this.dB() + (double)(this.ae.i() * $$24), this.dF() + this.ae.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ard $$0) {
      if (this.t() > 0) {
         int $$1 = this.t() - 1;
         this.bO.a(1.0F - (float)$$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dz(), this.dD(), this.dF(), 7.0F, false, dgz.a.c);
            if (!this.bb()) {
               $$0.b(1023, this.du(), 0);
            }
         }

         this.b($$1);
         if (this.af % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.a($$0);

         for (int $$2 = 1; $$2 < 3; $$2++) {
            if (this.af >= this.bL[$$2 - 1]) {
               this.bL[$$2 - 1] = this.af + 10 + this.ae.a(10);
               if (($$0.an() == bsv.c || $$0.an() == bsv.d) && this.bM[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = ayz.a(this.ae, this.dz() - 10.0, this.dz() + 10.0);
                  double $$6 = ayz.a(this.ae, this.dB() - 5.0, this.dB() + 5.0);
                  double $$7 = ayz.a(this.ae, this.dF() - 10.0, this.dF() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.bM[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  bvy $$9 = (bvy)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((bva)$$9) > 900.0) && this.E($$9)) {
                     this.a($$2 + 1, $$9);
                     this.bL[$$2 - 1] = this.af + 40 + this.ae.a(20);
                     this.bM[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<bvy> $$10 = $$0.a(bvy.class, bQ, this, this.cQ().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     bvy $$11 = $$10.get(this.ae.a($$10.size()));
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

         if (this.bN > 0) {
            this.bN--;
            if (this.bN == 0 && $$0.O().b(dgv.c)) {
               boolean $$12 = false;
               int $$13 = ayz.d(this.dp() / 2.0F + 1.0F);
               int $$14 = ayz.d(this.dq());

               for (ji $$15 : ji.b(this.dy() - $$13, this.dA(), this.dE() - $$13, this.dy() + $$13, this.dA() + $$14, this.dE() + $$13)) {
                  dxq $$16 = $$0.a_($$15);
                  if (c($$16)) {
                     $$12 = $$0.a($$15, true, this) || $$12;
                  }
               }

               if ($$12) {
                  $$0.a(null, 1022, this.du(), 0);
               }
            }
         }

         if (this.af % 20 == 0) {
            this.c(1.0F);
         }

         this.bO.a(this.eE() / this.eS());
      }
   }

   public static boolean c(dxq $$0) {
      return !$$0.l() && !$$0.a(awp.aH);
   }

   public void j() {
      this.b(220);
      this.bO.a(0.0F);
      this.d(this.eS() / 3.0F);
   }

   @Override
   public void a(dxq $$0, fbx $$1) {
   }

   @Override
   public void d(are $$0) {
      super.d($$0);
      this.bO.a($$0);
   }

   @Override
   public void e(are $$0) {
      super.e($$0);
      this.bO.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dz();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayz.b($$1);
         return this.dz() + (double)$$2 * 1.3 * (double)this.ej();
      }
   }

   private double s(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dB() + (double)($$1 * this.ej());
   }

   private double t(int $$0) {
      if ($$0 <= 0) {
         return this.dF();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ayz.a($$1);
         return this.dF() + (double)$$2 * 1.3 * (double)this.ej();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ayz.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bvy $$1) {
      this.a($$0, $$1.dz(), $$1.dB() + (double)$$1.cR() * 0.5, $$1.dF(), $$0 == 0 && this.ae.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.bb()) {
         this.dU().a(null, 1024, this.du(), 0);
      }

      double $$5 = this.r($$0);
      double $$6 = this.s($$0);
      double $$7 = this.t($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      fbx $$11 = new fbx($$8, $$9, $$10);
      cqy $$12 = new cqy(this.dU(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dU().b($$12);
   }

   @Override
   public void a(bvy $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(awr.t) || $$1.d() instanceof clj) {
         return false;
      } else if (this.t() > 0 && !$$1.a(awr.d)) {
         return false;
      } else {
         if (this.x()) {
            bva $$3 = $$1.c();
            if ($$3 instanceof cpy || $$3 instanceof crc) {
               return false;
            }
         }

         bva $$4 = $$1.d();
         if ($$4 != null && $$4.aq().a(awt.y)) {
            return false;
         } else {
            if (this.bN <= 0) {
               this.bN = 20;
            }

            for (int $$5 = 0; $$5 < this.bM.length; $$5++) {
               this.bM[$$5] = this.bM[$$5] + 3;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ard $$0, btp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      clw $$3 = this.a($$0, cxl.vt);
      if ($$3 != null) {
         $$3.t();
      }
   }

   @Override
   public void dG() {
      if (this.dU().an() == bsv.a && this.aa()) {
         this.at();
      } else {
         this.bd = 0;
      }
   }

   @Override
   public boolean b(bue $$0, @Nullable bva $$1) {
      return false;
   }

   public static bxf.a m() {
      return cms.gv().a(bxg.s, 300.0).a(bxg.v, 0.6F).a(bxg.l, 0.6F).a(bxg.m, 40.0).a(bxg.a, 4.0);
   }

   public float[] n() {
      return this.bI;
   }

   public float[] q() {
      return this.bH;
   }

   public int t() {
      return this.al.a(bF);
   }

   public void b(int $$0) {
      this.al.a(bF, $$0);
   }

   public int c(int $$0) {
      return this.al.a(d.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.al.a(d.get($$0), $$1);
   }

   public boolean x() {
      return this.eE() <= this.eS() / 2.0F;
   }

   @Override
   protected boolean o(bva $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(bue $$0) {
      return $$0.a(bug.t) ? false : super.b($$0);
   }

   class a extends ccw {
      public a() {
         this.a(EnumSet.of(ccw.a.a, ccw.a.c, ccw.a.b));
      }

      @Override
      public boolean b() {
         return clj.this.t() > 0;
      }
   }
}
