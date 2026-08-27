import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bvf {
   public static bri<bpp> a() {
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$0 -> $$0.group($$0.a(bys.n), $$0.a(bys.az), $$0.a(bys.ay), $$0.c(bys.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ib> $$7 = $$0.<bpp>a($$3).map(box::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new brk($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
