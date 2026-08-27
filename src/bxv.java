public class bxv extends bxy {
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

   public bxv(bkz<? extends bxv> $$0, csf $$1) {
      super($$0, $$1);
      this.ag.b((long)this.aj());
      this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bxv.b(this));
      this.bO.a(1, new bxv.a());
   }

   public static bmq.a gf() {
      return bln.C().a(bmr.l, 10.0);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   protected aqu y() {
      return aqv.xH;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.xJ;
   }

   @Override
   protected aqu n_() {
      return aqv.xI;
   }

   protected aqu w() {
      return aqv.xK;
   }

   @Override
   public boolean a(cdz $$0) {
      return !this.fT();
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Override
   protected bkv.b aW() {
      return bkv.b.c;
   }

   @Override
   public void d_() {
      super.d_();
      this.c = this.b;
      this.e = this.d;
      this.bU = this.bT;
      this.bW = this.bV;
      this.bT = this.bT + this.bY;
      if ((double)this.bT > Math.PI * 2) {
         if (this.dN().B) {
            this.bT = (float) (Math.PI * 2);
         } else {
            this.bT -= (float) (Math.PI * 2);
            if (this.ag.a(10) == 0) {
               this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
            }

            this.dN().a(this, (byte)19);
         }
      }

      if (this.bc()) {
         if (this.bT < (float) Math.PI) {
            float $$0 = this.bT / (float) Math.PI;
            this.bV = atq.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         if (!this.dN().B) {
            this.o((double)(this.ca * this.bX), (double)(this.cb * this.bX), (double)(this.cc * this.bX));
         }

         ejz $$1 = this.dq();
         double $$2 = $$1.h();
         this.aU = this.aU + (-((float)atq.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.r(this.aU);
         this.d = this.d + (float) Math.PI * this.bZ * 1.5F;
         this.b = this.b + (-((float)atq.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bV = atq.e(atq.a(this.bT)) * (float) Math.PI * 0.25F;
         if (!this.dN().B) {
            double $$3 = this.dq().d;
            if (this.a(bkk.y)) {
               $$3 = 0.05 * (double)(this.b(bkk.y).e() + 1);
            } else if (!this.aV()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (super.a($$0, $$1) && this.ei() != null) {
         if (!this.dN().B) {
            this.A();
         }

         return true;
      } else {
         return false;
      }
   }

   private ejz j(ejz $$0) {
      ejz $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void A() {
      this.a(this.w(), this.eX(), this.eY());
      ejz $$0 = this.j(new ejz(0.0, -1.0, 0.0)).b(this.ds(), this.du(), this.dy());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ejz $$2 = this.j(new ejz((double)this.ag.i() * 0.6 - 0.3, -1.0, (double)this.ag.i() * 0.6 - 0.3));
         ejz $$3 = $$2.a(0.3 + (double)(this.ag.i() * 2.0F));
         ((ami)this.dN()).a(this.u(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected ju u() {
      return jw.ad;
   }

   @Override
   public void a(ejz $$0) {
      this.a(blr.a, this.dq());
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

   public boolean gg() {
      return this.ca != 0.0F || this.cb != 0.0F || this.cc != 0.0F;
   }

   class a extends bsg {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bll $$0 = bxv.this.ei();
         return bxv.this.aZ() && $$0 != null ? bxv.this.f((bkv)$$0) < 100.0 : false;
      }

      @Override
      public void c() {
         this.e = 0;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         this.e++;
         bll $$0 = bxv.this.ei();
         if ($$0 != null) {
            ejz $$1 = new ejz(bxv.this.ds() - $$0.ds(), bxv.this.du() - $$0.du(), bxv.this.dy() - $$0.dy());
            dhn $$2 = bxv.this.dN().a_(hx.a(bxv.this.ds() + $$1.c, bxv.this.du() + $$1.d, bxv.this.dy() + $$1.e));
            ecx $$3 = bxv.this.dN().b_(hx.a(bxv.this.ds() + $$1.c, bxv.this.du() + $$1.d, bxv.this.dy() + $$1.e));
            if ($$3.a(arp.a) || $$2.i()) {
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

               bxv.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               bxv.this.dN().a(jw.e, bxv.this.ds(), bxv.this.du(), bxv.this.dy(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bsg {
      private final bxv b;

      public b(bxv $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.b.em();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.eh().a(b(50)) == 0 || !this.b.ai || !this.b.gg()) {
            float $$1 = this.b.eh().i() * (float) (Math.PI * 2);
            float $$2 = atq.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.eh().i() * 0.2F;
            float $$4 = atq.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
