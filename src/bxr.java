import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxr {
   public static bwv<btr> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bwv<btr> a(Predicate<btr> $$0, Function<btr, Float> $$1, int $$2) {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$3 -> $$3.group($$3.c(ccv.m), $$3.b(ccv.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new ccy($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
