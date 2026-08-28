import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cau {
   public static <T extends bxy> cay<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bxy> cay<T> a(Predicate<T> $$0, int $$1) {
      return cda.a(
         (Function<cda.b<T>, ? extends App<cda.c<T>, cdd<T>>>)($$2 -> $$2.group($$2.a(cgy.o), $$2.b(cgy.p), $$2.c(cgy.q), $$2.b(cgy.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bxw $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.h($$10) && $$2.<cha>b($$6).a($$10)) {
                        $$3.a(new bzy($$10, true));
                        $$8.a(bus.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bxy $$0) {
      return $$0.b($$1 -> {
         czw $$2 = $$1.h();
         return $$2 instanceof dav && $$0.a((dav)$$2);
      });
   }
}
