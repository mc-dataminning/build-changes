import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzv {
   public static bzx<byf> a(chh<?> $$0, int $$1) {
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$2 -> $$2.group($$2.a(chh.p), $$2.c(chh.ay), $$2.b($$0))
               .apply($$2, $$2.a(() -> "[BecomePassive if " + $$0 + " present]", ($$1xx, $$2x, $$3) -> ($$3x, $$4, $$5) -> {
                     $$2x.a(true, (long)$$1);
                     $$1xx.b();
                     return true;
                  })))
      );
   }
}
