import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzj {
   private static final int a = 10;
   private static final int b = 7;

   public static bxq<buv> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bxq<buv> a(float $$0, int $$1, int $$2) {
      return bzs.a((Function<bzs.b<buv>, ? extends App<bzs.c<buv>, bzv<buv>>>)($$3 -> $$3.group($$3.c(cdq.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               jf $$7 = $$5.ds();
               eyw $$8;
               if ($$4.c($$7)) {
                  $$8 = cfk.a($$5, $$1, $$2);
               } else {
                  kh $$9 = kh.a($$7);
                  kh $$10 = bwh.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cfh.a($$5, $$1, $$2, eyw.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cfk.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cdt($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
