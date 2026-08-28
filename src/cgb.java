public class cgb extends cge {
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

   public cgb(bsw<? extends cgb> $$0, dcu $$1) {
      super($$0, $$1);
      this.ah.b((long)this.an());
      this.cf = 1.0F / (this.ah.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cgb.b(this));
      this.bU.a(1, new cgb.a());
   }

   public static but.a gm() {
      return btn.A().a(buu.s, 10.0);
   }

   @Override
   protected avn v() {
      return avo.yZ;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.zb;
   }

   @Override
   protected avn n_() {
      return avo.za;
   }

   protected avn t() {
      return avo.zc;
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.fY();
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.c;
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
            this.cc = ayn.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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
            this.n((double)(this.ch * this.ce), (double)(this.ci * this.ce), (double)(this.cj * this.ce));
         }

         eww $$1 = this.dt();
         double $$2 = $$1.h();
         this.aY = this.aY + (-((float)ayn.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aY) * 0.1F;
         this.s(this.aY);
         this.d = this.d + (float) Math.PI * this.cg * 1.5F;
         this.b = this.b + (-((float)ayn.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.cc = ayn.e(ayn.a(this.ca)) * (float) Math.PI * 0.25F;
         if (!this.dQ().B) {
            double $$3 = this.dt().d;
            if (this.b(bsa.y)) {
               $$3 = 0.05 * (double)(this.c(bsa.y).e() + 1);
            } else {
               $$3 -= this.ba();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (super.a($$0, $$1) && this.ej() != null) {
         if (!this.dQ().B) {
            this.x();
         }

         return true;
      } else {
         return false;
      }
   }

   private eww b(eww $$0) {
      eww $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aZ * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      eww $$0 = this.b(new eww(0.0, -1.0, 0.0)).b(this.dv(), this.dx(), this.dB());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         eww $$2 = this.b(new eww((double)this.ah.i() * 0.6 - 0.3, -1.0, (double)this.ah.i() * 0.6 - 0.3));
         eww $$3 = $$2.a(0.3 + (double)(this.ah.i() * 2.0F));
         ((aqt)this.dQ()).a(this.s(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected lk s() {
      return lm.ai;
   }

   @Override
   public void a(eww $$0) {
      this.a(btq.a, this.dt());
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

   public boolean gn() {
      return this.ch != 0.0F || this.ci != 0.0F || this.cj != 0.0F;
   }

   class a extends cak {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         btl $$0 = cgb.this.ej();
         return cgb.this.bf() && $$0 != null ? cgb.this.g((bsq)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         btl $$0 = cgb.this.ej();
         if ($$0 != null) {
            eww $$1 = new eww(cgb.this.dv() - $$0.dv(), cgb.this.dx() - $$0.dx(), cgb.this.dB() - $$0.dB());
            dta $$2 = cgb.this.dQ().a_(jd.a(cgb.this.dv() + $$1.c, cgb.this.dx() + $$1.d, cgb.this.dB() + $$1.e));
            eoy $$3 = cgb.this.dQ().b_(jd.a(cgb.this.dv() + $$1.c, cgb.this.dx() + $$1.d, cgb.this.dB() + $$1.e));
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

               cgb.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cgb.this.dQ().a(lm.d, cgb.this.dv(), cgb.this.dx(), cgb.this.dB(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cak {
      private final cgb a;

      public b(final cgb $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.en();
         if ($$0 > 100) {
            this.a.a(0.0F, 0.0F, 0.0F);
         } else if (this.a.dT().a(b(50)) == 0 || !this.a.aj || !this.a.gn()) {
            float $$1 = this.a.dT().i() * (float) (Math.PI * 2);
            float $$2 = ayn.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.dT().i() * 0.2F;
            float $$4 = ayn.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
