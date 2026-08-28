import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzq {
   private static final int a = 1;

   public static byj<bwr> a(float $$0) {
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$1 -> $$1.group($$1.a(cft.o), $$1.c(cft.n), $$1.b(cft.t))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bvs $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new byt($$8, true));
                           $$3.a(new cfw(new byt($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
