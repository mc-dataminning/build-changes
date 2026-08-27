import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxq {
   public static btt<bsa> a() {
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$0 -> $$0.group($$0.a(cbd.n), $$0.a(cbd.az), $$0.a(cbd.ay), $$0.c(cbd.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<in> $$7 = $$0.<bsa>a($$3).map(brh::dn).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new btv($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
