import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bza {
   public static bye<bva> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bye<bva> a(Predicate<bva> $$0, Function<bva, Float> $$1, int $$2) {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$3 -> $$3.group($$3.c(cee.m), $$3.b(cee.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new ceh($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
