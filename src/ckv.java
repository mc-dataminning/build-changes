import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class ckv {
   public static bvr<cko> a() {
      return bxt.a(
         (Function<bxt.b<cko>, ? extends App<bxt.c<cko>, bxw<cko>>>)($$0 -> $$0.group($$0.b(cbr.ak), $$0.c(cbr.ab), $$0.c(cbr.ah), $$0.a(cbr.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(ckv::a)).isPresent()) {
                        cki $$6 = $$0.b($$1);
                        ckp.c($$4x, $$6);
                        ckp.c((ckn)$$4x);
                        ckp.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(ckp::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(ckn $$0) {
      return $$0.dZ().a(cbr.ah);
   }
}
