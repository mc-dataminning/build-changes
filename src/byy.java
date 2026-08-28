import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byy {
   private static final int a = 1;

   public static bxr<bvx> a(float $$0) {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$1 -> $$1.group($$1.a(cfb.n), $$1.c(cfb.m), $$1.b(cfb.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bvb $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new byb($$8, true));
                           $$3.a(new cfe(new byb($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
