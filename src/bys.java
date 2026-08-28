import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bys {
   public static bwu<bva> a(bvd $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ar().f()), $$1);
   }

   public static bye<bva> a(bul<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ar()), $$1);
   }

   public static bye<bva> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bye<bva> a(Predicate<bva> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$2x -> $$2x.group($$2x.c(cee.n), $$2x.b(cee.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bva> $$8 = $$2x.<ceg>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bue)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bxe($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
