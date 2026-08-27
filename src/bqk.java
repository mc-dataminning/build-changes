import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqk {
   public static bnx<bmf> a(Function<bmf, Optional<bpk>> $$0, Predicate<bmf> $$1, int $$2, int $$3, float $$4) {
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$5 -> $$5.group($$5.a(bvh.n), $$5.a(bvh.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bpk> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bpk $$11 = $$10.get();
                        if ($$8.dk().a((ir)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bpk $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new bvk($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
