import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbh {
   public static cal<bxj> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static cal<bxj> a(Predicate<bxj> $$0, Function<bxj, Float> $$1, int $$2) {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$3 -> $$3.group($$3.c(cgl.n), $$3.b(cgl.o)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new cgo($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
