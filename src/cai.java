import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cai {
   public static bly<cab> a() {
      return boa.a(
         (Function<boa.b<cab>, ? extends App<boa.c<cab>, bod<cab>>>)($$0 -> $$0.group($$0.b(bry.aj), $$0.c(bry.aa), $$0.c(bry.ag), $$0.a(bry.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.i_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cai::a)).isPresent()) {
                        bzv $$6 = $$0.b($$1);
                        cac.c($$4x, $$6);
                        cac.c((caa)$$4x);
                        cac.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cac::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(caa $$0) {
      return $$0.dM().a(bry.ag);
   }
}
