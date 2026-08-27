public abstract class etg extends eth {
   private final esw a;
   private int b = 16777215;

   public etg(int $$0, int $$1, int $$2, int $$3, ui $$4, esw $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(exc $$0) {
   }

   public etg a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final esw a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
