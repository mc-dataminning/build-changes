import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cby {
   private static final float a = 0.3F;

   public static cay<bxw> a() {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$0 -> $$0.group($$0.a(cgy.n), $$0.a(cgy.o), $$0.b(cgy.e), $$0.b(cgy.h), $$0.c(cgy.r))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jf $$9 = $$0.b($$3);
                     cha $$10 = $$0.b($$4);
                     if ($$6.G_().a(100) == 0 && $$6.aj() == $$9.a() && $$9.b().a($$7.dt(), 4.0) && $$10.d($$0xxx -> bxe.bE.equals($$0xxx.an()))) {
                        $$10.a($$1xx -> bxe.bE.equals($$1xx.an()) && $$1xx.g($$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bzy($$3xx, true));
                           $$1.a(new chb(new bzy($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
