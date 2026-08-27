import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bpl {
   public static bmb<cck> a(float $$0) {
      return bpm.a(
         (Function<bpm.b<cck>, ? extends App<bpm.c<cck>, bpp<cck>>>)($$1 -> $$1.group($$1.b(btk.d), $$1.c(btk.c), $$1.b(btk.g), $$1.a(btk.m), $$1.a(btk.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.n_()) {
                           return false;
                        } else if ($$7.gp().b() != ccn.b) {
                           return false;
                        } else {
                           ht $$9 = $$1.<ia>b($$2).b();
                           Optional<ib<bvl>> $$10 = $$6x.w().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bkj>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cck && $$1xxx != $$7)
                                 .map($$0xxxx -> (cck)$$0xxxx)
                                 .filter(bkj::bv)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dN().c(btk.c).isEmpty()) {
                                       bmc.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dN().a(btk.d, ia.a($$6x.ac(), $$9));
                                       abz.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ib<bvl> $$0, cck $$1, ht $$2) {
      boolean $$3 = $$1.dN().c(btk.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ia> $$4 = $$1.dN().c(btk.c);
         ccn $$5 = $$1.gp().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bks $$0, ht $$1, bvl $$2) {
      ebt $$3 = $$0.L().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
