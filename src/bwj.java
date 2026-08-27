import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwj {
   public static bsm<bqt> a() {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$0 -> $$0.group($$0.a(bzw.n), $$0.a(bzw.az), $$0.a(bzw.ay), $$0.c(bzw.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<id> $$7 = $$0.<bqt>a($$3).map(bqa::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bso($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
