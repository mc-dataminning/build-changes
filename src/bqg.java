import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqg {
   private static final int a = 1;

   public static boc<bmm> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static boc<bmm> a(Function<bmk, Float> $$0) {
      return bro.a(
         (Function<bro.b<bmm>, ? extends App<bro.c<bmm>, brr<bmm>>>)($$1 -> $$1.group($$1.a(bvm.m), $$1.a(bvm.n), $$1.b(bvm.o), $$1.a(bvm.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bmk $$9 = $$1.b($$4);
                     Optional<bvo> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bod.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bom($$9, true));
                        $$2.a(new bvp(new bom($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
