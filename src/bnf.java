import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnf {
   public static ble<bjm> a() {
      return bop.a((Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$0 -> $$0.a((bos<bjm>)(($$0x, $$1, $$2) -> {
            if ($$0x.z.a(20) != 0) {
               return false;
            } else {
               bkm<?> $$3 = $$1.dN();
               cdh $$4 = $$0x.c($$1.dl());
               if ($$4 != null) {
                  if ($$4.c() && !$$4.b()) {
                     $$3.b(cdl.h);
                     $$3.a(cdl.h);
                  } else {
                     $$3.b(cdl.i);
                     $$3.a(cdl.i);
                  }
               }

               return true;
            }
         }))));
   }
}
