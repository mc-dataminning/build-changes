import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsf {
   public static bsh<bqo> a(bzr<?> $$0, int $$1) {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$2 -> $$2.group($$2.a(bzr.o), $$2.c(bzr.ax), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
