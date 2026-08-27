import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class btt {
   private static final int a = 10;
   private static final int b = 7;

   public static bsa<bpf> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bsa<bpf> a(float $$0, int $$1, int $$2) {
      return buc.a((Function<buc.b<bpf>, ? extends App<buc.c<bpf>, buf<bpf>>>)($$3 -> $$3.group($$3.c(bya.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ib $$7 = $$5.dj();
               eov $$8;
               if ($$4.c($$7)) {
                  $$8 = bzu.a($$5, $$1, $$2);
               } else {
                  jd $$9 = jd.a($$7);
                  jd $$10 = bqr.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = bzr.a($$5, $$1, $$2, eov.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bzu.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new byd($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
