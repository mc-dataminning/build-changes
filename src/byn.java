import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byn {
   private static final int a = 36;

   public static bvj<btp> a() {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$0 -> $$0.group($$0.a(cct.x), $$0.a(cct.y), $$0.a(cct.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<btp>a($$2).filter($$1xx -> $$1xx.g((bsu)$$5) <= 36.0).isPresent();
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
