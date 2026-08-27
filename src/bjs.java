import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bjs {
   public static bhs<bfz> a(bfn<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$2x -> $$2x.group($$2x.a(bpb.n), $$2x.c(bpb.q), $$2x.b(bpb.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bfz> $$9 = $$2x.<bpd>b($$5).a($$3xx -> $$3xx.f((bfj)$$7) <= (double)$$2 && $$0.equals($$3xx.ae()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bfz $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new bic($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
