import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bso {
   public static bqq<box> a(bpa $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static bsa<box> a(bol<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static bsa<box> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bsa<box> a(Predicate<box> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$2x -> $$2x.group($$2x.c(bya.n), $$2x.b(bya.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<box> $$8 = $$2x.<byc>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bof)$$6) <= (double)$$2 && !$$6.w($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bra($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
