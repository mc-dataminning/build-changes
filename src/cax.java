import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cax {
   public static bxa<bvg> a() {
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$0 -> $$0.group($$0.a(cek.n), $$0.a(cek.az), $$0.a(cek.ay), $$0.c(cek.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<ji> $$7 = $$0.<bvg>a($$3).map(buk::dw).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bxc($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
