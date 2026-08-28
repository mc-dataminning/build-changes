import com.mojang.serialization.MapCodec;

public abstract class dju extends djk {
   protected dju(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dju> a();

   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(awo.ah) || $$0.a(djm.cK);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dwv $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return $$1 == etm.c && !this.aH ? true : super.a($$0, $$1);
   }
}
