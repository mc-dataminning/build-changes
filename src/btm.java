import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class btm {
   public static bqb<cgy> a(float $$0) {
      return btn.a(
         (Function<btn.b<cgy>, ? extends App<btn.c<cgy>, btq<cgy>>>)($$1 -> $$1.group($$1.b(bxl.d), $$1.c(bxl.c), $$1.b(bxl.g), $$1.a(bxl.m), $$1.a(bxl.n))
               .apply(
                  $$1,
                  ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                        if ($$7.o_()) {
                           return false;
                        } else if ($$7.gr().b() != chb.b) {
                           return false;
                        } else {
                           hz $$9 = $$1.<ii>b($$2).b();
                           Optional<ij<bzo>> $$10 = $$6x.y().c($$9);
                           if ($$10.isEmpty()) {
                              return true;
                           } else {
                              $$1.<List<boi>>b($$4)
                                 .stream()
                                 .filter($$1xxx -> $$1xxx instanceof cgy && $$1xxx != $$7)
                                 .map($$0xxxx -> (cgy)$$0xxxx)
                                 .filter(boi::bx)
                                 .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                                 .findFirst()
                                 .ifPresent($$6xx -> {
                                    $$5.b();
                                    $$6.b();
                                    $$2.b();
                                    if ($$6xx.dO().c(bxl.c).isEmpty()) {
                                       bqc.a($$6xx, $$9, $$0, 1);
                                       $$6xx.dO().a(bxl.d, ii.a($$6x.ad(), $$9));
                                       aep.c($$6x, $$9);
                                    }
                                 });
                              return true;
                           }
                        }
                     }
               ))
      );
   }

   private static boolean a(ij<bzo> $$0, cgy $$1, hz $$2) {
      boolean $$3 = $$1.dO().c(bxl.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<ii> $$4 = $$1.dO().c(bxl.c);
         chb $$5 = $$1.gr().b();
         if ($$5.b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(boq $$0, hz $$1, bzo $$2) {
      ehl $$3 = $$0.N().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
