public class dut extends dvh {
   public static final int d = 9;
   private ka<cwp> e = ka.a(9, cwp.j);

   protected dut(dub<?> $$0, ji $$1, dwx $$2) {
      super($$0, $$1, $$2);
   }

   public dut(ji $$0, dwx $$1) {
      this(dub.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azh $$0) {
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

   public cwp b(cwp $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cwp $$3 = this.e.get($$2);
         if ($$3.f() || cwp.c($$0, $$3)) {
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
   protected wp j() {
      return wp.c("container.dispenser");
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.e = ka.a(this.b(), cwp.j);
      if (!this.b_($$0)) {
         bse.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bse.a($$0, this.e, $$1);
      }
   }

   @Override
   protected ka<cwp> f() {
      return this.e;
   }

   @Override
   protected void a(ka<cwp> $$0) {
      this.e = $$0;
   }

   @Override
   protected csc a(int $$0, cow $$1) {
      return new csx($$0, $$1, this);
   }
}
