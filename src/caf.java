import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class caf {
   private static final int a = 10;
   private static final int b = 7;

   public static bym<bvq> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bym<bvq> a(float $$0, int $$1, int $$2) {
      return cao.a((Function<cao.b<bvq>, ? extends App<cao.c<bvq>, car<bvq>>>)($$3 -> $$3.group($$3.c(cem.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ji $$7 = $$5.dv();
               fbb $$8;
               if ($$4.c($$7)) {
                  $$8 = cgg.a($$5, $$1, $$2);
               } else {
                  kk $$9 = kk.a($$7);
                  kk $$10 = bxd.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cgd.a($$5, $$1, $$2, fbb.c($$10.k()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cgg.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cep($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
