import java.util.Objects;
import javax.annotation.Nullable;

public class cjh extends cif {
   public float bE;
   public float bF;
   public float bG;
   public float bH;
   public float bI;
   public float bJ;
   public float bK;
   public float bL;
   private float bM;
   private float bN;
   private float bO;
   fcu bP = fcu.c;

   public cjh(bwb<? extends cjh> $$0, dhp $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.bN = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bB.a(0, new cjh.b(this));
      this.bB.a(1, new cjh.a());
   }

   public static bxw.a gq() {
      return bwt.E().a(bxx.s, 10.0);
   }

   @Override
   protected awj u() {
      return awk.zX;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.zZ;
   }

   @Override
   protected awj l_() {
      return awk.zY;
   }

   protected awj t() {
      return awk.Aa;
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.c;
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return bwb.bq.a($$0, bwa.e);
   }

   @Override
   protected double bd() {
      return 0.08;
   }

   @Override
   public void k_() {
      super.k_();
      this.bF = this.bE;
      this.bH = this.bG;
      this.bJ = this.bI;
      this.bL = this.bK;
      this.bI = this.bI + this.bN;
      if ((double)this.bI > Math.PI * 2) {
         if (this.dV().C) {
            this.bI = (float) (Math.PI * 2);
         } else {
            this.bI -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.bN = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dV().a(this, (byte)19);
         }
      }

      if (this.bj()) {
         if (this.bI < (float) Math.PI) {
            float $$0 = this.bI / (float) Math.PI;
            this.bK = azk.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.dg()) {
                  this.i(this.bP);
               }

               this.bO = 1.0F;
            } else {
               this.bO *= 0.8F;
            }
         } else {
            this.bK = 0.0F;
            if (this.dg()) {
               this.i(this.dy().c(0.9));
            }

            this.bO *= 0.99F;
         }

         fcu $$1 = this.dy();
         double $$2 = $$1.i();
         this.aU = this.aU + (-((float)azk.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.w(this.aU);
         this.bG = this.bG + (float) Math.PI * this.bO * 1.5F;
         this.bE = this.bE + (-((float)azk.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bE) * 0.1F;
      } else {
         this.bK = azk.e(azk.a(this.bI)) * (float) Math.PI * 0.25F;
         if (!this.dV().C) {
            double $$3 = this.dy().e;
            if (this.b(buy.y)) {
               $$3 = 0.05 * (double)(this.c(buy.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bE = this.bE + (-90.0F - this.bE) * 0.02F;
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.eq() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private fcu l(fcu $$0) {
      fcu $$1 = $$0.a(this.bF * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      fcu $$0 = this.l(new fcu(0.0, -1.0, 0.0)).b(this.dA(), this.dC(), this.dG());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fcu $$2 = this.l(new fcu((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.n_() ? 0.1F : 0.3F;
         fcu $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((arn)this.dV()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lt q() {
      return lv.al;
   }

   @Override
   public void a_(fcu $$0) {
      this.a(bwv.a, this.dy());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bI = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gr() {
      return this.bP.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      bxj $$4 = Objects.requireNonNullElseGet($$3, () -> new bvi.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends cdn {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bwr $$0 = cjh.this.eq();
         return cjh.this.bj() && $$0 != null ? cjh.this.g((bvs)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         bwr $$0 = cjh.this.eq();
         if ($$0 != null) {
            fcu $$1 = new fcu(cjh.this.dA() - $$0.dA(), cjh.this.dC() - $$0.dC(), cjh.this.dG() - $$0.dG());
            dym $$2 = cjh.this.dV().a_(jj.a(cjh.this.dA() + $$1.d, cjh.this.dC() + $$1.e, cjh.this.dG() + $$1.f));
            eut $$3 = cjh.this.dV().b_(jj.a(cjh.this.dA() + $$1.d, cjh.this.dC() + $$1.e, cjh.this.dG() + $$1.f));
            if ($$3.a(axf.a) || $$2.l()) {
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

               cjh.this.bP = new fcu($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               cjh.this.dV().a(lv.d, cjh.this.dA(), cjh.this.dC(), cjh.this.dG(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends cdn {
      private final cjh a;

      public b(cjh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.ev();
         if ($$0 > 100) {
            this.a.bP = fcu.c;
         } else if (this.a.dY().a(b(50)) == 0 || !this.a.ag || !this.a.gr()) {
            float $$1 = this.a.dY().i() * (float) (Math.PI * 2);
            this.a.bP = new fcu((double)(azk.b($$1) * 0.2F), (double)(-0.1F + this.a.dY().i() * 0.2F), (double)(azk.a($$1) * 0.2F));
         }
      }
   }
}
