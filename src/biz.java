import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class biz {
   public static bjb<bfz> a(float $$0) {
      return bld.a((Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$1 -> $$1.group($$1.c(bpb.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.g($$3.di())) {
                  return false;
               } else {
                  Optional<eei> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bpe($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eei a(aif $$0, bfz $$1) {
      apf $$2 = $$1.ec();
      gu $$3 = $$1.di();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         gu $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return eei.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aif $$0, bfz $$1, gu $$2) {
      return $$0.g($$2) && (double)$$0.a(dhk.a.e, $$2).v() <= $$1.dp();
   }
}
