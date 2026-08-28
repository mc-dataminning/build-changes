import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cqu<E extends cqm> {
   public static bzm<bxu> a(int $$0) {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$1 -> $$1.group($$1.b(cgw.ae), $$1.a(cgw.M))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fc().f()) {
                        return false;
                     } else {
                        Optional<coc> $$7 = $$1.a($$3);
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
