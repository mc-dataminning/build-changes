public class byx extends bza {
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

   public byx(blz<? extends byx> $$0, ctp $$1) {
      super($$0, $$1);
      this.ag.b((long)this.aj());
      this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new byx.b(this));
      this.bO.a(1, new byx.a());
   }

   public static bnq.a ge() {
      return bmn.C().a(bnr.l, 10.0);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   protected arr y() {
      return ars.yc;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.ye;
   }

   @Override
   protected arr n_() {
      return ars.yd;
   }

   protected arr w() {
      return ars.yf;
   }

   @Override
   public boolean a(cfi $$0) {
      return !this.fS();
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected blv.b aW() {
      return blv.b.c;
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
         if (this.dM().B) {
            this.bT = (float) (Math.PI * 2);
         } else {
            this.bT -= (float) (Math.PI * 2);
            if (this.ag.a(10) == 0) {
               this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
            }

            this.dM().a(this, (byte)19);
         }
      }

      if (this.bc()) {
         if (this.bT < (float) Math.PI) {
            float $$0 = this.bT / (float) Math.PI;
            this.bV = auo.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         if (!this.dM().B) {
            this.o((double)(this.ca * this.bX), (double)(this.cb * this.bX), (double)(this.cc * this.bX));
         }

         elt $$1 = this.dp();
         double $$2 = $$1.h();
         this.aU = this.aU + (-((float)auo.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.r(this.aU);
         this.d = this.d + (float) Math.PI * this.bZ * 1.5F;
         this.b = this.b + (-((float)auo.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bV = auo.e(auo.a(this.bT)) * (float) Math.PI * 0.25F;
         if (!this.dM().B) {
            double $$3 = this.dp().d;
            if (this.a(blk.y)) {
               $$3 = 0.05 * (double)(this.b(blk.y).e() + 1);
            } else if (!this.aV()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if (super.a($$0, $$1) && this.eh() != null) {
         if (!this.dM().B) {
            this.A();
         }

         return true;
      } else {
         return false;
      }
   }

   private elt j(elt $$0) {
      elt $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void A() {
      this.a(this.w(), this.eW(), this.eX());
      elt $$0 = this.j(new elt(0.0, -1.0, 0.0)).b(this.dr(), this.dt(), this.dx());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         elt $$2 = this.j(new elt((double)this.ag.i() * 0.6 - 0.3, -1.0, (double)this.ag.i() * 0.6 - 0.3));
         elt $$3 = $$2.a(0.3 + (double)(this.ag.i() * 2.0F));
         ((and)this.dM()).a(this.u(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected jv u() {
      return jx.af;
   }

   @Override
   public void a(elt $$0) {
      this.a(bmr.a, this.dp());
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

   public boolean gf() {
      return this.ca != 0.0F || this.cb != 0.0F || this.cc != 0.0F;
   }

   class a extends bth {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bml $$0 = byx.this.eh();
         return byx.this.aZ() && $$0 != null ? byx.this.f((blv)$$0) < 100.0 : false;
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
         bml $$0 = byx.this.eh();
         if ($$0 != null) {
            elt $$1 = new elt(byx.this.dr() - $$0.dr(), byx.this.dt() - $$0.dt(), byx.this.dx() - $$0.dx());
            djh $$2 = byx.this.dM().a_(hx.a(byx.this.dr() + $$1.c, byx.this.dt() + $$1.d, byx.this.dx() + $$1.e));
            eer $$3 = byx.this.dM().b_(hx.a(byx.this.dr() + $$1.c, byx.this.dt() + $$1.d, byx.this.dx() + $$1.e));
            if ($$3.a(asm.a) || $$2.i()) {
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

               byx.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               byx.this.dM().a(jx.e, byx.this.dr(), byx.this.dt(), byx.this.dx(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bth {
      private final byx b;

      public b(byx $$0) {
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
         } else if (this.b.eg().a(b(50)) == 0 || !this.b.ai || !this.b.gf()) {
            float $$1 = this.b.eg().i() * (float) (Math.PI * 2);
            float $$2 = auo.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.eg().i() * 0.2F;
            float $$4 = auo.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
