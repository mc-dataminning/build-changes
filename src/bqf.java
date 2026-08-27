import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqf {
   public static boc<bmt> a(bvm<hx> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, els::c);
   }

   public static bpm<bmt> b(bvm<? extends blu> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, blu::dk);
   }

   private static <T> bpm<bmt> a(bvm<T> $$0, float $$1, int $$2, boolean $$3, Function<T, els> $$4) {
      return bro.a(
         (Function<bro.b<bmt>, ? extends App<bro.c<bmt>, brr<bmt>>>)($$5 -> $$5.group($$5.a(bvm.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bvp> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     els $$11 = $$8.dk();
                     els $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ir)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           els $$13 = $$10.get().a().a().d($$11);
                           els $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           els $$16 = bxf.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bvp($$16, $$1, 0));
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
