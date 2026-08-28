import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxv {
   public static bvj<btp> a(int $$0, BiPredicate<btp, btp> $$1) {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$2 -> $$2.group($$2.b(cct.o), $$2.a(cct.ab), $$2.c(cct.ai), $$2.a(cct.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     btp $$10 = $$2.b($$3);
                     if (!$$10.eB()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dp(), (long)$$0);
                        if ($$10.ak() != bta.by || $$7.ab().b(dbu.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
