import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bul {
   private static final int a = 10;
   private static final int b = 7;

   public static bss<bpx> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bss<bpx> a(float $$0, int $$1, int $$2) {
      return buu.a((Function<buu.b<bpx>, ? extends App<buu.c<bpx>, bux<bpx>>>)($$3 -> $$3.group($$3.c(bys.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ib $$7 = $$5.dm();
               ept $$8;
               if ($$4.c($$7)) {
                  $$8 = cam.a($$5, $$1, $$2);
               } else {
                  je $$9 = je.a($$7);
                  je $$10 = brj.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = caj.a($$5, $$1, $$2, ept.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cam.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new byv($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
