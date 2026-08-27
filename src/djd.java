import com.mojang.serialization.MapCodec;

public class djd extends dds {
   public static final MapCodec<djd> b = b(djd::new);
   private static final wg c = wg.c("container.upgrade");

   @Override
   public MapCodec<djd> a() {
      return b;
   }

   protected djd(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      return new bok(($$2x, $$3, $$4) -> new col($$2x, $$3, cna.a($$1, $$2)), c);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auw.aF);
         return boa.b;
      }
   }
}
