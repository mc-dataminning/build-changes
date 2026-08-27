import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcr extends dby {
   public static final MapCodec<dcr> a = b(dcr::new);
   private static final wg b = wg.c("container.cartography_table");

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   protected dcr(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auw.aw);
         return boa.b;
      }
   }

   @Nullable
   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      return new bok(($$2x, $$3, $$4) -> new cmv($$2x, $$3, cna.a($$1, $$2)), b);
   }
}
