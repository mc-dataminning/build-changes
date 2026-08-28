public class dra extends drn {
   public static final int d = 9;
   private jv<cuq> e = jv.a(9, cuq.l);

   protected dra(dqj<?> $$0, jd $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   public dra(jd $$0, dtc $$1) {
      this(dqj.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ayw $$0) {
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

   public cuq b(cuq $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cuq $$3 = this.e.get($$2);
         if ($$3.e() || cuq.c($$0, $$3)) {
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
   protected wz k() {
      return wz.c("container.dispenser");
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.e = jv.a(this.b(), cuq.l);
      if (!this.b_($$0)) {
         bql.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bql.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jv<cuq> j() {
      return this.e;
   }

   @Override
   protected void a(jv<cuq> $$0) {
      this.e = $$0;
   }

   @Override
   protected cpu a(int $$0, cmw $$1) {
      return new cqo($$0, $$1, this);
   }
}
