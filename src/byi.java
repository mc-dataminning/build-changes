import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byi {
   private static final int a = 36;

   public static bve<btk> a() {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$0 -> $$0.group($$0.a(cco.x), $$0.a(cco.y), $$0.a(cco.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<btk>a($$2).filter($$1xx -> $$1xx.g((bsp)$$5) <= 36.0).isPresent();
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
