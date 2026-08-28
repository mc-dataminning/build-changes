import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byp {
   public static bus<bsy> a() {
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$0 -> $$0.group($$0.a(ccc.n), $$0.a(ccc.az), $$0.a(ccc.ay), $$0.c(ccc.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ja> $$7 = $$0.<bsy>a($$3).map(bsd::dp).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new buu($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
