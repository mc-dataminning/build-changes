import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bze {
   public static byi<bve> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static byi<bve> a(Predicate<bve> $$0, Function<bve, Float> $$1, int $$2) {
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$3 -> $$3.group($$3.c(cei.m), $$3.b(cei.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new cel($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
