import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwu {
   public static bsx<bre> a() {
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$0 -> $$0.group($$0.a(cah.n), $$0.a(cah.az), $$0.a(cah.ay), $$0.c(cah.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<im> $$7 = $$0.<bre>a($$3).map(bql::dn).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bsz($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
