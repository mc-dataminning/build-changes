import com.mojang.serialization.MapCodec;

public class dds extends dby {
   public static final MapCodec<dds> a = b(dds::new);
   private static final wg b = wg.c("container.crafting");

   @Override
   public MapCodec<? extends dds> a() {
      return a;
   }

   protected dds(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auw.an);
         return boa.b;
      }
   }

   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      return new bok(($$2x, $$3, $$4) -> new cng($$2x, $$3, cna.a($$1, $$2)), b);
   }
}
