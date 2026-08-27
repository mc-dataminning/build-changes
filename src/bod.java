import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bod {
   public static bkt<cbc> a(float $$0) {
      return boe.a(
         (Function<boe.b<cbc>, ? extends App<boe.c<cbc>, boh<cbc>>>)($$1 -> $$1.group($$1.b(bsc.d), $$1.c(bsc.c), $$1.b(bsc.g), $$1.a(bsc.m), $$1.a(bsc.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.i_()) {
                           return false;
                        } else if ($$7.gl().b() != cbf.b) {
                           return false;
                        } else {
                           gw $$9 = $$1.<hf>b($$2).b();
                           Optional<hg<bud>> $$10 = $$6x.w().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bjb>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cbc && $$1xxx != $$7)
                                 .map($$0xxxx -> (cbc)$$0xxxx)
                                 .filter(bjb::bv)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dM().c(bsc.c).isEmpty()) {
                                       bku.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dM().a(bsc.d, hf.a($$6x.ac(), $$9));
                                       aay.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(hg<bud> $$0, cbc $$1, gw $$2) {
      boolean $$3 = $$1.dM().c(bsc.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<hf> $$4 = $$1.dM().c(bsc.c);
         cbf $$5 = $$1.gl().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bjk $$0, gw $$1, bud $$2) {
      eaw $$3 = $$0.H().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
