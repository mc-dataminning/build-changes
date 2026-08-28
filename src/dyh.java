public class dyh extends dyv {
   public static final int d = 9;
   private jo<czk> e = jo.a(9, czk.k);

   protected dyh(dxo<?> $$0, iv $$1, eao $$2) {
      super($$0, $$1, $$2);
   }

   public dyh(iv $$0, eao $$1) {
      this(dxo.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azv $$0) {
      this.d_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.e.size(); $$3++) {
         if (!this.e.get($$3).f() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public czk b(czk $$0) {
      int $$1 = this.f_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         czk $$3 = this.e.get($$2);
         if ($$3.f() || czk.c($$0, $$3)) {
            int $$4 = Math.min($$0.M(), $$1 - $$3.M());
            if ($$4 > 0) {
               if ($$3.f()) {
                  this.a($$2, $$0.a($$4));
               } else {
                  $$0.h($$4);
                  $$3.g($$4);
               }
            }

            if ($$0.f()) {
               break;
            }
         }
      }

      return $$0;
   }

   @Override
   protected wy j() {
      return wy.c("container.dispenser");
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.e = jo.a(this.b(), czk.k);
      if (!this.b_($$0)) {
         bua.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bua.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jo<czk> f() {
      return this.e;
   }

   @Override
   protected void a(jo<czk> $$0) {
      this.e = $$0;
   }

   @Override
   protected cvc a(int $$0, cri $$1) {
      return new cvx($$0, $$1, this);
   }
}
