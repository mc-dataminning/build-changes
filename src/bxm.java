import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxm {
   private static final int a = 36;

   public static bui<bso> a() {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$0 -> $$0.group($$0.a(cbs.x), $$0.a(cbs.y), $$0.a(cbs.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bso>a($$2).filter($$1xx -> $$1xx.g((bru)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dS().a($$4.Z(), $$4.Y());
                     }

                     return true;
                  }))
      );
   }
}
