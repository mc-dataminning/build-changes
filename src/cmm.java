import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cmm {
   public static bxi<cmf> a() {
      return bzk.a(
         (Function<bzk.b<cmf>, ? extends App<bzk.c<cmf>, bzn<cmf>>>)($$0 -> $$0.group($$0.b(cdi.ak), $$0.c(cdi.ab), $$0.c(cdi.ah), $$0.a(cdi.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cmm::a)).isPresent()) {
                        clz $$6 = $$0.b($$1);
                        cmg.c($$4x, $$6);
                        cmg.c((cme)$$4x);
                        cmg.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cmg::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cme $$0) {
      return $$0.dX().a(cdi.ah);
   }
}
