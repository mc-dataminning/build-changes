import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxn {
   private static final int a = 1;

   public static bwg<bun> a(float $$0) {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$1 -> $$1.group($$1.a(cdq.n), $$1.c(cdq.m), $$1.b(cdq.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bW()) {
                        return false;
                     } else {
                        btr $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bwq($$8, true));
                           $$3.a(new cdt(new bwq($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
