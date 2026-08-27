public abstract class fdm extends fdn {
   private final fda a;
   private int b = 16777215;

   public fdm(int $$0, int $$1, int $$2, int $$3, wg $$4, fda $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fhl $$0) {
   }

   public fdm a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fda a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
