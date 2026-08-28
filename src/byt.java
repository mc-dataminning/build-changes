import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byt {
   public static bvi<cmk> a(float $$0) {
      return byu.a(
         (Function<byu.b<cmk>, ? extends App<byu.c<cmk>, byx<cmk>>>)($$1 -> $$1.group($$1.b(ccs.d), $$1.c(ccs.c), $$1.b(ccs.g), $$1.a(ccs.m), $$1.a(ccs.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gv().b() != cmn.b) {
                           return false;
                        } else {
                           jd $$9 = $$1.<jl>b($$2).b();
                           Optional<jm<cev>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<btn>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cmk && $$1xxx != $$7)
                                 .map($$0xxxx -> (cmk)$$0xxxx)
                                 .filter(btn::bE)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dT().c(ccs.c).isEmpty()) {
                                       bvj.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dT().a(ccs.d, jl.a($$6x.af(), $$9));
                                       agf.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jm<cev> $$0, cmk $$1, jd $$2) {
      boolean $$3 = $$1.dT().c(ccs.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jl> $$4 = $$1.dT().c(ccs.c);
         cmn $$5 = $$1.gv().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(btw $$0, jd $$1, cev $$2) {
      eps $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
