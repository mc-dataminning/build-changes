import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brg {
   private static final int a = 36;

   public static boc<bmk> a() {
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$0 -> $$0.group($$0.a(bvm.x), $$0.a(bvm.y), $$0.a(bvm.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bmk>a($$2).filter($$1xx -> $$1xx.f((blu)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dO().a($$4.Y(), $$4.X());
                     }

                     return true;
                  }))
      );
   }
}
