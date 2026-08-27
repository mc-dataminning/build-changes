public class bvh extends bvk {
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

   public bvh(bik<? extends bvh> $$0, cpk $$1) {
      super($$0, $$1);
      this.ag.b((long)this.ah());
      this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bvh.b(this));
      this.bO.a(1, new bvh.a());
   }

   public static bkc.a fZ() {
      return biy.x().a(bkd.a, 10.0);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   protected aot r() {
      return aou.xh;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.xj;
   }

   @Override
   protected aot h_() {
      return aou.xi;
   }

   protected aot q() {
      return aou.xk;
   }

   @Override
   public boolean a(cbl $$0) {
      return !this.fO();
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   protected big.b aU() {
      return big.b.c;
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
         if (this.dK().B) {
            this.bT = (float) (Math.PI * 2);
         } else {
            this.bT -= (float) (Math.PI * 2);
            if (this.ag.a(10) == 0) {
               this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
            }

            this.dK().a(this, (byte)19);
         }
      }

      if (this.ba()) {
         if (this.bT < (float) Math.PI) {
            float $$0 = this.bT / (float) Math.PI;
            this.bV = aro.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         if (!this.dK().B) {
            this.o((double)(this.ca * this.bX), (double)(this.cb * this.bX), (double)(this.cc * this.bX));
         }

         ehf $$1 = this.dn();
         double $$2 = $$1.h();
         this.aU = this.aU + (-((float)aro.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.r(this.aU);
         this.d = this.d + (float) Math.PI * this.bZ * 1.5F;
         this.b = this.b + (-((float)aro.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bV = aro.e(aro.a(this.bT)) * (float) Math.PI * 0.25F;
         if (!this.dK().B) {
            double $$3 = this.dn().d;
            if (this.a(bhv.y)) {
               $$3 = 0.05 * (double)(this.b(bhv.y).e() + 1);
            } else if (!this.aT()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (super.a($$0, $$1) && this.ef() != null) {
         if (!this.dK().B) {
            this.t();
         }

         return true;
      } else {
         return false;
      }
   }

   private ehf j(ehf $$0) {
      ehf $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void t() {
      this.a(this.q(), this.eU(), this.eV());
      ehf $$0 = this.j(new ehf(0.0, -1.0, 0.0)).b(this.dp(), this.dr(), this.dv());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ehf $$2 = this.j(new ehf((double)this.ag.i() * 0.6 - 0.3, -1.0, (double)this.ag.i() * 0.6 - 0.3));
         ehf $$3 = $$2.a(0.3 + (double)(this.ag.i() * 2.0F));
         ((aki)this.dK()).a(this.p(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected iu p() {
      return iw.ac;
   }

   @Override
   public void h(ehf $$0) {
      this.a(bjc.a, this.dn());
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

   public boolean ga() {
      return this.ca != 0.0F || this.cb != 0.0F || this.cc != 0.0F;
   }

   class a extends bps {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         biw $$0 = bvh.this.ef();
         return bvh.this.aX() && $$0 != null ? bvh.this.f((big)$$0) < 100.0 : false;
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
         biw $$0 = bvh.this.ef();
         if ($$0 != null) {
            ehf $$1 = new ehf(bvh.this.dp() - $$0.dp(), bvh.this.dr() - $$0.dr(), bvh.this.dv() - $$0.dv());
            dey $$2 = bvh.this.dK().a_(gv.a(bvh.this.dp() + $$1.c, bvh.this.dr() + $$1.d, bvh.this.dv() + $$1.e));
            eab $$3 = bvh.this.dK().b_(gv.a(bvh.this.dp() + $$1.c, bvh.this.dr() + $$1.d, bvh.this.dv() + $$1.e));
            if ($$3.a(apo.a) || $$2.i()) {
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

               bvh.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               bvh.this.dK().a(iw.e, bvh.this.dp(), bvh.this.dr(), bvh.this.dv(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bps {
      private final bvh b;

      public b(bvh $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.b.ej();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.ee().a(b(50)) == 0 || !this.b.ai || !this.b.ga()) {
            float $$1 = this.b.ee().i() * (float) (Math.PI * 2);
            float $$2 = aro.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.ee().i() * 0.2F;
            float $$4 = aro.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
