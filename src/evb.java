public abstract class evb extends evc {
   private final eur a;
   private int b = 16777215;

   public evb(int $$0, int $$1, int $$2, int $$3, uv $$4, eur $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(eyx $$0) {
   }

   public evb a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final eur a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
