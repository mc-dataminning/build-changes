public abstract class esh extends esi {
   private final erx a;
   private int b = 16777215;

   public esh(int $$0, int $$1, int $$2, int $$3, tl $$4, erx $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(ewd $$0) {
   }

   public esh a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final erx a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
