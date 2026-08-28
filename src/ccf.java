import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ccf {
   public static byu<cqk> a(float $$0) {
      return ccg.a(
         (Function<ccg.b<cqk>, ? extends App<ccg.c<cqk>, ccj<cqk>>>)($$1 -> $$1.group($$1.b(cge.d), $$1.c(cge.c), $$1.b(cge.g), $$1.a(cge.n), $$1.a(cge.o))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if (!$$7.gy().b().a(cqn.b)) {
                           return false;
                        } else {
                           iu $$9 = $$1.<jd>b($$2).b();
                           Optional<je<cih>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bxc>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cqk && $$1xxx != $$7)
                                 .map($$0xxxx -> (cqk)$$0xxxx)
                                 .filter(bxc::bK)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cge.c).isEmpty()) {
                                       byv.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cge.d, jd.a($$6x.aj(), $$9));
                                       agm.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(je<cih> $$0, cqk $$1, iu $$2) {
      boolean $$3 = $$1.eb().c(cge.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jd> $$4 = $$1.eb().c(cge.c);
         je<cqn> $$5 = $$1.gy().b();
         if ($$5.a().b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bxk $$0, iu $$1, cih $$2) {
      ewu $$3 = $$0.O().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
