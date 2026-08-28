import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzy {
   private static final int a = 36;

   public static bwu<bva> a() {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$0 -> $$0.group($$0.a(cee.x), $$0.a(cee.y), $$0.a(cee.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bva>a($$2).filter($$1xx -> $$1xx.g((bue)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.ed().a($$4.ab(), $$4.aa());
                     }

                     return true;
                  }))
      );
   }
}
