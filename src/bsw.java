import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bsw {
   public static bsa<box> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bsa<box> a(Predicate<box> $$0, Function<box, Float> $$1, int $$2) {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$3 -> $$3.group($$3.c(bya.m), $$3.b(bya.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new byd($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
