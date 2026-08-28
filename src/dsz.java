public class dsz extends dtn {
   public static final int d = 9;
   private jy<cvx> e = jy.a(9, cvx.k);

   protected dsz(dsi<?> $$0, jg $$1, dvd $$2) {
      super($$0, $$1, $$2);
   }

   public dsz(jg $$0, dvd $$1) {
      this(dsi.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azr $$0) {
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

   public cvx b(cvx $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cvx $$3 = this.e.get($$2);
         if ($$3.f() || cvx.c($$0, $$3)) {
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
   protected xh j() {
      return xh.c("container.dispenser");
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.e = jy.a(this.b(), cvx.k);
      if (!this.b_($$0)) {
         brs.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brs.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jy<cvx> f() {
      return this.e;
   }

   @Override
   protected void a(jy<cvx> $$0) {
      this.e = $$0;
   }

   @Override
   protected crj a(int $$0, cog $$1) {
      return new cse($$0, $$1, this);
   }
}
