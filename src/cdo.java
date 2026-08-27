import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cdo {
   public static box<cdh> a() {
      return bqz.a(
         (Function<bqz.b<cdh>, ? extends App<bqz.c<cdh>, brc<cdh>>>)($$0 -> $$0.group($$0.b(bux.aj), $$0.c(bux.aa), $$0.c(bux.ag), $$0.a(bux.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cdo::a)).isPresent()) {
                        cdb $$6 = $$0.b($$1);
                        cdi.c($$4x, $$6);
                        cdi.c((cdg)$$4x);
                        cdi.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cdi::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cdg $$0) {
      return $$0.dO().a(bux.ag);
   }
}
