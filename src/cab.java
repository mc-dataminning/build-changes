import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cab {
   private static final int a = 1;

   public static byu<bxc> a(float $$0) {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$1 -> $$1.group($$1.a(cge.o), $$1.c(cge.n), $$1.b(cge.t))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bwd $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bze($$8, true));
                           $$3.a(new cgh(new bze($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
