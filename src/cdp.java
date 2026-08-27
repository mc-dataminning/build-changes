import javax.annotation.Nullable;

public class cdp extends cdd {
   private static final byte c = 10;
   private int d = -1;

   public cdp(bim<? extends cdp> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public cdp(cpl $$0, double $$1, double $$2, double $$3) {
      super(bim.aZ, $$0, $$1, $$2, $$3);
   }

   @Override
   public cdd.a t() {
      return cdd.a.d;
   }

   @Override
   public dez w() {
      return csm.ck.n();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dK().a(iv.Z, this.dp(), this.dr() + 0.5, this.dv(), 0.0, 0.0, 0.0);
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
   public boolean a(bhg $$0, float $$1) {
      if ($$0.c() instanceof cbs $$3 && $$3.bM()) {
         bhg $$4 = this.dL().d(this, $$0.d());
         this.a($$4, $$3.dn().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bhg $$0) {
      double $$1 = this.dn().i();
      if (!$$0.a(apn.i) && !$$0.a(apn.l) && !($$1 >= 0.01F)) {
         super.a($$0);
      } else {
         if (this.d < 0) {
            this.A();
            this.d = this.ag.a(20) + this.ag.a(20);
         }
      }
   }

   @Override
   protected cis j() {
      return cja.nd;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bhg $$0, double $$1) {
      if (!this.dK().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dK().a(this, $$0, null, this.dp(), this.dr(), this.dv(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, cpl.a.d);
         this.ak();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bhg $$2) {
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
            this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.xL, aox.e, 1.0F, 1.0F);
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
   public float a(cpd $$0, cor $$1, gu $$2, dez $$3, eac $$4, float $$5) {
      return !this.D() || !$$3.a(apl.N) && !$$1.a_($$2.c()).a(apl.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(cpd $$0, cor $$1, gu $$2, dez $$3, float $$4) {
      return !this.D() || !$$3.a(apl.N) && !$$1.a_($$2.c()).a(apl.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }
}
