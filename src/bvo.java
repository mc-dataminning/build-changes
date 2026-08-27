import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvo {
   private static final int a = 1;

   public static buh<bso> a(float $$0) {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$1 -> $$1.group($$1.a(cbr.n), $$1.c(cbr.m), $$1.b(cbr.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bW()) {
                        return false;
                     } else {
                        brv $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bur($$8, true));
                           $$3.a(new cbu(new bur($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
