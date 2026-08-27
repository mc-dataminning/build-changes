import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnh {
   private static final int a = 1;

   public static bmb<bkj> a(float $$0) {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$1 -> $$1.group($$1.a(btk.n), $$1.c(btk.m), $$1.b(btk.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bN()) {
                        return false;
                     } else {
                        bjt $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bml($$8, true));
                           $$3.a(new btn(new bml($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
