import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class clw {
   public static bwv<clp> a() {
      return byx.a(
         (Function<byx.b<clp>, ? extends App<byx.c<clp>, bza<clp>>>)($$0 -> $$0.group($$0.b(ccv.ak), $$0.c(ccv.ab), $$0.c(ccv.ah), $$0.a(ccv.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(clw::a)).isPresent()) {
                        clj $$6 = $$0.b($$1);
                        clq.c($$4x, $$6);
                        clq.c((clo)$$4x);
                        clq.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(clq::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(clo $$0) {
      return $$0.dS().a(ccv.ah);
   }
}
