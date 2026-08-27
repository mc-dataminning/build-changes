public class ddb extends dcq {
   private int a;

   public ddb(gw $$0, dfe $$1) {
      super(dcs.s, $$0, $$1);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a = $$0.h("OutputSignal");
   }

   public int c() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
