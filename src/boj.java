import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boj {
   private static final int a = 1;

   public static bnd<bll> a(float $$0) {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$1 -> $$1.group($$1.a(bum.n), $$1.c(bum.m), $$1.b(bum.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        bkv $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bnn($$8, true));
                           $$3.a(new bup(new bnn($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
