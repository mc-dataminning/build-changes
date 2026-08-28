public class dqa extends dqn {
   public static final int d = 9;
   private jr<cuq> e = jr.a(9, cuq.l);

   protected dqa(dpk<?> $$0, iz $$1, dsd $$2) {
      super($$0, $$1, $$2);
   }

   public dqa(iz $$0, dsd $$1) {
      this(dpk.f, $$0, $$1);
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

   public int b(cuq $$0) {
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
      this.e = jr.a(this.b(), cuq.l);
      if (!this.a_($$0)) {
         bqp.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqp.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jr<cuq> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cuq> $$0) {
      this.e = $$0;
   }

   @Override
   protected cpv a(int $$0, cmx $$1) {
      return new cqo($$0, $$1, this);
   }
}
