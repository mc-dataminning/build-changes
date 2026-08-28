import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cqv {
   public static cay<cqo> a() {
      return cda.a(
         (Function<cda.b<cqo>, ? extends App<cda.c<cqo>, cdd<cqo>>>)($$0 -> $$0.group($$0.b(cgy.al), $$0.c(cgy.ac), $$0.c(cgy.ai), $$0.a(cgy.ap))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cqv::a)).isPresent()) {
                        cqi $$6 = $$0.b($$1);
                        cqp.c($$3x, $$4x, $$6);
                        cqp.b((cqn)$$4x);
                        cqp.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cqp::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cqn $$0) {
      return $$0.ec().a(cgy.ai);
   }
}
