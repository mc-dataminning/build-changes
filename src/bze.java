import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bze extends cal implements bkw, cap {
   private static final afc<Integer> b = aff.a(bze.class, afe.b);
   private static final afc<Integer> c = aff.a(bze.class, afe.b);
   private static final afc<Integer> d = aff.a(bze.class, afe.b);
   private static final List<afc<Integer>> e = ImmutableList.of(b, c, d);
   private static final afc<Integer> bT = aff.a(bze.class, afe.b);
   private static final int bU = 220;
   private final float[] bV = new float[2];
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final int[] bZ = new int[2];
   private final int[] ca = new int[2];
   private int cb;
   private final aln cc = (aln)new aln(this.O_(), bhr.a.f, bhr.b.a).a(true);
   private static final Predicate<bkj> cd = $$0 -> $$0.eR() != bko.b && $$0.fz();
   private static final buv ce = buv.a().a(20.0).a(cd);

   public bze(bjx<? extends bze> $$0, cqz $$1) {
      super($$0, $$1);
      this.bL = new bqe(this, 10, false);
      this.c(this.eL());
      this.bJ = 50;
   }

   @Override
   protected bts b(cqz $$0) {
      btq $$1 = new btq(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bze.a());
      this.bO.a(2, new bsd(this, 1.0, 40, 20.0F));
      this.bO.a(5, new bsq(this, 1.0));
      this.bO.a(6, new brm(this, ccx.class, 8.0F));
      this.bO.a(7, new brz(this));
      this.bP.a(1, new bsw(this));
      this.bP.a(2, new bsx<>(this, bkj.class, 0, false, false, cd));
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
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Invul", this.y());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ac()) {
         this.cc.a(this.O_());
      }
   }

   @Override
   public void b(@Nullable ui $$0) {
      super.b($$0);
      this.cc.a(this.O_());
   }

   @Override
   protected aqc w() {
      return aqd.Am;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.Ap;
   }

   @Override
   protected aqc m_() {
      return aqd.Ao;
   }

   @Override
   public void c_() {
      eif $$0 = this.do().d(1.0, 0.6, 1.0);
      if (!this.dL().B && this.t(0) > 0) {
         bjt $$1 = this.dL().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.ds() < $$1.ds() || !this.a() && this.ds() < $$1.ds() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new eif($$0.c, $$2, $$0.e);
            eif $$3 = new eif($$1.dq() - this.dq(), 0.0, $$1.dw() - this.dw());
            if ($$3.i() > 9.0) {
               eif $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.f($$0);
      if ($$0.i() > 0.05) {
         this.r((float)asy.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.c_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bY[$$5] = this.bW[$$5];
         this.bX[$$5] = this.bV[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         bjt $$8 = null;
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
            float $$16 = (float)(asy.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(asy.d($$13, $$15) * 180.0F / (float)Math.PI));
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
         this.dL().a(js.Z, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.dL().z.a(4) == 0) {
            this.dL().a(js.v, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.y() > 0) {
         for (int $$23 = 0; $$23 < 3; $$23++) {
            this.dL().a(js.v, this.dq() + this.ag.k(), this.ds() + (double)(this.ag.i() * 3.3F), this.dw() + this.ag.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void X() {
      if (this.y() > 0) {
         int $$0 = this.y() - 1;
         this.cc.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dL().a(this, this.dq(), this.du(), this.dw(), 7.0F, false, cqz.a.c);
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
               if ((this.dL().ai() == bhy.c || this.dL().ai() == bhy.d) && this.ca[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = asy.a(this.ag, this.dq() - 10.0, this.dq() + 10.0);
                  double $$5 = asy.a(this.ag, this.ds() - 5.0, this.ds() + 5.0);
                  double $$6 = asy.a(this.ag, this.dw() - 10.0, this.dw() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ca[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  bkj $$8 = (bkj)this.dL().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((bjt)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.bZ[$$1 - 1] = this.ah + 40 + this.ag.a(20);
                     this.ca[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bkj> $$9 = this.dL().a(bkj.class, ce, this, this.cG().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bkj $$10 = $$9.get(this.ag.a($$9.size()));
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
            if (this.cb == 0 && this.dL().X().b(cqv.c)) {
               int $$11 = asy.a(this.ds());
               int $$12 = asy.a(this.dq());
               int $$13 = asy.a(this.dw());
               boolean $$14 = false;

               for (int $$15 = -1; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 3; $$17++) {
                        int $$18 = $$12 + $$15;
                        int $$19 = $$11 + $$17;
                        int $$20 = $$13 + $$16;
                        ht $$21 = new ht($$18, $$19, $$20);
                        dgb $$22 = this.dL().a_($$21);
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

   public static boolean d(dgb $$0) {
      return !$$0.i() && !$$0.a(aqs.aD);
   }

   @Override
   public void s() {
      this.s(220);
      this.cc.a(0.0F);
      this.c(this.eL() / 3.0F);
   }

   @Override
   public void a(dgb $$0, eif $$1) {
   }

   @Override
   public void c(alr $$0) {
      super.c($$0);
      this.cc.a($$0);
   }

   @Override
   public void d(alr $$0) {
      super.d($$0);
      this.cc.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dq();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = asy.b($$1);
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
         float $$2 = asy.a($$1);
         return this.dw() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = asy.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bkj $$1) {
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
      cec $$11 = new cec(this.dL(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dL().b($$11);
   }

   @Override
   public void a(bkj $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(aqu.t) || $$0.d() instanceof bze) {
         return false;
      } else if (this.y() > 0 && !$$0.a(aqu.d)) {
         return false;
      } else {
         if (this.a()) {
            bjt $$2 = $$0.c();
            if ($$2 instanceof cdd) {
               return false;
            }
         }

         bjt $$3 = $$0.d();
         if ($$3 != null && !($$3 instanceof ccx) && $$3 instanceof bkj && ((bkj)$$3).eR() == this.eR()) {
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
   protected void a(bir $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bzq $$3 = this.a(ckm.ty);
      if ($$3 != null) {
         $$3.A();
      }
   }

   @Override
   public void dx() {
      if (this.dL().ai() == bhy.a && this.V()) {
         this.ak();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bjg $$0, @Nullable bjt $$1) {
      return false;
   }

   public static blo.a t() {
      return cal.gk().a(blp.l, 300.0).a(blp.m, 0.6F).a(blp.f, 0.6F).a(blp.g, 40.0).a(blp.a, 4.0);
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
   public bko eR() {
      return bko.b;
   }

   @Override
   protected boolean o(bjt $$0) {
      return false;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public boolean c(bjg $$0) {
      return $$0.c() == bji.t ? false : super.c($$0);
   }

   class a extends bre {
      public a() {
         this.a(EnumSet.of(bre.a.a, bre.a.c, bre.a.b));
      }

      @Override
      public boolean a() {
         return bze.this.y() > 0;
      }
   }
}
