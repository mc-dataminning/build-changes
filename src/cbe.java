import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbe {
   private static final int a = 1;

   public static bzx<byf> a(float $$0) {
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$1 -> $$1.group($$1.a(chh.o), $$1.c(chh.n), $$1.b(chh.t))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bY()) {
                        return false;
                     } else {
                        bxe $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new cah($$8, true));
                           $$3.a(new chk(new cah($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
