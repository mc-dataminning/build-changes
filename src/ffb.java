public abstract class ffb extends ffc {
   private final fep a;
   private int b = 16777215;

   public ffb(int $$0, int $$1, int $$2, int $$3, wu $$4, fep $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fja $$0) {
   }

   public ffb a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fep a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
