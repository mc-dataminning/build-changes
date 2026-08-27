public class fst extends fun<bux, fet<bux>> {
   private static final aex a = new aex("textures/entity/fish/cod.png");

   public fst(fth.a $$0) {
      super($$0, new fet<>($$0.a(fib.u)), 0.3F);
   }

   public aex a(bux $$0) {
      return a;
   }

   protected void a(bux $$0, elp $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * arx.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aY()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
