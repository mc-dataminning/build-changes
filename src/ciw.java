import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class ciw extends chw {
   public float bZ;
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   public float cg;
   private float ch;
   private float ci;
   private float cj;
   fby ck = fby.c;

   public ciw(bvr<? extends ciw> $$0, dhi $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.ci = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bT.a(0, new ciw.b(this));
      this.bT.a(1, new ciw.a());
   }

   public static bxn.a go() {
      return bwi.C().a(bxo.s, 10.0);
   }

   @Override
   protected axe u() {
      return axf.zy;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.zA;
   }

   @Override
   protected axe o_() {
      return axf.zz;
   }

   protected axe t() {
      return axf.zB;
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
   protected bvk.c bg() {
      return bvk.c.c;
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      return bvr.br.a($$0, bvq.e);
   }

   @Override
   protected double bd() {
      return 0.08;
   }

   @Override
   public void d_() {
      super.d_();
      this.ca = this.bZ;
      this.cc = this.cb;
      this.ce = this.cd;
      this.cg = this.cf;
      this.cd = this.cd + this.ci;
      if ((double)this.cd > Math.PI * 2) {
         if (this.dW().C) {
            this.cd = (float) (Math.PI * 2);
         } else {
            this.cd -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.ci = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dW().a(this, (byte)19);
         }
      }

      if (this.bm()) {
         if (this.cd < (float) Math.PI) {
            float $$0 = this.cd / (float) Math.PI;
            this.cf = bae.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.di()) {
                  this.h(this.ck);
               }

               this.cj = 1.0F;
            } else {
               this.cj *= 0.8F;
            }
         } else {
            this.cf = 0.0F;
            if (this.di()) {
               this.h(this.dz().c(0.9));
            }

            this.cj *= 0.99F;
         }

         fby $$1 = this.dz();
         double $$2 = $$1.i();
         this.aX = this.aX + (-((float)bae.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aX) * 0.1F;
         this.v(this.aX);
         this.cb = this.cb + (float) Math.PI * this.cj * 1.5F;
         this.bZ = this.bZ + (-((float)bae.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bZ) * 0.1F;
      } else {
         this.cf = bae.e(bae.a(this.cd)) * (float) Math.PI * 0.25F;
         if (!this.dW().C) {
            double $$3 = this.dz().e;
            if (this.b(bur.y)) {
               $$3 = 0.05 * (double)(this.c(bur.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bZ = this.bZ + (-90.0F - this.bZ) * 0.02F;
      }
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.eq() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private fby k(fby $$0) {
      fby $$1 = $$0.a(this.ca * (float) (Math.PI / 180.0));
      return $$1.b(-this.aY * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      fby $$0 = this.k(new fby(0.0, -1.0, 0.0)).b(this.dB(), this.dD(), this.dH());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fby $$2 = this.k(new fby((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.e_() ? 0.1F : 0.3F;
         fby $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((ash)this.dW()).a(this.p(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lq p() {
      return ls.aj;
   }

   @Override
   public void a_(fby $$0) {
      if (this.di()) {
         this.a(bwk.a, this.dz());
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.cd = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gp() {
      return this.ck.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bwz $$4 = Objects.requireNonNullElseGet($$3, () -> new bvb.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends cde {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bwg $$0 = ciw.this.eq();
         return ciw.this.bj() && $$0 != null ? ciw.this.g((bvk)$$0) < 100.0 : false;
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
         bwg $$0 = ciw.this.eq();
         if ($$0 != null) {
            fby $$1 = new fby(ciw.this.dB() - $$0.dB(), ciw.this.dD() - $$0.dD(), ciw.this.dH() - $$0.dH());
            dxv $$2 = ciw.this.dW().a_(jh.a(ciw.this.dB() + $$1.d, ciw.this.dD() + $$1.e, ciw.this.dH() + $$1.f));
            etx $$3 = ciw.this.dW().b_(jh.a(ciw.this.dB() + $$1.d, ciw.this.dD() + $$1.e, ciw.this.dH() + $$1.f));
            if ($$3.a(aya.a) || $$2.l()) {
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

               ciw.this.ck = new fby($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               ciw.this.dW().a(ls.d, ciw.this.dB(), ciw.this.dD(), ciw.this.dH(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cde {
      private final ciw a;

      public b(final ciw $$0) {
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
            this.a.ck = fby.c;
         } else if (this.a.dZ().a(b(50)) == 0 || !this.a.ag || !this.a.gp()) {
            float $$1 = this.a.dZ().i() * (float) (Math.PI * 2);
            this.a.ck = new fby((double)(bae.b($$1) * 0.2F), (double)(-0.1F + this.a.dZ().i() * 0.2F), (double)(bae.a($$1) * 0.2F));
         }
      }
   }
}
