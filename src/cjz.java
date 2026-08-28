import java.util.Objects;
import javax.annotation.Nullable;

public class cjz extends cit {
   public float bG;
   public float bH;
   public float bI;
   public float bJ;
   public float bK;
   public float bL;
   public float bM;
   public float bN;
   private float bO;
   private float bP;
   private float bQ;
   feq bR = feq.c;

   public cjz(bwo<? extends cjz> $$0, dja $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.bP = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bD.a(0, new cjz.b(this));
      this.bD.a(1, new cjz.a());
   }

   public static byj.a gr() {
      return bxg.E().a(byk.s, 10.0);
   }

   @Override
   protected awm u() {
      return awn.Ad;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.Af;
   }

   @Override
   protected awm l_() {
      return awn.Ae;
   }

   protected awm t() {
      return awn.Ag;
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
   protected bwf.d bg() {
      return bwf.d.c;
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      return bwo.br.a($$0, bwn.e);
   }

   @Override
   protected double bd() {
      return 0.08;
   }

   @Override
   public void k_() {
      super.k_();
      this.bH = this.bG;
      this.bJ = this.bI;
      this.bL = this.bK;
      this.bN = this.bM;
      this.bK = this.bK + this.bP;
      if ((double)this.bK > Math.PI * 2) {
         if (this.dV().C) {
            this.bK = (float) (Math.PI * 2);
         } else {
            this.bK -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.bP = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dV().a(this, (byte)19);
         }
      }

      if (this.bj()) {
         if (this.bK < (float) Math.PI) {
            float $$0 = this.bK / (float) Math.PI;
            this.bM = azm.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.dg()) {
                  this.i(this.bR);
               }

               this.bQ = 1.0F;
            } else {
               this.bQ *= 0.8F;
            }
         } else {
            this.bM = 0.0F;
            if (this.dg()) {
               this.i(this.dy().c(0.9));
            }

            this.bQ *= 0.99F;
         }

         feq $$1 = this.dy();
         double $$2 = $$1.i();
         this.aV = this.aV + (-((float)azm.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aV) * 0.1F;
         this.w(this.aV);
         this.bI = this.bI + (float) Math.PI * this.bQ * 1.5F;
         this.bG = this.bG + (-((float)azm.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bG) * 0.1F;
      } else {
         this.bM = azm.e(azm.a(this.bK)) * (float) Math.PI * 0.25F;
         if (!this.dV().C) {
            double $$3 = this.dy().e;
            if (this.b(bvl.y)) {
               $$3 = 0.05 * (double)(this.c(bvl.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bG = this.bG + (-90.0F - this.bG) * 0.02F;
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.er() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private feq l(feq $$0) {
      feq $$1 = $$0.a(this.bH * (float) (Math.PI / 180.0));
      return $$1.b(-this.aW * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      feq $$0 = this.l(new feq(0.0, -1.0, 0.0)).b(this.dA(), this.dC(), this.dG());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         feq $$2 = this.l(new feq((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.n_() ? 0.1F : 0.3F;
         feq $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((arq)this.dV()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lv q() {
      return lx.al;
   }

   @Override
   public void a_(feq $$0) {
      this.a(bxi.a, this.dy());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bK = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gs() {
      return this.bR.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      bxw $$4 = Objects.requireNonNullElseGet($$3, () -> new bvv.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends cea {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bxe $$0 = cjz.this.er();
         return cjz.this.bj() && $$0 != null ? cjz.this.g((bwf)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         bxe $$0 = cjz.this.er();
         if ($$0 != null) {
            feq $$1 = new feq(cjz.this.dA() - $$0.dA(), cjz.this.dC() - $$0.dC(), cjz.this.dG() - $$0.dG());
            eah $$2 = cjz.this.dV().a_(iu.a(cjz.this.dA() + $$1.d, cjz.this.dC() + $$1.e, cjz.this.dG() + $$1.f));
            ewo $$3 = cjz.this.dV().b_(iu.a(cjz.this.dA() + $$1.d, cjz.this.dC() + $$1.e, cjz.this.dG() + $$1.f));
            if ($$3.a(axh.a) || $$2.l()) {
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

               cjz.this.bR = new feq($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               cjz.this.dV().a(lx.d, cjz.this.dA(), cjz.this.dC(), cjz.this.dG(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends cea {
      private final cjz a;

      public b(cjz $$0) {
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
            this.a.bR = feq.c;
         } else if (this.a.dY().a(b(50)) == 0 || !this.a.ag || !this.a.gs()) {
            float $$1 = this.a.dY().i() * (float) (Math.PI * 2);
            this.a.bR = new feq((double)(azm.b($$1) * 0.2F), (double)(-0.1F + this.a.dY().i() * 0.2F), (double)(azm.a($$1) * 0.2F));
         }
      }
   }
}
