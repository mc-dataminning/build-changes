public class dyo extends dyc {
   private static final int a = 0;
   private int b = 0;

   public dyo(iv $$0, ebe $$1) {
      super(dye.t, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.b);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.b = $$0.b("OutputSignal", 0);
   }

   public int a() {
      return this.b;
   }

   public void a(int $$0) {
      this.b = $$0;
   }
}
