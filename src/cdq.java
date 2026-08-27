import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cdq {
   public static bsh<bqo> a() {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$0 -> $$0.group($$0.b(bzr.N), $$0.a(bzr.y)).apply($$0, ($$1, $$2) -> ($$3, $$4, $$5) -> {
                  int $$6 = $$0.<Integer>b($$1);
                  if ($$6 <= 0) {
                     $$1.b();
                     $$2.b();
                     $$4.dP().f();
                  } else {
                     $$1.a($$6 - 1);
                  }

                  return true;
               }))
      );
   }
}
