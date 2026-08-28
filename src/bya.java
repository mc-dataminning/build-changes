import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bya {
   public static bye<bvc> a(int $$0) {
      return cag.a(
         (Function<cag.b<bvc>, ? extends App<cag.c<bvc>, caj<bvc>>>)($$1 -> $$1.group($$1.a(cee.n), $$1.b(cee.o), $$1.c(cee.p), $$1.b(cee.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bva $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<ceg>b($$5).a($$9)) {
                        $$2.a(new bxe($$9, true));
                        $$7.a(bsc.a);
                        $$7.E($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bvc $$0) {
      return $$0.b($$1 -> {
         cvx $$2 = $$1.h();
         return $$2 instanceof cwx && $$0.a((cwx)$$2);
      });
   }
}
