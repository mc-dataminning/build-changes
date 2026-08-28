import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cba {
   public static cae<bxc> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static cae<bxc> a(Predicate<bxc> $$0, Function<bxc, Float> $$1, int $$2) {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$3 -> $$3.group($$3.c(cge.n), $$3.b(cge.o)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new cgh($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
