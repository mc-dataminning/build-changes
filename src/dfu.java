import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfu extends dfb {
   public static final MapCodec<dfu> a = b(dfu::new);
   private static final xp b = xp.c("container.cartography_table");

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   protected dfu(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.aw);
         return bqw.c;
      }
   }

   @Nullable
   @Override
   protected bra b(dse $$0, dca $$1, iz $$2) {
      return new brg(($$2x, $$3, $$4) -> new cqc($$2x, $$3, cqh.a($$1, $$2)), b);
   }
}
