import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxk {
   public static buv<btb> a() {
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$0 -> $$0.group($$0.b(ccf.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof btb $$1xx ? $$1xx : null)
                           .filter(btb::ey)
                           .filter($$1xx -> $$1xx.al() != bsm.by || $$2.ab().b(dcb.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
