import com.mojang.serialization.MapCodec;

public abstract class dhv extends dhm {
   protected dhv(dur.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhv> a();

   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(awv.ag) || $$0.a(dho.cC);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dus $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return $$1 == eri.c && !this.aH ? true : super.a($$0, $$1);
   }
}
