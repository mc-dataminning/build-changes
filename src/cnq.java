import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cnq {
   public static byj<cnj> a() {
      return cal.a(
         (Function<cal.b<cnj>, ? extends App<cal.c<cnj>, cao<cnj>>>)($$0 -> $$0.group($$0.b(cej.ak), $$0.c(cej.ab), $$0.c(cej.ah), $$0.a(cej.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.e_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cnq::a)).isPresent()) {
                        cnd $$6 = $$0.b($$1);
                        cnk.c($$3x, $$4x, $$6);
                        cnk.b((cni)$$4x);
                        cnk.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cnk::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cni $$0) {
      return $$0.ec().a(cej.ah);
   }
}
