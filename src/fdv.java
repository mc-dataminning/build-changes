public abstract class fdv extends fdw {
   private final fdj a;
   private int b = 16777215;

   public fdv(int $$0, int $$1, int $$2, int $$3, wi $$4, fdj $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fhu $$0) {
   }

   public fdv a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fdj a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
