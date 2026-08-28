import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cqf {
   public static cal<cpy> a() {
      return ccn.a(
         (Function<ccn.b<cpy>, ? extends App<ccn.c<cpy>, ccq<cpy>>>)($$0 -> $$0.group($$0.b(cgl.al), $$0.c(cgl.ac), $$0.c(cgl.ai), $$0.a(cgl.ap))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cqf::a)).isPresent()) {
                        cps $$6 = $$0.b($$1);
                        cpz.c($$3x, $$4x, $$6);
                        cpz.b((cpx)$$4x);
                        cpz.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cpz::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cpx $$0) {
      return $$0.eb().a(cgl.ai);
   }
}
