public class bzb extends bze {
   public float b;
   public float c;
   public float d;
   public float e;
   public float bU;
   public float bV;
   public float bW;
   public float bX;
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;

   public bzb(bmc<? extends bzb> $$0, ctx $$1) {
      super($$0, $$1);
      this.ag.b((long)this.aj());
      this.bZ = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bP.a(0, new bzb.b(this));
      this.bP.a(1, new bzb.a());
   }

   public static bnt.a gf() {
      return bmq.C().a(bnu.n, 10.0);
   }

   @Override
   protected ars y() {
      return art.yr;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.yt;
   }

   @Override
   protected ars n_() {
      return art.ys;
   }

   protected ars w() {
      return art.yu;
   }

   @Override
   public boolean a(cfq $$0) {
      return !this.fT();
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected blw.b aW() {
      return blw.b.c;
   }

   @Override
   public void d_() {
      super.d_();
      this.c = this.b;
      this.e = this.d;
      this.bV = this.bU;
      this.bX = this.bW;
      this.bU = this.bU + this.bZ;
      if ((double)this.bU > Math.PI * 2) {
         if (this.dL().B) {
            this.bU = (float) (Math.PI * 2);
         } else {
            this.bU -= (float) (Math.PI * 2);
            if (this.ag.a(10) == 0) {
               this.bZ = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
            }

            this.dL().a(this, (byte)19);
         }
      }

      if (this.bc()) {
         if (this.bU < (float) Math.PI) {
            float $$0 = this.bU / (float) Math.PI;
            this.bW = aup.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.bY = 1.0F;
               this.ca = 1.0F;
            } else {
               this.ca *= 0.8F;
            }
         } else {
            this.bW = 0.0F;
            this.bY *= 0.9F;
            this.ca *= 0.99F;
         }

         if (!this.dL().B) {
            this.o((double)(this.cb * this.bY), (double)(this.cc * this.bY), (double)(this.cd * this.bY));
         }

         emc $$1 = this.do();
         double $$2 = $$1.h();
         this.aU = this.aU + (-((float)aup.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.r(this.aU);
         this.d = this.d + (float) Math.PI * this.ca * 1.5F;
         this.b = this.b + (-((float)aup.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bW = aup.e(aup.a(this.bU)) * (float) Math.PI * 0.25F;
         if (!this.dL().B) {
            double $$3 = this.do().d;
            if (this.a(bll.y)) {
               $$3 = 0.05 * (double)(this.c(bll.y).d() + 1);
            } else if (!this.aV()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (super.a($$0, $$1) && this.eh() != null) {
         if (!this.dL().B) {
            this.A();
         }

         return true;
      } else {
         return false;
      }
   }

   private emc j(emc $$0) {
      emc $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void A() {
      this.a(this.w(), this.eW(), this.eX());
      emc $$0 = this.j(new emc(0.0, -1.0, 0.0)).b(this.dq(), this.ds(), this.dw());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         emc $$2 = this.j(new emc((double)this.ag.i() * 0.6 - 0.3, -1.0, (double)this.ag.i() * 0.6 - 0.3));
         emc $$3 = $$2.a(0.3 + (double)(this.ag.i() * 2.0F));
         ((ane)this.dL()).a(this.u(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected jv u() {
      return jx.af;
   }

   @Override
   public void a(emc $$0) {
      this.a(bmu.a, this.do());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bU = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.cb = $$0;
      this.cc = $$1;
      this.cd = $$2;
   }

   public boolean gg() {
      return this.cb != 0.0F || this.cc != 0.0F || this.cd != 0.0F;
   }

   class a extends btk {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bmo $$0 = bzb.this.eh();
         return bzb.this.aZ() && $$0 != null ? bzb.this.f((blw)$$0) < 100.0 : false;
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
         bmo $$0 = bzb.this.eh();
         if ($$0 != null) {
            emc $$1 = new emc(bzb.this.dq() - $$0.dq(), bzb.this.ds() - $$0.ds(), bzb.this.dw() - $$0.dw());
            djp $$2 = bzb.this.dL().a_(hx.a(bzb.this.dq() + $$1.c, bzb.this.ds() + $$1.d, bzb.this.dw() + $$1.e));
            eez $$3 = bzb.this.dL().b_(hx.a(bzb.this.dq() + $$1.c, bzb.this.ds() + $$1.d, bzb.this.dw() + $$1.e));
            if ($$3.a(asn.a) || $$2.i()) {
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

               bzb.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               bzb.this.dL().a(jx.e, bzb.this.dq(), bzb.this.ds(), bzb.this.dw(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends btk {
      private final bzb b;

      public b(bzb $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.b.el();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.eg().a(b(50)) == 0 || !this.b.ai || !this.b.gg()) {
            float $$1 = this.b.eg().i() * (float) (Math.PI * 2);
            float $$2 = aup.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.eg().i() * 0.2F;
            float $$4 = aup.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
