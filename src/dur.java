public class dur extends dvf {
   public static final int d = 9;
   private ka<cwn> e = ka.a(9, cwn.j);

   protected dur(dtz<?> $$0, ji $$1, dwv $$2) {
      super($$0, $$1, $$2);
   }

   public dur(ji $$0, dwv $$1) {
      this(dtz.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azg $$0) {
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

   public cwn b(cwn $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cwn $$3 = this.e.get($$2);
         if ($$3.f() || cwn.c($$0, $$3)) {
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
   protected wo j() {
      return wo.c("container.dispenser");
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.e = ka.a(this.b(), cwn.j);
      if (!this.b_($$0)) {
         bsc.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsc.a($$0, this.e, $$1);
      }
   }

   @Override
   protected ka<cwn> f() {
      return this.e;
   }

   @Override
   protected void a(ka<cwn> $$0) {
      this.e = $$0;
   }

   @Override
   protected csa a(int $$0, cou $$1) {
      return new csv($$0, $$1, this);
   }
}
