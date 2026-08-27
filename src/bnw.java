import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnw {
   private static final int a = 1;

   public static bmq<bky> a(float $$0) {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$1 -> $$1.group($$1.a(btz.n), $$1.c(btz.m), $$1.b(btz.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bN()) {
                        return false;
                     } else {
                        bki $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bna($$8, true));
                           $$3.a(new buc(new bna($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
