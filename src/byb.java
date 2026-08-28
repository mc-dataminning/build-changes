import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byb {
   private static final int a = 1;

   public static bwu<bva> a(float $$0) {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$1 -> $$1.group($$1.a(cee.n), $$1.c(cee.m), $$1.b(cee.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.ca()) {
                        return false;
                     } else {
                        bue $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bxe($$8, true));
                           $$3.a(new ceh(new bxe($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
