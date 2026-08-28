import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzc {
   private static final int a = 1;

   public static bwy<bvg> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static bwy<bvg> a(Function<bve, Float> $$0) {
      return cak.a(
         (Function<cak.b<bvg>, ? extends App<cak.c<bvg>, can<bvg>>>)($$1 -> $$1.group($$1.a(cei.m), $$1.a(cei.n), $$1.b(cei.o), $$1.a(cei.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bve $$9 = $$1.b($$4);
                     Optional<cek> $$10 = $$1.a($$5);
                     if ($$10.isPresent() && $$10.get().a($$9) && bwz.a($$7, $$9, 1)) {
                        $$2.b();
                     } else {
                        $$3.a(new bxi($$9, true));
                        $$2.a(new cel(new bxi($$9, false), $$0.apply($$7), 0));
                     }

                     return true;
                  }))
      );
   }
}
