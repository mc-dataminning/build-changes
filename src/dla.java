public class dla extends dlm {
   public static final int e = 9;
   private iu<cqm> f = iu.a(9, cqm.h);

   protected dla(dkk<?> $$0, ib $$1, dnb $$2) {
      super($$0, $$1, $$2);
   }

   public dla(ib $$0, dnb $$1) {
      this(dkk.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(axd $$0) {
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

   public int a(cqm $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected vu k() {
      return vu.c("container.dispenser");
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.f = iu.a(this.b(), cqm.h);
      if (!this.c_($$0)) {
         bmx.b($$0, this.f);
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmx.a($$0, this.f);
      }
   }

   @Override
   protected iu<cqm> j() {
      return this.f;
   }

   @Override
   protected void a(iu<cqm> $$0) {
      this.f = $$0;
   }

   @Override
   protected clq a(int $$0, cit $$1) {
      return new cmj($$0, $$1, this);
   }
}
