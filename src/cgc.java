import javax.annotation.Nullable;

public class cgc extends cfq {
   private static final byte c = 10;
   private int d = -1;

   public cgc(bkz<? extends cgc> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cgc(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.aZ, $$0, $$1, $$2, $$3);
   }

   @Override
   public cfq.a w() {
      return cfq.a.d;
   }

   @Override
   public dhn y() {
      return cvh.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dN().a(jw.Z, this.ds(), this.du() + 0.5, this.dy(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dq().i());
      }

      if (this.P) {
         double $$0 = this.dq().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if ($$0.c() instanceof cef $$3 && $$3.bN()) {
         bjt $$4 = this.dO().d(this, $$0.d());
         this.a($$4, $$3.dq().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bjt $$0) {
      double $$1 = this.dq().i();
      if (!$$0.a(arm.i) && !$$0.a(arm.l) && !($$1 >= 0.01F)) {
         this.b(this.ah_());
      } else {
         if (this.d < 0) {
            this.C();
            this.d = this.ag.a(20) + this.ag.a(20);
         }
      }
   }

   @Override
   protected clj ah_() {
      return clr.nO;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bjt $$0, double $$1) {
      if (!this.dN().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dN().a(this, $$0, null, this.ds(), this.du(), this.dy(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, csf.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bjt $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.C();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.C();
      } else {
         super.b($$0);
      }
   }

   public void C() {
      this.d = 80;
      if (!this.dN().B) {
         this.dN().a(this, (byte)10);
         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.yg, aqw.e, 1.0F, 1.0F);
         }
      }
   }

   public int D() {
      return this.d;
   }

   public boolean E() {
      return this.d > -1;
   }

   @Override
   public float a(crx $$0, crl $$1, hx $$2, dhn $$3, ecx $$4, float $$5) {
      return !this.E() || !$$3.a(ark.N) && !$$1.a_($$2.c()).a(ark.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(crx $$0, crl $$1, hx $$2, dhn $$3, float $$4) {
      return !this.E() || !$$3.a(ark.N) && !$$1.a_($$2.c()).a(ark.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(sd $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean ai_() {
      return true;
   }
}
