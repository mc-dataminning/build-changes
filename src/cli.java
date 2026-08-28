import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cli {
   public static bwg<clb> a() {
      return byi.a(
         (Function<byi.b<clb>, ? extends App<byi.c<clb>, byl<clb>>>)($$0 -> $$0.group($$0.b(ccg.ak), $$0.c(ccg.ab), $$0.c(ccg.ah), $$0.a(ccg.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cli::a)).isPresent()) {
                        ckv $$6 = $$0.b($$1);
                        clc.c($$4x, $$6);
                        clc.c((cla)$$4x);
                        clc.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(clc::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cla $$0) {
      return $$0.dV().a(ccg.ah);
   }
}
