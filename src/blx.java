import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blx {
   private static final int a = 1;

   public static bkr<biy> a(float $$0) {
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$1 -> $$1.group($$1.a(bsa.n), $$1.c(bsa.m), $$1.b(bsa.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bN()) {
                        return false;
                     } else {
                        bii $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new blb($$8, true));
                           $$3.a(new bsd(new blb($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
