public class bvw extends bvz {
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

   public bvw(bja<? extends bvw> $$0, cqb $$1) {
      super($$0, $$1);
      this.ag.b((long)this.ah());
      this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bvw.b(this));
      this.bO.a(1, new bvw.a());
   }

   public static bkr.a ge() {
      return bjo.A().a(bks.l, 10.0);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   protected apf w() {
      return apg.xm;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.xo;
   }

   @Override
   protected apf l_() {
      return apg.xn;
   }

   protected apf t() {
      return apg.xp;
   }

   @Override
   public boolean a(cca $$0) {
      return !this.fS();
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   protected biw.b aU() {
      return biw.b.c;
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
         if (this.dL().B) {
            this.bT = (float) (Math.PI * 2);
         } else {
            this.bT -= (float) (Math.PI * 2);
            if (this.ag.a(10) == 0) {
               this.bY = 1.0F / (this.ag.i() + 1.0F) * 0.2F;
            }

            this.dL().a(this, (byte)19);
         }
      }

      if (this.ba()) {
         if (this.bT < (float) Math.PI) {
            float $$0 = this.bT / (float) Math.PI;
            this.bV = asb.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         if (!this.dL().B) {
            this.o((double)(this.ca * this.bX), (double)(this.cb * this.bX), (double)(this.cc * this.bX));
         }

         ehh $$1 = this.do();
         double $$2 = $$1.h();
         this.aU = this.aU + (-((float)asb.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.r(this.aU);
         this.d = this.d + (float) Math.PI * this.bZ * 1.5F;
         this.b = this.b + (-((float)asb.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bV = asb.e(asb.a(this.bT)) * (float) Math.PI * 0.25F;
         if (!this.dL().B) {
            double $$3 = this.do().d;
            if (this.a(bil.y)) {
               $$3 = 0.05 * (double)(this.b(bil.y).e() + 1);
            } else if (!this.aT()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (super.a($$0, $$1) && this.eg() != null) {
         if (!this.dL().B) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private ehh j(ehh $$0) {
      ehh $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.a(this.t(), this.eV(), this.eW());
      ehh $$0 = this.j(new ehh(0.0, -1.0, 0.0)).b(this.dq(), this.ds(), this.dw());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ehh $$2 = this.j(new ehh((double)this.ag.i() * 0.6 - 0.3, -1.0, (double)this.ag.i() * 0.6 - 0.3));
         ehh $$3 = $$2.a(0.3 + (double)(this.ag.i() * 2.0F));
         ((akt)this.dL()).a(this.s(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected it s() {
      return iv.ac;
   }

   @Override
   public void h(ehh $$0) {
      this.a(bjs.a, this.do());
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

   class a extends bqh {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bjm $$0 = bvw.this.eg();
         return bvw.this.aX() && $$0 != null ? bvw.this.f((biw)$$0) < 100.0 : false;
      }

      @Override
      public void c() {
         this.e = 0;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         this.e++;
         bjm $$0 = bvw.this.eg();
         if ($$0 != null) {
            ehh $$1 = new ehh(bvw.this.dq() - $$0.dq(), bvw.this.ds() - $$0.ds(), bvw.this.dw() - $$0.dw());
            dfd $$2 = bvw.this.dL().a_(gw.a(bvw.this.dq() + $$1.c, bvw.this.ds() + $$1.d, bvw.this.dw() + $$1.e));
            eag $$3 = bvw.this.dL().b_(gw.a(bvw.this.dq() + $$1.c, bvw.this.ds() + $$1.d, bvw.this.dw() + $$1.e));
            if ($$3.a(aqa.a) || $$2.i()) {
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

               bvw.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               bvw.this.dL().a(iv.e, bvw.this.dq(), bvw.this.ds(), bvw.this.dw(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bqh {
      private final bvw b;

      public b(bvw $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public void e() {
         int $$0 = this.b.ek();
         if ($$0 > 100) {
            this.b.a(0.0F, 0.0F, 0.0F);
         } else if (this.b.ef().a(b(50)) == 0 || !this.b.ai || !this.b.gf()) {
            float $$1 = this.b.ef().i() * (float) (Math.PI * 2);
            float $$2 = asb.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.ef().i() * 0.2F;
            float $$4 = asb.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
