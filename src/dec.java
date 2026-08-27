import com.mojang.serialization.MapCodec;

public class dec extends dby {
   public static final MapCodec<dec> a = b(dec::new);
   protected static final est b = dev.c;

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   protected dec(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   public doz a(cuo $$0) {
      return !this.n().a((cza)$$0.q(), $$0.a()) ? dby.a(this.n(), dca.j.n(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      dev.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      doz $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dex;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
