import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cad {
   public static bya<bwo> a(cfk<jh> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fby::c);
   }

   public static bzk<bwo> b(cfk<? extends bvk> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bvk::du);
   }

   private static <T> bzk<bwo> a(cfk<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fby> $$4) {
      return cbm.a(
         (Function<cbm.b<bwo>, ? extends App<cbm.c<bwo>, cbp<bwo>>>)($$5 -> $$5.group($$5.a(cfk.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cfn> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fby $$11 = $$8.du();
                     fby $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ka)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fby $$13 = $$10.get().a().a().d($$11);
                           fby $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fby $$16 = che.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cfn($$16, $$1, 0));
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
