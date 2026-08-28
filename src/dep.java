import com.mojang.serialization.MapCodec;

public abstract class dep extends dez {
   protected static final int a = 2;
   protected static final ewk b = dez.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dep(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dep> a();

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return a($$1, $$2.d(), je.b);
   }
}
