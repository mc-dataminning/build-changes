import java.util.Objects;
import javax.annotation.Nullable;

public class cjp extends cin {
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
   fdw bQ = fdw.c;

   public cjp(bwj<? extends cjp> $$0, dip $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.bO = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bC.a(0, new cjp.b(this));
      this.bC.a(1, new cjp.a());
   }

   public static bye.a gq() {
      return bxb.E().a(byf.s, 10.0);
   }

   @Override
   protected awk u() {
      return awl.zX;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.zZ;
   }

   @Override
   protected awk l_() {
      return awl.zY;
   }

   protected awk t() {
      return awl.Aa;
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
   protected bwa.d bg() {
      return bwa.d.c;
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      return bwj.br.a($$0, bwi.e);
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
         if (this.dV().C) {
            this.bJ = (float) (Math.PI * 2);
         } else {
            this.bJ -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.bO = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dV().a(this, (byte)19);
         }
      }

      if (this.bj()) {
         if (this.bJ < (float) Math.PI) {
            float $$0 = this.bJ / (float) Math.PI;
            this.bL = azk.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.dg()) {
                  this.i(this.bQ);
               }

               this.bP = 1.0F;
            } else {
               this.bP *= 0.8F;
            }
         } else {
            this.bL = 0.0F;
            if (this.dg()) {
               this.i(this.dy().c(0.9));
            }

            this.bP *= 0.99F;
         }

         fdw $$1 = this.dy();
         double $$2 = $$1.i();
         this.aV = this.aV + (-((float)azk.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aV) * 0.1F;
         this.w(this.aV);
         this.bH = this.bH + (float) Math.PI * this.bP * 1.5F;
         this.bF = this.bF + (-((float)azk.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bF) * 0.1F;
      } else {
         this.bL = azk.e(azk.a(this.bJ)) * (float) Math.PI * 0.25F;
         if (!this.dV().C) {
            double $$3 = this.dy().e;
            if (this.b(bvg.y)) {
               $$3 = 0.05 * (double)(this.c(bvg.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bF = this.bF + (-90.0F - this.bF) * 0.02F;
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.eq() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private fdw l(fdw $$0) {
      fdw $$1 = $$0.a(this.bG * (float) (Math.PI / 180.0));
      return $$1.b(-this.aW * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      fdw $$0 = this.l(new fdw(0.0, -1.0, 0.0)).b(this.dA(), this.dC(), this.dG());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fdw $$2 = this.l(new fdw((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.n_() ? 0.1F : 0.3F;
         fdw $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((aro)this.dV()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lv q() {
      return lx.al;
   }

   @Override
   public void a_(fdw $$0) {
      this.a(bxd.a, this.dy());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bJ = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gr() {
      return this.bQ.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      bxr $$4 = Objects.requireNonNullElseGet($$3, () -> new bvq.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends cdv {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bwz $$0 = cjp.this.eq();
         return cjp.this.bj() && $$0 != null ? cjp.this.g((bwa)$$0) < 100.0 : false;
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
         bwz $$0 = cjp.this.eq();
         if ($$0 != null) {
            fdw $$1 = new fdw(cjp.this.dA() - $$0.dA(), cjp.this.dC() - $$0.dC(), cjp.this.dG() - $$0.dG());
            dzo $$2 = cjp.this.dV().a_(iu.a(cjp.this.dA() + $$1.d, cjp.this.dC() + $$1.e, cjp.this.dG() + $$1.f));
            evv $$3 = cjp.this.dV().b_(iu.a(cjp.this.dA() + $$1.d, cjp.this.dC() + $$1.e, cjp.this.dG() + $$1.f));
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

               cjp.this.bQ = new fdw($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               cjp.this.dV().a(lx.d, cjp.this.dA(), cjp.this.dC(), cjp.this.dG(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends cdv {
      private final cjp a;

      public b(cjp $$0) {
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
            this.a.bQ = fdw.c;
         } else if (this.a.dY().a(b(50)) == 0 || !this.a.ag || !this.a.gr()) {
            float $$1 = this.a.dY().i() * (float) (Math.PI * 2);
            this.a.bQ = new fdw((double)(azk.b($$1) * 0.2F), (double)(-0.1F + this.a.dY().i() * 0.2F), (double)(azk.a($$1) * 0.2F));
         }
      }
   }
}
