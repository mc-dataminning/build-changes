import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqa {
   public static boc<bmk> a(bmn $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static bpm<bmk> a(bly<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static bpm<bmk> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static bpm<bmk> a(Predicate<bmk> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$2x -> $$2x.group($$2x.c(bvm.n), $$2x.b(bvm.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<bmk> $$8 = $$2x.<bvo>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((blu)$$6) <= (double)$$2 && !$$6.x($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bom($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
