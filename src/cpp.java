public class cpp extends cpr {
   public cpp(bup<? extends cpp> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpp(dff $$0, bve $$1, cwf $$2) {
      super(bup.aT, $$1, $$0, $$2);
   }

   public cpp(dff $$0, double $$1, double $$2, double $$3, cwf $$4) {
      super(bup.aT, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwb o() {
      return cwj.qD;
   }

   private lq q() {
      cwf $$0 = this.m();
      return (lq)(!$$0.f() && !$$0.a(this.o()) ? new lo(ls.S, $$0) : ls.W);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lq $$1 = this.q();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dY().a($$1, this.dD(), this.dF(), this.dJ(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      bui $$1 = $$0.a();
      int $$2 = $$1 instanceof cle ? 3 : 0;
      $$1.a(this.dZ().b(this, this.s()), (float)$$2);
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      if (!this.dY().C) {
         this.dY().a(this, (byte)3);
         this.av();
      }
   }
}
