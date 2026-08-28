public class cfr extends cfu {
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

   public cfr(bsn<? extends cfr> $$0, dcg $$1) {
      super($$0, $$1);
      this.ah.b((long)this.an());
      this.cf = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cfr.b(this));
      this.bU.a(1, new cfr.a());
   }

   public static buj.a gn() {
      return bte.A().a(buk.s, 10.0);
   }

   @Override
   protected avg v() {
      return avh.yZ;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.zb;
   }

   @Override
   protected avg n_() {
      return avh.za;
   }

   protected avg t() {
      return avh.zc;
   }

   @Override
   public boolean a(cml $$0) {
      return !this.fZ();
   }

   @Override
   protected float fc() {
      return 0.4F;
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.c;
   }

   @Override
   protected double ba() {
      return 0.08;
   }

   @Override
   public void m_() {
      super.m_();
      this.c = this.b;
      this.e = this.d;
      this.cb = this.ca;
      this.cd = this.cc;
      this.ca = this.ca + this.cf;
      if ((double)this.ca > Math.PI * 2) {
         if (this.dR().B) {
            this.ca = (float) (Math.PI * 2);
         } else {
            this.ca -= (float) (Math.PI * 2);
            if (this.ah.a(10) == 0) {
               this.cf = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
            }

            this.dR().a(this, (byte)19);
         }
      }

      if (this.bj()) {
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

         if (!this.dR().B) {
            this.o((double)(this.ch * this.ce), (double)(this.ci * this.ce), (double)(this.cj * this.ce));
         }

         ewh $$1 = this.du();
         double $$2 = $$1.h();
         this.aZ = this.aZ + (-((float)ayg.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aZ) * 0.1F;
         this.s(this.aZ);
         this.d = this.d + (float) Math.PI * this.cg * 1.5F;
         this.b = this.b + (-((float)ayg.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.cc = ayg.e(ayg.a(this.ca)) * (float) Math.PI * 0.25F;
         if (!this.dR().B) {
            double $$3 = this.du().d;
            if (this.b(brr.y)) {
               $$3 = 0.05 * (double)(this.c(brr.y).e() + 1);
            } else {
               $$3 -= this.bb();
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (super.a($$0, $$1) && this.ek() != null) {
         if (!this.dR().B) {
            this.x();
         }

         return true;
      } else {
         return false;
      }
   }

   private ewh b(ewh $$0) {
      ewh $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.ba * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      ewh $$0 = this.b(new ewh(0.0, -1.0, 0.0)).b(this.dw(), this.dy(), this.dC());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ewh $$2 = this.b(new ewh((double)this.ah.i() * 0.6 - 0.3, -1.0, (double)this.ah.i() * 0.6 - 0.3));
         ewh $$3 = $$2.a(0.3 + (double)(this.ah.i() * 2.0F));
         ((aqm)this.dR()).a(this.s(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected lh s() {
      return lj.ai;
   }

   @Override
   public void a(ewh $$0) {
      this.a(bth.a, this.du());
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

   public boolean go() {
      return this.ch != 0.0F || this.ci != 0.0F || this.cj != 0.0F;
   }

   class a extends caa {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         btc $$0 = cfr.this.ek();
         return cfr.this.bg() && $$0 != null ? cfr.this.g((bsh)$$0) < 100.0 : false;
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
         btc $$0 = cfr.this.ek();
         if ($$0 != null) {
            ewh $$1 = new ewh(cfr.this.dw() - $$0.dw(), cfr.this.dy() - $$0.dy(), cfr.this.dC() - $$0.dC());
            dsl $$2 = cfr.this.dR().a_(ja.a(cfr.this.dw() + $$1.c, cfr.this.dy() + $$1.d, cfr.this.dC() + $$1.e));
            eoj $$3 = cfr.this.dR().b_(ja.a(cfr.this.dw() + $$1.c, cfr.this.dy() + $$1.d, cfr.this.dC() + $$1.e));
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

               cfr.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cfr.this.dR().a(lj.d, cfr.this.dw(), cfr.this.dy(), cfr.this.dC(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends caa {
      private final cfr a;

      public b(final cfr $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.a.eo();
         if ($$0 > 100) {
            this.a.a(0.0F, 0.0F, 0.0F);
         } else if (this.a.dU().a(b(50)) == 0 || !this.a.aj || !this.a.go()) {
            float $$1 = this.a.dU().i() * (float) (Math.PI * 2);
            float $$2 = ayg.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.dU().i() * 0.2F;
            float $$4 = ayg.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
