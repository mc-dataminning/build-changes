import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byw {
   public static bwy<bve> a(bvh $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ar().f()), $$1);
   }

   public static byi<bve> a(bup<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ar()), $$1);
   }

   public static byi<bve> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static byi<bve> a(Predicate<bve> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$2x -> $$2x.group($$2x.c(cei.n), $$2x.b(cei.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bve> $$8 = $$2x.<cek>b($$4).a($$0.and($$2xxxx -> $$2xxxx.g((bui)$$6) <= (double)$$2 && !$$6.y($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bxi($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
