import com.mojang.serialization.MapCodec;

public abstract class dfo extends dff {
   protected dfo(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfo> a();

   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(avu.af) || $$0.a(dfh.cC);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return $$1 == eoq.c && !this.aG ? true : super.a($$0, $$1);
   }
}
