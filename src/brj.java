import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class brj {
   private static final int a = 10;
   private static final int b = 7;

   public static bpq<bmx> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bpq<bmx> a(float $$0, int $$1, int $$2) {
      return brs.a((Function<brs.b<bmx>, ? extends App<brs.c<bmx>, brv<bmx>>>)($$3 -> $$3.group($$3.c(bvq.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               hx $$7 = $$5.dl();
               emc $$8;
               if ($$4.c($$7)) {
                  $$8 = bxk.a($$5, $$1, $$2);
               } else {
                  iz $$9 = iz.a($$7);
                  iz $$10 = boh.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = bxh.a($$5, $$1, $$2, emc.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bxk.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bvt($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
