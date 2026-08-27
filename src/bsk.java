public class bsk extends bsn {
   public float b;
   public float c;
   public float d;
   public float e;
   public float bT;
   public float bU;
   public float bV;
   public float bW;
   private float bX;
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;

   public bsk(bfn<? extends bsk> $$0, cmm $$1) {
      super($$0, $$1);
      this.af.b((long)this.af());
      this.bY = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void x() {
      this.bO.a(0, new bsk.b(this));
      this.bO.a(1, new bsk.a());
   }

   public static bhf.a fY() {
      return bgb.y().a(bhg.a, 10.0);
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   protected amg s() {
      return amh.xg;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.xi;
   }

   @Override
   protected amg g_() {
      return amh.xh;
   }

   protected amg r() {
      return amh.xj;
   }

   @Override
   public boolean a(byo $$0) {
      return !this.fO();
   }

   @Override
   protected float eR() {
      return 0.4F;
   }

   @Override
   protected bfj.b aS() {
      return bfj.b.c;
   }

   @Override
   public void b_() {
      super.b_();
      this.c = this.b;
      this.e = this.d;
      this.bU = this.bT;
      this.bW = this.bV;
      this.bT = this.bT + this.bY;
      if ((double)this.bT > Math.PI * 2) {
         if (this.dI().B) {
            this.bT = (float) (Math.PI * 2);
         } else {
            this.bT -= (float) (Math.PI * 2);
            if (this.af.a(10) == 0) {
               this.bY = 1.0F / (this.af.i() + 1.0F) * 0.2F;
            }

            this.dI().a(this, (byte)19);
         }
      }

      if (this.aY()) {
         if (this.bT < (float) Math.PI) {
            float $$0 = this.bT / (float) Math.PI;
            this.bV = apa.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.bX = 1.0F;
               this.bZ = 1.0F;
            } else {
               this.bZ *= 0.8F;
            }
         } else {
            this.bV = 0.0F;
            this.bX *= 0.9F;
            this.bZ *= 0.99F;
         }

         if (!this.dI().B) {
            this.o((double)(this.ca * this.bX), (double)(this.cb * this.bX), (double)(this.cc * this.bX));
         }

         eei $$1 = this.dl();
         double $$2 = $$1.h();
         this.aV = this.aV + (-((float)apa.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aV) * 0.1F;
         this.a_(this.aV);
         this.d = this.d + (float) Math.PI * this.bZ * 1.5F;
         this.b = this.b + (-((float)apa.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bV = apa.e(apa.a(this.bT)) * (float) Math.PI * 0.25F;
         if (!this.dI().B) {
            double $$3 = this.dl().d;
            if (this.a(bfc.y)) {
               $$3 = 0.05 * (double)(this.b(bfc.y).e() + 1);
            } else if (!this.aR()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (super.a($$0, $$1) && this.ed() != null) {
         if (!this.dI().B) {
            this.w();
         }

         return true;
      } else {
         return false;
      }
   }

   private eei j(eei $$0) {
      eei $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aW * (float) (Math.PI / 180.0));
   }

   private void w() {
      this.a(this.r(), this.eR(), this.eS());
      eei $$0 = this.j(new eei(0.0, -1.0, 0.0)).b(this.dn(), this.dp(), this.dt());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         eei $$2 = this.j(new eei((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         eei $$3 = $$2.a(0.3 + (double)(this.af.i() * 2.0F));
         ((aif)this.dI()).a(this.q(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected it q() {
      return iv.ac;
   }

   @Override
   public void h(eei $$0) {
      this.a(bgf.a, this.dl());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bT = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.ca = $$0;
      this.cb = $$1;
      this.cc = $$2;
   }

   public boolean fZ() {
      return this.ca != 0.0F || this.cb != 0.0F || this.cc != 0.0F;
   }

   class a extends bmv {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bfz $$0 = bsk.this.ed();
         return bsk.this.aV() && $$0 != null ? bsk.this.f((bfj)$$0) < 100.0 : false;
      }

      @Override
      public void c() {
         this.e = 0;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         this.e++;
         bfz $$0 = bsk.this.ed();
         if ($$0 != null) {
            eei $$1 = new eei(bsk.this.dn() - $$0.dn(), bsk.this.dp() - $$0.dp(), bsk.this.dt() - $$0.dt());
            dcb $$2 = bsk.this.dI().a_(gu.a(bsk.this.dn() + $$1.c, bsk.this.dp() + $$1.d, bsk.this.dt() + $$1.e));
            dxe $$3 = bsk.this.dI().b_(gu.a(bsk.this.dn() + $$1.c, bsk.this.dp() + $$1.d, bsk.this.dt() + $$1.e));
            if ($$3.a(anb.a) || $$2.i()) {
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

               bsk.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               bsk.this.dI().a(iv.e, bsk.this.dn(), bsk.this.dp(), bsk.this.dt(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bmv {
      private final bsk b;

      public b(bsk $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.b.eh();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.ec().a(b(50)) == 0 || !this.b.ah || !this.b.fZ()) {
            float $$1 = this.b.ec().i() * (float) (Math.PI * 2);
            float $$2 = apa.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.ec().i() * 0.2F;
            float $$4 = apa.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
