import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cax {
   public static bmn<caq> a() {
      return bop.a(
         (Function<bop.b<caq>, ? extends App<bop.c<caq>, bos<caq>>>)($$0 -> $$0.group($$0.b(bsn.aj), $$0.c(bsn.aa), $$0.c(bsn.ag), $$0.a(bsn.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.m_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cax::a)).isPresent()) {
                        cak $$6 = $$0.b($$1);
                        car.c($$4x, $$6);
                        car.c((cap)$$4x);
                        car.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(car::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cap $$0) {
      return $$0.dN().a(bsn.ag);
   }
}
