import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cay {
   private static final int a = 10;
   private static final int b = 7;

   public static bzf<bwj> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bzf<bwj> a(float $$0, int $$1, int $$2) {
      return cbh.a((Function<cbh.b<bwj>, ? extends App<cbh.c<bwj>, cbk<bwj>>>)($$3 -> $$3.group($$3.c(cff.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               jh $$7 = $$5.dv();
               fbs $$8;
               if ($$4.c($$7)) {
                  $$8 = cgz.a($$5, $$1, $$2);
               } else {
                  kj $$9 = kj.a($$7);
                  kj $$10 = bxw.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cgw.a($$5, $$1, $$2, fbs.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cgz.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cfi($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
