import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzg {
   public static <T extends bwi> bzk<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bwi> bzk<T> a(Predicate<T> $$0, int $$1) {
      return cbm.a(
         (Function<cbm.b<T>, ? extends App<cbm.c<T>, cbp<T>>>)($$2 -> $$2.group($$2.a(cfk.n), $$2.b(cfk.o), $$2.c(cfk.p), $$2.b(cfk.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bwg $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.i($$10) && $$2.<cfm>b($$6).a($$10)) {
                        $$3.a(new byk($$10, true));
                        $$8.a(bti.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bwi $$0) {
      return $$0.b($$1 -> {
         cxl $$2 = $$1.h();
         return $$2 instanceof cyl && $$0.a((cyl)$$2);
      });
   }
}
