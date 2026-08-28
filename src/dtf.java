public class dtf extends dtt {
   public static final int d = 9;
   private jz<cwb> e = jz.a(9, cwb.k);

   protected dtf(dso<?> $$0, jh $$1, dvj $$2) {
      super($$0, $$1, $$2);
   }

   public dtf(jh $$0, dvj $$1) {
      this(dso.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azs $$0) {
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

   public cwb b(cwb $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cwb $$3 = this.e.get($$2);
         if ($$3.f() || cwb.c($$0, $$3)) {
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
   protected xi j() {
      return xi.c("container.dispenser");
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cwb.k);
      if (!this.b_($$0)) {
         brx.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brx.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jz<cwb> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cwb> $$0) {
      this.e = $$0;
   }

   @Override
   protected cro a(int $$0, col $$1) {
      return new csj($$0, $$1, this);
   }
}
