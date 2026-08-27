import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpe {
   private static final int a = 1;

   public static bnx<bmf> a(float $$0) {
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$1 -> $$1.group($$1.a(bvh.n), $$1.c(bvh.m), $$1.b(bvh.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        blp $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new boh($$8, true));
                           $$3.a(new bvk(new boh($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
