import com.mojang.serialization.MapCodec;

public class dku extends diq {
   public static final MapCodec<dku> a = b(dku::new);
   protected static final fas b = dlm.c;

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   protected dku(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   public dvv a(dad $$0) {
      return !this.m().a((dfp)$$0.q(), $$0.a()) ? diq.a(this.m(), dis.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == jm.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      dlm.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      dvv $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dlo;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
