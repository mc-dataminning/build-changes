import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cab {
   private static final int a = 10;
   private static final int b = 7;

   public static byi<bvm> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static byi<bvm> a(float $$0, int $$1, int $$2) {
      return cak.a((Function<cak.b<bvm>, ? extends App<cak.c<bvm>, can<bvm>>>)($$3 -> $$3.group($$3.c(cei.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               jh $$7 = $$5.dy();
               ezr $$8;
               if ($$4.c($$7)) {
                  $$8 = cgc.a($$5, $$1, $$2);
               } else {
                  kj $$9 = kj.a($$7);
                  kj $$10 = bwz.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cfz.a($$5, $$1, $$2, ezr.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cgc.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cel($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
