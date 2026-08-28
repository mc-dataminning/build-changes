import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzb {
   public static bwy<bvm> a(cei<jh> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ezr::c);
   }

   public static byi<bvm> b(cei<? extends bui> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bui::dw);
   }

   private static <T> byi<bvm> a(cei<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ezr> $$4) {
      return cak.a(
         (Function<cak.b<bvm>, ? extends App<cak.c<bvm>, can<bvm>>>)($$5 -> $$5.group($$5.a(cei.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cel> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ezr $$11 = $$8.dw();
                     ezr $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ka)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ezr $$13 = $$10.get().a().a().d($$11);
                           ezr $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ezr $$16 = cgc.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cel($$16, $$1, 0));
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
