import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cke {
   public static bvd<cjx> a() {
      return bxf.a(
         (Function<bxf.b<cjx>, ? extends App<bxf.c<cjx>, bxi<cjx>>>)($$0 -> $$0.group($$0.b(cbd.ak), $$0.c(cbd.ab), $$0.c(cbd.ah), $$0.a(cbd.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cke::a)).isPresent()) {
                        cjr $$6 = $$0.b($$1);
                        cjy.c($$4x, $$6);
                        cjy.c((cjw)$$4x);
                        cjy.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cjy::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cjw $$0) {
      return $$0.dQ().a(cbd.ah);
   }
}
