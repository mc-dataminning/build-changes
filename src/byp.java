import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byp {
   private static final int a = 36;

   public static bvl<btr> a() {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$0 -> $$0.group($$0.a(ccv.x), $$0.a(ccv.y), $$0.a(ccv.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<btr>a($$2).filter($$1xx -> $$1xx.g((bsw)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dS().a($$4.aa(), $$4.Z());
                     }

                     return true;
                  }))
      );
   }
}
