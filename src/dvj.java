import com.mojang.serialization.MapCodec;

public abstract class dvj extends dma {
   protected dvj(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dvj> a();

   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(axc.ah) || $$0.a(dmc.cL);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dzz $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return $$1 == ewv.c && !this.E ? true : super.a($$0, $$1);
   }
}
