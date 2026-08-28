import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byg {
   public static <T extends bvi> byk<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bvi> byk<T> a(Predicate<T> $$0, int $$1) {
      return cam.a(
         (Function<cam.b<T>, ? extends App<cam.c<T>, cap<T>>>)($$2 -> $$2.group($$2.a(cek.n), $$2.b(cek.o), $$2.c(cek.p), $$2.b(cek.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bvg $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.i($$10) && $$2.<cem>b($$6).a($$10)) {
                        $$3.a(new bxk($$10, true));
                        $$8.a(bsi.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bvi $$0) {
      return $$0.b($$1 -> {
         cwl $$2 = $$1.h();
         return $$2 instanceof cxl && $$0.a((cxl)$$2);
      });
   }
}
