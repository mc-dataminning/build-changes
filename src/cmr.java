import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cmr {
   public static bxn<cmk> a() {
      return bzp.a(
         (Function<bzp.b<cmk>, ? extends App<bzp.c<cmk>, bzs<cmk>>>)($$0 -> $$0.group($$0.b(cdn.ak), $$0.c(cdn.ab), $$0.c(cdn.ah), $$0.a(cdn.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cmr::a)).isPresent()) {
                        cme $$6 = $$0.b($$1);
                        cml.c($$4x, $$6);
                        cml.c((cmj)$$4x);
                        cml.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cml::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cmj $$0) {
      return $$0.dX().a(cdn.ah);
   }
}
