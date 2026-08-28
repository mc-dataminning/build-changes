import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cmk extends cnt implements cnx {
   private static final akh<Integer> a = akl.a(cmk.class, akj.b);
   private static final akh<Integer> b = akl.a(cmk.class, akj.b);
   private static final akh<Integer> c = akl.a(cmk.class, akj.b);
   private static final List<akh<Integer>> d = ImmutableList.of(a, b, c);
   private static final akh<Integer> bF = akl.a(cmk.class, akj.b);
   private static final int bG = 220;
   private final float[] bH = new float[2];
   private final float[] bI = new float[2];
   private final float[] bJ = new float[2];
   private final float[] bK = new float[2];
   private final int[] bL = new int[2];
   private final int[] bM = new int[2];
   private int bN;
   private final ark bO = (ark)new ark(this.m_(), bto.a.f, bto.b.a).a(true);
   private static final cho.a bP = ($$0, $$1) -> !$$0.aq().a(axd.y) && $$0.fL();
   private static final cho bQ = cho.a().a(20.0).a(bP);

   public cmk(bwj<? extends cmk> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new ccv(this, 10, false);
      this.d(this.eT());
      this.bx = 50;
   }

   @Override
   protected cgj b(dip $$0) {
      cgh $$1 = new cgh(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   protected void D() {
      this.bC.a(0, new cmk.a());
      this.bC.a(2, new ceu(this, 1.0, 40, 20.0F));
      this.bC.a(5, new cfh(this, 1.0));
      this.bC.a(6, new ced(this, cqs.class, 8.0F));
      this.bC.a(7, new ceq(this));
      this.bD.a(1, new cfn(this));
      this.bD.a(2, new cfo<>(this, bwz.class, 0, false, false, bP));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(bF, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Invul", this.t());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.b($$0.h("Invul"));
      if (this.h_()) {
         this.bO.a(this.m_());
      }
   }

   @Override
   public void b(@Nullable ww $$0) {
      super.b($$0);
      this.bO.a(this.m_());
   }

   @Override
   protected awk u() {
      return awl.Dw;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.Dz;
   }

   @Override
   protected awk l_() {
      return awl.Dy;
   }

   @Override
   public void k_() {
      fdw $$0 = this.dy().d(1.0, 0.6, 1.0);
      if (!this.dV().C && this.c(0) > 0) {
         bwa $$1 = this.dV().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dC() < $$1.dC() || !this.x() && this.dC() < $$1.dC() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new fdw($$0.d, $$2, $$0.f);
            fdw $$3 = new fdw($$1.dA() - this.dA(), 0.0, $$1.dG() - this.dG());
            if ($$3.j() > 9.0) {
               fdw $$4 = $$3.d();
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
         this.bK[$$5] = this.bI[$$5];
         this.bJ[$$5] = this.bH[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bwa $$8 = null;
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
         float $$23 = 0.3F * this.ek();
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
         float $$24 = 3.3F * this.ek();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dV()
               .a(lq.a(lx.u, 0.7F, 0.7F, 0.9F), this.dA() + this.ae.k(), this.dC() + (double)(this.ae.i() * $$24), this.dG() + this.ae.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(aro $$0) {
      if (this.t() > 0) {
         int $$1 = this.t() - 1;
         this.bO.a(1.0F - (float)$$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dA(), this.dE(), this.dG(), 7.0F, false, dip.a.c);
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
            if (this.af >= this.bL[$$2 - 1]) {
               this.bL[$$2 - 1] = this.af + 10 + this.ae.a(10);
               if (($$0.an() == btv.c || $$0.an() == btv.d) && this.bM[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = azk.a(this.ae, this.dA() - 10.0, this.dA() + 10.0);
                  double $$6 = azk.a(this.ae, this.dC() - 5.0, this.dC() + 5.0);
                  double $$7 = azk.a(this.ae, this.dG() - 10.0, this.dG() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.bM[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  bwz $$9 = (bwz)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((bwa)$$9) > 900.0) && this.E($$9)) {
                     this.a($$2 + 1, $$9);
                     this.bL[$$2 - 1] = this.af + 40 + this.ae.a(20);
                     this.bM[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<bwz> $$10 = $$0.a(bwz.class, bQ, this, this.cR().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     bwz $$11 = $$10.get(this.ae.a($$10.size()));
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
            if (this.bN == 0 && $$0.O().c(dil.c)) {
               boolean $$12 = false;
               int $$13 = azk.d(this.dq() / 2.0F + 1.0F);
               int $$14 = azk.d(this.dr());

               for (iu $$15 : iu.b(this.dz() - $$13, this.dB(), this.dF() - $$13, this.dz() + $$13, this.dB() + $$14, this.dF() + $$13)) {
                  dzo $$16 = $$0.a_($$15);
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

         this.bO.a(this.eF() / this.eT());
      }
   }

   public static boolean c(dzo $$0) {
      return !$$0.l() && !$$0.a(axa.aH);
   }

   @Override
   public void j() {
      this.b(220);
      this.bO.a(0.0F);
      this.d(this.eT() / 3.0F);
   }

   @Override
   public void a(dzo $$0, fdw $$1) {
   }

   @Override
   public void d(arp $$0) {
      super.d($$0);
      this.bO.a($$0);
   }

   @Override
   public void e(arp $$0) {
      super.e($$0);
      this.bO.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dA();
      } else {
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
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
         float $$1 = (this.aV + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
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

   private void a(int $$0, bwz $$1) {
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
      fdw $$11 = new fdw($$8, $$9, $$10);
      csb $$12 = new csb(this.dV(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.dV().b($$12);
   }

   @Override
   public void a(bwz $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(axb.t) || $$1.d() instanceof cmk) {
         return false;
      } else if (this.t() > 0 && !$$1.a(axb.d)) {
         return false;
      } else {
         if (this.x()) {
            bwa $$3 = $$1.c();
            if ($$3 instanceof cqz || $$3 instanceof csf) {
               return false;
            }
         }

         bwa $$4 = $$1.d();
         if ($$4 != null && $$4.aq().a(axd.y)) {
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
   protected void a(aro $$0, bup $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cmx $$3 = this.a($$0, cyw.vv);
      if ($$3 != null) {
         $$3.t();
      }
   }

   @Override
   public void dH() {
      if (this.dV().an() == btv.a && this.aa()) {
         this.at();
      } else {
         this.bd = 0;
      }
   }

   @Override
   public boolean b(bve $$0, @Nullable bwa $$1) {
      return false;
   }

   public static bye.a m() {
      return cnt.gt().a(byf.s, 300.0).a(byf.v, 0.6F).a(byf.l, 0.6F).a(byf.m, 40.0).a(byf.a, 4.0);
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
      return this.eF() <= this.eT() / 2.0F;
   }

   @Override
   protected boolean o(bwa $$0) {
      return false;
   }

   @Override
   public boolean n(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(bve $$0) {
      return $$0.a(bvg.t) ? false : super.b($$0);
   }

   class a extends cdv {
      public a() {
         this.a(EnumSet.of(cdv.a.a, cdv.a.c, cdv.a.b));
      }

      @Override
      public boolean b() {
         return cmk.this.t() > 0;
      }
   }
}
