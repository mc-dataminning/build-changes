import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class ccr {
   public static boh<cck> a() {
      return bqj.a(
         (Function<bqj.b<cck>, ? extends App<bqj.c<cck>, bqm<cck>>>)($$0 -> $$0.group($$0.b(buh.aj), $$0.c(buh.aa), $$0.c(buh.ag), $$0.a(buh.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(ccr::a)).isPresent()) {
                        cce $$6 = $$0.b($$1);
                        ccl.c($$4x, $$6);
                        ccl.c((ccj)$$4x);
                        ccl.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(ccl::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(ccj $$0) {
      return $$0.dP().a(buh.ag);
   }
}
