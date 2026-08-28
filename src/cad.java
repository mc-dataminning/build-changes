import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cad {
   private static final int a = 10;
   private static final int b = 7;

   public static byk<bvo> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static byk<bvo> a(float $$0, int $$1, int $$2) {
      return cam.a((Function<cam.b<bvo>, ? extends App<cam.c<bvo>, cap<bvo>>>)($$3 -> $$3.group($$3.c(cek.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ji $$7 = $$5.dv();
               faz $$8;
               if ($$4.c($$7)) {
                  $$8 = cge.a($$5, $$1, $$2);
               } else {
                  kk $$9 = kk.a($$7);
                  kk $$10 = bxb.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cgb.a($$5, $$1, $$2, faz.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cge.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cen($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
