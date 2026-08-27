import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqq {
   private static final int a = 10;
   private static final int b = 7;

   public static box<bme> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static box<bme> a(float $$0, int $$1, int $$2) {
      return bqz.a((Function<bqz.b<bme>, ? extends App<bqz.c<bme>, brc<bme>>>)($$3 -> $$3.group($$3.c(bux.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               hv $$7 = $$5.dm();
               elb $$8;
               if ($$4.b($$7)) {
                  $$8 = bwq.a($$5, $$1, $$2);
               } else {
                  ix $$9 = ix.a($$7);
                  ix $$10 = bno.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = bwn.a($$5, $$1, $$2, elb.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bwq.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bva($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
