import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqn {
   public static bsa<boz> a(int $$0, float $$1) {
      return buc.a(
         (Function<buc.b<boz>, ? extends App<buc.c<boz>, buf<boz>>>)($$2 -> $$2.group($$2.c(bya.m), $$2.a(bya.n), $$2.b(bya.o), $$2.b(bya.h))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                     box $$9 = $$2.b($$5);
                     if ($$9.a($$7, (double)$$0) && $$2.<byc>b($$6).a($$9)) {
                        $$4.a(new bra($$9, true));
                        $$7.K().a(-$$1, 0.0F);
                        $$7.r(awm.c($$7.dz(), $$7.aX, 0.0F));
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
