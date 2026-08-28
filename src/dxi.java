public class dxi extends dxw {
   public static final int d = 9;
   private jn<cys> e = jn.a(9, cys.k);

   protected dxi(dwp<?> $$0, iu $$1, dzo $$2) {
      super($$0, $$1, $$2);
   }

   public dxi(iu $$0, dzo $$1) {
      this(dwp.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azt $$0) {
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

   public cys b(cys $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cys $$3 = this.e.get($$2);
         if ($$3.f() || cys.c($$0, $$3)) {
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
   protected ww j() {
      return ww.c("container.dispenser");
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.e = jn.a(this.b(), cys.k);
      if (!this.b_($$0)) {
         bts.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bts.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jn<cys> f() {
      return this.e;
   }

   @Override
   protected void a(jn<cys> $$0) {
      this.e = $$0;
   }

   @Override
   protected cuk a(int $$0, cqr $$1) {
      return new cvf($$0, $$1, this);
   }
}
