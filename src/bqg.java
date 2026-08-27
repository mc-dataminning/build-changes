import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqg {
   private static final int a = 36;

   public static bnd<bll> a() {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$0 -> $$0.group($$0.a(bum.x), $$0.a(bum.y), $$0.a(bum.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bll>a($$2).filter($$1xx -> $$1xx.f((bkv)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dP().a($$4.X(), $$4.W());
                     }

                     return true;
                  }))
      );
   }
}
