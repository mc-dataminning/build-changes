import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cdy {
   public static bph<cdr> a() {
      return brj.a(
         (Function<brj.b<cdr>, ? extends App<brj.c<cdr>, brm<cdr>>>)($$0 -> $$0.group($$0.b(bvh.aj), $$0.c(bvh.aa), $$0.c(bvh.ag), $$0.a(bvh.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cdy::a)).isPresent()) {
                        cdl $$6 = $$0.b($$1);
                        cds.c($$4x, $$6);
                        cds.c((cdq)$$4x);
                        cds.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cds::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cdq $$0) {
      return $$0.dO().a(bvh.ag);
   }
}
