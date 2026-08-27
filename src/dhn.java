public class dhn extends dhz {
   public static final int e = 9;
   private iq<cmy> f = iq.a(9, cmy.f);

   protected dhn(dgx<?> $$0, hx $$1, djh $$2) {
      super($$0, $$1, $$2);
   }

   public dhn(hx $$0, djh $$1) {
      this(dgx.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(auv $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.f.size(); $$3++) {
         if (!this.f.get($$3).b() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(cmy $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected vf l() {
      return vf.c("container.dispenser");
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.f = iq.a(this.b(), cmy.f);
      if (!this.c_($$0)) {
         bjv.b($$0, this.f);
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bjv.a($$0, this.f);
      }
   }

   @Override
   protected iq<cmy> k() {
      return this.f;
   }

   @Override
   protected void a(iq<cmy> $$0) {
      this.f = $$0;
   }

   @Override
   protected cib a(int $$0, cfh $$1) {
      return new ciu($$0, $$1, this);
   }
}
