import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cpe {
   public static bzt<cox> a() {
      return cbv.a(
         (Function<cbv.b<cox>, ? extends App<cbv.c<cox>, cby<cox>>>)($$0 -> $$0.group($$0.b(cft.al), $$0.c(cft.ac), $$0.c(cft.ai), $$0.a(cft.ap))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cpe::a)).isPresent()) {
                        cor $$6 = $$0.b($$1);
                        coy.c($$3x, $$4x, $$6);
                        coy.b((cow)$$4x);
                        coy.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(coy::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cow $$0) {
      return $$0.eb().a(cft.ai);
   }
}
