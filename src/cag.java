import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cag extends cbn implements bly, cbr {
   private static final afs<Integer> b = afv.a(cag.class, afu.b);
   private static final afs<Integer> c = afv.a(cag.class, afu.b);
   private static final afs<Integer> d = afv.a(cag.class, afu.b);
   private static final List<afs<Integer>> e = ImmutableList.of(b, c, d);
   private static final afs<Integer> bT = afv.a(cag.class, afu.b);
   private static final int bU = 220;
   private final float[] bV = new float[2];
   private final float[] bW = new float[2];
   private final float[] bX = new float[2];
   private final float[] bY = new float[2];
   private final int[] bZ = new int[2];
   private final int[] ca = new int[2];
   private int cb;
   private final amf cc = (amf)new amf(this.Q_(), bir.a.f, bir.b.a).a(true);
   private static final Predicate<bll> cd = $$0 -> $$0.eT() != blq.b && $$0.fA();
   private static final bvx ce = bvx.a().a(20.0).a(cd);

   public cag(bkz<? extends cag> $$0, csf $$1) {
      super($$0, $$1);
      this.bL = new brg(this, 10, false);
      this.c(this.eN());
      this.bJ = 50;
   }

   @Override
   protected buu b(csf $$0) {
      bus $$1 = new bus(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void B() {
      this.bO.a(0, new cag.a());
      this.bO.a(2, new btf(this, 1.0, 40, 20.0F));
      this.bO.a(5, new bts(this, 1.0));
      this.bO.a(6, new bso(this, cdz.class, 8.0F));
      this.bO.a(7, new btb(this));
      this.bP.a(1, new bty(this));
      this.bP.a(2, new btz<>(this, bll.class, 0, false, false, cd));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, 0);
      this.an.a(c, 0);
      this.an.a(d, 0);
      this.an.a(bT, 0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Invul", this.A());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.s($$0.h("Invul"));
      if (this.ae()) {
         this.cc.a(this.Q_());
      }
   }

   @Override
   public void b(@Nullable uv $$0) {
      super.b($$0);
      this.cc.a(this.Q_());
   }

   @Override
   protected aqu y() {
      return aqv.AP;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.AS;
   }

   @Override
   protected aqu n_() {
      return aqv.AR;
   }

   @Override
   public void d_() {
      ejz $$0 = this.dq().d(1.0, 0.6, 1.0);
      if (!this.dN().B && this.t(0) > 0) {
         bkv $$1 = this.dN().a(this.t(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.du() < $$1.du() || !this.a() && this.du() < $$1.du() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new ejz($$0.c, $$2, $$0.e);
            ejz $$3 = new ejz($$1.ds() - this.ds(), 0.0, $$1.dy() - this.dy());
            if ($$3.i() > 9.0) {
               ejz $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.g($$0);
      if ($$0.i() > 0.05) {
         this.r((float)atq.d($$0.e, $$0.c) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.d_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.bY[$$5] = this.bW[$$5];
         this.bX[$$5] = this.bV[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.t($$6 + 1);
         bkv $$8 = null;
         if ($$7 > 0) {
            $$8 = this.dN().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.u($$6 + 1);
            double $$10 = this.v($$6 + 1);
            double $$11 = this.w($$6 + 1);
            double $$12 = $$8.ds() - $$9;
            double $$13 = $$8.dw() - $$10;
            double $$14 = $$8.dy() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(atq.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(atq.d($$13, $$15) * 180.0F / (float)Math.PI));
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
         this.dN().a(jw.Z, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.dN().z.a(4) == 0) {
            this.dN().a(jw.v, $$20 + this.ag.k() * 0.3F, $$21 + this.ag.k() * 0.3F, $$22 + this.ag.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.A() > 0) {
         for (int $$23 = 0; $$23 < 3; $$23++) {
            this.dN().a(jw.v, this.ds() + this.ag.k(), this.du() + (double)(this.ag.i() * 3.3F), this.dy() + this.ag.k(), 0.7F, 0.7F, 0.9F);
         }
      }
   }

   @Override
   protected void Z() {
      if (this.A() > 0) {
         int $$0 = this.A() - 1;
         this.cc.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            this.dN().a(this, this.ds(), this.dw(), this.dy(), 7.0F, false, csf.a.c);
            if (!this.aU()) {
               this.dN().b(1023, this.dn(), 0);
            }
         }

         this.s($$0);
         if (this.ah % 10 == 0) {
            this.b(10.0F);
         }
      } else {
         super.Z();

         for (int $$1 = 1; $$1 < 3; $$1++) {
            if (this.ah >= this.bZ[$$1 - 1]) {
               this.bZ[$$1 - 1] = this.ah + 10 + this.ag.a(10);
               if ((this.dN().aj() == biy.c || this.dN().aj() == biy.d) && this.ca[$$1 - 1]++ > 15) {
                  float $$2 = 10.0F;
                  float $$3 = 5.0F;
                  double $$4 = atq.a(this.ag, this.ds() - 10.0, this.ds() + 10.0);
                  double $$5 = atq.a(this.ag, this.du() - 5.0, this.du() + 5.0);
                  double $$6 = atq.a(this.ag, this.dy() - 10.0, this.dy() + 10.0);
                  this.a($$1 + 1, $$4, $$5, $$6, true);
                  this.ca[$$1 - 1] = 0;
               }

               int $$7 = this.t($$1);
               if ($$7 > 0) {
                  bll $$8 = (bll)this.dN().a($$7);
                  if ($$8 != null && this.c($$8) && !(this.f((bkv)$$8) > 900.0) && this.E($$8)) {
                     this.a($$1 + 1, $$8);
                     this.bZ[$$1 - 1] = this.ah + 40 + this.ag.a(20);
                     this.ca[$$1 - 1] = 0;
                  } else {
                     this.a($$1, 0);
                  }
               } else {
                  List<bll> $$9 = this.dN().a(bll.class, ce, this, this.cH().c(20.0, 8.0, 20.0));
                  if (!$$9.isEmpty()) {
                     bll $$10 = $$9.get(this.ag.a($$9.size()));
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
            if (this.cb == 0 && this.dN().Y().b(csb.c)) {
               int $$11 = atq.a(this.du());
               int $$12 = atq.a(this.ds());
               int $$13 = atq.a(this.dy());
               boolean $$14 = false;

               for (int $$15 = -1; $$15 <= 1; $$15++) {
                  for (int $$16 = -1; $$16 <= 1; $$16++) {
                     for (int $$17 = 0; $$17 <= 3; $$17++) {
                        int $$18 = $$12 + $$15;
                        int $$19 = $$11 + $$17;
                        int $$20 = $$13 + $$16;
                        hx $$21 = new hx($$18, $$19, $$20);
                        dhn $$22 = this.dN().a_($$21);
                        if (d($$22)) {
                           $$14 = this.dN().a($$21, true, this) || $$14;
                        }
                     }
                  }
               }

               if ($$14) {
                  this.dN().a(null, 1022, this.dn(), 0);
               }
            }
         }

         if (this.ah % 20 == 0) {
            this.b(1.0F);
         }

         this.cc.a(this.ew() / this.eN());
      }
   }

   public static boolean d(dhn $$0) {
      return !$$0.i() && !$$0.a(ark.aD);
   }

   @Override
   public void u() {
      this.s(220);
      this.cc.a(0.0F);
      this.c(this.eN() / 3.0F);
   }

   @Override
   public void a(dhn $$0, ejz $$1) {
   }

   @Override
   public void c(amj $$0) {
      super.c($$0);
      this.cc.a($$0);
   }

   @Override
   public void d(amj $$0) {
      super.d($$0);
      this.cc.b($$0);
   }

   private double u(int $$0) {
      if ($$0 <= 0) {
         return this.ds();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = atq.b($$1);
         return this.ds() + (double)$$2 * 1.3;
      }
   }

   private double v(int $$0) {
      return $$0 <= 0 ? this.du() + 3.0 : this.du() + 2.2;
   }

   private double w(int $$0) {
      if ($$0 <= 0) {
         return this.dy();
      } else {
         float $$1 = (this.aU + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = atq.a($$1);
         return this.dy() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = atq.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bll $$1) {
      this.a($$0, $$1.ds(), $$1.du() + (double)$$1.cI() * 0.5, $$1.dy(), $$0 == 0 && this.ag.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aU()) {
         this.dN().a(null, 1024, this.dn(), 0);
      }

      double $$5 = this.u($$0);
      double $$6 = this.v($$0);
      double $$7 = this.w($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      cfe $$11 = new cfe(this.dN(), this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.p($$5, $$6, $$7);
      this.dN().b($$11);
   }

   @Override
   public void a(bll $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.a(arm.t) || $$0.d() instanceof cag) {
         return false;
      } else if (this.A() > 0 && !$$0.a(arm.d)) {
         return false;
      } else {
         if (this.a()) {
            bkv $$2 = $$0.c();
            if ($$2 instanceof cef) {
               return false;
            }
         }

         bkv $$3 = $$0.d();
         if ($$3 != null && !($$3 instanceof cdz) && $$3 instanceof bll && ((bll)$$3).eT() == this.eT()) {
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
   protected void a(bjt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cas $$3 = this.a(clr.uk);
      if ($$3 != null) {
         $$3.B();
      }
   }

   @Override
   public void dz() {
      if (this.dN().aj() == biy.a && this.X()) {
         this.am();
      } else {
         this.bb = 0;
      }
   }

   @Override
   public boolean b(bki $$0, @Nullable bkv $$1) {
      return false;
   }

   public static bmq.a w() {
      return cbn.gl().a(bmr.l, 300.0).a(bmr.m, 0.6F).a(bmr.f, 0.6F).a(bmr.g, 40.0).a(bmr.a, 4.0);
   }

   public float b(int $$0) {
      return this.bW[$$0];
   }

   public float c(int $$0) {
      return this.bV[$$0];
   }

   public int A() {
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
      return this.ew() <= this.eN() / 2.0F;
   }

   @Override
   public blq eT() {
      return blq.b;
   }

   @Override
   protected boolean o(bkv $$0) {
      return false;
   }

   @Override
   public boolean ct() {
      return false;
   }

   @Override
   public boolean c(bki $$0) {
      return $$0.c() == bkk.t ? false : super.c($$0);
   }

   class a extends bsg {
      public a() {
         this.a(EnumSet.of(bsg.a.a, bsg.a.c, bsg.a.b));
      }

      @Override
      public boolean a() {
         return cag.this.A() > 0;
      }
   }
}
