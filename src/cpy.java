import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cpy {
   public static cag<cpr> a() {
      return cci.a(
         (Function<cci.b<cpr>, ? extends App<cci.c<cpr>, ccl<cpr>>>)($$0 -> $$0.group($$0.b(cgg.al), $$0.c(cgg.ac), $$0.c(cgg.ai), $$0.a(cgg.ap))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cpy::a)).isPresent()) {
                        cpl $$6 = $$0.b($$1);
                        cps.c($$3x, $$4x, $$6);
                        cps.b((cpq)$$4x);
                        cps.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cps::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cpq $$0) {
      return $$0.ec().a(cgg.ai);
   }
}
