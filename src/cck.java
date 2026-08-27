import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cck<E extends ccc> {
   public static bmq<bky> a(int $$0) {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$1 -> $$1.group($$1.b(btz.ac), $$1.a(btz.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eT().b()) {
                        return false;
                     } else {
                        Optional<caf> $$7 = $$1.a($$3);
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
