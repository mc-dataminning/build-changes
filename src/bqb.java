import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqb {
   private static final int a = 36;

   public static bmy<blg> a() {
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$0 -> $$0.group($$0.a(buh.x), $$0.a(buh.y), $$0.a(buh.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<blg>a($$2).filter($$1xx -> $$1xx.f((bkq)$$5) <= 36.0).isPresent();
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
