class arf extends aqw {
   private static final int a = aqr.b + 1;
   private final arb b;
   private final djm c;

   public arf(arb $$0, djm $$1) {
      super(a + 1, 16, 256);
      this.b = $$0;
      this.c = $$1;
      $$1.a(this::b);
   }

   @Override
   protected int b(long $$0) {
      return this.c.a($$0, false);
   }

   @Override
   protected int c(long $$0) {
      if (!this.b.a($$0)) {
         aqq $$1 = this.b.b($$0);
         if ($$1 != null) {
            return $$1.j();
         }
      }

      return a;
   }

   @Override
   protected void a(long $$0, int $$1) {
      aqq $$2 = this.b.b($$0);
      int $$3 = $$2 == null ? a : $$2.j();
      if ($$3 != $$1) {
         $$2 = this.b.a($$0, $$1, $$2, $$3);
         if ($$2 != null) {
            this.b.b.add($$2);
         }
      }
   }

   public int a(int $$0) {
      return this.b($$0);
   }
}
