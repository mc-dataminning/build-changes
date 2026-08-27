public class djw extends djl {
   private int a;

   public djw(ib $$0, dme $$1) {
      super(djn.s, $$0, $$1);
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
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
