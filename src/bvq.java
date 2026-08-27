import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvq {
   private static final int a = 36;

   public static bsm<bqt> a() {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$0 -> $$0.group($$0.a(bzw.x), $$0.a(bzw.y), $$0.a(bzw.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bqt>a($$2).filter($$1xx -> $$1xx.g((bqa)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dP().a($$4.Z(), $$4.Y());
                     }

                     return true;
                  }))
      );
   }
}
