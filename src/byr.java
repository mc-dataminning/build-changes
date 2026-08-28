import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byr {
   public static cae<bxe> a(int $$0, float $$1) {
      return ccg.a(
         (Function<ccg.b<bxe>, ? extends App<ccg.c<bxe>, ccj<bxe>>>)($$2 -> $$2.group($$2.c(cge.n), $$2.a(cge.o), $$2.b(cge.p), $$2.b(cge.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bxc $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cgg>b($$6).a($$9)) {
                        $$4.a(new bze($$9, true));
                        $$7.L().a(-$$1, 0.0F);
                        $$7.w(azm.c($$7.dL(), $$7.aX, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
