public class dyz extends dzn {
   public static final int d = 9;
   private jp<daa> e = jp.a(9, daa.k);

   protected dyz(dyg<?> $$0, iw $$1, ebg $$2) {
      super($$0, $$1, $$2);
   }

   public dyz(iw $$0, ebg $$1) {
      this(dyg.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azz $$0) {
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

   public daa b(daa $$0) {
      int $$1 = this.f_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         daa $$3 = this.e.get($$2);
         if ($$3.f() || daa.c($$0, $$3)) {
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
   protected xc j() {
      return xc.c("container.dispenser");
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.e = jp.a(this.b(), daa.k);
      if (!this.b_($$0)) {
         bun.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bun.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jp<daa> f() {
      return this.e;
   }

   @Override
   protected void a(jp<daa> $$0) {
      this.e = $$0;
   }

   @Override
   protected cvs a(int $$0, cry $$1) {
      return new cwn($$0, $$1, this);
   }
}
