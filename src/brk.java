import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brk {
   private static final int a = 36;

   public static bog<bmo> a() {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$0 -> $$0.group($$0.a(bvq.x), $$0.a(bvq.y), $$0.a(bvq.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bmo>a($$2).filter($$1xx -> $$1xx.f((blw)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dN().a($$4.Y(), $$4.X());
                     }

                     return true;
                  }))
      );
   }
}
