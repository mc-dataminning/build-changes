public abstract class fsf extends fsh {
   private final frt a;
   private int b = 16777215;

   public fsf(int $$0, int $$1, int $$2, int $$3, wy $$4, frt $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fwg $$0) {
   }

   public fsf a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final frt a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
