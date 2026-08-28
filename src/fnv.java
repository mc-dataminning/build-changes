public abstract class fnv extends fnw {
   private final fnj a;
   private int b = 16777215;

   public fnv(int $$0, int $$1, int $$2, int $$3, xv $$4, fnj $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(frw $$0) {
   }

   public fnv a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fnj a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
