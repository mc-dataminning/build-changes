public abstract class foa extends fob {
   private final fno a;
   private int b = 16777215;

   public foa(int $$0, int $$1, int $$2, int $$3, xv $$4, fno $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fsb $$0) {
   }

   public foa a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fno a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
