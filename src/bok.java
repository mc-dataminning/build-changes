import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bok {
   public static bom<bll> a(float $$0) {
      return bqo.a((Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$1 -> $$1.group($$1.c(bum.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.g($$3.dn())) {
                  return false;
               } else {
                  Optional<ejz> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new bup($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static ejz a(ami $$0, bll $$1) {
      atw $$2 = $$1.eh();
      hx $$3 = $$1.dn();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         hx $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return ejz.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ami $$0, bll $$1, hx $$2) {
      return $$0.g($$2) && (double)$$0.a(dmw.a.e, $$2).v() <= $$1.du();
   }
}
