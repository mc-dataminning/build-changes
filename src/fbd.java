public abstract class fbd extends fbe {
   private final far a;
   private int b = 16777215;

   public fbd(int $$0, int $$1, int $$2, int $$3, vu $$4, far $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(ffc $$0) {
   }

   public fbd a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final far a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
