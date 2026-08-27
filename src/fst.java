public class fst extends fun<bux, fet<bux>> {
   private static final aew a = new aew("textures/entity/fish/cod.png");

   public fst(fth.a $$0) {
      super($$0, new fet<>($$0.a(fib.u)), 0.3F);
   }

   public aew a(bux $$0) {
      return a;
   }

   protected void a(bux $$0, elp $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * arw.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
