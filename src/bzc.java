import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzc {
   public static bwp<buv> a(Function<buv, Optional<byc>> $$0, Predicate<buv> $$1, int $$2, int $$3, float $$4) {
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$5 -> $$5.group($$5.a(cdz.n), $$5.a(cdz.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<byc> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        byc $$11 = $$10.get();
                        if ($$8.dv().a((jz)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           byc $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cec($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
