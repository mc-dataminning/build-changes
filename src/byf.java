import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byf {
   private static final int a = 1;

   public static bwy<bve> a(float $$0) {
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$1 -> $$1.group($$1.a(cei.n), $$1.c(cei.m), $$1.b(cei.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.cb()) {
                        return false;
                     } else {
                        bui $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bxi($$8, true));
                           $$3.a(new cel(new bxi($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
