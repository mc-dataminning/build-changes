import com.mojang.serialization.MapCodec;

public abstract class dwq extends dne {
   protected dwq(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dwq> a();

   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(axg.ah) || $$0.a(dng.cN);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(ebg $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return $$1 == eyf.c && !this.F ? true : super.a($$0, $$1);
   }
}
