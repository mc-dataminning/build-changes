import com.mojang.serialization.MapCodec;

public class dkn extends dij {
   public static final MapCodec<dkn> a = b(dkn::new);
   protected static final fal b = dlf.c;

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   protected dkn(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   public dvo a(czw $$0) {
      return !this.m().a((dfi)$$0.q(), $$0.a()) ? dij.a(this.m(), dil.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      dlf.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      dvo $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dlh;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
