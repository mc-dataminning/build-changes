import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqm {
   public static bmq<bky> a() {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$0 -> $$0.group($$0.a(btz.n), $$0.a(btz.ay), $$0.a(btz.ax), $$0.c(btz.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ht> $$7 = $$0.<bky>a($$3).map(bki::dl).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bms($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
