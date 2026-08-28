import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzy {
   private static final int a = 1;

   public static byr<bwz> a(float $$0) {
      return ccd.a(
         (Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$1 -> $$1.group($$1.a(cgb.o), $$1.c(cgb.n), $$1.b(cgb.t))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bZ()) {
                        return false;
                     } else {
                        bwa $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bzb($$8, true));
                           $$3.a(new cge(new bzb($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
