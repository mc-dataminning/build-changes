import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class brz {
   public static bqb<boi> a(bol $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai().f()), $$1);
   }

   public static brl<boi> a(bnw<?> $$0, float $$1) {
      return a($$1x -> $$0.equals($$1x.ai()), $$1);
   }

   public static brl<boi> a(float $$0) {
      return a($$0x -> true, $$0);
   }

   public static brl<boi> a(Predicate<boi> $$0, float $$1) {
      float $$2 = $$1 * $$1;
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$2x -> $$2x.group($$2x.c(bxl.n), $$2x.b(bxl.h))
               .apply($$2x, ($$3, $$4) -> ($$5, $$6, $$7) -> {
                     Optional<boi> $$8 = $$2x.<bxn>b($$4).a($$0.and($$2xxxx -> $$2xxxx.f((bnq)$$6) <= (double)$$2 && !$$6.w($$2xxxx)));
                     if ($$8.isEmpty()) {
                        return false;
                     } else {
                        $$3.a(new bql($$8.get(), true));
                        return true;
                     }
                  }))
      );
   }
}
