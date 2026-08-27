import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bju {
   public static bhs<bgi> a(bpb<gu> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, eei::c);
   }

   public static bjb<bgi> b(bpb<? extends bfj> $$0, float $$1, int $$2, boolean $$3) {
      return a($$0, $$1, $$2, $$3, bfj::dg);
   }

   private static <T> bjb<bgi> a(bpb<T> $$0, float $$1, int $$2, boolean $$3, Function<T, eei> $$4) {
      return bld.a(
         (Function<bld.b<bgi>, ? extends App<bld.c<bgi>, blg<bgi>>>)($$5 -> $$5.group($$5.a(bpb.m), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                  Optional<bpe> $$10 = $$5.a($$5x);
                  if ($$10.isPresent() && !$$3) {
                     return false;
                  } else {
                     eei $$11 = $$8.dg();
                     eei $$12 = $$4.apply($$5.b($$6));
                     if (!$$11.a((ho)$$12, (double)$$2)) {
                        return false;
                     } else {
                        if ($$10.isPresent() && $$10.get().b() == $$1) {
                           eei $$13 = $$10.get().a().a().d($$11);
                           eei $$14 = $$12.d($$11);
                           if ($$13.b($$14) < 0.0) {
                              return false;
                           }
                        }

                        for (int $$15 = 0; $$15 < 10; $$15++) {
                           eei $$16 = bqt.b($$8, 16, 7, $$12);
                           if ($$16 != null) {
                              $$5x.a(new bpe($$16, $$1, 0));
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
