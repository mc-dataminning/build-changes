public class cfd extends cfg {
   public float b;
   public float c;
   public float d;
   public float e;
   public float ch;
   public float ci;
   public float cj;
   public float ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;

   public cfd(bsb<? extends cfd> $$0, dca $$1) {
      super($$0, $$1);
      this.al.b((long)this.al());
      this.cm = 1.0F / (this.al.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void y() {
      this.cb.a(0, new cfd.b(this));
      this.cb.a(1, new cfd.a());
   }

   public static btu.a gy() {
      return bsq.A().a(btv.q, 10.0);
   }

   @Override
   protected avn u() {
      return avo.zu;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.zw;
   }

   @Override
   protected avn n_() {
      return avo.zv;
   }

   protected avn t() {
      return avo.zx;
   }

   @Override
   public boolean a(cly $$0) {
      return !this.gl();
   }

   @Override
   protected float fn() {
      return 0.4F;
   }

   @Override
   protected brv.c bf() {
      return brv.c.c;
   }

   @Override
   protected double bc() {
      return 0.08;
   }

   @Override
   public void m_() {
      super.m_();
      this.c = this.b;
      this.e = this.d;
      this.ci = this.ch;
      this.ck = this.cj;
      this.ch = this.ch + this.cm;
      if ((double)this.ch > Math.PI * 2) {
         if (this.dU().C) {
            this.ch = (float) (Math.PI * 2);
         } else {
            this.ch -= (float) (Math.PI * 2);
            if (this.al.a(10) == 0) {
               this.cm = 1.0F / (this.al.i() + 1.0F) * 0.2F;
            }

            this.dU().a(this, (byte)19);
         }
      }

      if (this.bl()) {
         if (this.ch < (float) Math.PI) {
            float $$0 = this.ch / (float) Math.PI;
            this.cj = aym.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.cl = 1.0F;
               this.cn = 1.0F;
            } else {
               this.cn *= 0.8F;
            }
         } else {
            this.cj = 0.0F;
            this.cl *= 0.9F;
            this.cn *= 0.99F;
         }

         if (!this.dU().C) {
            this.o((double)(this.co * this.cl), (double)(this.cp * this.cl), (double)(this.cq * this.cl));
         }

         ewu $$1 = this.dx();
         double $$2 = $$1.h();
         this.bj = this.bj + (-((float)aym.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.bj) * 0.1F;
         this.r(this.bj);
         this.d = this.d + (float) Math.PI * this.cn * 1.5F;
         this.b = this.b + (-((float)aym.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.cj = aym.e(aym.a(this.ch)) * (float) Math.PI * 0.25F;
         if (!this.dU().C) {
            double $$3 = this.dx().d;
            if (this.b(brj.y)) {
               $$3 = 0.05 * (double)(this.c(brj.y).e() + 1);
            } else {
               $$3 -= this.bd();
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (super.a($$0, $$1) && this.eu() != null) {
         if (!this.dU().C) {
            this.x();
         }

         return true;
      } else {
         return false;
      }
   }

   private ewu j(ewu $$0) {
      ewu $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.bk * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      ewu $$0 = this.j(new ewu(0.0, -1.0, 0.0)).b(this.dz(), this.dB(), this.dF());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ewu $$2 = this.j(new ewu((double)this.al.i() * 0.6 - 0.3, -1.0, (double)this.al.i() * 0.6 - 0.3));
         ewu $$3 = $$2.a(0.3 + (double)(this.al.i() * 2.0F));
         ((aqt)this.dU()).a(this.r(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected kz r() {
      return lb.ag;
   }

   @Override
   public void a(ewu $$0) {
      this.a(bst.a, this.dx());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.ch = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.co = $$0;
      this.cp = $$1;
      this.cq = $$2;
   }

   public boolean gz() {
      return this.co != 0.0F || this.cp != 0.0F || this.cq != 0.0F;
   }

   class a extends bzl {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bso $$0 = cfd.this.eu();
         return cfd.this.bi() && $$0 != null ? cfd.this.g((brv)$$0) < 100.0 : false;
      }

      @Override
      public void c() {
         this.e = 0;
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         this.e++;
         bso $$0 = cfd.this.eu();
         if ($$0 != null) {
            ewu $$1 = new ewu(cfd.this.dz() - $$0.dz(), cfd.this.dB() - $$0.dB(), cfd.this.dF() - $$0.dF());
            dtc $$2 = cfd.this.dU().a_(ir.a(cfd.this.dz() + $$1.c, cfd.this.dB() + $$1.d, cfd.this.dF() + $$1.e));
            epe $$3 = cfd.this.dU().b_(ir.a(cfd.this.dz() + $$1.c, cfd.this.dB() + $$1.d, cfd.this.dF() + $$1.e));
            if ($$3.a(awj.a) || $$2.i()) {
               double $$4 = $$1.f();
               if ($$4 > 0.0) {
                  $$1.d();
                  double $$5 = 3.0;
                  if ($$4 > 5.0) {
                     $$5 -= ($$4 - 5.0) / 5.0;
                  }

                  if ($$5 > 0.0) {
                     $$1 = $$1.a($$5);
                  }
               }

               if ($$2.i()) {
                  $$1 = $$1.a(0.0, $$1.d, 0.0);
               }

               cfd.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cfd.this.dU().a(lb.d, cfd.this.dz(), cfd.this.dB(), cfd.this.dF(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bzl {
      private final cfd b;

      public b(cfd $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.b.ey();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.et().a(b(50)) == 0 || !this.b.an || !this.b.gz()) {
            float $$1 = this.b.et().i() * (float) (Math.PI * 2);
            float $$2 = aym.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.et().i() * 0.2F;
            float $$4 = aym.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
