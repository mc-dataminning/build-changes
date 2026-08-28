import com.mojang.serialization.MapCodec;

public abstract class dhs extends dhj {
   protected dhs(dun.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhs> a();

   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(awt.ag) || $$0.a(dhl.cC);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(duo $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return $$1 == ere.c && !this.aH ? true : super.a($$0, $$1);
   }
}
