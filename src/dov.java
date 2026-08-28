import com.mojang.serialization.MapCodec;

public class dov extends dfi {
   public static final MapCodec<dov> a = b(dov::new);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   public dov(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      ewh $$4 = new ewh(0.25, 0.05F, 0.25);
      if ($$3 instanceof btc $$5 && $$5.b(brr.K)) {
         $$4 = new ewh(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
