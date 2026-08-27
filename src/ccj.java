import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class ccj {
   public static bnz<ccc> a() {
      return bqb.a(
         (Function<bqb.b<ccc>, ? extends App<bqb.c<ccc>, bqe<ccc>>>)($$0 -> $$0.group($$0.b(btz.aj), $$0.c(btz.aa), $$0.c(btz.ag), $$0.a(btz.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(ccj::a)).isPresent()) {
                        cbw $$6 = $$0.b($$1);
                        ccd.c($$4x, $$6);
                        ccd.c((ccb)$$4x);
                        ccd.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(ccd::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(ccb $$0) {
      return $$0.dN().a(btz.ag);
   }
}
