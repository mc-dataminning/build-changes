import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blw {
   private static final int a = 1;

   public static bkq<biy> a(float $$0) {
      return bob.a(
         (Function<bob.b<biy>, ? extends App<bob.c<biy>, boe<biy>>>)($$1 -> $$1.group($$1.a(brz.n), $$1.c(brz.m), $$1.b(brz.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bN()) {
                        return false;
                     } else {
                        bii $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bla($$8, true));
                           $$3.a(new bsc(new bla($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
