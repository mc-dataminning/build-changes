import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class ccv {
   public static bnd<bll> a(int $$0) {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$1 -> $$1.group($$1.b(bum.K), $$1.c(bum.ac), $$1.c(bum.af), $$1.c(bum.ae))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$4x, $$5x, $$6) -> {
                     cas $$7 = $$1.b($$2);
                     if (!ccq.a($$7.q())) {
                        return false;
                     } else {
                        $$3.a(true, (long)$$0);
                        return true;
                     }
                  }))
      );
   }
}
