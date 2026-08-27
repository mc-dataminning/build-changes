import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxs extends byz implements bjj, bzd {
   private static final adx<Integer> b = aea.a(bxs.class, adz.b);
   private static final adx<Integer> c = aea.a(bxs.class, adz.b);
   private static final adx<Integer> d = aea.a(bxs.class, adz.b);
   private static final List<adx<Integer>> e = ImmutableList.of(b, c, d);
   private static final adx<Integer> bT = aea.a(bxs.class, adz.b);
   private static final int bU = 220;
   private final float[] bV = new float[2];
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final int[] bZ = new int[2];
   private final int[] ca = new int[2];
   private int cb;
   private final akf cc = (akf)new akf(this.H_(), bge.a.f, bge.b.a).a(true);
   private static final Predicate<biw> cd = $$0 -> $$0.eQ() != bjb.b && $$0.fx();
   private static final btj ce = btj.a().a(20.0).a(cd);

   public bxs(bik<? extends bxs> $$0, cpk $$1) {
      super($$0, $$1);
      this.bL = new bos(this, 10, false);
      this.c(this.eK());
      this.bJ = 50;
   }

   @Override
   protected bsg b(cpk $$0) {
      bse $$1 = new bse(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bxs.a());
      this.bO.a(2, new bqr(this, 1.0, 40, 20.0F));
      this.bO.a(5, new bre(this, 1.0));
      this.bO.a(6, new bqa(this, cbl.class, 8.0F));
      this.bO.a(7, new bqn(this));
      this.bP.a(1, new brk(this));
      this.bP.a(2, new brl<>(this, biw.class, 0, false, false, cd));
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
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Invul", this.t());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ac()) {
         this.cc.a(this.H_());
      }
   }

   @Override
   public void b(@Nullable te $$0) {
      super.b($$0);
      this.cc.a(this.H_());
   }

   @Override
   protected aot r() {
      return aou.zZ;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.Ac;
   }

   @Override
   protected aot h_() {
      return aou.Ab;
   }

   @Override
   public void b_() {
      ehf $$0 = this.dn().d(1.0, 0.6, 1.0);
      if (!this.dK().B && this.t(0) > 0) {
         big $$1 = this.dK().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dr() < $$1.dr() || !this.a() && this.dr() < $$1.dr() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ehf($$0.c, $$2, $$0.e);
            ehf $$3 = new ehf($$1.dp() - this.dp(), 0.0, $$1.dv() - this.dv());
            if ($$3.i() > 9.0) {
               ehf $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.f($$0);
      if ($$0.i() > 0.05) {
         this.r((float)aro.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.b_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bY[$$5] = this.bW[$$5];
         this.bX[$$5] = this.bV[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         big $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dK().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.dp() - $$9;
            double $$13 = $$8.dt() - $$10;
            double $$14 = $$8.dv() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(aro.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(aro.d($$13, $$15) * 180.0F / (float)Math.PI));
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
         this.dK().a(iw.Z, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.dK().z.a(4) == 0) {
            this.dK().a(iw.v, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.t() > 0) {
         for (int $$23 = 0; $$23 < 3; $$23++) {
            this.dK().a(iw.v, this.dp() + this.ag.k(), this.dr() + (double)(this.ag.i() * 3.3F), this.dv() + this.ag.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void V() {
      if (this.t() > 0) {
         int $$0 = this.t() - 1;
         this.cc.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dK().a(this, this.dp(), this.dt(), this.dv(), 7.0F, false, cpk.a.c);
            if (!this.aS()) {
               this.dK().b(1023, this.dk(), 0);
            }
         }

         this.s($$0);
         if (this.ah % 10 == 0) {
            this.b(10.0F);
         }
      } else {
         super.V();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ah >= this.bZ[$$1 - 1]) {
               this.bZ[$$1 - 1] = this.ah + 10 + this.ag.a(10);
               if ((this.dK().ai() == bgl.c || this.dK().ai() == bgl.d) && this.ca[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = aro.a(this.ag, this.dp() - 10.0, this.dp() + 10.0);
                  double $$5 = aro.a(this.ag, this.dr() - 5.0, this.dr() + 5.0);
                  double $$6 = aro.a(this.ag, this.dv() - 10.0, this.dv() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ca[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  biw $$8 = (biw)this.dK().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((big)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.bZ[$$1 - 1] = this.ah + 40 + this.ag.a(20);
                     this.ca[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<biw> $$9 = this.dK().a(biw.class, ce, this, this.cG().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     biw $$10 = $$9.get(this.ag.a($$9.size()));
                     this.a($$1, $$10.ah());
                  }
               }
            }
         }

         if (this.j() != null) {
            this.a(0, this.j().ah());
         } else {
            this.a(0, 0);
         }

         if (this.cb > 0) {
            this.cb--;
            if (this.cb == 0 && this.dK().X().b(cpg.c)) {
               int $$11 = aro.a(this.dr());
               int $$12 = aro.a(this.dp());
               int $$13 = aro.a(this.dv());
               boolean $$14 = false;

               for (int $$15 = -1; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 3; $$17++) {
                        int $$18 = $$12 + $$15;
                        int $$19 = $$11 + $$17;
                        int $$20 = $$13 + $$16;
                        gv $$21 = new gv($$18, $$19, $$20);
                        dey $$22 = this.dK().a_($$21);
                        if (d($$22)) {
                           $$14 = this.dK().a($$21, true, this) || $$14;
                        }
                     }
                  }
               }

               if ($$14) {
                  this.dK().a(null, 1022, this.dk(), 0);
               }
            }
         }

         if (this.ah % 20 == 0) {
            this.b(1.0F);
         }

         this.cc.a(this.et() / this.eK());
      }
   }

   public static boolean d(dey $$0) {
      return !$$0.i() && !$$0.a(apj.aD);
   }

   @Override
   public void p() {
      this.s(220);
      this.cc.a(0.0F);
      this.c(this.eK() / 3.0F);
   }

   @Override
   public void a(dey $$0, ehf $$1) {
   }

   @Override
   public void c(akj $$0) {
      super.c($$0);
      this.cc.a($$0);
   }

   @Override
   public void d(akj $$0) {
      super.d($$0);
      this.cc.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dp();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = aro.b($$1);
         return this.dp() + (double)$$2 * 1.3;
      }
   }

   private double v(int $$0) {
      return $$0 <= 0 ? this.dr() + 3.0 : this.dr() + 2.2;
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dv();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = aro.a($$1);
         return this.dv() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = aro.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, biw $$1) {
      this.a($$0, $$1.dp(), $$1.dr() + (double)$$1.cH() * 0.5, $$1.dv(), $$0 == 0 && this.ag.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aS()) {
         this.dK().a(null, 1024, this.dk(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      ccq $$11 = new ccq(this.dK(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dK().b($$11);
   }

   @Override
   public void a(biw $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(apl.t) || $$0.d() instanceof bxs) {
         return false;
      } else if (this.t() > 0 && !$$0.a(apl.d)) {
         return false;
      } else {
         if (this.a()) {
            big $$2 = $$0.c();
            if ($$2 instanceof cbr) {
               return false;
            }
         }

         big $$3 = $$0.d();
         if ($$3 != null && !($$3 instanceof cbl) && $$3 instanceof biw && ((biw)$$3).eQ() == this.eQ()) {
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
   protected void a(bhe $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bye $$3 = this.a(ciz.ty);
      if ($$3 != null) {
         $$3.t();
      }
   }

   @Override
   public void dw() {
      if (this.dK().ai() == bgl.a && this.S()) {
         this.ak();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bht $$0, @Nullable big $$1) {
      return false;
   }

   public static bkc.a q() {
      return byz.gf().a(bkd.a, 300.0).a(bkd.d, 0.6F).a(bkd.e, 0.6F).a(bkd.b, 40.0).a(bkd.i, 4.0);
   }

   public float b(int $$0) {
      return this.bW[$$0];
   }

   public float c(int $$0) {
      return this.bV[$$0];
   }

   public int t() {
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
      return this.et() <= this.eK() / 2.0F;
   }

   @Override
   public bjb eQ() {
      return bjb.b;
   }

   @Override
   protected boolean o(big $$0) {
      return false;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public boolean c(bht $$0) {
      return $$0.c() == bhv.t ? false : super.c($$0);
   }

   class a extends bps {
      public a() {
         this.a(EnumSet.of(bps.a.a, bps.a.c, bps.a.b));
      }

      @Override
      public boolean a() {
         return bxs.this.t() > 0;
      }
   }
}
