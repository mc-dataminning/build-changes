public abstract class fsr extends fst {
   private final fsf a;
   private int b = 16777215;

   public fsr(int $$0, int $$1, int $$2, int $$3, wy $$4, fsf $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fws $$0) {
   }

   public fsr a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fsf a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
