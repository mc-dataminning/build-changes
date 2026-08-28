import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cqi {
   public static cal<cqb> a() {
      return ccn.a(
         (Function<ccn.b<cqb>, ? extends App<ccn.c<cqb>, ccq<cqb>>>)($$0 -> $$0.group($$0.b(cgl.al), $$0.c(cgl.ac), $$0.c(cgl.ai), $$0.a(cgl.ap))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cqi::a)).isPresent()) {
                        cpv $$6 = $$0.b($$1);
                        cqc.c($$3x, $$4x, $$6);
                        cqc.b((cqa)$$4x);
                        cqc.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cqc::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cqa $$0) {
      return $$0.eb().a(cgl.ai);
   }
}
