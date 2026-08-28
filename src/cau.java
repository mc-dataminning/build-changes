import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cau {
   public static byw<bxe> a(bxh $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq().f()), $$1);
   }

   public static cag<bxe> a(bwo<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.aq()), $$1);
   }

   public static cag<bxe> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static cag<bxe> a(Predicate<bxe> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cci.a(
         (Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$2x -> $$2x.group($$2x.c(cgg.o), $$2x.b(cgg.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bxe> $$8 = $$2x.<cgi>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g($$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bzg($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
