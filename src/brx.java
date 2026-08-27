import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brx {
   private static final int a = 1;

   public static bqq<box> a(float $$0) {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$1 -> $$1.group($$1.a(bya.n), $$1.c(bya.m), $$1.b(bya.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bL()) {
                        return false;
                     } else {
                        bof $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.m($$8);
                        } else {
                           $$2.a(new bra($$8, true));
                           $$3.a(new byd(new bra($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
