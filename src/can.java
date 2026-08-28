import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class can {
   public static bzb<cqv> a() {
      return ccn.a(
         (Function<ccn.b<cqv>, ? extends App<ccn.c<cqv>, ccq<cqv>>>)($$0 -> $$0.group($$0.b(cgl.c), $$0.b(cgl.g))
               .apply(
                  $$0,
                  ($$1, $$2) -> ($$3, $$4, $$5) -> {
                        je $$6 = $$0.b($$1);
                        $$3.A()
                           .c($$6.b())
                           .ifPresent(
                              $$4x -> $$0.<List<bxj>>b($$2)
                                    .stream()
                                    .filter($$1xxx -> $$1xxx instanceof cqv && $$1xxx != $$4)
                                    .map($$0xxxx -> (cqv)$$0xxxx)
                                    .filter(bxj::bI)
                                    .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                                    .reduce($$4, can::a)
                           );
                        return true;
                     }
               ))
      );
   }

   private static cqv a(cqv $$0, cqv $$1) {
      cqv $$2;
      cqv $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eb().b(cgl.c);
      return $$2;
   }

   private static boolean a(je $$0, jf<cio> $$1, cqv $$2) {
      Optional<je> $$3 = $$2.eb().c(cgl.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gB().b());
   }

   private static boolean a(jf<cio> $$0, jf<cqy> $$1) {
      return $$1.a().b().test($$0);
   }
}
