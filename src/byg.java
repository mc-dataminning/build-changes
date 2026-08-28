import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class byg {
   public static byi<bve> a(float $$0) {
      return cak.a((Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$1 -> $$1.group($$1.c(cei.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dy())) {
                  return false;
               } else {
                  Optional<ezr> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cel($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ezr a(arq $$0, bve $$1) {
      azv $$2 = $$1.eb();
      jh $$3 = $$1.dy();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jh $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ezr.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arq $$0, bve $$1, jh $$2) {
      return $$0.h($$2) && (double)$$0.a(ebj.a.e, $$2).v() <= $$1.dF();
   }
}
