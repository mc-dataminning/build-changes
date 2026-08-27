public class cds extends cdv {
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

   public cds(bqr<? extends cds> $$0, czu $$1) {
      super($$0, $$1);
      this.ah.b((long)this.aj());
      this.cd = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cds.b(this));
      this.bS.a(1, new cds.a());
   }

   public static bsk.a gp() {
      return brg.A().a(bsl.q, 10.0);
   }

   @Override
   protected auy v() {
      return auz.yK;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.yM;
   }

   @Override
   protected auy o_() {
      return auz.yL;
   }

   protected auy u() {
      return auz.yN;
   }

   @Override
   public boolean a(ckl $$0) {
      return !this.gc();
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   protected bql.b aZ() {
      return bql.b.c;
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
      this.bZ = this.bY;
      this.cb = this.ca;
      this.bY = this.bY + this.cd;
      if ((double)this.bY > Math.PI * 2) {
         if (this.dN().B) {
            this.bY = (float) (Math.PI * 2);
         } else {
            this.bY -= (float) (Math.PI * 2);
            if (this.ah.a(10) == 0) {
               this.cd = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
            }

            this.dN().a(this, (byte)19);
         }
      }

      if (this.bf()) {
         if (this.bY < (float) Math.PI) {
            float $$0 = this.bY / (float) Math.PI;
            this.ca = axw.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         if (!this.dN().B) {
            this.o((double)(this.cf * this.cc), (double)(this.cg * this.cc), (double)(this.ch * this.cc));
         }

         etf $$1 = this.dq();
         double $$2 = $$1.h();
         this.aZ = this.aZ + (-((float)axw.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aZ) * 0.1F;
         this.r(this.aZ);
         this.d = this.d + (float) Math.PI * this.ce * 1.5F;
         this.b = this.b + (-((float)axw.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.ca = axw.e(axw.a(this.bY)) * (float) Math.PI * 0.25F;
         if (!this.dN().B) {
            double $$3 = this.dq().d;
            if (this.b(bpz.y)) {
               $$3 = 0.05 * (double)(this.c(bpz.y).e() + 1);
            } else {
               $$3 -= this.aX();
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (super.a($$0, $$1) && this.ek() != null) {
         if (!this.dN().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private etf j(etf $$0) {
      etf $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.ba * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.u());
      etf $$0 = this.j(new etf(0.0, -1.0, 0.0)).b(this.ds(), this.du(), this.dy());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         etf $$2 = this.j(new etf((double)this.ah.i() * 0.6 - 0.3, -1.0, (double)this.ah.i() * 0.6 - 0.3));
         etf $$3 = $$2.a(0.3 + (double)(this.ah.i() * 2.0F));
         ((aqe)this.dN()).a(this.r(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected ku r() {
      return kw.af;
   }

   @Override
   public void a(etf $$0) {
      this.a(brj.a, this.dq());
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

   class a extends byb {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bre $$0 = cds.this.ek();
         return cds.this.bc() && $$0 != null ? cds.this.g((bql)$$0) < 100.0 : false;
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
         bre $$0 = cds.this.ek();
         if ($$0 != null) {
            etf $$1 = new etf(cds.this.ds() - $$0.ds(), cds.this.du() - $$0.du(), cds.this.dy() - $$0.dy());
            dpy $$2 = cds.this.dN().a_(im.a(cds.this.ds() + $$1.c, cds.this.du() + $$1.d, cds.this.dy() + $$1.e));
            elr $$3 = cds.this.dN().b_(im.a(cds.this.ds() + $$1.c, cds.this.du() + $$1.d, cds.this.dy() + $$1.e));
            if ($$3.a(avt.a) || $$2.i()) {
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

               cds.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cds.this.dN().a(kw.d, cds.this.ds(), cds.this.du(), cds.this.dy(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends byb {
      private final cds b;

      public b(cds $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.b.eo();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.ej().a(b(50)) == 0 || !this.b.aj || !this.b.gq()) {
            float $$1 = this.b.ej().i() * (float) (Math.PI * 2);
            float $$2 = axw.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.ej().i() * 0.2F;
            float $$4 = axw.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
