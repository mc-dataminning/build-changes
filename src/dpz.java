public class dpz extends dqm {
   public static final int d = 9;
   private jr<cup> e = jr.a(9, cup.l);

   protected dpz(dpj<?> $$0, iz $$1, dsc $$2) {
      super($$0, $$1, $$2);
   }

   public dpz(iz $$0, dsc $$1) {
      this(dpj.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azh $$0) {
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

   public int b(cup $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         if (this.e.get($$1).e()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected xp k() {
      return xp.c("container.dispenser");
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.e = jr.a(this.b(), cup.l);
      if (!this.a_($$0)) {
         bqo.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqo.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jr<cup> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cup> $$0) {
      this.e = $$0;
   }

   @Override
   protected cpu a(int $$0, cmw $$1) {
      return new cqn($$0, $$1, this);
   }
}
