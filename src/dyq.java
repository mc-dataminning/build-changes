public class dyq extends dye {
   private static final int a = 0;
   private int b = 0;

   public dyq(iw $$0, ebg $$1) {
      super(dyg.t, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.b);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
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
