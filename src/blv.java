import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blv {
   public static blz<bja> a(int $$0) {
      return bob.a(
         (Function<bob.b<bja>, ? extends App<bob.c<bja>, boe<bja>>>)($$1 -> $$1.group($$1.a(brz.n), $$1.b(brz.o), $$1.c(brz.p), $$1.b(brz.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     biy $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bsb>b($$5).a($$9)) {
                        $$2.a(new bla($$9, true));
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
         cis $$2 = $$1.d();
         return $$2 instanceof cjn && $$0.a((cjn)$$2);
      });
   }
}
