import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class com {
   public static bzc<cof> a() {
      return cbe.a(
         (Function<cbe.b<cof>, ? extends App<cbe.c<cof>, cbh<cof>>>)($$0 -> $$0.group($$0.b(cfc.ak), $$0.c(cfc.ab), $$0.c(cfc.ah), $$0.a(cfc.ao))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
                     if (!$$4x.n_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(com::a)).isPresent()) {
                        cnz $$6 = $$0.b($$1);
                        cog.c($$3x, $$4x, $$6);
                        cog.b((coe)$$4x);
                        cog.b($$3x, $$4x, $$6);
                        $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(cog::b));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(coe $$0) {
      return $$0.ea().a(cfc.ah);
   }
}
