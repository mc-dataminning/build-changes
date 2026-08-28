public abstract class fid extends fie {
   private final fhr a;
   private int b = 16777215;

   public fid(int $$0, int $$1, int $$2, int $$3, wy $$4, fhr $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   protected void a(fmc $$0) {
   }

   public fid a(int $$0) {
      this.b = $$0;
      return this;
   }

   protected final fhr a() {
      return this.a;
   }

   protected final int b() {
      return this.b;
   }
}
