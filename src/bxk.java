import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxk {
   private static final int a = 1;

   public static bwd<buk> a(float $$0) {
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$1 -> $$1.group($$1.a(cdn.n), $$1.c(cdn.m), $$1.b(cdn.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bW()) {
                        return false;
                     } else {
                        bto $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bwn($$8, true));
                           $$3.a(new cdq(new bwn($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
