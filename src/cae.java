import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cae {
   private static final int a = 36;

   public static bxa<bvg> a() {
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$0 -> $$0.group($$0.a(cek.x), $$0.a(cek.y), $$0.a(cek.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bvg>a($$2).filter($$1xx -> $$1xx.g((buk)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.eb().a($$4.ae(), $$4.ad());
                     }

                     return true;
                  }))
      );
   }
}
