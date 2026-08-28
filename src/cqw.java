import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cqw<E extends cqo> {
   public static bzo<bxw> a(int $$0) {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$1 -> $$1.group($$1.b(cgy.ae), $$1.a(cgy.M))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fc().f()) {
                        return false;
                     } else {
                        Optional<coe> $$7 = $$1.a($$3);
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
