import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxo {
   private static final int a = 36;

   public static buk<bsq> a() {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$0 -> $$0.group($$0.a(cbu.x), $$0.a(cbu.y), $$0.a(cbu.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bsq>a($$2).filter($$1xx -> $$1xx.g((brw)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dS().a($$4.Z(), $$4.Y());
                     }

                     return true;
                  }))
      );
   }
}
