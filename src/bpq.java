import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpq {
   public static bnn<bme> a(bux<hv> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, elb::c);
   }

   public static box<bme> b(bux<? extends blf> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, blf::dk);
   }

   private static <T> box<bme> a(bux<T> $$0, float $$1, int $$2, boolean $$3, Function<T, elb> $$4) {
      return bqz.a(
         (Function<bqz.b<bme>, ? extends App<bqz.c<bme>, brc<bme>>>)($$5 -> $$5.group($$5.a(bux.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bva> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     elb $$11 = $$8.dk();
                     elb $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ip)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           elb $$13 = $$10.get().a().a().d($$11);
                           elb $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           elb $$16 = bwq.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bva($$16, $$1, 0));
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
