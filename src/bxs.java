import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bxs {
   public static buh<cll> a(float $$0) {
      return bxt.a(
         (Function<bxt.b<cll>, ? extends App<bxt.c<cll>, bxw<cll>>>)($$1 -> $$1.group($$1.b(cbr.d), $$1.c(cbr.c), $$1.b(cbr.g), $$1.a(cbr.m), $$1.a(cbr.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gL().b() != clo.b) {
                           return false;
                        } else {
                           ir $$9 = $$1.<iz>b($$2).b();
                           Optional<ja<cdu>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bso>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cll && $$1xxx != $$7)
                                 .map($$0xxxx -> (cll)$$0xxxx)
                                 .filter(bso::bI)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dZ().c(cbr.c).isEmpty()) {
                                       bui.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dZ().a(cbr.d, iz.a($$6x.af(), $$9));
                                       agi.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ja<cdu> $$0, cll $$1, ir $$2) {
      boolean $$3 = $$1.dZ().c(cbr.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<iz> $$4 = $$1.dZ().c(cbr.c);
         clo $$5 = $$1.gL().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bsw $$0, ir $$1, cdu $$2) {
      eps $$3 = $$0.J().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
