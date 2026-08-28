import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bys {
   public static bvh<cmi> a(float $$0) {
      return byt.a(
         (Function<byt.b<cmi>, ? extends App<byt.c<cmi>, byw<cmi>>>)($$1 -> $$1.group($$1.b(ccr.d), $$1.c(ccr.c), $$1.b(ccr.g), $$1.a(ccr.m), $$1.a(ccr.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gB().b() != cml.b) {
                           return false;
                        } else {
                           iz $$9 = $$1.<jh>b($$2).b();
                           Optional<ji<ceu>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<btn>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cmi && $$1xxx != $$7)
                                 .map($$0xxxx -> (cmi)$$0xxxx)
                                 .filter(btn::bD)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dS().c(ccr.c).isEmpty()) {
                                       bvi.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dS().a(ccr.d, jh.a($$6x.af(), $$9));
                                       ags.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ji<ceu> $$0, cmi $$1, iz $$2) {
      boolean $$3 = $$1.dS().c(ccr.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jh> $$4 = $$1.dS().c(ccr.c);
         cml $$5 = $$1.gB().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(btw $$0, iz $$1, ceu $$2) {
      eoh $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
