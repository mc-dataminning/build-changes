import com.mojang.serialization.MapCodec;

public abstract class dwo extends dnc {
   protected dwo(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dwo> a();

   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(axe.ah) || $$0.a(dne.cN);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(ebe $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return $$1 == eyd.c && !this.F ? true : super.a($$0, $$1);
   }
}
