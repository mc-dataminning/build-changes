import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwl {
   private static final int a = 1;

   public static bve<btk> a(float $$0) {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$1 -> $$1.group($$1.a(cco.n), $$1.c(cco.m), $$1.b(cco.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bR()) {
                        return false;
                     } else {
                        bsp $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bvo($$8, true));
                           $$3.a(new ccr(new bvo($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
