public class cfq extends cft {
   public float b;
   public float c;
   public float d;
   public float e;
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   private float ce;
   private float cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;

   public cfq(bsm<? extends cfq> $$0, dcf $$1) {
      super($$0, $$1);
      this.ah.b((long)this.am());
      this.cf = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cfq.b(this));
      this.bU.a(1, new cfq.a());
   }

   public static bui.a go() {
      return btd.A().a(buj.s, 10.0);
   }

   @Override
   protected avg v() {
      return avh.yZ;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.zb;
   }

   @Override
   protected avg o_() {
      return avh.za;
   }

   protected avg u() {
      return avh.zc;
   }

   @Override
   public boolean a(cmk $$0) {
      return !this.ga();
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.c;
   }

   @Override
   protected double aZ() {
      return 0.08;
   }

   @Override
   public void n_() {
      super.n_();
      this.c = this.b;
      this.e = this.d;
      this.cb = this.ca;
      this.cd = this.cc;
      this.ca = this.ca + this.cf;
      if ((double)this.ca > Math.PI * 2) {
         if (this.dQ().B) {
            this.ca = (float) (Math.PI * 2);
         } else {
            this.ca -= (float) (Math.PI * 2);
            if (this.ah.a(10) == 0) {
               this.cf = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
            }

            this.dQ().a(this, (byte)19);
         }
      }

      if (this.bi()) {
         if (this.ca < (float) Math.PI) {
            float $$0 = this.ca / (float) Math.PI;
            this.cc = ayg.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.ce = 1.0F;
               this.cg = 1.0F;
            } else {
               this.cg *= 0.8F;
            }
         } else {
            this.cc = 0.0F;
            this.ce *= 0.9F;
            this.cg *= 0.99F;
         }

         if (!this.dQ().B) {
            this.o((double)(this.ch * this.ce), (double)(this.ci * this.ce), (double)(this.cj * this.ce));
         }

         ewf $$1 = this.dt();
         double $$2 = $$1.h();
         this.aY = this.aY + (-((float)ayg.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aY) * 0.1F;
         this.s(this.aY);
         this.d = this.d + (float) Math.PI * this.cg * 1.5F;
         this.b = this.b + (-((float)ayg.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.cc = ayg.e(ayg.a(this.ca)) * (float) Math.PI * 0.25F;
         if (!this.dQ().B) {
            double $$3 = this.dt().d;
            if (this.b(brq.y)) {
               $$3 = 0.05 * (double)(this.c(brq.y).e() + 1);
            } else {
               $$3 -= this.ba();
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (super.a($$0, $$1) && this.ej() != null) {
         if (!this.dQ().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private ewf l(ewf $$0) {
      ewf $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aZ * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.u());
      ewf $$0 = this.l(new ewf(0.0, -1.0, 0.0)).b(this.dv(), this.dx(), this.dB());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ewf $$2 = this.l(new ewf((double)this.ah.i() * 0.6 - 0.3, -1.0, (double)this.ah.i() * 0.6 - 0.3));
         ewf $$3 = $$2.a(0.3 + (double)(this.ah.i() * 2.0F));
         ((aqm)this.dQ()).a(this.s(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected lh s() {
      return lj.ai;
   }

   @Override
   public void a(ewf $$0) {
      this.a(btg.a, this.dt());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.ca = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.ch = $$0;
      this.ci = $$1;
      this.cj = $$2;
   }

   public boolean gp() {
      return this.ch != 0.0F || this.ci != 0.0F || this.cj != 0.0F;
   }

   class a extends bzz {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         btb $$0 = cfq.this.ej();
         return cfq.this.bf() && $$0 != null ? cfq.this.g((bsg)$$0) < 100.0 : false;
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
         btb $$0 = cfq.this.ej();
         if ($$0 != null) {
            ewf $$1 = new ewf(cfq.this.dv() - $$0.dv(), cfq.this.dx() - $$0.dx(), cfq.this.dB() - $$0.dB());
            dsk $$2 = cfq.this.dQ().a_(ja.a(cfq.this.dv() + $$1.c, cfq.this.dx() + $$1.d, cfq.this.dB() + $$1.e));
            eoh $$3 = cfq.this.dQ().b_(ja.a(cfq.this.dv() + $$1.c, cfq.this.dx() + $$1.d, cfq.this.dB() + $$1.e));
            if ($$3.a(awc.a) || $$2.i()) {
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

               cfq.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cfq.this.dQ().a(lj.d, cfq.this.dv(), cfq.this.dx(), cfq.this.dB(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bzz {
      private final cfq a;

      public b(final cfq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.a.en();
         if ($$0 > 100) {
            this.a.a(0.0F, 0.0F, 0.0F);
         } else if (this.a.dT().a(b(50)) == 0 || !this.a.aj || !this.a.gp()) {
            float $$1 = this.a.dT().i() * (float) (Math.PI * 2);
            float $$2 = ayg.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.dT().i() * 0.2F;
            float $$4 = ayg.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
