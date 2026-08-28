public class dtr extends duf {
   public static final int d = 9;
   private jz<cwm> e = jz.a(9, cwm.k);

   protected dtr(dta<?> $$0, jh $$1, dvv $$2) {
      super($$0, $$1, $$2);
   }

   public dtr(jh $$0, dvv $$1) {
      this(dta.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azu $$0) {
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

   public cwm b(cwm $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cwm $$3 = this.e.get($$2);
         if ($$3.f() || cwm.c($$0, $$3)) {
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
   protected xj j() {
      return xj.c("container.dispenser");
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cwm.k);
      if (!this.b_($$0)) {
         bse.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bse.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jz<cwm> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cwm> $$0) {
      this.e = $$0;
   }

   @Override
   protected crz a(int $$0, cot $$1) {
      return new csu($$0, $$1, this);
   }
}
