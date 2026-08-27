import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwl {
   public static bui<bsx> a(cbs<io> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, euk::c);
   }

   public static bvs<bsx> b(cbs<? extends bru> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bru::dn);
   }

   private static <T> bvs<bsx> a(cbs<T> $$0, float $$1, int $$2, boolean $$3, Function<T, euk> $$4) {
      return bxu.a(
         (Function<bxu.b<bsx>, ? extends App<bxu.c<bsx>, bxx<bsx>>>)($$5 -> $$5.group($$5.a(cbs.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<cbv> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     euk $$11 = $$8.dn();
                     euk $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((jh)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           euk $$13 = $$10.get().a().a().d($$11);
                           euk $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           euk $$16 = cdm.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new cbv($$16, $$1, 0));
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
