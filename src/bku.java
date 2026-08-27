import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bku {
   public static bmh<bil> a(bgj $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bmh<bil> a(bgj $$0, Function<bjg, Float> $$1) {
      return boj.a(
         (Function<boj.b<bil>, ? extends App<boj.c<bil>, bom<bil>>>)($$2 -> $$2.group($$2.b(bsh.J), $$2.a(bsh.n), $$2.c(bsh.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.m_()) {
                        return false;
                     } else {
                        bil $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bsk $$10 = new bsk(new bli($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bli($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
