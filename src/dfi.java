import com.mojang.serialization.MapCodec;

public abstract class dfi extends dez {
   protected dfi(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfi> a();

   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(awp.af) || $$0.a(dfb.cC);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return $$1 == eok.c && !this.aG ? true : super.a($$0, $$1);
   }
}
