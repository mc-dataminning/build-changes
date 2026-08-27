public abstract class epe extends epf {
   private final eov a;
   private int b = 16777215;

   public epe(int $$0, int $$1, int $$2, int $$3, sw $$4, eov $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(esp $$0) {
   }

   public epe a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final eov a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
