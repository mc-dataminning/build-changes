public class fsz extends fsf<byw, fez<byw>> {
   private static final aew a = new aew("textures/entity/zombie/drowned.png");

   public fsz(fth.a $$0) {
      super($$0, new fez<>($$0.a(fib.L)), new fez<>($$0.a(fib.M)), new fez<>($$0.a(fib.N)));
      this.a(new fwx<>(this, $$0.f()));
   }

   @Override
   public aew a(cab $$0) {
      return a;
   }

   protected void a(byw $$0, elp $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = $$0.a($$4);
      if ($$5 > 0.0F) {
         float $$6 = -10.0F - $$0.dD();
         float $$7 = arw.i($$5, 0.0F, $$6);
         $$1.a(a.b.rotationDegrees($$7), 0.0F, $$0.dg() / 2.0F, 0.0F);
      }
   }
}
