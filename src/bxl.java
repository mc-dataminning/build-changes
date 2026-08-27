import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxl {
   private static final int a = 36;

   public static buh<bso> a() {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$0 -> $$0.group($$0.a(cbr.x), $$0.a(cbr.y), $$0.a(cbr.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bso>a($$2).filter($$1xx -> $$1xx.g((brv)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dZ().a($$4.aa(), $$4.Z());
                     }

                     return true;
                  }))
      );
   }
}
