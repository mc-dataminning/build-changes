public class dpy extends dql {
   public static final int d = 9;
   private jr<cuo> e = jr.a(9, cuo.l);

   protected dpy(dpi<?> $$0, iz $$1, dsb $$2) {
      super($$0, $$1, $$2);
   }

   public dpy(iz $$0, dsb $$1) {
      this(dpi.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azg $$0) {
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

   public int b(cuo $$0) {
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
      this.e = jr.a(this.b(), cuo.l);
      if (!this.a_($$0)) {
         bqn.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqn.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jr<cuo> j() {
      return this.e;
   }

   @Override
   protected void a(jr<cuo> $$0) {
      this.e = $$0;
   }

   @Override
   protected cpt a(int $$0, cmv $$1) {
      return new cqm($$0, $$1, this);
   }
}
