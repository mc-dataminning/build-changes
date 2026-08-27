import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bou {
   public static bky<bjg> a() {
      return boj.a(
         (Function<boj.b<bjg>, ? extends App<boj.c<bjg>, bom<bjg>>>)($$0 -> $$0.group($$0.a(bsh.n), $$0.a(bsh.ay), $$0.a(bsh.ax), $$0.c(bsh.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<gw> $$7 = $$0.<bjg>a($$3).map(biq::dl).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bla($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
