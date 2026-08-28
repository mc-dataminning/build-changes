import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class clt {
   public static bws<clm> a() {
      return byu.a(
         (Function<byu.b<clm>, ? extends App<byu.c<clm>, byx<clm>>>)($$0 -> $$0.group($$0.b(ccs.ak), $$0.c(ccs.ab), $$0.c(ccs.ah), $$0.a(ccs.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(clt::a)).isPresent()) {
                        clg $$6 = $$0.b($$1);
                        cln.c($$4x, $$6);
                        cln.c((cll)$$4x);
                        cln.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cln::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cll $$0) {
      return $$0.dS().a(ccs.ah);
   }
}
