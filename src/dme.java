import com.mojang.serialization.MapCodec;

public abstract class dme extends dlu {
   protected dme(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dme> a();

   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(axa.ah) || $$0.a(dlw.cK);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dzo $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return $$1 == ewk.c && !this.E ? true : super.a($$0, $$1);
   }
}
