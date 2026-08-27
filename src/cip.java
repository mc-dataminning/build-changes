import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cip {
   public static bsh<bqo> a(int $$0) {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$1 -> $$1.group($$1.b(bzr.L), $$1.c(bzr.ad), $$1.c(bzr.ag), $$1.c(bzr.af))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$4x, $$5x, $$6) -> {
                     cgd $$7 = $$1.b($$2);
                     if (!cik.a($$7.p())) {
                        return false;
                     } else {
                        $$3.a(true, (long)$$0);
                        return true;
                     }
                  }))
      );
   }
}
