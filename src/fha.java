public abstract class fha extends fhb {
   private final fgo a;
   private int b = 16777215;

   public fha(int $$0, int $$1, int $$2, int $$3, xo $$4, fgo $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fkz $$0) {
   }

   public fha a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fgo a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
