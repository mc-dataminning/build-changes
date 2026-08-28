public class dsl extends dsz {
   public static final int d = 9;
   private jw<cvp> e = jw.a(9, cvp.k);

   protected dsl(dru<?> $$0, je $$1, duo $$2) {
      super($$0, $$1, $$2);
   }

   public dsl(je $$0, duo $$1) {
      this(dru.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azl $$0) {
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

   public cvp b(cvp $$0) {
      int $$1 = this.f_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cvp $$3 = this.e.get($$2);
         if ($$3.f() || cvp.c($$0, $$3)) {
            int $$4 = Math.min($$0.J(), $$1 - $$3.J());
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
   protected xd j() {
      return xd.c("container.dispenser");
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.e = jw.a(this.b(), cvp.k);
      if (!this.b_($$0)) {
         brj.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brj.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jw<cvp> f() {
      return this.e;
   }

   @Override
   protected void a(jw<cvp> $$0) {
      this.e = $$0;
   }

   @Override
   protected cqw a(int $$0, cnt $$1) {
      return new crr($$0, $$1, this);
   }
}
