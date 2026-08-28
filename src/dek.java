import com.mojang.serialization.MapCodec;

public abstract class dek extends deu {
   protected static final int a = 2;
   protected static final ewf b = deu.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dek(drw.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dek> a();

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return a($$1, $$2.d(), je.b);
   }
}
