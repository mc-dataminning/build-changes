import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxw extends bzd implements bjo, bzh {
   private static final aec<Integer> b = aef.a(bxw.class, aee.b);
   private static final aec<Integer> c = aef.a(bxw.class, aee.b);
   private static final aec<Integer> d = aef.a(bxw.class, aee.b);
   private static final List<aec<Integer>> e = ImmutableList.of(b, c, d);
   private static final aec<Integer> bT = aef.a(bxw.class, aee.b);
   private static final int bU = 220;
   private final float[] bV = new float[2];
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final int[] bZ = new int[2];
   private final int[] ca = new int[2];
   private int cb;
   private final akk cc = (akk)new akk(this.H_(), bgj.a.f, bgj.b.a).a(true);
   private static final Predicate<bjb> cd = $$0 -> $$0.eQ() != bjg.b && $$0.fx();
   private static final btn ce = btn.a().a(20.0).a(cd);

   public bxw(bip<? extends bxw> $$0, cpq $$1) {
      super($$0, $$1);
      this.bL = new bow(this, 10, false);
      this.c(this.eK());
      this.bJ = 50;
   }

   @Override
   protected bsk b(cpq $$0) {
      bsi $$1 = new bsi(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bxw.a());
      this.bO.a(2, new bqv(this, 1.0, 40, 20.0F));
      this.bO.a(5, new bri(this, 1.0));
      this.bO.a(6, new bqe(this, cbp.class, 8.0F));
      this.bO.a(7, new bqr(this));
      this.bP.a(1, new bro(this));
      this.bP.a(2, new brp<>(this, bjb.class, 0, false, false, cd));
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
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Invul", this.t());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ac()) {
         this.cc.a(this.H_());
      }
   }

   @Override
   public void b(@Nullable ti $$0) {
      super.b($$0);
      this.cc.a(this.H_());
   }

   @Override
   protected aoy r() {
      return aoz.Aj;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.Am;
   }

   @Override
   protected aoy h_() {
      return aoz.Al;
   }

   @Override
   public void b_() {
      ehi $$0 = this.dn().d(1.0, 0.6, 1.0);
      if (!this.dK().B && this.t(0) > 0) {
         bil $$1 = this.dK().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dr() < $$1.dr() || !this.a() && this.dr() < $$1.dr() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ehi($$0.c, $$2, $$0.e);
            ehi $$3 = new ehi($$1.dp() - this.dp(), 0.0, $$1.dv() - this.dv());
            if ($$3.i() > 9.0) {
               ehi $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.f($$0);
      if ($$0.i() > 0.05) {
         this.r((float)ars.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.b_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bY[$$5] = this.bW[$$5];
         this.bX[$$5] = this.bV[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         bil $$8 = null;
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
            float $$16 = (float)(ars.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(ars.d($$13, $$15) * 180.0F / (float)Math.PI));
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
         this.dK().a(ix.Z, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.dK().z.a(4) == 0) {
            this.dK().a(ix.v, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.t() > 0) {
         for (int $$23 = 0; $$23 < 3; $$23++) {
            this.dK().a(ix.v, this.dp() + this.ag.k(), this.dr() + (double)(this.ag.i() * 3.3F), this.dv() + this.ag.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void V() {
      if (this.t() > 0) {
         int $$0 = this.t() - 1;
         this.cc.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dK().a(this, this.dp(), this.dt(), this.dv(), 7.0F, false, cpq.a.c);
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
               if ((this.dK().ai() == bgq.c || this.dK().ai() == bgq.d) && this.ca[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = ars.a(this.ag, this.dp() - 10.0, this.dp() + 10.0);
                  double $$5 = ars.a(this.ag, this.dr() - 5.0, this.dr() + 5.0);
                  double $$6 = ars.a(this.ag, this.dv() - 10.0, this.dv() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ca[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  bjb $$8 = (bjb)this.dK().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((bil)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.bZ[$$1 - 1] = this.ah + 40 + this.ag.a(20);
                     this.ca[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bjb> $$9 = this.dK().a(bjb.class, ce, this, this.cG().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bjb $$10 = $$9.get(this.ag.a($$9.size()));
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
            if (this.cb == 0 && this.dK().X().b(cpm.c)) {
               int $$11 = ars.a(this.dr());
               int $$12 = ars.a(this.dp());
               int $$13 = ars.a(this.dv());
               boolean $$14 = false;

               for (int $$15 = -1; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 3; $$17++) {
                        int $$18 = $$12 + $$15;
                        int $$19 = $$11 + $$17;
                        int $$20 = $$13 + $$16;
                        gw $$21 = new gw($$18, $$19, $$20);
                        dfe $$22 = this.dK().a_($$21);
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

   public static boolean d(dfe $$0) {
      return !$$0.i() && !$$0.a(apo.aD);
   }

   @Override
   public void p() {
      this.s(220);
      this.cc.a(0.0F);
      this.c(this.eK() / 3.0F);
   }

   @Override
   public void a(dfe $$0, ehi $$1) {
   }

   @Override
   public void c(ako $$0) {
      super.c($$0);
      this.cc.a($$0);
   }

   @Override
   public void d(ako $$0) {
      super.d($$0);
      this.cc.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.dp();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ars.b($$1);
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
         float $$2 = ars.a($$1);
         return this.dv() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ars.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bjb $$1) {
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
      ccu $$11 = new ccu(this.dK(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dK().b($$11);
   }

   @Override
   public void a(bjb $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(apq.t) || $$0.d() instanceof bxw) {
         return false;
      } else if (this.t() > 0 && !$$0.a(apq.d)) {
         return false;
      } else {
         if (this.a()) {
            bil $$2 = $$0.c();
            if ($$2 instanceof cbv) {
               return false;
            }
         }

         bil $$3 = $$0.d();
         if ($$3 != null && !($$3 instanceof cbp) && $$3 instanceof bjb && ((bjb)$$3).eQ() == this.eQ()) {
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
   protected void a(bhj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      byi $$3 = this.a(cjd.ty);
      if ($$3 != null) {
         $$3.t();
      }
   }

   @Override
   public void dw() {
      if (this.dK().ai() == bgq.a && this.S()) {
         this.ak();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bhy $$0, @Nullable bil $$1) {
      return false;
   }

   public static bkg.a q() {
      return bzd.gg().a(bkh.a, 300.0).a(bkh.d, 0.6F).a(bkh.e, 0.6F).a(bkh.b, 40.0).a(bkh.i, 4.0);
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
   public bjg eQ() {
      return bjg.b;
   }

   @Override
   protected boolean o(bil $$0) {
      return false;
   }

   @Override
   public boolean cs() {
      return false;
   }

   @Override
   public boolean c(bhy $$0) {
      return $$0.c() == bia.t ? false : super.c($$0);
   }

   class a extends bpw {
      public a() {
         this.a(EnumSet.of(bpw.a.a, bpw.a.c, bpw.a.b));
      }

      @Override
      public boolean a() {
         return bxw.this.t() > 0;
      }
   }
}
