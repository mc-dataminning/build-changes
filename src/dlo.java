import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlo extends dku {
   public static final MapCodec<dlo> a = b(dlo::new);
   private static final wv b = wv.c("container.cartography_table");

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.aw);
      }

      return btq.a;
   }

   @Nullable
   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return new bty(($$2x, $$3, $$4) -> new ctv($$2x, $$3, cua.a($$1, $$2)), b);
   }
}
