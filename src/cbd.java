import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cbd {
   public static <T extends byh> cbh<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends byh> cbh<T> a(Predicate<T> $$0, int $$1) {
      return cdj.a(
         (Function<cdj.b<T>, ? extends App<cdj.c<T>, cdm<T>>>)($$2 -> $$2.group($$2.a(chh.o), $$2.b(chh.p), $$2.c(chh.q), $$2.b(chh.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     byf $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.h($$10) && $$2.<chj>b($$6).a($$10)) {
                        $$3.a(new cah($$10, true));
                        $$8.a(bvb.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(byh $$0) {
      return $$0.b($$1 -> {
         dag $$2 = $$1.h();
         return $$2 instanceof dbf && $$0.a((dbf)$$2);
      });
   }
}
