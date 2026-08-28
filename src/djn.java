import com.mojang.serialization.MapCodec;

public class djn extends deu {
   public static final MapCodec<djn> a = b(djn::new);
   private static final int b = 20;

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   public djn(drw.d $$0) {
      super($$0);
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, bsp $$3) {
      if (!$$3.bW() && $$3 instanceof btk && !czw.j((btk)$$3)) {
         $$3.a($$0.aj().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      dfa.b($$1, $$2.c(), $$0);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && $$2.a(dew.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
