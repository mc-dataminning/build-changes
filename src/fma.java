public abstract class fma extends fmb {
   private final flo a;
   private int b = 16777215;

   public fma(int $$0, int $$1, int $$2, int $$3, xj $$4, flo $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fqb $$0) {
   }

   public fma a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final flo a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
