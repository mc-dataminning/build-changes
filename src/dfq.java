import com.mojang.serialization.MapCodec;

public class dfq extends dez {
   public static final MapCodec<dfq> a = b(dfq::new);
   protected static final ewk b = dez.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dfq> a() {
      return a;
   }

   public dfq(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return !$$1.u($$2.d());
   }
}
