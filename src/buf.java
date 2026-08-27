import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class buf {
   public static bsh<bqo> a(bqr $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static btr<bqo> a(bqb<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static btr<bqo> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static btr<bqo> a(Predicate<bqo> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$2x -> $$2x.group($$2x.c(bzr.n), $$2x.b(bzr.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bqo> $$8 = $$2x.<bzt>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bpv)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bsr($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
