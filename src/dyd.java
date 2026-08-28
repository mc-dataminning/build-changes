public class dyd extends dxr {
   private int a;

   public dyd(iv $$0, eat $$1) {
      super(dxt.t, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.f("OutputSignal");
   }

   public int a() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
