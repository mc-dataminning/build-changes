import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class clu {
   public static bwt<cln> a() {
      return byv.a(
         (Function<byv.b<cln>, ? extends App<byv.c<cln>, byy<cln>>>)($$0 -> $$0.group($$0.b(cct.ak), $$0.c(cct.ab), $$0.c(cct.ah), $$0.a(cct.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(clu::a)).isPresent()) {
                        clh $$6 = $$0.b($$1);
                        clo.c($$4x, $$6);
                        clo.c((clm)$$4x);
                        clo.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(clo::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(clm $$0) {
      return $$0.dS().a(cct.ah);
   }
}
