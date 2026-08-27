import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bsn {
   public static bqb<boi> a(int $$0, BiPredicate<boi, boi> $$1) {
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$2 -> $$2.group($$2.b(bxl.o), $$2.a(bxl.ab), $$2.c(bxl.ai), $$2.a(bxl.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     boi $$10 = $$2.b($$3);
                     if (!$$10.ex()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dm(), (long)$$0);
                        if ($$10.ai() != bnw.bw || $$7.Z().b(cvn.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
