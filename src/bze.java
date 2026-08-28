import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bze {
   private static final float a = 0.3F;

   public static bye<bva> a() {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$0 -> $$0.group($$0.a(cee.m), $$0.a(cee.n), $$0.b(cee.e), $$0.b(cee.h), $$0.c(cee.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jp $$9 = $$0.b($$3);
                     ceg $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ag() == $$9.a() && $$9.b().a($$7.dv(), 4.0) && $$10.d($$0xxx -> bul.bj.equals($$0xxx.ar()))) {
                        $$10.a($$1xx -> bul.bj.equals($$1xx.ar()) && $$1xx.g((bue)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bxe($$3xx, true));
                           $$1.a(new ceh(new bxe($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
