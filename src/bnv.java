import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnv {
   private static final int a = 10;
   private static final int b = 7;

   public static bmc<bjk> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bmc<bjk> a(float $$0, int $$1, int $$2) {
      return boe.a((Function<boe.b<bjk>, ? extends App<boe.c<bjk>, boh<bjk>>>)($$3 -> $$3.group($$3.c(bsc.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               gw $$7 = $$5.dk();
               ehi $$8;
               if ($$4.b($$7)) {
                  $$8 = btu.a($$5, $$1, $$2);
               } else {
                  hz $$9 = hz.a($$7);
                  hz $$10 = bku.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = btr.a($$5, $$1, $$2, ehi.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = btu.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bsf($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
