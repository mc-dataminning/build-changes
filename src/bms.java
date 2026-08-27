import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bms {
   public static bkq<bjh> a(brz<gu> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, ehd::c);
   }

   public static blz<bjh> b(brz<? extends bii> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bii::di);
   }

   private static <T> blz<bjh> a(brz<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ehd> $$4) {
      return bob.a(
         (Function<bob.b<bjh>, ? extends App<bob.c<bjh>, boe<bjh>>>)($$5 -> $$5.group($$5.a(brz.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bsc> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     ehd $$11 = $$8.di();
                     ehd $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ho)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           ehd $$13 = $$10.get().a().a().d($$11);
                           ehd $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           ehd $$16 = btr.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bsc($$16, $$1, 0));
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
