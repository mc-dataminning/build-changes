public class dtk extends dty {
   public static final int d = 9;
   private jz<cwf> e = jz.a(9, cwf.k);

   protected dtk(dst<?> $$0, jh $$1, dvo $$2) {
      super($$0, $$1, $$2);
   }

   public dtk(jh $$0, dvo $$1) {
      this(dst.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azv $$0) {
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

   public cwf b(cwf $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cwf $$3 = this.e.get($$2);
         if ($$3.f() || cwf.c($$0, $$3)) {
            int $$4 = Math.min($$0.L(), $$1 - $$3.L());
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
   protected xl j() {
      return xl.c("container.dispenser");
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cwf.k);
      if (!this.b_($$0)) {
         bsb.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsb.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jz<cwf> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cwf> $$0) {
      this.e = $$0;
   }

   @Override
   protected crs a(int $$0, coq $$1) {
      return new csn($$0, $$1, this);
   }
}
