import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmq {
   public static bkt<bjb> a(bje $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag().f()), $$1);
   }

   public static bmc<bjb> a(bip<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ag()), $$1);
   }

   public static bmc<bjb> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bmc<bjb> a(Predicate<bjb> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$2x -> $$2x.group($$2x.c(bsc.n), $$2x.b(bsc.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bjb> $$8 = $$2x.<bse>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bil)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bld($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
