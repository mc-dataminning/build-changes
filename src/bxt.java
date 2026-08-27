import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bxt {
   public static bui<clj> a(float $$0) {
      return bxu.a(
         (Function<bxu.b<clj>, ? extends App<bxu.c<clj>, bxx<clj>>>)($$1 -> $$1.group($$1.b(cbs.d), $$1.c(cbs.c), $$1.b(cbs.g), $$1.a(cbs.m), $$1.a(cbs.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gA().b() != clm.b) {
                           return false;
                        } else {
                           io $$9 = $$1.<iw>b($$2).b();
                           Optional<ix<cdv>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bso>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof clj && $$1xxx != $$7)
                                 .map($$0xxxx -> (clj)$$0xxxx)
                                 .filter(bso::bD)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dS().c(cbs.c).isEmpty()) {
                                       buj.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dS().a(cbs.d, iw.a($$6x.ae(), $$9));
                                       aga.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ix<cdv> $$0, clj $$1, io $$2) {
      boolean $$3 = $$1.dS().c(cbs.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<iw> $$4 = $$1.dS().c(cbs.c);
         clm $$5 = $$1.gA().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bsx $$0, io $$1, cdv $$2) {
      eni $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
