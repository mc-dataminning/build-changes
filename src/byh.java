public class byh extends byk {
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

   public byh(blj<? extends byh> $$0, csy $$1) {
      super($$0, $$1);
      this.ag.b((long)this.aj());
      this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new byh.b(this));
      this.bO.a(1, new byh.a());
   }

   public static bna.a ge() {
      return blx.C().a(bnb.l, 10.0);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   protected arb y() {
      return arc.yc;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.ye;
   }

   @Override
   protected arb n_() {
      return arc.yd;
   }

   protected arb w() {
      return arc.yf;
   }

   @Override
   public boolean a(cer $$0) {
      return !this.fS();
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected blf.b aW() {
      return blf.b.c;
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
            this.bV = aty.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         elb $$1 = this.dp();
         double $$2 = $$1.h();
         this.aU = this.aU + (-((float)aty.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.r(this.aU);
         this.d = this.d + (float) Math.PI * this.bZ * 1.5F;
         this.b = this.b + (-((float)aty.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bV = aty.e(aty.a(this.bT)) * (float) Math.PI * 0.25F;
         if (!this.dM().B) {
            double $$3 = this.dp().d;
            if (this.a(bku.y)) {
               $$3 = 0.05 * (double)(this.b(bku.y).e() + 1);
            } else if (!this.aV()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (super.a($$0, $$1) && this.eh() != null) {
         if (!this.dM().B) {
            this.A();
         }

         return true;
      } else {
         return false;
      }
   }

   private elb j(elb $$0) {
      elb $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void A() {
      this.a(this.w(), this.eW(), this.eX());
      elb $$0 = this.j(new elb(0.0, -1.0, 0.0)).b(this.dr(), this.dt(), this.dx());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         elb $$2 = this.j(new elb((double)this.ag.i() * 0.6 - 0.3, -1.0, (double)this.ag.i() * 0.6 - 0.3));
         elb $$3 = $$2.a(0.3 + (double)(this.ag.i() * 2.0F));
         ((amp)this.dM()).a(this.u(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected jt u() {
      return jv.af;
   }

   @Override
   public void a(elb $$0) {
      this.a(bmb.a, this.dp());
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

   class a extends bsr {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         blv $$0 = byh.this.eh();
         return byh.this.aZ() && $$0 != null ? byh.this.f((blf)$$0) < 100.0 : false;
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
         blv $$0 = byh.this.eh();
         if ($$0 != null) {
            elb $$1 = new elb(byh.this.dr() - $$0.dr(), byh.this.dt() - $$0.dt(), byh.this.dx() - $$0.dx());
            dip $$2 = byh.this.dM().a_(hv.a(byh.this.dr() + $$1.c, byh.this.dt() + $$1.d, byh.this.dx() + $$1.e));
            edz $$3 = byh.this.dM().b_(hv.a(byh.this.dr() + $$1.c, byh.this.dt() + $$1.d, byh.this.dx() + $$1.e));
            if ($$3.a(arw.a) || $$2.i()) {
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

               byh.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               byh.this.dM().a(jv.e, byh.this.dr(), byh.this.dt(), byh.this.dx(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bsr {
      private final byh b;

      public b(byh $$0) {
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
            float $$2 = aty.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.eg().i() * 0.2F;
            float $$4 = aty.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
