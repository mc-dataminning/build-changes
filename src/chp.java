import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class chp {
   public static bsr<chi> a() {
      return but.a(
         (Function<but.b<chi>, ? extends App<but.c<chi>, buw<chi>>>)($$0 -> $$0.group($$0.b(byr.ak), $$0.c(byr.ab), $$0.c(byr.ah), $$0.a(byr.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(chp::a)).isPresent()) {
                        chc $$6 = $$0.b($$1);
                        chj.c($$4x, $$6);
                        chj.c((chh)$$4x);
                        chj.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(chj::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(chh $$0) {
      return $$0.dP().a(byr.ah);
   }
}
