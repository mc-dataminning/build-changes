import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxy {
   private static final int a = 10;
   private static final int b = 7;

   public static bwf<btk> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bwf<btk> a(float $$0, int $$1, int $$2) {
      return byh.a((Function<byh.b<btk>, ? extends App<byh.c<btk>, byk<btk>>>)($$3 -> $$3.group($$3.c(ccf.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ja $$7 = $$5.dq();
               ewf $$8;
               if ($$4.c($$7)) {
                  $$8 = cdz.a($$5, $$1, $$2);
               } else {
                  kc $$9 = kc.a($$7);
                  kc $$10 = buw.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cdw.a($$5, $$1, $$2, ewf.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cdz.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cci($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
