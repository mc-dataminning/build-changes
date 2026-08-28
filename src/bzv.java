import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzv {
   private static final int a = 1;

   public static bxr<bvz> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bxr<bvz> a(Function<bvx, Float> $$0) {
      return cbd.a(
         (Function<cbd.b<bvz>, ? extends App<cbd.c<bvz>, cbg<bvz>>>)($$1 -> $$1.group($$1.a(cfb.m), $$1.a(cfb.n), $$1.b(cfb.o), $$1.a(cfb.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bvx $$9 = $$1.b($$4);
                     Optional<cfd> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bxs.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new byb($$9, true));
                        $$2.a(new cfe(new byb($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
