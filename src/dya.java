public class dya extends dyo {
   public static final int d = 9;
   private jn<czd> e = jn.a(9, czd.k);

   protected dya(dxh<?> $$0, iu $$1, eah $$2) {
      super($$0, $$1, $$2);
   }

   public dya(iu $$0, eah $$1) {
      this(dxh.f, $$0, $$1);
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

   public czd b(czd $$0) {
      int $$1 = this.f_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         czd $$3 = this.e.get($$2);
         if ($$3.f() || czd.c($$0, $$3)) {
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
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.e = jn.a(this.b(), czd.k);
      if (!this.b_($$0)) {
         btx.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btx.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jn<czd> f() {
      return this.e;
   }

   @Override
   protected void a(jn<czd> $$0) {
      this.e = $$0;
   }

   @Override
   protected cuv a(int $$0, crb $$1) {
      return new cvq($$0, $$1, this);
   }
}
