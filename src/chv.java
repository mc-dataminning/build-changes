import java.util.Objects;
import javax.annotation.Nullable;

public class chv extends cgv {
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
   fay cj = fay.c;

   public chv(buq<? extends chv> $$0, dgg $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.ch = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bS.a(0, new chv.b(this));
      this.bS.a(1, new chv.a());
   }

   public static bwm.a gp() {
      return bvh.C().a(bwn.s, 10.0);
   }

   @Override
   protected avy u() {
      return avz.zN;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.zP;
   }

   @Override
   protected avy o_() {
      return avz.zO;
   }

   protected avy t() {
      return avz.zQ;
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
   protected buj.c bg() {
      return buj.c.c;
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      return buq.bq.a($$0, bup.e);
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
         if (this.dW().C) {
            this.cc = (float) (Math.PI * 2);
         } else {
            this.cc -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.ch = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dW().a(this, (byte)19);
         }
      }

      if (this.bm()) {
         if (this.cc < (float) Math.PI) {
            float $$0 = this.cc / (float) Math.PI;
            this.ce = ayy.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.di()) {
                  this.h(this.cj);
               }

               this.ci = 1.0F;
            } else {
               this.ci *= 0.8F;
            }
         } else {
            this.ce = 0.0F;
            if (this.di()) {
               this.h(this.dz().c(0.9));
            }

            this.ci *= 0.99F;
         }

         fay $$1 = this.dz();
         double $$2 = $$1.i();
         this.aX = this.aX + (-((float)ayy.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aX) * 0.1F;
         this.v(this.aX);
         this.ca = this.ca + (float) Math.PI * this.ci * 1.5F;
         this.bY = this.bY + (-((float)ayy.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bY) * 0.1F;
      } else {
         this.ce = ayy.e(ayy.a(this.cc)) * (float) Math.PI * 0.25F;
         if (!this.dW().C) {
            double $$3 = this.dz().e;
            if (this.b(btq.y)) {
               $$3 = 0.05 * (double)(this.c(btq.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bY = this.bY + (-90.0F - this.bY) * 0.02F;
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.eq() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private fay k(fay $$0) {
      fay $$1 = $$0.a(this.bZ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aY * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      fay $$0 = this.k(new fay(0.0, -1.0, 0.0)).b(this.dB(), this.dD(), this.dH());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fay $$2 = this.k(new fay((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.e_() ? 0.1F : 0.3F;
         fay $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((arc)this.dW()).a(this.p(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lr p() {
      return lt.ak;
   }

   @Override
   public void a_(fay $$0) {
      if (this.di()) {
         this.a(bvj.a, this.dz());
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

   public boolean gq() {
      return this.cj.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      bvy $$4 = Objects.requireNonNullElseGet($$3, () -> new bua.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends ccd {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bvf $$0 = chv.this.eq();
         return chv.this.bj() && $$0 != null ? chv.this.g((buj)$$0) < 100.0 : false;
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
         bvf $$0 = chv.this.eq();
         if ($$0 != null) {
            fay $$1 = new fay(chv.this.dB() - $$0.dB(), chv.this.dD() - $$0.dD(), chv.this.dH() - $$0.dH());
            dwv $$2 = chv.this.dW().a_(ji.a(chv.this.dB() + $$1.d, chv.this.dD() + $$1.e, chv.this.dH() + $$1.f));
            esx $$3 = chv.this.dW().b_(ji.a(chv.this.dB() + $$1.d, chv.this.dD() + $$1.e, chv.this.dH() + $$1.f));
            if ($$3.a(awu.a) || $$2.l()) {
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

               chv.this.cj = new fay($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               chv.this.dW().a(lt.d, chv.this.dB(), chv.this.dD(), chv.this.dH(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends ccd {
      private final chv a;

      public b(chv $$0) {
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
            this.a.cj = fay.c;
         } else if (this.a.dZ().a(b(50)) == 0 || !this.a.ag || !this.a.gq()) {
            float $$1 = this.a.dZ().i() * (float) (Math.PI * 2);
            this.a.cj = new fay((double)(ayy.b($$1) * 0.2F), (double)(-0.1F + this.a.dZ().i() * 0.2F), (double)(ayy.a($$1) * 0.2F));
         }
      }
   }
}
