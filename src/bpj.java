import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpj {
   private static final int a = 1;

   public static boc<bmk> a(float $$0) {
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$1 -> $$1.group($$1.a(bvm.n), $$1.c(bvm.m), $$1.b(bvm.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        blu $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bom($$8, true));
                           $$3.a(new bvp(new bom($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
