import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cav {
   private static final int a = 10;
   private static final int b = 7;

   public static bzc<bwg> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bzc<bwg> a(float $$0, int $$1, int $$2) {
      return cbe.a((Function<cbe.b<bwg>, ? extends App<cbe.c<bwg>, cbh<bwg>>>)($$3 -> $$3.group($$3.c(cfc.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ji $$7 = $$5.du();
               fbx $$8;
               if ($$4.c($$7)) {
                  $$8 = cgw.a($$5, $$1, $$2);
               } else {
                  kk $$9 = kk.a($$7);
                  kk $$10 = bxt.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cgt.a($$5, $$1, $$2, fbx.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cgw.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cff($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
