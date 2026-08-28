import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cdj {
   public static bzm<bxu> a() {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$0 -> $$0.group($$0.a(cgw.o), $$0.a(cgw.aA), $$0.a(cgw.az), $$0.c(cgw.p))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iv> $$7 = $$0.<bxu>a($$3).map(bwt::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bzo($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
