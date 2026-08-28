public class cgd extends cgg {
   public float b;
   public float c;
   public float d;
   public float e;
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public cgd(bsx<? extends cgd> $$0, dcw $$1) {
      super($$0, $$1);
      this.ah.b((long)this.an());
      this.ch = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bW.a(0, new cgd.b(this));
      this.bW.a(1, new cgd.a());
   }

   public static buv.a gk() {
      return btp.C().a(buw.s, 10.0);
   }

   @Override
   protected avo v() {
      return avp.yZ;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.zb;
   }

   @Override
   protected avo n_() {
      return avp.za;
   }

   protected avo t() {
      return avp.zc;
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected float fa() {
      return 0.4F;
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.c;
   }

   @Override
   protected double aZ() {
      return 0.08;
   }

   @Override
   public void m_() {
      super.m_();
      this.c = this.b;
      this.e = this.d;
      this.cd = this.cc;
      this.cf = this.ce;
      this.cc = this.cc + this.ch;
      if ((double)this.cc > Math.PI * 2) {
         if (this.dO().B) {
            this.cc = (float) (Math.PI * 2);
         } else {
            this.cc -= (float) (Math.PI * 2);
            if (this.ah.a(10) == 0) {
               this.ch = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
            }

            this.dO().a(this, (byte)19);
         }
      }

      if (this.bi()) {
         if (this.cc < (float) Math.PI) {
            float $$0 = this.cc / (float) Math.PI;
            this.ce = ayo.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.cg = 1.0F;
               this.ci = 1.0F;
            } else {
               this.ci *= 0.8F;
            }
         } else {
            this.ce = 0.0F;
            this.cg *= 0.9F;
            this.ci *= 0.99F;
         }

         if (!this.dO().B) {
            this.n((double)(this.cj * this.cg), (double)(this.ck * this.cg), (double)(this.cl * this.cg));
         }

         exc $$1 = this.dr();
         double $$2 = $$1.h();
         this.aY = this.aY + (-((float)ayo.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aY) * 0.1F;
         this.t(this.aY);
         this.d = this.d + (float) Math.PI * this.ci * 1.5F;
         this.b = this.b + (-((float)ayo.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.ce = ayo.e(ayo.a(this.cc)) * (float) Math.PI * 0.25F;
         if (!this.dO().B) {
            double $$3 = this.dr().d;
            if (this.b(bsb.y)) {
               $$3 = 0.05 * (double)(this.c(bsb.y).e() + 1);
            } else {
               $$3 -= this.ba();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (super.a($$0, $$1) && this.ei() != null) {
         if (!this.dO().B) {
            this.x();
         }

         return true;
      } else {
         return false;
      }
   }

   private exc b(exc $$0) {
      exc $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aZ * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      exc $$0 = this.b(new exc(0.0, -1.0, 0.0)).b(this.dt(), this.dv(), this.dz());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         exc $$2 = this.b(new exc((double)this.ah.i() * 0.6 - 0.3, -1.0, (double)this.ah.i() * 0.6 - 0.3));
         exc $$3 = $$2.a(0.3 + (double)(this.ah.i() * 2.0F));
         ((aqu)this.dO()).a(this.s(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected lk s() {
      return lm.ai;
   }

   @Override
   public void a(exc $$0) {
      this.a(bts.a, this.dr());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.cc = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.cj = $$0;
      this.ck = $$1;
      this.cl = $$2;
   }

   public boolean gl() {
      return this.cj != 0.0F || this.ck != 0.0F || this.cl != 0.0F;
   }

   class a extends cam {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         btn $$0 = cgd.this.ei();
         return cgd.this.bf() && $$0 != null ? cgd.this.g((bsr)$$0) < 100.0 : false;
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
         btn $$0 = cgd.this.ei();
         if ($$0 != null) {
            exc $$1 = new exc(cgd.this.dt() - $$0.dt(), cgd.this.dv() - $$0.dv(), cgd.this.dz() - $$0.dz());
            dtc $$2 = cgd.this.dO().a_(jd.a(cgd.this.dt() + $$1.c, cgd.this.dv() + $$1.d, cgd.this.dz() + $$1.e));
            epe $$3 = cgd.this.dO().b_(jd.a(cgd.this.dt() + $$1.c, cgd.this.dv() + $$1.d, cgd.this.dz() + $$1.e));
            if ($$3.a(awk.a) || $$2.i()) {
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

               cgd.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cgd.this.dO().a(lm.d, cgd.this.dt(), cgd.this.dv(), cgd.this.dz(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cam {
      private final cgd a;

      public b(final cgd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.em();
         if ($$0 > 100) {
            this.a.a(0.0F, 0.0F, 0.0F);
         } else if (this.a.dR().a(b(50)) == 0 || !this.a.aj || !this.a.gl()) {
            float $$1 = this.a.dR().i() * (float) (Math.PI * 2);
            float $$2 = ayo.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.dR().i() * 0.2F;
            float $$4 = ayo.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
