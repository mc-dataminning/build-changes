import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bze {
   public static bxb<bvp> a(cel<jh> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ezy::c);
   }

   public static byl<bvp> b(cel<? extends bul> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bul::dt);
   }

   private static <T> byl<bvp> a(cel<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ezy> $$4) {
      return can.a(
         (Function<can.b<bvp>, ? extends App<can.c<bvp>, caq<bvp>>>)($$5 -> $$5.group($$5.a(cel.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<ceo> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ezy $$11 = $$8.dt();
                     ezy $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ka)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ezy $$13 = $$10.get().a().a().d($$11);
                           ezy $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ezy $$16 = cgf.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new ceo($$16, $$1, 0));
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
