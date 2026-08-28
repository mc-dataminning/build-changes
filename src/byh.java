import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byh {
   public static <T extends bvj> byl<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bvj> byl<T> a(Predicate<T> $$0, int $$1) {
      return can.a(
         (Function<can.b<T>, ? extends App<can.c<T>, caq<T>>>)($$2 -> $$2.group($$2.a(cel.n), $$2.b(cel.o), $$2.c(cel.p), $$2.b(cel.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvh $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.i($$10) && $$2.<cen>b($$6).a($$10)) {
                        $$3.a(new bxl($$10, true));
                        $$8.a(bsj.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bvj $$0) {
      return $$0.b($$1 -> {
         cwl $$2 = $$1.h();
         return $$2 instanceof cxl && $$0.a((cxl)$$2);
      });
   }
}
