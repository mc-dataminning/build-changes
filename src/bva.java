import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bva {
   private static final int a = 1;

   public static btt<bsa> a(float $$0) {
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$1 -> $$1.group($$1.a(cbd.n), $$1.c(cbd.m), $$1.b(cbd.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bP()) {
                        return false;
                     } else {
                        brh $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bud($$8, true));
                           $$3.a(new cbg(new bud($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
