import java.util.Objects;
import javax.annotation.Nullable;

public class cko extends cjj {
   public float bI;
   public float bJ;
   public float bK;
   public float bL;
   public float bM;
   public float bN;
   public float bO;
   public float bP;
   private float bQ;
   private float bR;
   private float bS;
   ffq bT = ffq.c;

   public cko(bxc<? extends cko> $$0, djx $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ao());
      this.bR = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bF.a(0, new cko.b(this));
      this.bF.a(1, new cko.a());
   }

   public static byz.a gu() {
      return bxw.E().a(bza.s, 10.0);
   }

   @Override
   protected awo u() {
      return awp.Ad;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.Af;
   }

   @Override
   protected awo l_() {
      return awp.Ae;
   }

   protected awo t() {
      return awp.Ag;
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.c;
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      return bxc.bs.a($$0, bxb.e);
   }

   @Override
   protected double bc() {
      return 0.08;
   }

   @Override
   public void k_() {
      super.k_();
      this.bJ = this.bI;
      this.bL = this.bK;
      this.bN = this.bM;
      this.bP = this.bO;
      this.bM = this.bM + this.bR;
      if ((double)this.bM > Math.PI * 2) {
         if (this.dV().C) {
            this.bM = (float) (Math.PI * 2);
         } else {
            this.bM -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.bR = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dV().a(this, (byte)19);
         }
      }

      if (this.bi()) {
         if (this.bM < (float) Math.PI) {
            float $$0 = this.bM / (float) Math.PI;
            this.bO = azo.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.dg()) {
                  this.i(this.bT);
               }

               this.bS = 1.0F;
            } else {
               this.bS *= 0.8F;
            }
         } else {
            this.bO = 0.0F;
            if (this.dg()) {
               this.i(this.dy().c(0.9));
            }

            this.bS *= 0.99F;
         }

         ffq $$1 = this.dy();
         double $$2 = $$1.i();
         this.aV = this.aV + (-((float)azo.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aV) * 0.1F;
         this.w(this.aV);
         this.bK = this.bK + (float) Math.PI * this.bS * 1.5F;
         this.bI = this.bI + (-((float)azo.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bI) * 0.1F;
      } else {
         this.bO = azo.e(azo.a(this.bM)) * (float) Math.PI * 0.25F;
         if (!this.dV().C) {
            double $$3 = this.dy().e;
            if (this.b(bvz.y)) {
               $$3 = 0.05 * (double)(this.c(bvz.y).e() + 1);
            } else {
               $$3 -= this.bd();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bI = this.bI + (-90.0F - this.bI) * 0.02F;
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.er() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private ffq l(ffq $$0) {
      ffq $$1 = $$0.a(this.bJ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aW * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      ffq $$0 = this.l(new ffq(0.0, -1.0, 0.0)).b(this.dA(), this.dC(), this.dG());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ffq $$2 = this.l(new ffq((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.n_() ? 0.1F : 0.3F;
         ffq $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((ars)this.dV()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lw q() {
      return ly.al;
   }

   @Override
   public void a_(ffq $$0) {
      this.a(bxy.a, this.dy());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bM = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gv() {
      return this.bT.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      bym $$4 = Objects.requireNonNullElseGet($$3, () -> new bwj.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends ceq {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bxu $$0 = cko.this.er();
         return cko.this.bi() && $$0 != null ? cko.this.g((bwt)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         bxu $$0 = cko.this.er();
         if ($$0 != null) {
            ffq $$1 = new ffq(cko.this.dA() - $$0.dA(), cko.this.dC() - $$0.dC(), cko.this.dG() - $$0.dG());
            ebe $$2 = cko.this.dV().a_(iv.a(cko.this.dA() + $$1.d, cko.this.dC() + $$1.e, cko.this.dG() + $$1.f));
            exo $$3 = cko.this.dV().b_(iv.a(cko.this.dA() + $$1.d, cko.this.dC() + $$1.e, cko.this.dG() + $$1.f));
            if ($$3.a(axj.a) || $$2.l()) {
               double $$4 = $$1.g();
               if ($$4 > 0.0) {
                  $$1.d();
                  double $$5 = 3.0;
                  if ($$4 > 5.0) {
                     $$5 -= ($$4 - 5.0) / 5.0;
                  }

                  if ($$5 > 0.0) {
                     $$1 = $$1.c($$5);
                  }
               }

               if ($$2.l()) {
                  $$1 = $$1.a(0.0, $$1.e, 0.0);
               }

               cko.this.bT = new ffq($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               cko.this.dV().a(ly.d, cko.this.dA(), cko.this.dC(), cko.this.dG(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends ceq {
      private final cko a;

      public b(cko $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.ew();
         if ($$0 > 100) {
            this.a.bT = ffq.c;
         } else if (this.a.dY().a(b(50)) == 0 || !this.a.ag || !this.a.gv()) {
            float $$1 = this.a.dY().i() * (float) (Math.PI * 2);
            this.a.bT = new ffq((double)(azo.b($$1) * 0.2F), (double)(-0.1F + this.a.dY().i() * 0.2F), (double)(azo.a($$1) * 0.2F));
         }
      }
   }
}
