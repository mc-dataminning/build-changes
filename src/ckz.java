import javax.annotation.Nullable;

public class ckz extends ckn {
   private static final byte c = 10;
   private int d = -1;

   public ckz(bpc<? extends ckz> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public ckz(cwz $$0, double $$1, double $$2, double $$3) {
      super(bpc.bc, $$0, $$1, $$2, $$3);
   }

   @Override
   public ckn.a v() {
      return ckn.a.d;
   }

   @Override
   public dmz x() {
      return dac.ck.o();
   }

   @Override
   public void l() {
      super.l();
      if (this.d > 0) {
         this.d--;
         this.dM().a(kc.ac, this.dr(), this.dt() + 0.5, this.dx(), 0.0, 0.0, 0.0);
      } else if (this.d == 0) {
         this.h(this.dp().i());
      }

      if (this.P) {
         double $$0 = this.dp().i();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if ($$0.c() instanceof ciy $$3 && $$3.bN()) {
         bnv $$4 = this.dN().d(this, $$0.d());
         this.a($$4, $$3.dp().g());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bnv $$0) {
      double $$1 = this.dp().i();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.ah_());
      } else {
         if (this.d < 0) {
            this.B();
            this.d = this.ag.a(20) + this.ag.a(20);
         }
      }
   }

   @Override
   protected cqf ah_() {
      return cqn.nO;
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bnv $$0, double $$1) {
      if (!this.dM().B) {
         double $$2 = Math.sqrt($$1);
         if ($$2 > 5.0) {
            $$2 = 5.0;
         }

         this.dM().a(this, $$0, null, this.dr(), this.dt(), this.dx(), (float)(4.0 + this.ag.j() * 1.5 * $$2), false, cwz.a.d);
         this.am();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bnv $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.d < 0) {
         this.B();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.B();
      } else {
         super.b($$0);
      }
   }

   public void B() {
      this.d = 80;
      if (!this.dM().B) {
         this.dM().a(this, (byte)10);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.yU, atz.e, 1.0F, 1.0F);
         }
      }
   }

   public int C() {
      return this.d;
   }

   public boolean D() {
      return this.d > -1;
   }

   @Override
   public float a(cwr $$0, cwf $$1, ib $$2, dmz $$3, ein $$4, float $$5) {
      return !this.D() || !$$3.a(aun.N) && !$$1.a_($$2.c()).a(aun.N) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(cwr $$0, cwf $$1, ib $$2, dmz $$3, float $$4) {
      return !this.D() || !$$3.a(aun.N) && !$$1.a_($$2.c()).a(aun.N) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(ta $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.d = $$0.h("TNTFuse");
      }
   }

   @Override
   protected void b(ta $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.d);
   }

   @Override
   boolean d(bnv $$0) {
      return e($$0);
   }

   private static boolean e(bnv $$0) {
      return $$0.a(aup.j) || $$0.a(aup.m);
   }
}
