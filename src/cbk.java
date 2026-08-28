import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbk {
   public static bzm<bxu> a(bxx $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.an().f()), $$1);
   }

   public static caw<bxu> a(bxc<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.an()), $$1);
   }

   public static caw<bxu> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static caw<bxu> a(Predicate<bxu> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$2x -> $$2x.group($$2x.c(cgw.o), $$2x.b(cgw.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bxu> $$8 = $$2x.<cgy>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g($$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bzw($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
