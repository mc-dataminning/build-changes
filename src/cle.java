import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cle {
   public static bwc<ckx> a() {
      return bye.a(
         (Function<bye.b<ckx>, ? extends App<bye.c<ckx>, byh<ckx>>>)($$0 -> $$0.group($$0.b(ccc.ak), $$0.c(ccc.ab), $$0.c(ccc.ah), $$0.a(ccc.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cle::a)).isPresent()) {
                        ckr $$6 = $$0.b($$1);
                        cky.c($$4x, $$6);
                        cky.c((ckw)$$4x);
                        cky.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cky::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(ckw $$0) {
      return $$0.dT().a(ccc.ah);
   }
}
