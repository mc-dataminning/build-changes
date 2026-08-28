import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bwo {
   public static bwq<btl> a(float $$0) {
      return bys.a((Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$1 -> $$1.group($$1.c(ccq.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dq())) {
                  return false;
               } else {
                  Optional<eww> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cct($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eww a(aqt $$0, btl $$1) {
      ayv $$2 = $$1.dT();
      jd $$3 = $$1.dq();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jd $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return eww.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aqt $$0, btl $$1, jd $$2) {
      return $$0.h($$2) && (double)$$0.a(dyv.a.e, $$2).v() <= $$1.dx();
   }
}
