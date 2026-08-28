import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byl {
   public static bwz<cog> a() {
      return cal.a(
         (Function<cal.b<cog>, ? extends App<cal.c<cog>, cao<cog>>>)($$0 -> $$0.group($$0.b(cej.c), $$0.b(cej.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        jq $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bvf>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cog && $$1xxx != $$4)
                                    .map($$0xxxx -> (cog)$$0xxxx)
                                    .filter(bvf::bL)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, byl::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cog a(cog $$0, cog $$1) {
      cog $$2;
      cog $$3;
      if ($$0.x() > $$1.x()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.ec().b(cej.c);
      return $$2;
   }

   private static boolean a(jq $$0, jr<cgm> $$1, cog $$2) {
      Optional<jq> $$3 = $$2.ec().c(cej.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gz().b());
   }

   private static boolean a(jr<cgm> $$0, coj $$1) {
      return $$1.b().test($$0);
   }
}
