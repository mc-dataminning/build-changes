import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bys {
   public static bwp<bvd> a(cdz<jg> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ezh::c);
   }

   public static bxz<bvd> b(cdz<? extends btz> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, btz::dv);
   }

   private static <T> bxz<bvd> a(cdz<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ezh> $$4) {
      return cab.a(
         (Function<cab.b<bvd>, ? extends App<cab.c<bvd>, cae<bvd>>>)($$5 -> $$5.group($$5.a(cdz.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cec> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ezh $$11 = $$8.dv();
                     ezh $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jz)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ezh $$13 = $$10.get().a().a().d($$11);
                           ezh $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ezh $$16 = cft.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cec($$16, $$1, 0));
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
