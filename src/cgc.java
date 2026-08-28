public class cgc extends cgf {
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

   public cgc(bsy<? extends cgc> $$0, dbw $$1) {
      super($$0, $$1);
      this.ah.b((long)this.al());
      this.cd = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cgc.b(this));
      this.bS.a(1, new cgc.a());
   }

   public static buu.a gq() {
      return btp.A().a(buv.q, 10.0);
   }

   @Override
   protected avy v() {
      return avz.yW;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.yY;
   }

   @Override
   protected avy o_() {
      return avz.yX;
   }

   protected avy u() {
      return avz.yZ;
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.gd();
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected bss.b bb() {
      return bss.b.c;
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
            this.ca = ayx.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         evp $$1 = this.ds();
         double $$2 = $$1.h();
         this.aY = this.aY + (-((float)ayx.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aY) * 0.1F;
         this.r(this.aY);
         this.d = this.d + (float) Math.PI * this.ce * 1.5F;
         this.b = this.b + (-((float)ayx.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.ca = ayx.e(ayx.a(this.bY)) * (float) Math.PI * 0.25F;
         if (!this.dP().B) {
            double $$3 = this.ds().d;
            if (this.b(bsc.y)) {
               $$3 = 0.05 * (double)(this.c(bsc.y).e() + 1);
            } else {
               $$3 -= this.aZ();
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      if (super.a($$0, $$1) && this.em() != null) {
         if (!this.dP().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private evp k(evp $$0) {
      evp $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aZ * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.u());
      evp $$0 = this.k(new evp(0.0, -1.0, 0.0)).b(this.du(), this.dw(), this.dA());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         evp $$2 = this.k(new evp((double)this.ah.i() * 0.6 - 0.3, -1.0, (double)this.ah.i() * 0.6 - 0.3));
         evp $$3 = $$2.a(0.3 + (double)(this.ah.i() * 2.0F));
         ((are)this.dP()).a(this.s(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected lg s() {
      return li.ai;
   }

   @Override
   public void a(evp $$0) {
      this.a(bts.a, this.ds());
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

   class a extends cal {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         btn $$0 = cgc.this.em();
         return cgc.this.be() && $$0 != null ? cgc.this.g((bss)$$0) < 100.0 : false;
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
         btn $$0 = cgc.this.em();
         if ($$0 != null) {
            evp $$1 = new evp(cgc.this.du() - $$0.du(), cgc.this.dw() - $$0.dw(), cgc.this.dA() - $$0.dA());
            dsa $$2 = cgc.this.dP().a_(iz.a(cgc.this.du() + $$1.c, cgc.this.dw() + $$1.d, cgc.this.dA() + $$1.e));
            ent $$3 = cgc.this.dP().b_(iz.a(cgc.this.du() + $$1.c, cgc.this.dw() + $$1.d, cgc.this.dA() + $$1.e));
            if ($$3.a(awu.a) || $$2.i()) {
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

               cgc.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cgc.this.dP().a(li.d, cgc.this.du(), cgc.this.dw(), cgc.this.dA(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cal {
      private final cgc a;

      public b(final cgc $$0) {
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
            float $$2 = ayx.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.el().i() * 0.2F;
            float $$4 = ayx.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
