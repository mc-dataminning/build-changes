import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cqj<E extends cqb> {
   public static bzb<bxj> a(int $$0) {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$1 -> $$1.group($$1.b(cgl.ae), $$1.a(cgl.M))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fb().f()) {
                        return false;
                     } else {
                        Optional<cnr> $$7 = $$1.a($$3);
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
