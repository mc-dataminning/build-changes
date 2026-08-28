import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzy {
   public static bzc<bvy> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bzc<bvy> a(Predicate<bvy> $$0, Function<bvy, Float> $$1, int $$2) {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$3 -> $$3.group($$3.c(cfc.m), $$3.b(cfc.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new cff($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
