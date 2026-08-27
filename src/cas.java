public class cas extends cav {
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

   public cas(bnu<? extends cas> $$0, cvn $$1) {
      super($$0, $$1);
      this.af.b((long)this.aj());
      this.bY = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bO.a(0, new cas.b(this));
      this.bO.a(1, new cas.a());
   }

   public static bpk.a gg() {
      return boi.C().a(bpl.n, 10.0);
   }

   @Override
   protected atj y() {
      return atk.yr;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.yt;
   }

   @Override
   protected atj n_() {
      return atk.ys;
   }

   protected atj w() {
      return atk.yu;
   }

   @Override
   public boolean a(chh $$0) {
      return !this.fU();
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   protected bno.b aW() {
      return bno.b.c;
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
            this.bV = awh.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         ens $$1 = this.dp();
         double $$2 = $$1.h();
         this.aU = this.aU + (-((float)awh.d($$1.c, $$1.e)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.r(this.aU);
         this.d = this.d + (float) Math.PI * this.bZ * 1.5F;
         this.b = this.b + (-((float)awh.d($$2, $$1.d)) * (180.0F / (float)Math.PI) - this.b) * 0.1F;
      } else {
         this.bV = awh.e(awh.a(this.bT)) * (float) Math.PI * 0.25F;
         if (!this.dM().B) {
            double $$3 = this.dp().d;
            if (this.a(bnd.y)) {
               $$3 = 0.05 * (double)(this.c(bnd.y).d() + 1);
            } else if (!this.aV()) {
               $$3 -= 0.08;
            }

            this.o(0.0, $$3 * 0.98F, 0.0);
         }

         this.b = this.b + (-90.0F - this.b) * 0.02F;
      }
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (super.a($$0, $$1) && this.ei() != null) {
         if (!this.dM().B) {
            this.A();
         }

         return true;
      } else {
         return false;
      }
   }

   private ens j(ens $$0) {
      ens $$1 = $$0.a(this.c * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void A() {
      this.b(this.w());
      ens $$0 = this.j(new ens(0.0, -1.0, 0.0)).b(this.dr(), this.dt(), this.dx());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ens $$2 = this.j(new ens((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         ens $$3 = $$2.a(0.3 + (double)(this.af.i() * 2.0F));
         ((aov)this.dM()).a(this.u(), $$0.c, $$0.d + 0.5, $$0.e, 0, $$3.c, $$3.d, $$3.e, 0.1F);
      }
   }

   protected jx u() {
      return jz.af;
   }

   @Override
   public void a(ens $$0) {
      this.a(bol.a, this.dp());
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

   class a extends bvb {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean a() {
         bog $$0 = cas.this.ei();
         return cas.this.aZ() && $$0 != null ? cas.this.f((bno)$$0) < 100.0 : false;
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
         bog $$0 = cas.this.ei();
         if ($$0 != null) {
            ens $$1 = new ens(cas.this.dr() - $$0.dr(), cas.this.dt() - $$0.dt(), cas.this.dx() - $$0.dx());
            dlf $$2 = cas.this.dM().a_(hz.a(cas.this.dr() + $$1.c, cas.this.dt() + $$1.d, cas.this.dx() + $$1.e));
            egp $$3 = cas.this.dM().b_(hz.a(cas.this.dr() + $$1.c, cas.this.dt() + $$1.d, cas.this.dx() + $$1.e));
            if ($$3.a(aue.a) || $$2.i()) {
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

               cas.this.a((float)$$1.c / 20.0F, (float)$$1.d / 20.0F, (float)$$1.e / 20.0F);
            }

            if (this.e % 10 == 5) {
               cas.this.dM().a(jz.e, cas.this.dr(), cas.this.dt(), cas.this.dx(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends bvb {
      private final cas b;

      public b(cas $$0) {
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
            float $$2 = awh.b($$1) * 0.2F;
            float $$3 = -0.1F + this.b.eh().i() * 0.2F;
            float $$4 = awh.a($$1) * 0.2F;
            this.b.a($$2, $$3, $$4);
         }
      }
   }
}
