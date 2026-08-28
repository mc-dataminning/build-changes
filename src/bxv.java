import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxv {
   private static final int a = 10;
   private static final int b = 7;

   public static bwc<bth> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bwc<bth> a(float $$0, int $$1, int $$2) {
      return bye.a((Function<bye.b<bth>, ? extends App<bye.c<bth>, byh<bth>>>)($$3 -> $$3.group($$3.c(ccc.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ja $$7 = $$5.dp();
               evz $$8;
               if ($$4.c($$7)) {
                  $$8 = cdw.a($$5, $$1, $$2);
               } else {
                  kc $$9 = kc.a($$7);
                  kc $$10 = but.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cdt.a($$5, $$1, $$2, evz.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cdw.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new ccf($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
