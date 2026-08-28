import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzg {
   private static final int a = 1;

   public static bxz<bwf> a(float $$0) {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$1 -> $$1.group($$1.a(cfj.n), $$1.c(cfj.m), $$1.b(cfj.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bvj $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new byj($$8, true));
                           $$3.a(new cfm(new byj($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
