import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byr {
   public static bvg<cmi> a(float $$0) {
      return bys.a(
         (Function<bys.b<cmi>, ? extends App<bys.c<cmi>, byv<cmi>>>)($$1 -> $$1.group($$1.b(ccq.d), $$1.c(ccq.c), $$1.b(ccq.g), $$1.a(ccq.m), $$1.a(ccq.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gx().b() != cml.b) {
                           return false;
                        } else {
                           jd $$9 = $$1.<jl>b($$2).b();
                           Optional<jm<cet>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<btl>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cmi && $$1xxx != $$7)
                                 .map($$0xxxx -> (cmi)$$0xxxx)
                                 .filter(btl::bE)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dU().c(ccq.c).isEmpty()) {
                                       bvh.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dU().a(ccq.d, jl.a($$6x.af(), $$9));
                                       age.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jm<cet> $$0, cmi $$1, jd $$2) {
      boolean $$3 = $$1.dU().c(ccq.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jl> $$4 = $$1.dU().c(ccq.c);
         cml $$5 = $$1.gx().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(btu $$0, jd $$1, cet $$2) {
      epm $$3 = $$0.J().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
