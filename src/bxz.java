import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxz {
   private static final int a = 36;

   public static buv<btb> a() {
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$0 -> $$0.group($$0.a(ccf.x), $$0.a(ccf.y), $$0.a(ccf.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<btb>a($$2).filter($$1xx -> $$1xx.g((bsg)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dU().a($$4.aa(), $$4.Z());
                     }

                     return true;
                  }))
      );
   }
}
