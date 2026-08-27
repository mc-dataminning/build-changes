import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cen {
   public static bpq<ceg> a() {
      return brs.a(
         (Function<brs.b<ceg>, ? extends App<brs.c<ceg>, brv<ceg>>>)($$0 -> $$0.group($$0.b(bvq.ak), $$0.c(bvq.ab), $$0.c(bvq.ah), $$0.a(bvq.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cen::a)).isPresent()) {
                        cea $$6 = $$0.b($$1);
                        ceh.c($$4x, $$6);
                        ceh.c((cef)$$4x);
                        ceh.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(ceh::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cef $$0) {
      return $$0.dN().a(bvq.ah);
   }
}
