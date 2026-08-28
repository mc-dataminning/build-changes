import java.util.Objects;
import javax.annotation.Nullable;

public class chw extends cgw {
   public float bY;
   public float bZ;
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cg;
   private float ch;
   private float ci;
   faz cj = faz.c;

   public chw(bur<? extends chw> $$0, dgh $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.ch = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void E() {
      this.bS.a(0, new chw.b(this));
      this.bS.a(1, new chw.a());
   }

   public static bwn.a gs() {
      return bvi.F().a(bwo.s, 10.0);
   }

   @Override
   protected avz u() {
      return awa.zN;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.zP;
   }

   @Override
   protected avz o_() {
      return awa.zO;
   }

   protected avz t() {
      return awa.zQ;
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   protected buk.c bg() {
      return buk.c.c;
   }

   @Nullable
   @Override
   public bub a(ard $$0, bub $$1) {
      return bur.bq.a($$0, buq.e);
   }

   @Override
   protected double bd() {
      return 0.08;
   }

   @Override
   public void d_() {
      super.d_();
      this.bZ = this.bY;
      this.cb = this.ca;
      this.cd = this.cc;
      this.cf = this.ce;
      this.cc = this.cc + this.ch;
      if ((double)this.cc > Math.PI * 2) {
         if (this.dV().C) {
            this.cc = (float) (Math.PI * 2);
         } else {
            this.cc -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.ch = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dV().a(this, (byte)19);
         }
      }

      if (this.bm()) {
         if (this.cc < (float) Math.PI) {
            float $$0 = this.cc / (float) Math.PI;
            this.ce = ayz.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.dh()) {
                  this.i(this.cj);
               }

               this.ci = 1.0F;
            } else {
               this.ci *= 0.8F;
            }
         } else {
            this.ce = 0.0F;
            if (this.dh()) {
               this.i(this.dy().c(0.9));
            }

            this.ci *= 0.99F;
         }

         faz $$1 = this.dy();
         double $$2 = $$1.i();
         this.aX = this.aX + (-((float)ayz.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aX) * 0.1F;
         this.v(this.aX);
         this.ca = this.ca + (float) Math.PI * this.ci * 1.5F;
         this.bY = this.bY + (-((float)ayz.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bY) * 0.1F;
      } else {
         this.ce = ayz.e(ayz.a(this.cc)) * (float) Math.PI * 0.25F;
         if (!this.dV().C) {
            double $$3 = this.dy().e;
            if (this.b(btr.y)) {
               $$3 = 0.05 * (double)(this.c(btr.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bY = this.bY + (-90.0F - this.bY) * 0.02F;
      }
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.ep() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private faz l(faz $$0) {
      faz $$1 = $$0.a(this.bZ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aY * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      faz $$0 = this.l(new faz(0.0, -1.0, 0.0)).b(this.dA(), this.dC(), this.dG());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         faz $$2 = this.l(new faz((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.e_() ? 0.1F : 0.3F;
         faz $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((ard)this.dV()).a(this.p(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lr p() {
      return lt.ak;
   }

   @Override
   public void a_(faz $$0) {
      if (this.dh()) {
         this.a(bvk.a, this.dy());
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.cc = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gt() {
      return this.cj.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      bvz $$4 = Objects.requireNonNullElseGet($$3, () -> new bub.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends cce {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bvg $$0 = chw.this.ep();
         return chw.this.bj() && $$0 != null ? chw.this.g((buk)$$0) < 100.0 : false;
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
         bvg $$0 = chw.this.ep();
         if ($$0 != null) {
            faz $$1 = new faz(chw.this.dA() - $$0.dA(), chw.this.dC() - $$0.dC(), chw.this.dG() - $$0.dG());
            dww $$2 = chw.this.dV().a_(ji.a(chw.this.dA() + $$1.d, chw.this.dC() + $$1.e, chw.this.dG() + $$1.f));
            esy $$3 = chw.this.dV().b_(ji.a(chw.this.dA() + $$1.d, chw.this.dC() + $$1.e, chw.this.dG() + $$1.f));
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

               chw.this.cj = new faz($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               chw.this.dV().a(lt.d, chw.this.dA(), chw.this.dC(), chw.this.dG(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends cce {
      private final chw a;

      public b(chw $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.et();
         if ($$0 > 100) {
            this.a.cj = faz.c;
         } else if (this.a.dY().a(b(50)) == 0 || !this.a.ag || !this.a.gt()) {
            float $$1 = this.a.dY().i() * (float) (Math.PI * 2);
            this.a.cj = new faz((double)(ayz.b($$1) * 0.2F), (double)(-0.1F + this.a.dY().i() * 0.2F), (double)(ayz.a($$1) * 0.2F));
         }
      }
   }
}
