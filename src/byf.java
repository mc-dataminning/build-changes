import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byf {
   public static bui<bso> a() {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$0 -> $$0.group($$0.a(cbs.n), $$0.a(cbs.az), $$0.a(cbs.ay), $$0.c(cbs.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<io> $$7 = $$0.<bso>a($$3).map(bru::dp).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new buk($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
