import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwb {
   private static final int a = 36;

   public static bsx<bre> a() {
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$0 -> $$0.group($$0.a(cah.x), $$0.a(cah.y), $$0.a(cah.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bre>a($$2).filter($$1xx -> $$1xx.g((bql)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dQ().a($$4.Z(), $$4.Y());
                     }

                     return true;
                  }))
      );
   }
}
