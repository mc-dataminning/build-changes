import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class but {
   public static bsh<bqo> a(int $$0, BiPredicate<bqo, bqo> $$1) {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$2 -> $$2.group($$2.b(bzr.o), $$2.a(bzr.ab), $$2.c(bzr.ai), $$2.a(bzr.aj))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bqo $$10 = $$2.b($$3);
                     if (!$$10.ey()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dm(), (long)$$0);
                        if ($$10.ai() != bqb.bx || $$7.aa().b(cyt.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
