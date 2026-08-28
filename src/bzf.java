import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzf {
   public static <T extends bwh> bzj<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bwh> bzj<T> a(Predicate<T> $$0, int $$1) {
      return cbl.a(
         (Function<cbl.b<T>, ? extends App<cbl.c<T>, cbo<T>>>)($$2 -> $$2.group($$2.a(cfj.n), $$2.b(cfj.o), $$2.c(cfj.p), $$2.b(cfj.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bwf $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.i($$10) && $$2.<cfl>b($$6).a($$10)) {
                        $$3.a(new byj($$10, true));
                        $$8.a(bth.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bwh $$0) {
      return $$0.b($$1 -> {
         cxk $$2 = $$1.h();
         return $$2 instanceof cyk && $$0.a((cyk)$$2);
      });
   }
}
