import com.mojang.serialization.MapCodec;

public abstract class dxa extends dno {
   protected dxa(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dxa> a();

   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(axn.ah) || $$0.a(dnq.cN);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(ebq $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return $$1 == eyp.c && !this.F ? true : super.a($$0, $$1);
   }
}
