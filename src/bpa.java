import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpa {
   public static ble<bjm> a() {
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$0 -> $$0.group($$0.a(bsn.n), $$0.a(bsn.ay), $$0.a(bsn.ax), $$0.c(bsn.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<gw> $$7 = $$0.<bjm>a($$3).map(biw::dl).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new blg($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
