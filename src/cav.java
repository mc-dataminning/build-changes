import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cav {
   private static final int a = 1;

   public static bzo<bxw> a(float $$0) {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$1 -> $$1.group($$1.a(cgy.o), $$1.c(cgy.n), $$1.b(cgy.t))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bY()) {
                        return false;
                     } else {
                        bwv $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bzy($$8, true));
                           $$3.a(new chb(new bzy($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
