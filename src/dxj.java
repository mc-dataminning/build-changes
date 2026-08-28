public class dxj extends dwx {
   private int a;

   public dxj(iu $$0, dzz $$1) {
      super(dwz.t, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.h("OutputSignal");
   }

   public int a() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
