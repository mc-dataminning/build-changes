import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cnd {
   public static bxz<cmw> a() {
      return cab.a(
         (Function<cab.b<cmw>, ? extends App<cab.c<cmw>, cae<cmw>>>)($$0 -> $$0.group($$0.b(cdz.ak), $$0.c(cdz.ab), $$0.c(cdz.ah), $$0.a(cdz.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cnd::a)).isPresent()) {
                        cmq $$6 = $$0.b($$1);
                        cmx.c($$4x, $$6);
                        cmx.c((cmv)$$4x);
                        cmx.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cmx::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cmv $$0) {
      return $$0.ed().a(cdz.ah);
   }
}
