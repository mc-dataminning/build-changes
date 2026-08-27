import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqz {
   public static bnd<bll> a() {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$0 -> $$0.group($$0.a(bum.n), $$0.a(bum.ay), $$0.a(bum.ax), $$0.c(bum.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<hx> $$7 = $$0.<bll>a($$3).map(bkv::dn).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bnf($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
