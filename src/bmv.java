import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmv {
   public static bky<bjg> a(bjj $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ah().f()), $$1);
   }

   public static bmh<bjg> a(biu<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ah()), $$1);
   }

   public static bmh<bjg> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bmh<bjg> a(Predicate<bjg> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$2x -> $$2x.group($$2x.c(bsh.n), $$2x.b(bsh.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bjg> $$8 = $$2x.<bsj>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((biq)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bli($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
