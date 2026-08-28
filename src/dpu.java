public class dpu extends dqh {
   public static final int d = 9;
   private jr<cuk> e = jr.a(9, cuk.l);

   protected dpu(dpe<?> $$0, iz $$1, drx $$2) {
      super($$0, $$1, $$2);
   }

   public dpu(iz $$0, drx $$1) {
      this(dpe.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azc $$0) {
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

   public int b(cuk $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         if (this.e.get($$1).e()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected xl k() {
      return xl.c("container.dispenser");
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.e = jr.a(this.b(), cuk.l);
      if (!this.a_($$0)) {
         bqj.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqj.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jr<cuk> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cuk> $$0) {
      this.e = $$0;
   }

   @Override
   protected cpp a(int $$0, cmr $$1) {
      return new cqi($$0, $$1, this);
   }
}
