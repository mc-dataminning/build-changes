import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class caz {
   private static final int a = 36;

   public static bxv<bwb> a() {
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$0 -> $$0.group($$0.a(cff.x), $$0.a(cff.y), $$0.a(cff.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bwb>a($$2).filter($$1xx -> $$1xx.g((bvf)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.eb().a($$4.ad(), $$4.ac());
                     }

                     return true;
                  }))
      );
   }
}
