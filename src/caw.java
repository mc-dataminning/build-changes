public class caw extends caz {
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

   public caw(bnw<? extends caw> $$0, cvr $$1) {
      super($$0, $$1);
      this.af.b((long)this.aj());
      this.bY = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new caw.b(this));
      this.bO.a(1, new caw.a());
   }

   public static bpo.a gg() {
      return bok.C().a(bpp.n, 10.0);
   }

   @Override
   protected atk y() {
      return atl.ys;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.yu;
   }

   @Override
   protected atk n_() {
      return atl.yt;
   }

   protected atk w() {
      return atl.yv;
   }

   @Override
   public boolean a(chl $$0) {
      return !this.fU();
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.c;
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
            if (this.af.a(10) == 0) {
               this.bY = 1.0F / (this.af.i() + 1.0F) * 0.2F;
            }

            this.dM().a(this, (byte)19);
         }
      }

      if (this.bc()) {
         if (this.bT < (float) Math.PI) {
            float $$0 = this.bT / (float) Math.PI;
            this.bV = awi.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         enz $$1 = this.dp();
         double $$2 = $$1.h();
         this.aU = this.aU + (-((float)awi.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.r(this.aU);
         this.d = this.d + (float) Math.PI * this.bZ * 1.5F;
         this.b = this.b + (-((float)awi.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bV = awi.e(awi.a(this.bT)) * (float) Math.PI * 0.25F;
         if (!this.dM().B) {
            double $$3 = this.dp().d;
            if (this.a(bnf.y)) {
               $$3 = 0.05 * (double)(this.c(bnf.y).d() + 1);
            } else if (!this.aV()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (super.a($$0, $$1) && this.ei() != null) {
         if (!this.dM().B) {
            this.A();
         }

         return true;
      } else {
         return false;
      }
   }

   private enz j(enz $$0) {
      enz $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void A() {
      this.b(this.w());
      enz $$0 = this.j(new enz(0.0, -1.0, 0.0)).b(this.dr(), this.dt(), this.dx());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         enz $$2 = this.j(new enz((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         enz $$3 = $$2.a(0.3 + (double)(this.af.i() * 2.0F));
         ((aow)this.dM()).a(this.u(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected jx u() {
      return jz.af;
   }

   @Override
   public void a(enz $$0) {
      this.a(bon.a, this.dp());
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

   public boolean gh() {
      return this.ca != 0.0F || this.cb != 0.0F || this.cc != 0.0F;
   }

   class a extends bvf {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         boi $$0 = caw.this.ei();
         return caw.this.aZ() && $$0 != null ? caw.this.f((bnq)$$0) < 100.0 : false;
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
         boi $$0 = caw.this.ei();
         if ($$0 != null) {
            enz $$1 = new enz(caw.this.dr() - $$0.dr(), caw.this.dt() - $$0.dt(), caw.this.dx() - $$0.dx());
            dlj $$2 = caw.this.dM().a_(hz.a(caw.this.dr() + $$1.c, caw.this.dt() + $$1.d, caw.this.dx() + $$1.e));
            egw $$3 = caw.this.dM().b_(hz.a(caw.this.dr() + $$1.c, caw.this.dt() + $$1.d, caw.this.dx() + $$1.e));
            if ($$3.a(auf.a) || $$2.i()) {
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

               caw.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               caw.this.dM().a(jz.e, caw.this.dr(), caw.this.dt(), caw.this.dx(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bvf {
      private final caw b;

      public b(caw $$0) {
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
         } else if (this.b.eh().a(b(50)) == 0 || !this.b.ah || !this.b.gh()) {
            float $$1 = this.b.eh().i() * (float) (Math.PI * 2);
            float $$2 = awi.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.eh().i() * 0.2F;
            float $$4 = awi.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
