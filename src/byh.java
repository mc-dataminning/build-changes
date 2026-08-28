import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byh {
   public static byl<bvj> a(int $$0) {
      return can.a(
         (Function<can.b<bvj>, ? extends App<can.c<bvj>, caq<bvj>>>)($$1 -> $$1.group($$1.a(cel.n), $$1.b(cel.o), $$1.c(cel.p), $$1.b(cel.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bvh $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<cen>b($$5).a($$9)) {
                        $$2.a(new bxl($$9, true));
                        $$7.a(bsj.a);
                        $$7.c($$6, $$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bvj $$0) {
      return $$0.b($$1 -> {
         cwi $$2 = $$1.h();
         return $$2 instanceof cxi && $$0.a((cxi)$$2);
      });
   }
}
