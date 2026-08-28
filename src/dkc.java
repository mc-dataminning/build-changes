import com.mojang.serialization.MapCodec;

public class dkc extends dhy {
   public static final MapCodec<dkc> a = b(dkc::new);
   protected static final fab b = dku.c;

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   protected dkc(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   public dvd a(czm $$0) {
      return !this.m().a((dey)$$0.q(), $$0.a()) ? dhy.a(this.m(), dia.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      dku.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dkw;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
