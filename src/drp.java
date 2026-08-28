public class drp extends dre {
   private int a;

   public drp(je $$0, dua $$1) {
      super(drg.s, $$0, $$1);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.h("OutputSignal");
   }

   public int b() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
