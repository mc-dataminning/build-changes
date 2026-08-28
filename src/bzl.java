import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzl {
   public static bwy<bve> a(Function<bve, Optional<byl>> $$0, Predicate<bve> $$1, int $$2, int $$3, float $$4) {
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$5 -> $$5.group($$5.a(cei.n), $$5.a(cei.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<byl> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        byl $$11 = $$10.get();
                        if ($$8.dw().a((ka)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           byl $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new cel($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
