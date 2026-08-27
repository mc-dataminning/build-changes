import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cee {
   public static bpm<cdx> a() {
      return bro.a(
         (Function<bro.b<cdx>, ? extends App<bro.c<cdx>, brr<cdx>>>)($$0 -> $$0.group($$0.b(bvm.aj), $$0.c(bvm.aa), $$0.c(bvm.ag), $$0.a(bvm.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cee::a)).isPresent()) {
                        cdr $$6 = $$0.b($$1);
                        cdy.c($$4x, $$6);
                        cdy.c((cdw)$$4x);
                        cdy.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cdy::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cdw $$0) {
      return $$0.dO().a(bvm.ag);
   }
}
