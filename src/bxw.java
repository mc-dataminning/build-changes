import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxw {
   private static final int a = 1;

   public static bwp<buv> a(float $$0) {
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$1 -> $$1.group($$1.a(cdz.n), $$1.c(cdz.m), $$1.b(cdz.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.ca()) {
                        return false;
                     } else {
                        btz $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bwz($$8, true));
                           $$3.a(new cec(new bwz($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
