import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class byc {
   public static bye<bva> a(float $$0) {
      return cag.a((Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$1 -> $$1.group($$1.c(cee.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dx())) {
                  return false;
               } else {
                  Optional<ezn> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new ceh($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ezn a(arn $$0, bva $$1) {
      azs $$2 = $$1.ea();
      jh $$3 = $$1.dx();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jh $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ezn.c($$5);
         }
      }

      return null;
   }

   public static boolean a(arn $$0, bva $$1, jh $$2) {
      return $$0.h($$2) && (double)$$0.a(ebf.a.e, $$2).v() <= $$1.dE();
   }
}
