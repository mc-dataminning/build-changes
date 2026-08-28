import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cmu {
   public static bxq<cmn> a() {
      return bzs.a(
         (Function<bzs.b<cmn>, ? extends App<bzs.c<cmn>, bzv<cmn>>>)($$0 -> $$0.group($$0.b(cdq.ak), $$0.c(cdq.ab), $$0.c(cdq.ah), $$0.a(cdq.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cmu::a)).isPresent()) {
                        cmh $$6 = $$0.b($$1);
                        cmo.c($$4x, $$6);
                        cmo.c((cmm)$$4x);
                        cmo.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cmo::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cmm $$0) {
      return $$0.dY().a(cdq.ah);
   }
}
