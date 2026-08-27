public class dmx extends dnk {
   public static final int e = 9;
   private iu<crj> f = iu.a(9, crj.i);

   protected dmx(dmh<?> $$0, ib $$1, doz $$2) {
      super($$0, $$1, $$2);
   }

   public dmx(ib $$0, doz $$1) {
      this(dmh.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(axr $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.f.size(); $$3++) {
         if (!this.f.get($$3).d() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(crj $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).d()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected wg k() {
      return wg.c("container.dispenser");
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.f = iu.a(this.b(), crj.i);
      if (!this.a_($$0)) {
         bnu.b($$0, this.f, $$1);
      }
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnu.a($$0, this.f, $$1);
      }
   }

   @Override
   protected iu<crj> j() {
      return this.f;
   }

   @Override
   protected void a(iu<crj> $$0) {
      this.f = $$0;
   }

   @Override
   protected cmp a(int $$0, cjs $$1) {
      return new cni($$0, $$1, this);
   }
}
