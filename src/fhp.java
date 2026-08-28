public abstract class fhp extends fhq {
   private final fhd a;
   private int b = 16777215;

   public fhp(int $$0, int $$1, int $$2, int $$3, wu $$4, fhd $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(flo $$0) {
   }

   public fhp a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fhd a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
