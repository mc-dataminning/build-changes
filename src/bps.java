import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bps {
   private static final int a = 10;
   private static final int b = 7;

   public static bnz<blh> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bnz<blh> a(float $$0, int $$1, int $$2) {
      return bqb.a((Function<bqb.b<blh>, ? extends App<bqb.c<blh>, bqe<blh>>>)($$3 -> $$3.group($$3.c(btz.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ht $$7 = $$5.dl();
               eji $$8;
               if ($$4.b($$7)) {
                  $$8 = bvr.a($$5, $$1, $$2);
               } else {
                  iu $$9 = iu.a($$7);
                  iu $$10 = bmr.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = bvo.a($$5, $$1, $$2, eji.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bvr.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new buc($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
