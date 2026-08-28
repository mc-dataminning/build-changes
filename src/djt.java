import com.mojang.serialization.MapCodec;

public class djt extends dfa {
   public static final MapCodec<djt> a = b(djt::new);
   private static final int b = 20;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(dsc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, bsv $$3) {
      if (!$$3.bW() && $$3 instanceof btq && !dac.j((btq)$$3)) {
         $$3.a($$0.aj().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      dfg.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && $$2.a(dfc.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
