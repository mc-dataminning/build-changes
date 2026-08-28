public abstract class fhr extends fhs {
   private final fhf a;
   private int b = 16777215;

   public fhr(int $$0, int $$1, int $$2, int $$3, wu $$4, fhf $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(flq $$0) {
   }

   public fhr a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fhf a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
