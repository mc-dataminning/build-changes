import com.mojang.serialization.MapCodec;

public abstract class dfr extends dfi {
   protected dfr(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfr> a();

   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(avw.af) || $$0.a(dfk.cC);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dsl $$0, dbm $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return $$1 == eoy.c && !this.aG ? true : super.a($$0, $$1);
   }
}
