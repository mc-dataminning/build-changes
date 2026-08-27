import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class ccw {
   public static bom<ccp> a() {
      return bqo.a(
         (Function<bqo.b<ccp>, ? extends App<bqo.c<ccp>, bqr<ccp>>>)($$0 -> $$0.group($$0.b(bum.aj), $$0.c(bum.aa), $$0.c(bum.ag), $$0.a(bum.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(ccw::a)).isPresent()) {
                        ccj $$6 = $$0.b($$1);
                        ccq.c($$4x, $$6);
                        ccq.c((cco)$$4x);
                        ccq.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(ccq::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cco $$0) {
      return $$0.dP().a(bum.ag);
   }
}
