import com.mojang.serialization.MapCodec;

public abstract class djv extends djl {
   protected djv(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djv> a();

   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(awp.ah) || $$0.a(djn.cK);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dww $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return $$1 == etn.c && !this.aH ? true : super.a($$0, $$1);
   }
}
