import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdk extends cer implements bou, cev {
   private static final aie<Integer> b = aih.a(cdk.class, aig.b);
   private static final aie<Integer> c = aih.a(cdk.class, aig.b);
   private static final aie<Integer> d = aih.a(cdk.class, aig.b);
   private static final List<aie<Integer>> e = ImmutableList.of(b, c, d);
   private static final aie<Integer> bT = aih.a(cdk.class, aig.b);
   private static final int bU = 220;
   private final float[] bV = new float[2];
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final int[] bZ = new int[2];
   private final int[] ca = new int[2];
   private int cb;
   private final aot cc = (aot)new aot(this.Q_(), blm.a.f, blm.b.a).a(true);
   private static final Predicate<boi> cd = $$0 -> !$$0.ai().a(aud.y) && $$0.fz();
   private static final byy ce = byy.a().a(20.0).a(cd);

   public cdk(bnw<? extends cdk> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new buf(this, 10, false);
      this.t(this.eN());
      this.bJ = 50;
   }

   @Override
   protected bxt b(cvr $$0) {
      bxr $$1 = new bxr(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bO.a(0, new cdk.a());
      this.bO.a(2, new bwe(this, 1.0, 40, 20.0F));
      this.bO.a(5, new bwr(this, 1.0));
      this.bO.a(6, new bvn(this, chl.class, 8.0F));
      this.bO.a(7, new bwa(this));
      this.bP.a(1, new bwx(this));
      this.bP.a(2, new bwy<>(this, boi.class, 0, false, false, cd));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, 0);
      this.am.a(c, 0);
      this.am.a(d, 0);
      this.am.a(bT, 0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Invul", this.A());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.t($$0.h("Invul"));
      if (this.ae()) {
         this.cc.a(this.Q_());
      }
   }

   @Override
   public void b(@Nullable vq $$0) {
      super.b($$0);
      this.cc.a(this.Q_());
   }

   @Override
   protected atk y() {
      return atl.BB;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.BE;
   }

   @Override
   protected atk n_() {
      return atl.BD;
   }

   @Override
   public void d_() {
      enz $$0 = this.dp().d(1.0, 0.6, 1.0);
      if (!this.dM().B && this.u(0) > 0) {
         bnq $$1 = this.dM().a(this.u(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dt() < $$1.dt() || !this.a() && this.dt() < $$1.dt() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new enz($$0.c, $$2, $$0.e);
            enz $$3 = new enz($$1.dr() - this.dr(), 0.0, $$1.dx() - this.dx());
            if ($$3.i() > 9.0) {
               enz $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)awi.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.d_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bY[$$5] = this.bW[$$5];
         this.bX[$$5] = this.bV[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.u($$6 + 1);
         bnq $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dM().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.v($$6 + 1);
            double $$10 = this.w($$6 + 1);
            double $$11 = this.x($$6 + 1);
            double $$12 = $$8.dr() - $$9;
            double $$13 = $$8.dv() - $$10;
            double $$14 = $$8.dx() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(awi.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(awi.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bV[$$6] = this.a(this.bV[$$6], $$17, 40.0F);
            this.bW[$$6] = this.a(this.bW[$$6], $$16, 10.0F);
         } else {
            this.bW[$$6] = this.a(this.bW[$$6], this.aU, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.v($$19);
         double $$21 = this.w($$19);
         double $$22 = this.x($$19);
         float $$23 = 0.3F * this.ea();
         this.dM().a(jz.ab, $$20 + this.af.k() * (double)$$23, $$21 + this.af.k() * (double)$$23, $$22 + this.af.k() * (double)$$23, 0.0, 0.0, 0.0);
         if ($$18 && this.dM().z.a(4) == 0) {
            this.dM().a(jz.v, $$20 + this.af.k() * (double)$$23, $$21 + this.af.k() * (double)$$23, $$22 + this.af.k() * (double)$$23, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.A() > 0) {
         float $$24 = 3.3F * this.ea();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.dM().a(jz.v, this.dr() + this.af.k(), this.dt() + (double)(this.af.i() * $$24), this.dx() + this.af.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void aa() {
      if (this.A() > 0) {
         int $$0 = this.A() - 1;
         this.cc.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dM().a(this, this.dr(), this.dv(), this.dx(), 7.0F, false, cvr.a.c);
            if (!this.aU()) {
               this.dM().b(1023, this.dm(), 0);
            }
         }

         this.t($$0);
         if (this.ag % 10 == 0) {
            this.c(10.0F);
         }
      } else {
         super.aa();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ag >= this.bZ[$$1 - 1]) {
               this.bZ[$$1 - 1] = this.ag + 10 + this.af.a(10);
               if ((this.dM().aj() == blt.c || this.dM().aj() == blt.d) && this.ca[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = awi.a(this.af, this.dr() - 10.0, this.dr() + 10.0);
                  double $$5 = awi.a(this.af, this.dt() - 5.0, this.dt() + 5.0);
                  double $$6 = awi.a(this.af, this.dx() - 10.0, this.dx() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ca[$$1 - 1] = 0;
               }

               int $$7 = this.u($$1);
               if ($$7 > 0) {
                  boi $$8 = (boi)this.dM().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((bnq)$$8) > 900.0) && this.D($$8)) {
                     this.a($$1 + 1, $$8);
                     this.bZ[$$1 - 1] = this.ag + 40 + this.af.a(20);
                     this.ca[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<boi> $$9 = this.dM().a(boi.class, ce, this, this.cH().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     boi $$10 = $$9.get(this.af.a($$9.size()));
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
            if (this.cb == 0 && this.dM().Z().b(cvn.c)) {
               boolean $$11 = false;
               int $$12 = awi.d(this.dg() / 2.0F + 1.0F);
               int $$13 = awi.d(this.dh());

               for (hz $$14 : hz.b(this.dq() - $$12, this.ds(), this.dw() - $$12, this.dq() + $$12, this.ds() + $$13, this.dw() + $$12)) {
                  dlj $$15 = this.dM().a_($$14);
                  if (d($$15)) {
                     $$11 = this.dM().a($$14, true, this) || $$11;
                  }
               }

               if ($$11) {
                  this.dM().a(null, 1022, this.dm(), 0);
               }
            }
         }

         if (this.ag % 20 == 0) {
            this.c(1.0F);
         }

         this.cc.a(this.ew() / this.eN());
      }
   }

   public static boolean d(dlj $$0) {
      return !$$0.i() && !$$0.a(aua.aD);
   }

   @Override
   public void u() {
      this.t(220);
      this.cc.a(0.0F);
      this.t(this.eN() / 3.0F);
   }

   @Override
   public void a(dlj $$0, enz $$1) {
   }

   @Override
   public void c(aox $$0) {
      super.c($$0);
      this.cc.a($$0);
   }

   @Override
   public void d(aox $$0) {
      super.d($$0);
      this.cc.b($$0);
   }

   private double v(int $$0) {
      if ($$0 <= 0) {
         return this.dr();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = awi.b($$1);
         return this.dr() + (double)$$2 * 1.3 * (double)this.ea();
      }
   }

   private double w(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dt() + (double)($$1 * this.ea());
   }

   private double x(int $$0) {
      if ($$0 <= 0) {
         return this.dx();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = awi.a($$1);
         return this.dx() + (double)$$2 * 1.3 * (double)this.ea();
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = awi.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, boi $$1) {
      this.a($$0, $$1.dr(), $$1.dt() + (double)$$1.cI() * 0.5, $$1.dx(), $$0 == 0 && this.af.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aU()) {
         this.dM().a(null, 1024, this.dm(), 0);
      }

      double $$5 = this.v($$0);
      double $$6 = this.w($$0);
      double $$7 = this.x($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      cis $$11 = new cis(this.dM(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dM().b($$11);
   }

   @Override
   public void a(boi $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(auc.u) || $$0.d() instanceof cdk) {
         return false;
      } else if (this.A() > 0 && !$$0.a(auc.e)) {
         return false;
      } else {
         if (this.a()) {
            bnq $$2 = $$0.c();
            if ($$2 instanceof chr) {
               return false;
            }
         }

         bnq $$3 = $$0.d();
         if ($$3 != null && $$3.ai().a(aud.y)) {
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
   protected void a(bmp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cdw $$3 = this.a(cpg.uo);
      if ($$3 != null) {
         $$3.B();
      }
   }

   @Override
   public void dy() {
      if (this.dM().aj() == blt.a && this.Y()) {
         this.am();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bnd $$0, @Nullable bnq $$1) {
      return false;
   }

   public static bpo.a w() {
      return cer.gm().a(bpp.n, 300.0).a(bpp.o, 0.6F).a(bpp.h, 0.6F).a(bpp.i, 40.0).a(bpp.a, 4.0);
   }

   public float b(int $$0) {
      return this.bW[$$0];
   }

   public float c(int $$0) {
      return this.bV[$$0];
   }

   public int A() {
      return this.am.b(bT);
   }

   public void t(int $$0) {
      this.am.b(bT, $$0);
   }

   public int u(int $$0) {
      return this.am.b(e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.am.b(e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.ew() <= this.eN() / 2.0F;
   }

   @Override
   protected boolean n(bnq $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public boolean c(bnd $$0) {
      return $$0.a(bnf.t) ? false : super.c($$0);
   }

   class a extends bvf {
      public a() {
         this.a(EnumSet.of(bvf.a.a, bvf.a.c, bvf.a.b));
      }

      @Override
      public boolean a() {
         return cdk.this.A() > 0;
      }
   }
}
