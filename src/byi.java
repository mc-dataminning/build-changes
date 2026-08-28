import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byi {
   private static final int a = 1;

   public static bxb<bvh> a(float $$0) {
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$1 -> $$1.group($$1.a(cel.n), $$1.c(cel.m), $$1.b(cel.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bul $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bxl($$8, true));
                           $$3.a(new ceo(new bxl($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
