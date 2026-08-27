import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bto {
   public static bss<bpp> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static bss<bpp> a(Predicate<bpp> $$0, Function<bpp, Float> $$1, int $$2) {
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$3 -> $$3.group($$3.c(bys.m), $$3.b(bys.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new byv($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
