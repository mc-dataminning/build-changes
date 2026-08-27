import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boh {
   private static final int a = 36;

   public static ble<bjm> a() {
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$0 -> $$0.group($$0.a(bsn.x), $$0.a(bsn.y), $$0.a(bsn.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bjm>a($$2).filter($$1xx -> $$1xx.f((biw)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dN().a($$4.W(), $$4.V());
                     }

                     return true;
                  }))
      );
   }
}
