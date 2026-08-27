import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cef {
   public static bpn<cdy> a() {
      return brp.a(
         (Function<brp.b<cdy>, ? extends App<brp.c<cdy>, brs<cdy>>>)($$0 -> $$0.group($$0.b(bvn.aj), $$0.c(bvn.aa), $$0.c(bvn.ag), $$0.a(bvn.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cef::a)).isPresent()) {
                        cds $$6 = $$0.b($$1);
                        cdz.c($$4x, $$6);
                        cdz.c((cdx)$$4x);
                        cdz.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cdz::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cdx $$0) {
      return $$0.dO().a(bvn.ag);
   }
}
