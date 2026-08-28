import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxc {
   public static bwg<btc> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bwg<btc> a(Predicate<btc> $$0, Function<btc, Float> $$1, int $$2) {
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$3 -> $$3.group($$3.c(ccg.m), $$3.b(ccg.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new ccj($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
