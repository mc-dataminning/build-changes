import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cot<E extends cok> {
   public static bxz<bwf> a(int $$0) {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$1 -> $$1.group($$1.b(cfj.ad), $$1.a(cfj.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fa().f()) {
                        return false;
                     } else {
                        Optional<cma> $$7 = $$1.a($$3);
                        if ($$7.isPresent() && $$7.get().a($$5, (double)$$0)) {
                           return false;
                        } else {
                           $$2.b();
                           return true;
                        }
                     }
                  }))
      );
   }
}
