import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cls {
   public static bwq<cll> a() {
      return bys.a(
         (Function<bys.b<cll>, ? extends App<bys.c<cll>, byv<cll>>>)($$0 -> $$0.group($$0.b(ccq.ak), $$0.c(ccq.ab), $$0.c(ccq.ah), $$0.a(ccq.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cls::a)).isPresent()) {
                        clf $$6 = $$0.b($$1);
                        clm.c($$4x, $$6);
                        clm.c((clk)$$4x);
                        clm.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(clm::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(clk $$0) {
      return $$0.dU().a(ccq.ah);
   }
}
