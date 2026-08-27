public class ddq extends dec {
   public static final int c = 9;
   private hn<cjl> f = hn.a(9, cjl.b);

   protected ddq(ddb<?> $$0, gw $$1, dfd $$2) {
      super($$0, $$1, $$2);
   }

   public ddq(gw $$0, dfd $$1) {
      this(ddb.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ash $$0) {
      this.e(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.f.size(); $$3++) {
         if (!this.f.get($$3).b() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(cjl $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected tl g() {
      return tl.c("container.dispenser");
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.f = hn.a(this.b(), cjl.b);
      if (!this.d($$0)) {
         bgy.b($$0, this.f);
      }
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bgy.a($$0, this.f);
      }
   }

   @Override
   protected hn<cjl> f() {
      return this.f;
   }

   @Override
   protected void a(hn<cjl> $$0) {
      this.f = $$0;
   }

   @Override
   protected cer a(int $$0, cbz $$1) {
      return new cfi($$0, $$1, this);
   }
}
