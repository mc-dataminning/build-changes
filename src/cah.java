import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cah {
   public static <T extends bxl> cal<T> a(int $$0) {
      return a($$0x -> true, $$0);
   }

   public static <T extends bxl> cal<T> a(Predicate<T> $$0, int $$1) {
      return ccn.a(
         (Function<ccn.b<T>, ? extends App<ccn.c<T>, ccq<T>>>)($$2 -> $$2.group($$2.a(cgl.o), $$2.b(cgl.p), $$2.c(cgl.q), $$2.b(cgl.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bxj $$10 = $$2.b($$4);
                     if ($$0.test((T)$$8) && !a($$8) && $$8.h($$10) && $$2.<cgn>b($$6).a($$10)) {
                        $$3.a(new bzl($$10, true));
                        $$8.a(buf.a);
                        $$8.c($$7, $$10);
                        $$5.a(true, (long)$$1);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bxl $$0) {
      return $$0.b($$1 -> {
         czg $$2 = $$1.h();
         return $$2 instanceof daf && $$0.a((daf)$$2);
      });
   }
}
