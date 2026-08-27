import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bqo {
   public static boc<bmk> a(int $$0, BiPredicate<bmk, bmk> $$1) {
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$2 -> $$2.group($$2.b(bvm.o), $$2.a(bvm.aa), $$2.c(bvm.ah), $$2.a(bvm.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bmk $$10 = $$2.b($$3);
                     if (!$$10.ew()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dm(), (long)$$0);
                        if ($$10.ai() != bly.bv || $$7.Z().b(ctk.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
