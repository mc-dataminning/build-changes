import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzg {
   public static bvj<btp> a() {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$0 -> $$0.group($$0.a(cct.n), $$0.a(cct.az), $$0.a(cct.ay), $$0.c(cct.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iz> $$7 = $$0.<btp>a($$3).map(bsu::dp).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bvl($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
