import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byk {
   private static final int a = 36;

   public static bvg<btl> a() {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$0 -> $$0.group($$0.a(ccq.x), $$0.a(ccq.y), $$0.a(ccq.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<btl>a($$2).filter($$1xx -> $$1xx.g((bsq)$$5) <= 36.0).isPresent();
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
