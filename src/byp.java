import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byp {
   public static bve<cmf> a(float $$0) {
      return byq.a(
         (Function<byq.b<cmf>, ? extends App<byq.c<cmf>, byt<cmf>>>)($$1 -> $$1.group($$1.b(cco.d), $$1.c(cco.c), $$1.b(cco.g), $$1.a(cco.m), $$1.a(cco.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gB().b() != cmi.b) {
                           return false;
                        } else {
                           iz $$9 = $$1.<jh>b($$2).b();
                           Optional<ji<cer>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<btk>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cmf && $$1xxx != $$7)
                                 .map($$0xxxx -> (cmf)$$0xxxx)
                                 .filter(btk::bD)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dS().c(cco.c).isEmpty()) {
                                       bvf.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dS().a(cco.d, jh.a($$6x.af(), $$9));
                                       agp.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ji<cer> $$0, cmf $$1, iz $$2) {
      boolean $$3 = $$1.dS().c(cco.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jh> $$4 = $$1.dS().c(cco.c);
         cmi $$5 = $$1.gB().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(btt $$0, iz $$1, cer $$2) {
      eoe $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
