import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cok<E extends coc> {
   public static bxr<bvx> a(int $$0) {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$1 -> $$1.group($$1.b(cfb.ad), $$1.a(cfb.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fa().f()) {
                        return false;
                     } else {
                        Optional<cls> $$7 = $$1.a($$3);
                        if ($$7.isPresent() && $$7.get().a($$5, (double)$$0)) {
                           return false;
                        } else {
                           $$2.b();
                           return true;
                        }
                     }
                  }))
      );
   }
}
