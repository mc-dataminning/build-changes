import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cgy<E extends cgq> {
   public static bqq<box> a(int $$0) {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$1 -> $$1.group($$1.b(bya.ad), $$1.a(bya.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eS().b()) {
                        return false;
                     } else {
                        Optional<cel> $$7 = $$1.a($$3);
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
