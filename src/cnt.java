import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cnt<E extends cnl> {
   public static bxa<bvg> a(int $$0) {
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$1 -> $$1.group($$1.b(cek.ad), $$1.a(cek.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fa().f()) {
                        return false;
                     } else {
                        Optional<clb> $$7 = $$1.a($$3);
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
