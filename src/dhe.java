import com.mojang.serialization.MapCodec;

public abstract class dhe extends dgv {
   protected dhe(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhe> a();

   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(aws.ag) || $$0.a(dgx.cC);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dua $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return $$1 == eqq.c && !this.aG ? true : super.a($$0, $$1);
   }
}
