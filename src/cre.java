import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cre {
   public static cbh<cqx> a() {
      return cdj.a(
         (Function<cdj.b<cqx>, ? extends App<cdj.c<cqx>, cdm<cqx>>>)($$0 -> $$0.group($$0.b(chh.al), $$0.c(chh.ac), $$0.c(chh.ai), $$0.a(chh.ap))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.e_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cre::a)).isPresent()) {
                        cqr $$6 = $$0.b($$1);
                        cqy.c($$3x, $$4x, $$6);
                        cqy.b((cqw)$$4x);
                        cqy.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cqy::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cqw $$0) {
      return $$0.ec().a(chh.ai);
   }
}
