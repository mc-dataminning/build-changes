import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cge {
   public static brh<cfx> a() {
      return btj.a(
         (Function<btj.b<cfx>, ? extends App<btj.c<cfx>, btm<cfx>>>)($$0 -> $$0.group($$0.b(bxh.ak), $$0.c(bxh.ab), $$0.c(bxh.ah), $$0.a(bxh.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cge::a)).isPresent()) {
                        cfr $$6 = $$0.b($$1);
                        cfy.c($$4x, $$6);
                        cfy.c((cfw)$$4x);
                        cfy.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cfy::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cfw $$0) {
      return $$0.dO().a(bxh.ah);
   }
}
