import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbf {
   private static final int a = 1;

   public static bzb<bxl> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bzb<bxl> a(Function<bxj, Float> $$0) {
      return ccn.a(
         (Function<ccn.b<bxl>, ? extends App<ccn.c<bxl>, ccq<bxl>>>)($$1 -> $$1.group($$1.a(cgl.n), $$1.a(cgl.o), $$1.b(cgl.p), $$1.a(cgl.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bxj $$9 = $$1.b($$4);
                     Optional<cgn> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bzc.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bzl($$9, true));
                        $$2.a(new cgo(new bzl($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
