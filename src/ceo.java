import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ceo<E extends ceg> {
   public static bog<bmo> a(int $$0) {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$1 -> $$1.group($$1.b(bvq.ad), $$1.a(bvq.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eU().b()) {
                        return false;
                     } else {
                        Optional<ccb> $$7 = $$1.a($$3);
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
