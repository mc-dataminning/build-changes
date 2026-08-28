public class dpx extends dqk {
   public static final int d = 9;
   private jr<cun> e = jr.a(9, cun.l);

   protected dpx(dph<?> $$0, iz $$1, dsa $$2) {
      super($$0, $$1, $$2);
   }

   public dpx(iz $$0, dsa $$1) {
      this(dph.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azf $$0) {
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

   public int b(cun $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         if (this.e.get($$1).e()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected xo k() {
      return xo.c("container.dispenser");
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.e = jr.a(this.b(), cun.l);
      if (!this.a_($$0)) {
         bqm.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqm.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jr<cun> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cun> $$0) {
      this.e = $$0;
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return new cql($$0, $$1, this);
   }
}
