import com.mojang.serialization.MapCodec;

public class djq extends dhm {
   public static final MapCodec<djq> a = b(djq::new);
   protected static final ezq b = dkj.c;

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   protected djq(dur.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   public dus a(czn $$0) {
      return !this.n().a((dem)$$0.q(), $$0.a()) ? dhm.a(this.n(), dho.j.n(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == jk.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      dkj.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      dus $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dkl;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
