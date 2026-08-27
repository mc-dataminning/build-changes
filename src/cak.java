import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cak {
   public static bma<cad> a() {
      return boc.a(
         (Function<boc.b<cad>, ? extends App<boc.c<cad>, bof<cad>>>)($$0 -> $$0.group($$0.b(bsa.aj), $$0.c(bsa.aa), $$0.c(bsa.ag), $$0.a(bsa.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.i_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cak::a)).isPresent()) {
                        bzx $$6 = $$0.b($$1);
                        cae.c($$4x, $$6);
                        cae.c((cac)$$4x);
                        cae.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cae::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cac $$0) {
      return $$0.dM().a(bsa.ag);
   }
}
