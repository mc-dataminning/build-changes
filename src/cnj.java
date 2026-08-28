import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cnj<E extends cnb> {
   public static bwu<bva> a(int $$0) {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$1 -> $$1.group($$1.b(cee.ad), $$1.a(cee.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fc().f()) {
                        return false;
                     } else {
                        Optional<ckv> $$7 = $$1.a($$3);
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
