import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnm {
   public static bky<bjg> a() {
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$0 -> $$0.group($$0.b(bsh.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bjg $$1xx ? $$1xx : null)
                           .filter(bjg::ev)
                           .filter($$1xx -> $$1xx.ah() != biu.bt || $$2.X().b(cpr.J))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
