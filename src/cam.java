import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cam {
   public static bmc<caf> a() {
      return boe.a(
         (Function<boe.b<caf>, ? extends App<boe.c<caf>, boh<caf>>>)($$0 -> $$0.group($$0.b(bsc.aj), $$0.c(bsc.aa), $$0.c(bsc.ag), $$0.a(bsc.an))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.i_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cam::a)).isPresent()) {
                        bzz $$6 = $$0.b($$1);
                        cag.c($$4x, $$6);
                        cag.c((cae)$$4x);
                        cag.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cag::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cae $$0) {
      return $$0.dM().a(bsc.ag);
   }
}
