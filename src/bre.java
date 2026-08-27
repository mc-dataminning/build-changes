import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bre {
   public static bss<bos> a(bmo $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bss<bos> a(bmo $$0, Function<bpp, Float> $$1) {
      return buu.a(
         (Function<buu.b<bos>, ? extends App<buu.c<bos>, bux<bos>>>)($$2 -> $$2.group($$2.b(bys.K), $$2.a(bys.n), $$2.c(bys.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bos $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           byv $$10 = new byv(new brs($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new brs($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
