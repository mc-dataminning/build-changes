import java.util.Objects;
import javax.annotation.Nullable;

public class ckq extends cjl {
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
   ffs bT = ffs.c;

   public ckq(bxe<? extends ckq> $$0, djz $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ao());
      this.bR = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bF.a(0, new ckq.b(this));
      this.bF.a(1, new ckq.a());
   }

   public static bzb.a gu() {
      return bxy.E().a(bzc.s, 10.0);
   }

   @Override
   protected awq u() {
      return awr.Ad;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.Af;
   }

   @Override
   protected awq l_() {
      return awr.Ae;
   }

   protected awq t() {
      return awr.Ag;
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
   protected bwv.c bf() {
      return bwv.c.c;
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      return bxe.bs.a($$0, bxd.e);
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
            this.bO = azq.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         ffs $$1 = this.dy();
         double $$2 = $$1.i();
         this.aV = this.aV + (-((float)azq.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aV) * 0.1F;
         this.w(this.aV);
         this.bK = this.bK + (float) Math.PI * this.bS * 1.5F;
         this.bI = this.bI + (-((float)azq.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bI) * 0.1F;
      } else {
         this.bO = azq.e(azq.a(this.bM)) * (float) Math.PI * 0.25F;
         if (!this.dV().C) {
            double $$3 = this.dy().e;
            if (this.b(bwb.y)) {
               $$3 = 0.05 * (double)(this.c(bwb.y).e() + 1);
            } else {
               $$3 -= this.bd();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bI = this.bI + (-90.0F - this.bI) * 0.02F;
      }
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.er() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private ffs l(ffs $$0) {
      ffs $$1 = $$0.a(this.bJ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aW * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      ffs $$0 = this.l(new ffs(0.0, -1.0, 0.0)).b(this.dA(), this.dC(), this.dG());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ffs $$2 = this.l(new ffs((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.n_() ? 0.1F : 0.3F;
         ffs $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((aru)this.dV()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lx q() {
      return lz.al;
   }

   @Override
   public void a_(ffs $$0) {
      this.a(bya.a, this.dy());
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
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      byo $$4 = Objects.requireNonNullElseGet($$3, () -> new bwl.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends ces {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bxw $$0 = ckq.this.er();
         return ckq.this.bi() && $$0 != null ? ckq.this.g((bwv)$$0) < 100.0 : false;
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
         bxw $$0 = ckq.this.er();
         if ($$0 != null) {
            ffs $$1 = new ffs(ckq.this.dA() - $$0.dA(), ckq.this.dC() - $$0.dC(), ckq.this.dG() - $$0.dG());
            ebg $$2 = ckq.this.dV().a_(iw.a(ckq.this.dA() + $$1.d, ckq.this.dC() + $$1.e, ckq.this.dG() + $$1.f));
            exq $$3 = ckq.this.dV().b_(iw.a(ckq.this.dA() + $$1.d, ckq.this.dC() + $$1.e, ckq.this.dG() + $$1.f));
            if ($$3.a(axl.a) || $$2.l()) {
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

               ckq.this.bT = new ffs($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               ckq.this.dV().a(lz.d, ckq.this.dA(), ckq.this.dC(), ckq.this.dG(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends ces {
      private final ckq a;

      public b(ckq $$0) {
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
            this.a.bT = ffs.c;
         } else if (this.a.dY().a(b(50)) == 0 || !this.a.ag || !this.a.gv()) {
            float $$1 = this.a.dY().i() * (float) (Math.PI * 2);
            this.a.bT = new ffs((double)(azq.b($$1) * 0.2F), (double)(-0.1F + this.a.dY().i() * 0.2F), (double)(azq.a($$1) * 0.2F));
         }
      }
   }
}
