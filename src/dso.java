public class dso extends dtc {
   public static final int d = 9;
   private jx<cvs> e = jx.a(9, cvs.k);

   protected dso(drx<?> $$0, jf $$1, dus $$2) {
      super($$0, $$1, $$2);
   }

   public dso(jf $$0, dus $$1) {
      this(drx.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azn $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.e.size(); $$3++) {
         if (!this.e.get($$3).f() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public cvs b(cvs $$0) {
      int $$1 = this.f_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cvs $$3 = this.e.get($$2);
         if ($$3.f() || cvs.c($$0, $$3)) {
            int $$4 = Math.min($$0.K(), $$1 - $$3.K());
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
   protected xe j() {
      return xe.c("container.dispenser");
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.e = jx.a(this.b(), cvs.k);
      if (!this.b_($$0)) {
         brm.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brm.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jx<cvs> f() {
      return this.e;
   }

   @Override
   protected void a(jx<cvs> $$0) {
      this.e = $$0;
   }

   @Override
   protected cqz a(int $$0, cnw $$1) {
      return new cru($$0, $$1, this);
   }
}
