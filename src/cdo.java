import javax.annotation.Nullable;

public class cdo extends cdc {
   private static final byte c = 10;
   private int d = -1;

   public cdo(bik<? extends cdo> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cdo(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.aZ, $$0, $$1, $$2, $$3);
   }

   @Override
   public cdc.a t() {
      return cdc.a.d;
   }

   @Override
   public dey w() {
      return csl.ck.n();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dK().a(iw.Z, this.dp(), this.dr() + 0.5, this.dv(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dn().i());
      }

      if (this.P) {
         double $$0 = this.dn().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if ($$0.c() instanceof cbr $$3 && $$3.bM()) {
         bhe $$4 = this.dL().d(this, $$0.d());
         this.a($$4, $$3.dn().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bhe $$0) {
      double $$1 = this.dn().i();
      if (!$$0.a(apl.i) && !$$0.a(apl.l) && !($$1 >= 0.01F)) {
         super.a($$0);
      } else {
         if (this.d < 0) {
            this.A();
            this.d = this.ag.a(20) + this.ag.a(20);
         }
      }
   }

   @Override
   protected cir j() {
      return ciz.nd;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bhe $$0, double $$1) {
      if (!this.dK().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dK().a(this, $$0, null, this.dp(), this.dr(), this.dv(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, cpk.a.d);
         this.ak();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhe $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.A();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.A();
      } else {
         super.b($$0);
      }
   }

   public void A() {
      this.d = 80;
      if (!this.dK().B) {
         this.dK().a(this, (byte)10);
         if (!this.aS()) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.xG, aov.e, 1.0F, 1.0F);
         }
      }
   }

   public int B() {
      return this.d;
   }

   public boolean D() {
      return this.d > -1;
   }

   @Override
   public float a(cpc $$0, coq $$1, gv $$2, dey $$3, eab $$4, float $$5) {
      return !this.D() || !$$3.a(apj.N) && !$$1.a_($$2.c()).a(apj.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(cpc $$0, coq $$1, gv $$2, dey $$3, float $$4) {
      return !this.D() || !$$3.a(apj.N) && !$$1.a_($$2.c()).a(apj.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(qs $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }
}
