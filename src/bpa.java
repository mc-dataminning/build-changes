import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpa {
   public static bmy<blp> a(buh<ht> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eju::c);
   }

   public static boh<blp> b(buh<? extends bkq> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bkq::dl);
   }

   private static <T> boh<blp> a(buh<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eju> $$4) {
      return bqj.a(
         (Function<bqj.b<blp>, ? extends App<bqj.c<blp>, bqm<blp>>>)($$5 -> $$5.group($$5.a(buh.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<buk> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eju $$11 = $$8.dl();
                     eju $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((im)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eju $$13 = $$10.get().a().a().d($$11);
                           eju $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eju $$16 = bvz.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new buk($$16, $$1, 0));
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
