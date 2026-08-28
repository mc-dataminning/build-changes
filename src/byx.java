import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byx {
   public static bwu<bvi> a(cee<jh> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ezn::c);
   }

   public static bye<bvi> b(cee<? extends bue> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bue::dv);
   }

   private static <T> bye<bvi> a(cee<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ezn> $$4) {
      return cag.a(
         (Function<cag.b<bvi>, ? extends App<cag.c<bvi>, caj<bvi>>>)($$5 -> $$5.group($$5.a(cee.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<ceh> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ezn $$11 = $$8.dv();
                     ezn $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ka)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ezn $$13 = $$10.get().a().a().d($$11);
                           ezn $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ezn $$16 = cfy.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new ceh($$16, $$1, 0));
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
