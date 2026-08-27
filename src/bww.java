import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bww {
   private static final int a = 10;
   private static final int b = 7;

   public static bvd<bsi> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bvd<bsi> a(float $$0, int $$1, int $$2) {
      return bxf.a((Function<bxf.b<bsi>, ? extends App<bxf.c<bsi>, bxi<bsi>>>)($$3 -> $$3.group($$3.c(cbd.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               in $$7 = $$5.dn();
               etp $$8;
               if ($$4.c($$7)) {
                  $$8 = ccx.a($$5, $$1, $$2);
               } else {
                  jp $$9 = jp.a($$7);
                  jp $$10 = btu.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = ccu.a($$5, $$1, $$2, etp.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = ccx.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cbg($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
