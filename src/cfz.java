public class cfz extends cgc {
   public float b;
   public float c;
   public float d;
   public float e;
   public float bY;
   public float bZ;
   public float ca;
   public float cb;
   private float cc;
   private float cd;
   private float ce;
   private float cf;
   private float cg;
   private float ch;

   public cfz(bsv<? extends cfz> $$0, dbt $$1) {
      super($$0, $$1);
      this.ah.b((long)this.al());
      this.cd = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cfz.b(this));
      this.bS.a(1, new cfz.a());
   }

   public static bur.a gq() {
      return btm.A().a(bus.q, 10.0);
   }

   @Override
   protected avv v() {
      return avw.yW;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.yY;
   }

   @Override
   protected avv o_() {
      return avw.yX;
   }

   protected avv u() {
      return avw.yZ;
   }

   @Override
   public boolean a(cms $$0) {
      return !this.gd();
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected bsp.b bb() {
      return bsp.b.c;
   }

   @Override
   protected double aY() {
      return 0.08;
   }

   @Override
   public void n_() {
      super.n_();
      this.c = this.b;
      this.e = this.d;
      this.bZ = this.bY;
      this.cb = this.ca;
      this.bY = this.bY + this.cd;
      if ((double)this.bY > Math.PI * 2) {
         if (this.dP().B) {
            this.bY = (float) (Math.PI * 2);
         } else {
            this.bY -= (float) (Math.PI * 2);
            if (this.ah.a(10) == 0) {
               this.cd = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
            }

            this.dP().a(this, (byte)19);
         }
      }

      if (this.bh()) {
         if (this.bY < (float) Math.PI) {
            float $$0 = this.bY / (float) Math.PI;
            this.ca = ayu.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.cc = 1.0F;
               this.ce = 1.0F;
            } else {
               this.ce *= 0.8F;
            }
         } else {
            this.ca = 0.0F;
            this.cc *= 0.9F;
            this.ce *= 0.99F;
         }

         if (!this.dP().B) {
            this.o((double)(this.cf * this.cc), (double)(this.cg * this.cc), (double)(this.ch * this.cc));
         }

         evm $$1 = this.ds();
         double $$2 = $$1.h();
         this.aY = this.aY + (-((float)ayu.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aY) * 0.1F;
         this.r(this.aY);
         this.d = this.d + (float) Math.PI * this.ce * 1.5F;
         this.b = this.b + (-((float)ayu.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.ca = ayu.e(ayu.a(this.bY)) * (float) Math.PI * 0.25F;
         if (!this.dP().B) {
            double $$3 = this.ds().d;
            if (this.b(brz.y)) {
               $$3 = 0.05 * (double)(this.c(brz.y).e() + 1);
            } else {
               $$3 -= this.aZ();
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (super.a($$0, $$1) && this.em() != null) {
         if (!this.dP().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private evm k(evm $$0) {
      evm $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aZ * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.u());
      evm $$0 = this.k(new evm(0.0, -1.0, 0.0)).b(this.du(), this.dw(), this.dA());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         evm $$2 = this.k(new evm((double)this.ah.i() * 0.6 - 0.3, -1.0, (double)this.ah.i() * 0.6 - 0.3));
         evm $$3 = $$2.a(0.3 + (double)(this.ah.i() * 2.0F));
         ((arb)this.dP()).a(this.s(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected lh s() {
      return lj.ai;
   }

   @Override
   public void a(evm $$0) {
      this.a(btp.a, this.ds());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bY = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.cf = $$0;
      this.cg = $$1;
      this.ch = $$2;
   }

   public boolean gr() {
      return this.cf != 0.0F || this.cg != 0.0F || this.ch != 0.0F;
   }

   class a extends cai {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         btk $$0 = cfz.this.em();
         return cfz.this.be() && $$0 != null ? cfz.this.g((bsp)$$0) < 100.0 : false;
      }

      @Override
      public void c() {
         this.e = 0;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.e++;
         btk $$0 = cfz.this.em();
         if ($$0 != null) {
            evm $$1 = new evm(cfz.this.du() - $$0.du(), cfz.this.dw() - $$0.dw(), cfz.this.dA() - $$0.dA());
            drx $$2 = cfz.this.dP().a_(iz.a(cfz.this.du() + $$1.c, cfz.this.dw() + $$1.d, cfz.this.dA() + $$1.e));
            enq $$3 = cfz.this.dP().b_(iz.a(cfz.this.du() + $$1.c, cfz.this.dw() + $$1.d, cfz.this.dA() + $$1.e));
            if ($$3.a(awr.a) || $$2.i()) {
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

               cfz.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cfz.this.dP().a(lj.d, cfz.this.du(), cfz.this.dw(), cfz.this.dA(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cai {
      private final cfz a;

      public b(final cfz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.a.eq();
         if ($$0 > 100) {
            this.a.a(0.0F, 0.0F, 0.0F);
         } else if (this.a.el().a(b(50)) == 0 || !this.a.aj || !this.a.gr()) {
            float $$1 = this.a.el().i() * (float) (Math.PI * 2);
            float $$2 = ayu.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.el().i() * 0.2F;
            float $$4 = ayu.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
