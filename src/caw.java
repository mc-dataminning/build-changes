import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class caw {
   public static bwz<bvf> a() {
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$0 -> $$0.group($$0.a(cej.n), $$0.a(cej.az), $$0.a(cej.ay), $$0.c(cej.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ji> $$7 = $$0.<bvf>a($$3).map(buj::dw).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bxb($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
