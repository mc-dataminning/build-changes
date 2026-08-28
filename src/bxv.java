import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxv {
   public static bvg<btl> a() {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$0 -> $$0.group($$0.b(ccq.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof btl $$1xx ? $$1xx : null)
                           .filter(btl::ey)
                           .filter($$1xx -> $$1xx.am() != bsw.by || $$2.ab().b(dcq.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
