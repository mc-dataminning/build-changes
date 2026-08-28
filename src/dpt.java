import com.mojang.serialization.MapCodec;

public class dpt extends dno {
   public static final MapCodec<dpt> a = b(dpt::new);
   private static final fgw b = dno.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   protected dpt(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   public ebq a(ded $$0) {
      return !this.m().a((dkm)$$0.q(), $$0.a()) ? dno.a(this.m(), dnq.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == jc.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      dqn.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dqp;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
