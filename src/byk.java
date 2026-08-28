import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byk {
   private static final int a = 10;
   private static final int b = 7;

   public static bwr<btw> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bwr<btw> a(float $$0, int $$1, int $$2) {
      return byt.a((Function<byt.b<btw>, ? extends App<byt.c<btw>, byw<btw>>>)($$3 -> $$3.group($$3.c(ccr.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               iz $$7 = $$5.dp();
               evp $$8;
               if ($$4.c($$7)) {
                  $$8 = cel.a($$5, $$1, $$2);
               } else {
                  kb $$9 = kb.a($$7);
                  kb $$10 = bvi.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cei.a($$5, $$1, $$2, evp.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cel.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new ccu($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
