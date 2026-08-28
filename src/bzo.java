import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class bzo {
   public static bwd<cnh> a(float $$0) {
      return bzp.a(
         (Function<bzp.b<cnh>, ? extends App<bzp.c<cnh>, bzs<cnh>>>)($$1 -> $$1.group($$1.b(cdn.d), $$1.c(cdn.c), $$1.b(cdn.g), $$1.a(cdn.m), $$1.a(cdn.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gz().b() != cnk.b) {
                           return false;
                        } else {
                           je $$9 = $$1.<jm>b($$2).b();
                           Optional<jn<cfq>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<buk>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cnh && $$1xxx != $$7)
                                 .map($$0xxxx -> (cnh)$$0xxxx)
                                 .filter(buk::bI)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dX().c(cdn.c).isEmpty()) {
                                       bwe.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dX().a(cdn.d, jm.a($$6x.ag(), $$9));
                                       agn.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(jn<cfq> $$0, cnh $$1, je $$2) {
      boolean $$3 = $$1.dX().c(cdn.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jm> $$4 = $$1.dX().c(cdn.c);
         cnk $$5 = $$1.gz().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(bus $$0, je $$1, cfq $$2) {
      erd $$3 = $$0.P().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
