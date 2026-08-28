import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbe {
   private static final int a = 36;

   public static bya<bwg> a() {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$0 -> $$0.group($$0.a(cfk.x), $$0.a(cfk.y), $$0.a(cfk.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bwg>a($$2).filter($$1xx -> $$1xx.g((bvk)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.ec().a($$4.ad(), $$4.ac());
                     }

                     return true;
                  }))
      );
   }
}
