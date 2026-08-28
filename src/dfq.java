import com.mojang.serialization.MapCodec;

public abstract class dfq extends dfh {
   protected dfq(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfq> a();

   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(avw.af) || $$0.a(dfj.cC);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return $$1 == eow.c && !this.aG ? true : super.a($$0, $$1);
   }
}
