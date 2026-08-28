import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cpu {
   public static cae<cpn> a() {
      return ccg.a(
         (Function<ccg.b<cpn>, ? extends App<ccg.c<cpn>, ccj<cpn>>>)($$0 -> $$0.group($$0.b(cge.al), $$0.c(cge.ac), $$0.c(cge.ai), $$0.a(cge.ap))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cpu::a)).isPresent()) {
                        cph $$6 = $$0.b($$1);
                        cpo.c($$3x, $$4x, $$6);
                        cpo.b((cpm)$$4x);
                        cpo.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cpo::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cpm $$0) {
      return $$0.eb().a(cge.ai);
   }
}
