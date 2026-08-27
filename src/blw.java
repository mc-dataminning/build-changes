import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blw {
   public static bma<bja> a(int $$0) {
      return boc.a(
         (Function<boc.b<bja>, ? extends App<boc.c<bja>, bof<bja>>>)($$1 -> $$1.group($$1.a(bsa.n), $$1.b(bsa.o), $$1.c(bsa.p), $$1.b(bsa.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     biy $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.k($$9) && $$1.<bsc>b($$5).a($$9)) {
                        $$2.a(new blb($$9, true));
                        $$7.a(bgp.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bja $$0) {
      return $$0.b($$1 -> {
         cit $$2 = $$1.d();
         return $$2 instanceof cjo && $$0.a((cjo)$$2);
      });
   }
}
