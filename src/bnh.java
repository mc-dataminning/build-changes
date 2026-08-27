import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnh {
   public static bkt<bjb> a() {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$0 -> $$0.group($$0.b(bsc.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bjb $$1xx ? $$1xx : null)
                           .filter(bjb::eu)
                           .filter($$1xx -> $$1xx.ag() != bip.bt || $$2.X().b(cpm.J))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
