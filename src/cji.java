import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cji {
   public static buh<cjb> a() {
      return bwj.a(
         (Function<bwj.b<cjb>, ? extends App<bwj.c<cjb>, bwm<cjb>>>)($$0 -> $$0.group($$0.b(cah.ak), $$0.c(cah.ab), $$0.c(cah.ah), $$0.a(cah.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cji::a)).isPresent()) {
                        civ $$6 = $$0.b($$1);
                        cjc.c($$4x, $$6);
                        cjc.c((cja)$$4x);
                        cjc.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cjc::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cja $$0) {
      return $$0.dQ().a(cah.ah);
   }
}
