import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bnl {
   public static bla<bji> a(int $$0, BiPredicate<bji, bji> $$1) {
      return bol.a(
         (Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$2 -> $$2.group($$2.b(bsj.o), $$2.a(bsj.aa), $$2.c(bsj.ah), $$2.a(bsj.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bji $$10 = $$2.b($$3);
                     if (!$$10.ev()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dl(), (long)$$0);
                        if ($$10.ag() != biw.bt || $$7.X().b(cpt.J)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
