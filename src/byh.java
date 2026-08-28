import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byh {
   private static final int a = 10;
   private static final int b = 7;

   public static bwo<btt> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bwo<btt> a(float $$0, int $$1, int $$2) {
      return byq.a((Function<byq.b<btt>, ? extends App<byq.c<btt>, byt<btt>>>)($$3 -> $$3.group($$3.c(cco.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               iz $$7 = $$5.dp();
               evm $$8;
               if ($$4.c($$7)) {
                  $$8 = cei.a($$5, $$1, $$2);
               } else {
                  kb $$9 = kb.a($$7);
                  kb $$10 = bvf.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cef.a($$5, $$1, $$2, evm.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cei.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new ccr($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
