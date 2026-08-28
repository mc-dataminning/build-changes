import java.util.Objects;
import javax.annotation.Nullable;

public class ciq extends cho {
   public float bF;
   public float bG;
   public float bH;
   public float bI;
   public float bJ;
   public float bK;
   public float bL;
   public float bM;
   private float bN;
   private float bO;
   private float bP;
   fbx bQ = fbx.c;

   public ciq(bvi<? extends ciq> $$0, dgz $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.bO = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bC.a(0, new ciq.b(this));
      this.bC.a(1, new ciq.a());
   }

   public static bxf.a gs() {
      return bwa.E().a(bxg.s, 10.0);
   }

   @Override
   protected avz u() {
      return awa.zX;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.zZ;
   }

   @Override
   protected avz l_() {
      return awa.zY;
   }

   protected avz t() {
      return awa.Aa;
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   protected bva.c bg() {
      return bva.c.c;
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return bvi.bq.a($$0, bvh.e);
   }

   @Override
   protected double bd() {
      return 0.08;
   }

   @Override
   public void k_() {
      super.k_();
      this.bG = this.bF;
      this.bI = this.bH;
      this.bK = this.bJ;
      this.bM = this.bL;
      this.bJ = this.bJ + this.bO;
      if ((double)this.bJ > Math.PI * 2) {
         if (this.dU().C) {
            this.bJ = (float) (Math.PI * 2);
         } else {
            this.bJ -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.bO = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dU().a(this, (byte)19);
         }
      }

      if (this.bj()) {
         if (this.bJ < (float) Math.PI) {
            float $$0 = this.bJ / (float) Math.PI;
            this.bL = ayz.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.df()) {
                  this.i(this.bQ);
               }

               this.bP = 1.0F;
            } else {
               this.bP *= 0.8F;
            }
         } else {
            this.bL = 0.0F;
            if (this.df()) {
               this.i(this.dx().c(0.9));
            }

            this.bP *= 0.99F;
         }

         fbx $$1 = this.dx();
         double $$2 = $$1.i();
         this.aV = this.aV + (-((float)ayz.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aV) * 0.1F;
         this.w(this.aV);
         this.bH = this.bH + (float) Math.PI * this.bP * 1.5F;
         this.bF = this.bF + (-((float)ayz.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bF) * 0.1F;
      } else {
         this.bL = ayz.e(ayz.a(this.bJ)) * (float) Math.PI * 0.25F;
         if (!this.dU().C) {
            double $$3 = this.dx().e;
            if (this.b(bug.y)) {
               $$3 = 0.05 * (double)(this.c(bug.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bF = this.bF + (-90.0F - this.bF) * 0.02F;
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.ep() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private fbx l(fbx $$0) {
      fbx $$1 = $$0.a(this.bG * (float) (Math.PI / 180.0));
      return $$1.b(-this.aW * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      fbx $$0 = this.l(new fbx(0.0, -1.0, 0.0)).b(this.dz(), this.dB(), this.dF());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fbx $$2 = this.l(new fbx((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.n_() ? 0.1F : 0.3F;
         fbx $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((ard)this.dU()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lr q() {
      return lt.al;
   }

   @Override
   public void a_(fbx $$0) {
      this.a(bwc.a, this.dx());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bJ = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gt() {
      return this.bQ.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      bwr $$4 = Objects.requireNonNullElseGet($$3, () -> new buq.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends ccw {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bvy $$0 = ciq.this.ep();
         return ciq.this.bj() && $$0 != null ? ciq.this.g((bva)$$0) < 100.0 : false;
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
         bvy $$0 = ciq.this.ep();
         if ($$0 != null) {
            fbx $$1 = new fbx(ciq.this.dz() - $$0.dz(), ciq.this.dB() - $$0.dB(), ciq.this.dF() - $$0.dF());
            dxq $$2 = ciq.this.dU().a_(ji.a(ciq.this.dz() + $$1.d, ciq.this.dB() + $$1.e, ciq.this.dF() + $$1.f));
            etw $$3 = ciq.this.dU().b_(ji.a(ciq.this.dz() + $$1.d, ciq.this.dB() + $$1.e, ciq.this.dF() + $$1.f));
            if ($$3.a(awv.a) || $$2.l()) {
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

               ciq.this.bQ = new fbx($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               ciq.this.dU().a(lt.d, ciq.this.dz(), ciq.this.dB(), ciq.this.dF(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends ccw {
      private final ciq a;

      public b(ciq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.eu();
         if ($$0 > 100) {
            this.a.bQ = fbx.c;
         } else if (this.a.dX().a(b(50)) == 0 || !this.a.ag || !this.a.gt()) {
            float $$1 = this.a.dX().i() * (float) (Math.PI * 2);
            this.a.bQ = new fbx((double)(ayz.b($$1) * 0.2F), (double)(-0.1F + this.a.dX().i() * 0.2F), (double)(ayz.a($$1) * 0.2F));
         }
      }
   }
}
