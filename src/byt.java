import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class byt {
   public static bvi<cmj> a(float $$0) {
      return byu.a(
         (Function<byu.b<cmj>, ? extends App<byu.c<cmj>, byx<cmj>>>)($$1 -> $$1.group($$1.b(ccs.d), $$1.c(ccs.c), $$1.b(ccs.g), $$1.a(ccs.m), $$1.a(ccs.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.p_()) {
                           return false;
                        } else if ($$7.gB().b() != cmm.b) {
                           return false;
                        } else {
                           iz $$9 = $$1.<jh>b($$2).b();
                           Optional<ji<cev>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<bto>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cmj && $$1xxx != $$7)
                                 .map($$0xxxx -> (cmj)$$0xxxx)
                                 .filter(bto::bD)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dS().c(ccs.c).isEmpty()) {
                                       bvj.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dS().a(ccs.d, jh.a($$6x.af(), $$9));
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

   private static boolean a(ji<cev> $$0, cmj $$1, iz $$2) {
      boolean $$3 = $$1.dS().c(ccs.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jh> $$4 = $$1.dS().c(ccs.c);
         cmm $$5 = $$1.gB().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(btx $$0, iz $$1, cev $$2) {
      eoi $$3 = $$0.K().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
