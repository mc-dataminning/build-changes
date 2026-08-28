public abstract class fop extends fos {
   private final fod a;
   private int b = 16777215;

   public fop(int $$0, int $$1, int $$2, int $$3, wp $$4, fod $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fsr $$0) {
   }

   public fop a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fod a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
