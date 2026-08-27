public class bxq extends bxt {
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

   public bxq(bku<? extends bxq> $$0, csa $$1) {
      super($$0, $$1);
      this.ag.b((long)this.aj());
      this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bxq.b(this));
      this.bO.a(1, new bxq.a());
   }

   public static bml.a gf() {
      return bli.C().a(bmm.l, 10.0);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   protected aqq y() {
      return aqr.xH;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.xJ;
   }

   @Override
   protected aqq m_() {
      return aqr.xI;
   }

   protected aqq w() {
      return aqr.xK;
   }

   @Override
   public boolean a(cdu $$0) {
      return !this.fT();
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.c;
   }

   @Override
   public void c_() {
      super.c_();
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
            this.bV = atm.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         eju $$1 = this.dq();
         double $$2 = $$1.h();
         this.aU = this.aU + (-((float)atm.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.r(this.aU);
         this.d = this.d + (float) Math.PI * this.bZ * 1.5F;
         this.b = this.b + (-((float)atm.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bV = atm.e(atm.a(this.bT)) * (float) Math.PI * 0.25F;
         if (!this.dN().B) {
            double $$3 = this.dq().d;
            if (this.a(bkf.y)) {
               $$3 = 0.05 * (double)(this.b(bkf.y).e() + 1);
            } else if (!this.aV()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (super.a($$0, $$1) && this.ei() != null) {
         if (!this.dN().B) {
            this.A();
         }

         return true;
      } else {
         return false;
      }
   }

   private eju j(eju $$0) {
      eju $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void A() {
      this.a(this.w(), this.eX(), this.eY());
      eju $$0 = this.j(new eju(0.0, -1.0, 0.0)).b(this.ds(), this.du(), this.dy());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         eju $$2 = this.j(new eju((double)this.ag.i() * 0.6 - 0.3, -1.0, (double)this.ag.i() * 0.6 - 0.3));
         eju $$3 = $$2.a(0.3 + (double)(this.ag.i() * 2.0F));
         ((ame)this.dN()).a(this.u(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected jq u() {
      return js.ad;
   }

   @Override
   public void a(eju $$0) {
      this.a(blm.a, this.dq());
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

   class a extends bsb {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         blg $$0 = bxq.this.ei();
         return bxq.this.aZ() && $$0 != null ? bxq.this.f((bkq)$$0) < 100.0 : false;
      }

      @Override
      public void c() {
         this.e = 0;
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         this.e++;
         blg $$0 = bxq.this.ei();
         if ($$0 != null) {
            eju $$1 = new eju(bxq.this.ds() - $$0.ds(), bxq.this.du() - $$0.du(), bxq.this.dy() - $$0.dy());
            dhi $$2 = bxq.this.dN().a_(ht.a(bxq.this.ds() + $$1.c, bxq.this.du() + $$1.d, bxq.this.dy() + $$1.e));
            ecs $$3 = bxq.this.dN().b_(ht.a(bxq.this.ds() + $$1.c, bxq.this.du() + $$1.d, bxq.this.dy() + $$1.e));
            if ($$3.a(arl.a) || $$2.i()) {
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

               bxq.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               bxq.this.dN().a(js.e, bxq.this.ds(), bxq.this.du(), bxq.this.dy(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bsb {
      private final bxq b;

      public b(bxq $$0) {
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
            float $$2 = atm.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.eh().i() * 0.2F;
            float $$4 = atm.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
