import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxk {
   private static final int a = 10;
   private static final int b = 7;

   public static bvr<bsw> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bvr<bsw> a(float $$0, int $$1, int $$2) {
      return bxt.a((Function<bxt.b<bsw>, ? extends App<bxt.c<bsw>, bxw<bsw>>>)($$3 -> $$3.group($$3.c(cbr.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ir $$7 = $$5.du();
               ewu $$8;
               if ($$4.c($$7)) {
                  $$8 = cdl.a($$5, $$1, $$2);
               } else {
                  jt $$9 = jt.a($$7);
                  jt $$10 = bui.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cdi.a($$5, $$1, $$2, ewu.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cdl.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cbu($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
