import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmf {
   public static bmj<bjk> a(int $$0) {
      return bol.a(
         (Function<bol.b<bjk>, ? extends App<bol.c<bjk>, boo<bjk>>>)($$1 -> $$1.group($$1.a(bsj.n), $$1.b(bsj.o), $$1.c(bsj.p), $$1.b(bsj.h))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     bji $$9 = $$1.b($$3);
                     if (!a($$7) && $$7.i($$9) && $$1.<bsl>b($$5).a($$9)) {
                        $$2.a(new blk($$9, true));
                        $$7.a(bgz.a);
                        $$7.C($$9);
                        $$4.a(true, (long)$$0);
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }

   private static boolean a(bjk $$0) {
      return $$0.b($$1 -> {
         cjc $$2 = $$1.d();
         return $$2 instanceof cjx && $$0.a((cjx)$$2);
      });
   }
}
