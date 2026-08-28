public abstract class fpm extends fpo {
   private final fpa a;
   private int b = 16777215;

   public fpm(int $$0, int $$1, int $$2, int $$3, wp $$4, fpa $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(ftn $$0) {
   }

   public fpm a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fpa a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
