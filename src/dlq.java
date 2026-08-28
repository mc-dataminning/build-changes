import com.mojang.serialization.MapCodec;

public class dlq extends djl {
   public static final MapCodec<dlq> a = b(dlq::new);
   protected static final fbt b = dmj.c;

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   protected dlq(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dww $$0) {
      return true;
   }

   @Override
   public dww a(daf $$0) {
      return !this.m().a((dgk)$$0.q(), $$0.a()) ? djl.a(this.m(), djn.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      dmj.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      dww $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dml;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
