import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bke {
   public static bhs<bfz> a(Function<bfz, Optional<bje>> $$0, Predicate<bfz> $$1, int $$2, int $$3, float $$4) {
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$5 -> $$5.group($$5.a(bpb.n), $$5.a(bpb.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bje> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bje $$11 = $$10.get();
                        if ($$8.dg().a((ho)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bje $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bpe($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
