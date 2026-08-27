public class cdc extends cdf {
   public float b;
   public float c;
   public float d;
   public float e;
   public float bX;
   public float bY;
   public float bZ;
   public float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;
   private float cf;
   private float cg;

   public cdc(bqb<? extends cdc> $$0, cyx $$1) {
      super($$0, $$1);
      this.ag.b((long)this.aj());
      this.cc = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bR.a(0, new cdc.b(this));
      this.bR.a(1, new cdc.a());
   }

   public static bru.a gn() {
      return bqq.A().a(brv.q, 10.0);
   }

   @Override
   protected aul v() {
      return aum.yD;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.yF;
   }

   @Override
   protected aul o_() {
      return aum.yE;
   }

   protected aul u() {
      return aum.yG;
   }

   @Override
   public boolean a(cjt $$0) {
      return !this.gb();
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.c;
   }

   @Override
   protected double aW() {
      return 0.08;
   }

   @Override
   public void n_() {
      super.n_();
      this.c = this.b;
      this.e = this.d;
      this.bY = this.bX;
      this.ca = this.bZ;
      this.bX = this.bX + this.cc;
      if ((double)this.bX > Math.PI * 2) {
         if (this.dM().B) {
            this.bX = (float) (Math.PI * 2);
         } else {
            this.bX -= (float) (Math.PI * 2);
            if (this.ag.a(10) == 0) {
               this.cc = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
            }

            this.dM().a(this, (byte)19);
         }
      }

      if (this.bf()) {
         if (this.bX < (float) Math.PI) {
            float $$0 = this.bX / (float) Math.PI;
            this.bZ = axk.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.cb = 1.0F;
               this.cd = 1.0F;
            } else {
               this.cd *= 0.8F;
            }
         } else {
            this.bZ = 0.0F;
            this.cb *= 0.9F;
            this.cd *= 0.99F;
         }

         if (!this.dM().B) {
            this.o((double)(this.ce * this.cb), (double)(this.cf * this.cb), (double)(this.cg * this.cb));
         }

         esa $$1 = this.dp();
         double $$2 = $$1.h();
         this.aX = this.aX + (-((float)axk.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aX) * 0.1F;
         this.r(this.aX);
         this.d = this.d + (float) Math.PI * this.cd * 1.5F;
         this.b = this.b + (-((float)axk.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bZ = axk.e(axk.a(this.bX)) * (float) Math.PI * 0.25F;
         if (!this.dM().B) {
            double $$3 = this.dp().d;
            if (this.b(bpj.y)) {
               $$3 = 0.05 * (double)(this.c(bpj.y).d() + 1);
            } else {
               $$3 -= this.aX();
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (super.a($$0, $$1) && this.ej() != null) {
         if (!this.dM().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private esa j(esa $$0) {
      esa $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aY * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.u());
      esa $$0 = this.j(new esa(0.0, -1.0, 0.0)).b(this.dr(), this.dt(), this.dx());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         esa $$2 = this.j(new esa((double)this.ag.i() * 0.6 - 0.3, -1.0, (double)this.ag.i() * 0.6 - 0.3));
         esa $$3 = $$2.a(0.3 + (double)(this.ag.i() * 2.0F));
         ((aps)this.dM()).a(this.r(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected kj r() {
      return kl.ag;
   }

   @Override
   public void a(esa $$0) {
      this.a(bqt.a, this.dp());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bX = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.ce = $$0;
      this.cf = $$1;
      this.cg = $$2;
   }

   public boolean go() {
      return this.ce != 0.0F || this.cf != 0.0F || this.cg != 0.0F;
   }

   class a extends bxl {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bqo $$0 = cdc.this.ej();
         return cdc.this.bc() && $$0 != null ? cdc.this.g((bpv)$$0) < 100.0 : false;
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
         bqo $$0 = cdc.this.ej();
         if ($$0 != null) {
            esa $$1 = new esa(cdc.this.dr() - $$0.dr(), cdc.this.dt() - $$0.dt(), cdc.this.dx() - $$0.dx());
            doz $$2 = cdc.this.dM().a_(ib.a(cdc.this.dr() + $$1.c, cdc.this.dt() + $$1.d, cdc.this.dx() + $$1.e));
            eks $$3 = cdc.this.dM().b_(ib.a(cdc.this.dr() + $$1.c, cdc.this.dt() + $$1.d, cdc.this.dx() + $$1.e));
            if ($$3.a(avh.a) || $$2.i()) {
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

               cdc.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cdc.this.dM().a(kl.e, cdc.this.dr(), cdc.this.dt(), cdc.this.dx(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bxl {
      private final cdc b;

      public b(cdc $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.b.en();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.ei().a(b(50)) == 0 || !this.b.ai || !this.b.go()) {
            float $$1 = this.b.ei().i() * (float) (Math.PI * 2);
            float $$2 = axk.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.ei().i() * 0.2F;
            float $$4 = axk.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
