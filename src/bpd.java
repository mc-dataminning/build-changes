import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpd {
   private static final int a = 10;
   private static final int b = 7;

   public static bnk<bks> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bnk<bks> a(float $$0, int $$1, int $$2) {
      return bpm.a((Function<bpm.b<bks>, ? extends App<bpm.c<bks>, bpp<bks>>>)($$3 -> $$3.group($$3.c(btk.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ht $$7 = $$5.dl();
               eif $$8;
               if ($$4.b($$7)) {
                  $$8 = bvc.a($$5, $$1, $$2);
               } else {
                  iu $$9 = iu.a($$7);
                  iu $$10 = bmc.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = buz.a($$5, $$1, $$2, eif.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bvc.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new btn($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
