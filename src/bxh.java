import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxh {
   public static buv<btb> a(int $$0, BiPredicate<btb, btb> $$1) {
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$2 -> $$2.group($$2.b(ccf.o), $$2.a(ccf.ab), $$2.c(ccf.ai), $$2.a(ccf.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     btb $$10 = $$2.b($$3);
                     if (!$$10.ey()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dq(), (long)$$0);
                        if ($$10.al() != bsm.by || $$7.ab().b(dcb.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
