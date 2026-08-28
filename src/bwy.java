import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwy {
   public static buv<btk> a(ccf<ja> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ewf::c);
   }

   public static bwf<btk> b(ccf<? extends bsg> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bsg::do);
   }

   private static <T> bwf<btk> a(ccf<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ewf> $$4) {
      return byh.a(
         (Function<byh.b<btk>, ? extends App<byh.c<btk>, byk<btk>>>)($$5 -> $$5.group($$5.a(ccf.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cci> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ewf $$11 = $$8.do();
                     ewf $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jt)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ewf $$13 = $$10.get().a().a().d($$11);
                           ewf $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ewf $$16 = cdz.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cci($$16, $$1, 0));
                              break;
                           }
                        }

                        return true;
                     }
                  }
               }))
      );
   }
}
