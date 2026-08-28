public abstract class fhd extends fhe {
   private final fgr a;
   private int b = 16777215;

   public fhd(int $$0, int $$1, int $$2, int $$3, xp $$4, fgr $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(flc $$0) {
   }

   public fhd a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fgr a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
