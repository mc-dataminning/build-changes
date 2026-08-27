import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class ciq {
   public static btr<cij> a() {
      return bvt.a(
         (Function<bvt.b<cij>, ? extends App<bvt.c<cij>, bvw<cij>>>)($$0 -> $$0.group($$0.b(bzr.ak), $$0.c(bzr.ab), $$0.c(bzr.ah), $$0.a(bzr.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(ciq::a)).isPresent()) {
                        cid $$6 = $$0.b($$1);
                        cik.c($$4x, $$6);
                        cik.c((cii)$$4x);
                        cik.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cik::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cii $$0) {
      return $$0.dP().a(bzr.ah);
   }
}
