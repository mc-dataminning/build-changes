import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbs {
   public static caw<bxu> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static caw<bxu> a(Predicate<bxu> $$0, Function<bxu, Float> $$1, int $$2) {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$3 -> $$3.group($$3.c(cgw.n), $$3.b(cgw.o)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new cgz($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
