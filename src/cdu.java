import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cdu {
   public static bzx<byf> a() {
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$0 -> $$0.group($$0.a(chh.o), $$0.a(chh.aA), $$0.a(chh.az), $$0.c(chh.p))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<iw> $$7 = $$0.<byf>a($$3).map(bxe::dv).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bzz($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
