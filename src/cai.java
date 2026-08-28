import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cai {
   private static final int a = 1;

   public static bzb<bxj> a(float $$0) {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$1 -> $$1.group($$1.a(cgl.o), $$1.c(cgl.n), $$1.b(cgl.t))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bX()) {
                        return false;
                     } else {
                        bwi $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bzl($$8, true));
                           $$3.a(new cgo(new bzl($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
