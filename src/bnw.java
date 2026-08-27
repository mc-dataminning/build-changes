import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnw {
   private static final int a = 36;

   public static bkt<bjb> a() {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$0 -> $$0.group($$0.a(bsc.x), $$0.a(bsc.y), $$0.a(bsc.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bjb>a($$2).filter($$1xx -> $$1xx.f((bil)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dM().a($$4.W(), $$4.V());
                     }

                     return true;
                  }))
      );
   }
}
