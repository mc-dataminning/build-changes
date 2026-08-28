public class csu extends cua {
   private final cst a;

   public csu(bse $$0, int $$1, int $$2, int $$3, cst $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
   }

   @Override
   public boolean a(cwq $$0) {
      return !this.a.e(this.d) && super.a($$0);
   }

   @Override
   public void c() {
      super.c();
      this.a.a(this.c);
   }
}
