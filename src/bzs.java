import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzs {
   private static final int a = 10;
   private static final int b = 7;

   public static bxz<bvd> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bxz<bvd> a(float $$0, int $$1, int $$2) {
      return cab.a((Function<cab.b<bvd>, ? extends App<cab.c<bvd>, cae<bvd>>>)($$3 -> $$3.group($$3.c(cdz.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               jg $$7 = $$5.dx();
               ezh $$8;
               if ($$4.c($$7)) {
                  $$8 = cft.a($$5, $$1, $$2);
               } else {
                  ki $$9 = ki.a($$7);
                  ki $$10 = bwq.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cfq.a($$5, $$1, $$2, ezh.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cft.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cec($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
