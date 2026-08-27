public class cfd extends cfg {
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

   public cfd(bsa<? extends cfd> $$0, dax $$1) {
      super($$0, $$1);
      this.ah.b((long)this.al());
      this.cd = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cfd.b(this));
      this.bS.a(1, new cfd.a());
   }

   public static btv.a gp() {
      return bsq.A().a(btw.q, 10.0);
   }

   @Override
   protected avg v() {
      return avh.yW;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.yY;
   }

   @Override
   protected avg o_() {
      return avh.yX;
   }

   protected avg u() {
      return avh.yZ;
   }

   @Override
   public boolean a(clw $$0) {
      return !this.gc();
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected bru.b bb() {
      return bru.b.c;
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
            this.ca = ayd.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         euk $$1 = this.ds();
         double $$2 = $$1.h();
         this.aZ = this.aZ + (-((float)ayd.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aZ) * 0.1F;
         this.r(this.aZ);
         this.d = this.d + (float) Math.PI * this.ce * 1.5F;
         this.b = this.b + (-((float)ayd.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.ca = ayd.e(ayd.a(this.bY)) * (float) Math.PI * 0.25F;
         if (!this.dP().B) {
            double $$3 = this.ds().d;
            if (this.b(bre.y)) {
               $$3 = 0.05 * (double)(this.c(bre.y).e() + 1);
            } else {
               $$3 -= this.aZ();
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (super.a($$0, $$1) && this.em() != null) {
         if (!this.dP().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private euk j(euk $$0) {
      euk $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.ba * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.u());
      euk $$0 = this.j(new euk(0.0, -1.0, 0.0)).b(this.du(), this.dw(), this.dA());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         euk $$2 = this.j(new euk((double)this.ah.i() * 0.6 - 0.3, -1.0, (double)this.ah.i() * 0.6 - 0.3));
         euk $$3 = $$2.a(0.3 + (double)(this.ah.i() * 2.0F));
         ((aqm)this.dP()).a(this.s(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected kw s() {
      return ky.ai;
   }

   @Override
   public void a(euk $$0) {
      this.a(bst.a, this.ds());
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

   public boolean gq() {
      return this.cf != 0.0F || this.cg != 0.0F || this.ch != 0.0F;
   }

   class a extends bzm {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bso $$0 = cfd.this.em();
         return cfd.this.be() && $$0 != null ? cfd.this.g((bru)$$0) < 100.0 : false;
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
         bso $$0 = cfd.this.em();
         if ($$0 != null) {
            euk $$1 = new euk(cfd.this.du() - $$0.du(), cfd.this.dw() - $$0.dw(), cfd.this.dA() - $$0.dA());
            drb $$2 = cfd.this.dP().a_(io.a(cfd.this.du() + $$1.c, cfd.this.dw() + $$1.d, cfd.this.dA() + $$1.e));
            emu $$3 = cfd.this.dP().b_(io.a(cfd.this.du() + $$1.c, cfd.this.dw() + $$1.d, cfd.this.dA() + $$1.e));
            if ($$3.a(awb.a) || $$2.i()) {
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
               cfd.this.dP().a(ky.d, cfd.this.du(), cfd.this.dw(), cfd.this.dA(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bzm {
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
         int $$0 = this.b.eq();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.el().a(b(50)) == 0 || !this.b.aj || !this.b.gq()) {
            float $$1 = this.b.el().i() * (float) (Math.PI * 2);
            float $$2 = ayd.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.el().i() * 0.2F;
            float $$4 = ayd.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
