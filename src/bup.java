import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bup {
   public static bsm<brb> a(bzw<id> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, esj::c);
   }

   public static btw<brb> b(bzw<? extends bqa> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bqa::dk);
   }

   private static <T> btw<brb> a(bzw<T> $$0, float $$1, int $$2, boolean $$3, Function<T, esj> $$4) {
      return bvy.a(
         (Function<bvy.b<brb>, ? extends App<bvy.c<brb>, bwb<brb>>>)($$5 -> $$5.group($$5.a(bzw.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bzz> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     esj $$11 = $$8.dk();
                     esj $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ix)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           esj $$13 = $$10.get().a().a().d($$11);
                           esj $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           esj $$16 = cbq.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bzz($$16, $$1, 0));
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
