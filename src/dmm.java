import com.mojang.serialization.MapCodec;

public class dmm extends dfa {
   public static final MapCodec<dmm> a = b(dmm::new);
   protected static final ewl b = dfa.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   public dmm(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected ewl b_(dsd $$0, dbf $$1, iz $$2) {
      return ewi.b();
   }

   @Override
   protected ewl c(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return ewi.b();
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

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   protected float d(dsd $$0, dbf $$1, iz $$2) {
      return 0.2F;
   }
}
