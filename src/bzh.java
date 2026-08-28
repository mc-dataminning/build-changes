import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bzh {
   public static bzj<bwf> a(float $$0) {
      return cbl.a((Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$1 -> $$1.group($$1.c(cfj.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.h($$3.dv())) {
                  return false;
               } else {
                  Optional<fbx> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new cfm($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static fbx a(ash $$0, bwf $$1) {
      bam $$2 = $$1.dY();
      jh $$3 = $$1.dv();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jh $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fbx.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ash $$0, bwf $$1, jh $$2) {
      return $$0.h($$2) && (double)$$0.a(edp.a.e, $$2).v() <= $$1.dC();
   }
}
