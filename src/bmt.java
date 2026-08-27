import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bmt {
   public static bkr<bjh> a(bsa<gu> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ehe::c);
   }

   public static bma<bjh> b(bsa<? extends bii> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bii::di);
   }

   private static <T> bma<bjh> a(bsa<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ehe> $$4) {
      return boc.a(
         (Function<boc.b<bjh>, ? extends App<boc.c<bjh>, bof<bjh>>>)($$5 -> $$5.group($$5.a(bsa.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bsd> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ehe $$11 = $$8.di();
                     ehe $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ho)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ehe $$13 = $$10.get().a().a().d($$11);
                           ehe $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ehe $$16 = bts.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bsd($$16, $$1, 0));
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
