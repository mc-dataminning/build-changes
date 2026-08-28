import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cac {
   public static <T extends bxg> cag<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bxg> cag<T> a(Predicate<T> $$0, int $$1) {
      return cci.a(
         (Function<cci.b<T>, ? extends App<cci.c<T>, ccl<T>>>)($$2 -> $$2.group($$2.a(cgg.o), $$2.b(cgg.p), $$2.c(cgg.q), $$2.b(cgg.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bxe $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.h($$10) && $$2.<cgi>b($$6).a($$10)) {
                        $$3.a(new bzg($$10, true));
                        $$8.a(buc.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bxg $$0) {
      return $$0.b($$1 -> {
         cyz $$2 = $$1.h();
         return $$2 instanceof czy && $$0.a((czy)$$2);
      });
   }
}
