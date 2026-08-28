import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class ccf {
   private static final int a = 36;

   public static bzb<bxj> a() {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$0 -> $$0.group($$0.a(cgl.y), $$0.a(cgl.z), $$0.a(cgl.B))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bxj>a($$2).filter($$1xx -> $$1xx.g($$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.eb().a($$4.af(), $$4.ae());
                     }

                     return true;
                  }))
      );
   }
}
