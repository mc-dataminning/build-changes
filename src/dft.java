import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dft extends dfa {
   public static final MapCodec<dft> a = b(dft::new);
   private static final xp b = xp.c("container.cartography_table");

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   protected dft(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.aw);
         return bqv.c;
      }
   }

   @Nullable
   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      return new brf(($$2x, $$3, $$4) -> new cqb($$2x, $$3, cqg.a($$1, $$2)), b);
   }
}
