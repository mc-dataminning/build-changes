public abstract class fsw extends fsy {
   private final fsk a;
   private int b = 16777215;

   public fsw(int $$0, int $$1, int $$2, int $$3, wy $$4, fsk $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fwx $$0) {
   }

   public fsw a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fsk a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
