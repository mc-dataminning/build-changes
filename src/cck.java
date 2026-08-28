import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cck {
   public static bzx<byf> a(Function<byf, Optional<cbk>> $$0, Predicate<byf> $$1, int $$2, int $$3, float $$4) {
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$5 -> $$5.group($$5.a(chh.o), $$5.a(chh.n))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<cbk> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        cbk $$11 = $$10.get();
                        if ($$8.dt().a((jq)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           cbk $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new chk($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
