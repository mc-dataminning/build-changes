import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class cgx {
   public static bsa<cgq> a() {
      return buc.a(
         (Function<buc.b<cgq>, ? extends App<buc.c<cgq>, buf<cgq>>>)($$0 -> $$0.group($$0.b(bya.ak), $$0.c(bya.ab), $$0.c(bya.ah), $$0.a(bya.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.o_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(cgx::a)).isPresent()) {
                        cgk $$6 = $$0.b($$1);
                        cgr.c($$4x, $$6);
                        cgr.c((cgp)$$4x);
                        cgr.b($$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cgr::c));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(cgp $$0) {
      return $$0.dM().a(bya.ah);
   }
}
