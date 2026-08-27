public abstract class esi extends esj {
   private final ery a;
   private int b = 16777215;

   public esi(int $$0, int $$1, int $$2, int $$3, ti $$4, ery $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(ewd $$0) {
   }

   public esi a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final ery a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
