import com.mojang.serialization.MapCodec;

public class doh extends deu {
   public static final MapCodec<doh> a = b(doh::new);

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   public doh(drw.d $$0) {
      super($$0);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      evm $$4 = new evm(0.25, 0.05F, 0.25);
      if ($$3 instanceof btk $$5 && $$5.b(brz.K)) {
         $$4 = new evm(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
