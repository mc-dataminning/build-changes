public class dsx extends dsm {
   private int a;

   public dsx(jh $$0, dvj $$1) {
      super(dso.s, $$0, $$1);
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
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
