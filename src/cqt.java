import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cqt {
   public static caw<cqm> a() {
      return ccy.a(
         (Function<ccy.b<cqm>, ? extends App<ccy.c<cqm>, cdb<cqm>>>)($$0 -> $$0.group($$0.b(cgw.al), $$0.c(cgw.ac), $$0.c(cgw.ai), $$0.a(cgw.ap))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cqt::a)).isPresent()) {
                        cqg $$6 = $$0.b($$1);
                        cqn.c($$3x, $$4x, $$6);
                        cqn.b((cql)$$4x);
                        cqn.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cqn::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cql $$0) {
      return $$0.ec().a(cgw.ai);
   }
}
