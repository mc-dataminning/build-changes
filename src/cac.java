import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cac {
   private static final int a = 10;
   private static final int b = 7;

   public static byj<bvn> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static byj<bvn> a(float $$0, int $$1, int $$2) {
      return cal.a((Function<cal.b<bvn>, ? extends App<cal.c<bvn>, cao<bvn>>>)($$3 -> $$3.group($$3.c(cej.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ji $$7 = $$5.dw();
               fay $$8;
               if ($$4.c($$7)) {
                  $$8 = cgd.a($$5, $$1, $$2);
               } else {
                  kk $$9 = kk.a($$7);
                  kk $$10 = bxa.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cga.a($$5, $$1, $$2, fay.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cgd.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cem($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
