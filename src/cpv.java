import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cpv<E extends cpn> {
   public static byu<bxc> a(int $$0) {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$1 -> $$1.group($$1.b(cge.ae), $$1.a(cge.M))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fb().f()) {
                        return false;
                     } else {
                        Optional<cnd> $$7 = $$1.a($$3);
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
