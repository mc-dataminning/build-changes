import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class clv {
   public static bwu<clo> a() {
      return byw.a(
         (Function<byw.b<clo>, ? extends App<byw.c<clo>, byz<clo>>>)($$0 -> $$0.group($$0.b(ccu.ak), $$0.c(ccu.ab), $$0.c(ccu.ah), $$0.a(ccu.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.p_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(clv::a)).isPresent()) {
                        cli $$6 = $$0.b($$1);
                        clp.c($$4x, $$6);
                        clp.c((cln)$$4x);
                        clp.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(clp::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cln $$0) {
      return $$0.dS().a(ccu.ah);
   }
}
