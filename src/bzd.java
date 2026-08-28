import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzd {
   public static bxa<bvo> a(cek<ji> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, fba::c);
   }

   public static byk<bvo> b(cek<? extends buk> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, buk::du);
   }

   private static <T> byk<bvo> a(cek<T> $$0, float $$1, int $$2, boolean $$3, Function<T, fba> $$4) {
      return cam.a(
         (Function<cam.b<bvo>, ? extends App<cam.c<bvo>, cap<bvo>>>)($$5 -> $$5.group($$5.a(cek.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cen> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     fba $$11 = $$8.du();
                     fba $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((kb)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           fba $$13 = $$10.get().a().a().d($$11);
                           fba $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           fba $$16 = cge.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cen($$16, $$1, 0));
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
