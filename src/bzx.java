import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzx {
   public static <T extends bxb> cab<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bxb> cab<T> a(Predicate<T> $$0, int $$1) {
      return ccd.a(
         (Function<ccd.b<T>, ? extends App<ccd.c<T>, ccg<T>>>)($$2 -> $$2.group($$2.a(cgb.o), $$2.b(cgb.p), $$2.c(cgb.q), $$2.b(cgb.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bwz $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.h($$10) && $$2.<cgd>b($$6).a($$10)) {
                        $$3.a(new bzb($$10, true));
                        $$8.a(btx.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bxb $$0) {
      return $$0.b($$1 -> {
         cyo $$2 = $$1.h();
         return $$2 instanceof czn && $$0.a((czn)$$2);
      });
   }
}
