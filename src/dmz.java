import com.mojang.serialization.MapCodec;

public class dmz extends dku {
   public static final MapCodec<dmz> a = b(dmz::new);
   private static final fdo b = dku.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   protected dmz(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   public dym a(dbn $$0) {
      return !this.m().a((dhs)$$0.q(), $$0.a()) ? dku.a(this.m(), dkw.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == jo.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      dns.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      dym $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dnu;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
