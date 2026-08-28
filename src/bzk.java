import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzk {
   public static cay<bwl> a(bue $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static cay<bwl> a(bue $$0, Function<bxw, Float> $$1) {
      return cda.a(
         (Function<cda.b<bwl>, ? extends App<cda.c<bwl>, cdd<bwl>>>)($$2 -> $$2.group($$2.b(cgy.L), $$2.a(cgy.o), $$2.c(cgy.n))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bwl $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           chb $$10 = new chb(new bzy($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bzy($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
