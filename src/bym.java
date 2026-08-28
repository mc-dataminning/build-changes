import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bym {
   private static final int a = 36;

   public static bvi<bto> a() {
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$0 -> $$0.group($$0.a(ccs.x), $$0.a(ccs.y), $$0.a(ccs.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bto>a($$2).filter($$1xx -> $$1xx.g((bst)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dS().a($$4.aa(), $$4.Z());
                     }

                     return true;
                  }))
      );
   }
}
