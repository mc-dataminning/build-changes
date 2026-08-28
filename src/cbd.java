import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbd {
   private static final int a = 36;

   public static bxz<bwf> a() {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$0 -> $$0.group($$0.a(cfj.x), $$0.a(cfj.y), $$0.a(cfj.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bwf>a($$2).filter($$1xx -> $$1xx.g((bvj)$$5) <= 36.0).isPresent();
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
