import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cav {
   public static bwy<bve> a() {
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$0 -> $$0.group($$0.a(cei.n), $$0.a(cei.az), $$0.a(cei.ay), $$0.c(cei.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<jh> $$7 = $$0.<bve>a($$3).map(bui::dy).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bxa($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
