public class dus extends dvg {
   public static final int d = 9;
   private ka<cwo> e = ka.a(9, cwo.j);

   protected dus(dua<?> $$0, ji $$1, dww $$2) {
      super($$0, $$1, $$2);
   }

   public dus(ji $$0, dww $$1) {
      this(dua.f, $$0, $$1);
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

   public cwo b(cwo $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cwo $$3 = this.e.get($$2);
         if ($$3.f() || cwo.c($$0, $$3)) {
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
      this.e = ka.a(this.b(), cwo.j);
      if (!this.b_($$0)) {
         bsd.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsd.a($$0, this.e, $$1);
      }
   }

   @Override
   protected ka<cwo> f() {
      return this.e;
   }

   @Override
   protected void a(ka<cwo> $$0) {
      this.e = $$0;
   }

   @Override
   protected csb a(int $$0, cov $$1) {
      return new csw($$0, $$1, this);
   }
}
