import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byt {
   public static cag<bxg> a(int $$0, float $$1) {
      return cci.a(
         (Function<cci.b<bxg>, ? extends App<cci.c<bxg>, ccl<bxg>>>)($$2 -> $$2.group($$2.c(cgg.n), $$2.a(cgg.o), $$2.b(cgg.p), $$2.b(cgg.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     bxe $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<cgi>b($$6).a($$9)) {
                        $$4.a(new bzg($$9, true));
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
