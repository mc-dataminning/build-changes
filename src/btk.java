import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class btk {
   public static brh<bpw> a(byr<ib> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, epr::c);
   }

   public static bsr<bpw> b(byr<? extends bow> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bow::dk);
   }

   private static <T> bsr<bpw> a(byr<T> $$0, float $$1, int $$2, boolean $$3, Function<T, epr> $$4) {
      return but.a(
         (Function<but.b<bpw>, ? extends App<but.c<bpw>, buw<bpw>>>)($$5 -> $$5.group($$5.a(byr.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<byu> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     epr $$11 = $$8.dk();
                     epr $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((iv)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           epr $$13 = $$10.get().a().a().d($$11);
                           epr $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           epr $$16 = cal.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new byu($$16, $$1, 0));
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
