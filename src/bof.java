import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bof {
   public static boh<blg> a(float $$0) {
      return bqj.a((Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$1 -> $$1.group($$1.c(buh.m)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
               if ($$2.g($$3.dn())) {
                  return false;
               } else {
                  Optional<eju> $$5 = Optional.ofNullable(a($$2, $$3));
                  $$5.ifPresent($$2x -> $$1x.a(new buk($$2x, $$0, 0)));
                  return true;
               }
            })));
   }

   @Nullable
   private static eju a(ame $$0, blg $$1) {
      ats $$2 = $$1.eh();
      ht $$3 = $$1.dn();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         ht $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return eju.c($$5);
         }
      }

      return null;
   }

   public static boolean a(ame $$0, blg $$1, ht $$2) {
      return $$0.g($$2) && (double)$$0.a(dmr.a.e, $$2).v() <= $$1.du();
   }
}
