import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bzz {
   public static cab<bwz> a(float $$0) {
      return ccd.a((Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$1 -> $$1.group($$1.c(cgb.n)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<fdw> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cge($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fdw a(aro $$0, bwz $$1) {
      azt $$2 = $$1.dY();
      iu $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         iu $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fdw.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aro $$0, bwz $$1, iu $$2) {
      return $$0.h($$2) && (double)$$0.a(efn.a.e, $$2).v() <= $$1.dC();
   }
}
