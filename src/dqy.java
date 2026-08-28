public class dqy extends drl {
   public static final int d = 9;
   private jv<cuo> e = jv.a(9, cuo.l);

   protected dqy(dqh<?> $$0, jd $$1, dta $$2) {
      super($$0, $$1, $$2);
   }

   public dqy(jd $$0, dta $$1) {
      this(dqh.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ayv $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.e.size(); $$3++) {
         if (!this.e.get($$3).e() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public cuo b(cuo $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cuo $$3 = this.e.get($$2);
         if ($$3.e() || cuo.c($$0, $$3)) {
            int $$4 = Math.min($$0.H(), $$1 - $$3.H());
            if ($$4 > 0) {
               if ($$3.e()) {
                  this.a($$2, $$0.a($$4));
               } else {
                  $$0.h($$4);
                  $$3.g($$4);
               }
            }

            if ($$0.e()) {
               break;
            }
         }
      }

      return $$0;
   }

   @Override
   protected wy k() {
      return wy.c("container.dispenser");
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.e = jv.a(this.b(), cuo.l);
      if (!this.a_($$0)) {
         bqk.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqk.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jv<cuo> j() {
      return this.e;
   }

   @Override
   protected void a(jv<cuo> $$0) {
      this.e = $$0;
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return new cqm($$0, $$1, this);
   }
}
