import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cix {
   public static btw<ciq> a() {
      return bvy.a(
         (Function<bvy.b<ciq>, ? extends App<bvy.c<ciq>, bwb<ciq>>>)($$0 -> $$0.group($$0.b(bzw.ak), $$0.c(bzw.ab), $$0.c(bzw.ah), $$0.a(bzw.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cix::a)).isPresent()) {
                        cik $$6 = $$0.b($$1);
                        cir.c($$4x, $$6);
                        cir.c((cip)$$4x);
                        cir.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cir::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cip $$0) {
      return $$0.dP().a(bzw.ah);
   }
}
