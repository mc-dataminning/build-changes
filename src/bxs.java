import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxs {
   public static bvg<btl> a(int $$0, BiPredicate<btl, btl> $$1) {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$2 -> $$2.group($$2.b(ccq.o), $$2.a(ccq.ab), $$2.c(ccq.ai), $$2.a(ccq.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     btl $$10 = $$2.b($$3);
                     if (!$$10.ey()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dq(), (long)$$0);
                        if ($$10.am() != bsw.by || $$7.ab().b(dcq.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
