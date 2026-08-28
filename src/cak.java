import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cak {
   public static bwz<cog> a(float $$0) {
      return cal.a(
         (Function<cal.b<cog>, ? extends App<cal.c<cog>, cao<cog>>>)($$1 -> $$1.group($$1.b(cej.d), $$1.c(cej.c), $$1.b(cej.g), $$1.a(cej.m), $$1.a(cej.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.e_()) {
                           return false;
                        } else if ($$7.gz().b() != coj.b) {
                           return false;
                        } else {
                           ji $$9 = $$1.<jq>b($$2).b();
                           Optional<jr<cgm>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bvf>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cog && $$1xxx != $$7)
                                 .map($$0xxxx -> (cog)$$0xxxx)
                                 .filter(bvf::bL)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.ec().c(cej.c).isEmpty()) {
                                       bxa.a($$6xx, $$9, $$0, 1);
                                       $$6xx.ec().a(cej.d, jq.a($$6x.ai(), $$9));
                                       agc.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jr<cgm> $$0, cog $$1, ji $$2) {
      boolean $$3 = $$1.ec().c(cej.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jq> $$4 = $$1.ec().c(cej.c);
         coj $$5 = $$1.gz().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bvn $$0, ji $$1, cgm $$2) {
      etl $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
