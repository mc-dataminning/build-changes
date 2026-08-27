import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byb extends bzi implements bjt, bzm {
   private static final aef<Integer> b = aei.a(byb.class, aeh.b);
   private static final aef<Integer> c = aei.a(byb.class, aeh.b);
   private static final aef<Integer> d = aei.a(byb.class, aeh.b);
   private static final List<aef<Integer>> e = ImmutableList.of(b, c, d);
   private static final aef<Integer> bT = aei.a(byb.class, aeh.b);
   private static final int bU = 220;
   private final float[] bV = new float[2];
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final int[] bZ = new int[2];
   private final int[] ca = new int[2];
   private int cb;
   private final ako cc = (ako)new ako(this.N_(), bgo.a.f, bgo.b.a).a(true);
   private static final Predicate<bjg> cd = $$0 -> $$0.eR() != bjl.b && $$0.fy();
   private static final bts ce = bts.a().a(20.0).a(cd);

   public byb(biu<? extends byb> $$0, cpv $$1) {
      super($$0, $$1);
      this.bL = new bpb(this, 10, false);
      this.c(this.eL());
      this.bJ = 50;
   }

   @Override
   protected bsp b(cpv $$0) {
      bsn $$1 = new bsn(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void z() {
      this.bO.a(0, new byb.a());
      this.bO.a(2, new bra(this, 1.0, 40, 20.0F));
      this.bO.a(5, new brn(this, 1.0));
      this.bO.a(6, new bqj(this, cbu.class, 8.0F));
      this.bO.a(7, new bqw(this));
      this.bP.a(1, new brt(this));
      this.bP.a(2, new bru<>(this, bjg.class, 0, false, false, cd));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, 0);
      this.an.a(c, 0);
      this.an.a(d, 0);
      this.an.a(bT, 0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Invul", this.y());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ac()) {
         this.cc.a(this.N_());
      }
   }

   @Override
   public void b(@Nullable tm $$0) {
      super.b($$0);
      this.cc.a(this.N_());
   }

   @Override
   protected apd w() {
      return ape.Aj;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.Am;
   }

   @Override
   protected apd l_() {
      return ape.Al;
   }

   @Override
   public void b_() {
      ehn $$0 = this.do().d(1.0, 0.6, 1.0);
      if (!this.dL().B && this.t(0) > 0) {
         biq $$1 = this.dL().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.ds() < $$1.ds() || !this.a() && this.ds() < $$1.ds() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ehn($$0.c, $$2, $$0.e);
            ehn $$3 = new ehn($$1.dq() - this.dq(), 0.0, $$1.dw() - this.dw());
            if ($$3.i() > 9.0) {
               ehn $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.f($$0);
      if ($$0.i() > 0.05) {
         this.r((float)arx.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.b_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bY[$$5] = this.bW[$$5];
         this.bX[$$5] = this.bV[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         biq $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dL().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.dq() - $$9;
            double $$13 = $$8.du() - $$10;
            double $$14 = $$8.dw() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(arx.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(arx.d($$13, $$15) * 180.0F / (float)Math.PI));
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
         this.dL().a(ix.Z, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.dL().z.a(4) == 0) {
            this.dL().a(ix.v, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.y() > 0) {
         for (int $$23 = 0; $$23 < 3; $$23++) {
            this.dL().a(ix.v, this.dq() + this.ag.k(), this.ds() + (double)(this.ag.i() * 3.3F), this.dw() + this.ag.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void X() {
      if (this.y() > 0) {
         int $$0 = this.y() - 1;
         this.cc.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dL().a(this, this.dq(), this.du(), this.dw(), 7.0F, false, cpv.a.c);
            if (!this.aS()) {
               this.dL().b(1023, this.dl(), 0);
            }
         }

         this.s($$0);
         if (this.ah % 10 == 0) {
            this.b(10.0F);
         }
      } else {
         super.X();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ah >= this.bZ[$$1 - 1]) {
               this.bZ[$$1 - 1] = this.ah + 10 + this.ag.a(10);
               if ((this.dL().ai() == bgv.c || this.dL().ai() == bgv.d) && this.ca[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = arx.a(this.ag, this.dq() - 10.0, this.dq() + 10.0);
                  double $$5 = arx.a(this.ag, this.ds() - 5.0, this.ds() + 5.0);
                  double $$6 = arx.a(this.ag, this.dw() - 10.0, this.dw() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ca[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  bjg $$8 = (bjg)this.dL().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((biq)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.bZ[$$1 - 1] = this.ah + 40 + this.ag.a(20);
                     this.ca[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bjg> $$9 = this.dL().a(bjg.class, ce, this, this.cG().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bjg $$10 = $$9.get(this.ag.a($$9.size()));
                     this.a($$1, $$10.ah());
                  }
               }
            }
         }

         if (this.q() != null) {
            this.a(0, this.q().ah());
         } else {
            this.a(0, 0);
         }

         if (this.cb > 0) {
            this.cb--;
            if (this.cb == 0 && this.dL().X().b(cpr.c)) {
               int $$11 = arx.a(this.ds());
               int $$12 = arx.a(this.dq());
               int $$13 = arx.a(this.dw());
               boolean $$14 = false;

               for (int $$15 = -1; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 3; $$17++) {
                        int $$18 = $$12 + $$15;
                        int $$19 = $$11 + $$17;
                        int $$20 = $$13 + $$16;
                        gw $$21 = new gw($$18, $$19, $$20);
                        dfj $$22 = this.dL().a_($$21);
                        if (d($$22)) {
                           $$14 = this.dL().a($$21, true, this) || $$14;
                        }
                     }
                  }
               }

               if ($$14) {
                  this.dL().a(null, 1022, this.dl(), 0);
               }
            }
         }

         if (this.ah % 20 == 0) {
            this.b(1.0F);
         }

         this.cc.a(this.eu() / this.eL());
      }
   }

   public static boolean d(dfj $$0) {
      return !$$0.i() && !$$0.a(apt.aD);
   }

   @Override
   public void s() {
      this.s(220);
      this.cc.a(0.0F);
      this.c(this.eL() / 3.0F);
   }

   @Override
   public void a(dfj $$0, ehn $$1) {
   }

   @Override
   public void c(aks $$0) {
      super.c($$0);
      this.cc.a($$0);
   }

   @Override
   public void d(aks $$0) {
      super.d($$0);
      this.cc.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dq();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = arx.b($$1);
         return this.dq() + (double)$$2 * 1.3;
      }
   }

   private double v(int $$0) {
      return $$0 <= 0 ? this.ds() + 3.0 : this.ds() + 2.2;
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dw();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = arx.a($$1);
         return this.dw() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = arx.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bjg $$1) {
      this.a($$0, $$1.dq(), $$1.ds() + (double)$$1.cH() * 0.5, $$1.dw(), $$0 == 0 && this.ag.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aS()) {
         this.dL().a(null, 1024, this.dl(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      ccz $$11 = new ccz(this.dL(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dL().b($$11);
   }

   @Override
   public void a(bjg $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(apv.t) || $$0.d() instanceof byb) {
         return false;
      } else if (this.y() > 0 && !$$0.a(apv.d)) {
         return false;
      } else {
         if (this.a()) {
            biq $$2 = $$0.c();
            if ($$2 instanceof cca) {
               return false;
            }
         }

         biq $$3 = $$0.d();
         if ($$3 != null && !($$3 instanceof cbu) && $$3 instanceof bjg && ((bjg)$$3).eR() == this.eR()) {
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
   protected void a(bho $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      byn $$3 = this.a(cji.ty);
      if ($$3 != null) {
         $$3.A();
      }
   }

   @Override
   public void dx() {
      if (this.dL().ai() == bgv.a && this.V()) {
         this.ak();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bid $$0, @Nullable biq $$1) {
      return false;
   }

   public static bkl.a t() {
      return bzi.gj().a(bkm.a, 300.0).a(bkm.d, 0.6F).a(bkm.e, 0.6F).a(bkm.b, 40.0).a(bkm.i, 4.0);
   }

   public float b(int $$0) {
      return this.bW[$$0];
   }

   public float c(int $$0) {
      return this.bV[$$0];
   }

   public int y() {
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
      return this.eu() <= this.eL() / 2.0F;
   }

   @Override
   public bjl eR() {
      return bjl.b;
   }

   @Override
   protected boolean o(biq $$0) {
      return false;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public boolean c(bid $$0) {
      return $$0.c() == bif.t ? false : super.c($$0);
   }

   class a extends bqb {
      public a() {
         this.a(EnumSet.of(bqb.a.a, bqb.a.c, bqb.a.b));
      }

      @Override
      public boolean a() {
         return byb.this.y() > 0;
      }
   }
}
