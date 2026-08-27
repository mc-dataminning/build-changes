public class cbl extends cbo {
   public float b;
   public float c;
   public float d;
   public float e;
   public float bV;
   public float bW;
   public float bX;
   public float bY;
   private float bZ;
   private float ca;
   private float cb;
   private float cc;
   private float cd;
   private float ce;

   public cbl(bol<? extends cbl> $$0, cwe $$1) {
      super($$0, $$1);
      this.af.b((long)this.aj());
      this.ca = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bP.a(0, new cbl.b(this));
      this.bP.a(1, new cbl.a());
   }

   public static bqd.a gl() {
      return boz.C().a(bqe.n, 10.0);
   }

   @Override
   protected ato y() {
      return atp.ys;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.yu;
   }

   @Override
   protected ato n_() {
      return atp.yt;
   }

   protected ato w() {
      return atp.yv;
   }

   @Override
   public boolean a(cia $$0) {
      return !this.fZ();
   }

   @Override
   protected float eY() {
      return 0.4F;
   }

   @Override
   protected bof.b aW() {
      return bof.b.c;
   }

   @Override
   public void d_() {
      super.d_();
      this.c = this.b;
      this.e = this.d;
      this.bW = this.bV;
      this.bY = this.bX;
      this.bV = this.bV + this.ca;
      if ((double)this.bV > Math.PI * 2) {
         if (this.dJ().B) {
            this.bV = (float) (Math.PI * 2);
         } else {
            this.bV -= (float) (Math.PI * 2);
            if (this.af.a(10) == 0) {
               this.ca = 1.0F / (this.af.i() + 1.0F) * 0.2F;
            }

            this.dJ().a(this, (byte)19);
         }
      }

      if (this.bc()) {
         if (this.bV < (float) Math.PI) {
            float $$0 = this.bV / (float) Math.PI;
            this.bX = awm.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.bZ = 1.0F;
               this.cb = 1.0F;
            } else {
               this.cb *= 0.8F;
            }
         } else {
            this.bX = 0.0F;
            this.bZ *= 0.9F;
            this.cb *= 0.99F;
         }

         if (!this.dJ().B) {
            this.o((double)(this.cc * this.bZ), (double)(this.cd * this.bZ), (double)(this.ce * this.bZ));
         }

         eov $$1 = this.dm();
         double $$2 = $$1.h();
         this.aV = this.aV + (-((float)awm.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aV) * 0.1F;
         this.r(this.aV);
         this.d = this.d + (float) Math.PI * this.cb * 1.5F;
         this.b = this.b + (-((float)awm.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bX = awm.e(awm.a(this.bV)) * (float) Math.PI * 0.25F;
         if (!this.dJ().B) {
            double $$3 = this.dm().d;
            if (this.a(bnu.y)) {
               $$3 = 0.05 * (double)(this.c(bnu.y).d() + 1);
            } else if (!this.aV()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (super.a($$0, $$1) && this.eg() != null) {
         if (!this.dJ().B) {
            this.A();
         }

         return true;
      } else {
         return false;
      }
   }

   private eov j(eov $$0) {
      eov $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aW * (float) (Math.PI / 180.0));
   }

   private void A() {
      this.b(this.w());
      eov $$0 = this.j(new eov(0.0, -1.0, 0.0)).b(this.do(), this.dq(), this.du());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         eov $$2 = this.j(new eov((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         eov $$3 = $$2.a(0.3 + (double)(this.af.i() * 2.0F));
         ((apa)this.dJ()).a(this.u(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected jz u() {
      return kb.af;
   }

   @Override
   public void a(eov $$0) {
      this.a(bpc.a, this.dm());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bV = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.cc = $$0;
      this.cd = $$1;
      this.ce = $$2;
   }

   public boolean gm() {
      return this.cc != 0.0F || this.cd != 0.0F || this.ce != 0.0F;
   }

   class a extends bvu {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         box $$0 = cbl.this.eg();
         return cbl.this.aZ() && $$0 != null ? cbl.this.f((bof)$$0) < 100.0 : false;
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
         box $$0 = cbl.this.eg();
         if ($$0 != null) {
            eov $$1 = new eov(cbl.this.do() - $$0.do(), cbl.this.dq() - $$0.dq(), cbl.this.du() - $$0.du());
            dme $$2 = cbl.this.dJ().a_(ib.a(cbl.this.do() + $$1.c, cbl.this.dq() + $$1.d, cbl.this.du() + $$1.e));
            ehr $$3 = cbl.this.dJ().b_(ib.a(cbl.this.do() + $$1.c, cbl.this.dq() + $$1.d, cbl.this.du() + $$1.e));
            if ($$3.a(auj.a) || $$2.i()) {
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

               cbl.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cbl.this.dJ().a(kb.e, cbl.this.do(), cbl.this.dq(), cbl.this.du(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bvu {
      private final cbl b;

      public b(cbl $$0) {
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
         } else if (this.b.ef().a(b(50)) == 0 || !this.b.ah || !this.b.gm()) {
            float $$1 = this.b.ef().i() * (float) (Math.PI * 2);
            float $$2 = awm.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.ef().i() * 0.2F;
            float $$4 = awm.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
