import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bjp {
   public static bhs<bfz> a(bgc $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ae().f()), $$1);
   }

   public static bjb<bfz> a(bfn<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ae()), $$1);
   }

   public static bjb<bfz> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bjb<bfz> a(Predicate<bfz> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$2x -> $$2x.group($$2x.c(bpb.n), $$2x.b(bpb.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bfz> $$8 = $$2x.<bpd>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bfj)$$6) <= (double)$$2 && !$$6.u($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bic($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
