import java.util.Objects;
import javax.annotation.Nullable;

public class ckz extends cju {
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
   fgc bT = fgc.c;

   public ckz(bxn<? extends ckz> $$0, dkj $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ao());
      this.bR = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void C() {
      this.bF.a(0, new ckz.b(this));
      this.bF.a(1, new ckz.a());
   }

   public static bzk.a gu() {
      return byh.D().a(bzl.s, 10.0);
   }

   @Override
   protected awx s() {
      return awy.Ad;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.Af;
   }

   @Override
   protected awx j_() {
      return awy.Ae;
   }

   protected awx p() {
      return awy.Ag;
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
   protected bxe.c bf() {
      return bxe.c.c;
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      return bxn.bs.a($$0, bxm.e);
   }

   @Override
   protected double bc() {
      return 0.08;
   }

   @Override
   public void d_() {
      super.d_();
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
            this.bO = azz.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         fgc $$1 = this.dy();
         double $$2 = $$1.i();
         this.aV = this.aV + (-((float)azz.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aV) * 0.1F;
         this.w(this.aV);
         this.bK = this.bK + (float) Math.PI * this.bS * 1.5F;
         this.bI = this.bI + (-((float)azz.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bI) * 0.1F;
      } else {
         this.bO = azz.e(azz.a(this.bM)) * (float) Math.PI * 0.25F;
         if (!this.dV().C) {
            double $$3 = this.dy().e;
            if (this.b(bwk.y)) {
               $$3 = 0.05 * (double)(this.c(bwk.y).e() + 1);
            } else {
               $$3 -= this.bd();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bI = this.bI + (-90.0F - this.bI) * 0.02F;
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.er() != null) {
         this.u();
         return true;
      } else {
         return false;
      }
   }

   private fgc l(fgc $$0) {
      fgc $$1 = $$0.a(this.bJ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aW * (float) (Math.PI / 180.0));
   }

   private void u() {
      this.b(this.p());
      fgc $$0 = this.l(new fgc(0.0, -1.0, 0.0)).b(this.dA(), this.dC(), this.dG());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fgc $$2 = this.l(new fgc((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.e_() ? 0.1F : 0.3F;
         fgc $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((asb)this.dV()).a(this.m(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lx m() {
      return lz.al;
   }

   @Override
   public void a_(fgc $$0) {
      this.a(byj.a, this.dy());
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
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      byx $$4 = Objects.requireNonNullElseGet($$3, () -> new bwu.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends cfb {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         byf $$0 = ckz.this.er();
         return ckz.this.bi() && $$0 != null ? ckz.this.g((bxe)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean W_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         byf $$0 = ckz.this.er();
         if ($$0 != null) {
            fgc $$1 = new fgc(ckz.this.dA() - $$0.dA(), ckz.this.dC() - $$0.dC(), ckz.this.dG() - $$0.dG());
            ebq $$2 = ckz.this.dV().a_(iw.a(ckz.this.dA() + $$1.d, ckz.this.dC() + $$1.e, ckz.this.dG() + $$1.f));
            eya $$3 = ckz.this.dV().b_(iw.a(ckz.this.dA() + $$1.d, ckz.this.dC() + $$1.e, ckz.this.dG() + $$1.f));
            if ($$3.a(axs.a) || $$2.l()) {
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

               ckz.this.bT = new fgc($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               ckz.this.dV().a(lz.d, ckz.this.dA(), ckz.this.dC(), ckz.this.dG(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends cfb {
      private final ckz a;

      public b(ckz $$0) {
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
            this.a.bT = fgc.c;
         } else if (this.a.dY().a(b(50)) == 0 || !this.a.ag || !this.a.gv()) {
            float $$1 = this.a.dY().i() * (float) (Math.PI * 2);
            this.a.bT = new fgc((double)(azz.b($$1) * 0.2F), (double)(-0.1F + this.a.dY().i() * 0.2F), (double)(azz.a($$1) * 0.2F));
         }
      }
   }
}
