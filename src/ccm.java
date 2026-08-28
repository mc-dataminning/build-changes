import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ccm {
   public static bzb<cqy> a(float $$0) {
      return ccn.a(
         (Function<ccn.b<cqy>, ? extends App<ccn.c<cqy>, ccq<cqy>>>)($$1 -> $$1.group($$1.b(cgl.d), $$1.c(cgl.c), $$1.b(cgl.g), $$1.a(cgl.n), $$1.a(cgl.o))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if (!$$7.gB().b().a(crb.b)) {
                           return false;
                        } else {
                           iv $$9 = $$1.<je>b($$2).b();
                           Optional<jf<cio>> $$10 = $$6x.A().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bxj>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cqy && $$1xxx != $$7)
                                 .map($$0xxxx -> (cqy)$$0xxxx)
                                 .filter(bxj::bI)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.eb().c(cgl.c).isEmpty()) {
                                       bzc.a($$6xx, $$9, $$0, 1);
                                       $$6xx.eb().a(cgl.d, je.a($$6x.aj(), $$9));
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

   private static boolean a(jf<cio> $$0, cqy $$1, iv $$2) {
      boolean $$3 = $$1.eb().c(cgl.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<je> $$4 = $$1.eb().c(cgl.c);
         jf<crb> $$5 = $$1.gB().b();
         if ($$5.a().b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bxr $$0, iv $$1, cio $$2) {
      exo $$3 = $$0.O().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
