import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnr {
   private static final int a = 10;
   private static final int b = 7;

   public static bly<bjf> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bly<bjf> a(float $$0, int $$1, int $$2) {
      return boa.a((Function<boa.b<bjf>, ? extends App<boa.c<bjf>, bod<bjf>>>)($$3 -> $$3.group($$3.c(bry.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               gv $$7 = $$5.dk();
               ehf $$8;
               if ($$4.b($$7)) {
                  $$8 = btq.a($$5, $$1, $$2);
               } else {
                  hy $$9 = hy.a($$7);
                  hy $$10 = bkq.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = btn.a($$5, $$1, $$2, ehf.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = btq.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bsb($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
