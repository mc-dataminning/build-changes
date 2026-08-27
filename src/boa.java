import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class boa {
   private static final int a = 10;
   private static final int b = 7;

   public static bmh<bjp> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bmh<bjp> a(float $$0, int $$1, int $$2) {
      return boj.a((Function<boj.b<bjp>, ? extends App<boj.c<bjp>, bom<bjp>>>)($$3 -> $$3.group($$3.c(bsh.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               gw $$7 = $$5.dl();
               ehn $$8;
               if ($$4.b($$7)) {
                  $$8 = btz.a($$5, $$1, $$2);
               } else {
                  hw $$9 = hw.a($$7);
                  hw $$10 = bkz.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = btw.a($$5, $$1, $$2, ehn.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = btz.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bsk($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
