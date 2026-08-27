import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqu {
   public static bmy<blg> a() {
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$0 -> $$0.group($$0.a(buh.n), $$0.a(buh.ay), $$0.a(buh.ax), $$0.c(buh.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ht> $$7 = $$0.<blg>a($$3).map(bkq::dn).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bna($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
