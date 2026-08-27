import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bku {
   private static final int a = 10;
   private static final int b = 7;

   public static bjb<bgi> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bjb<bgi> a(float $$0, int $$1, int $$2) {
      return bld.a((Function<bld.b<bgi>, ? extends App<bld.c<bgi>, blg<bgi>>>)($$3 -> $$3.group($$3.c(bpb.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               gu $$7 = $$5.di();
               eei $$8;
               if ($$4.b($$7)) {
                  $$8 = bqt.a($$5, $$1, $$2);
               } else {
                  hx $$9 = hx.a($$7);
                  hx $$10 = bht.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = bqq.a($$5, $$1, $$2, eei.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = bqt.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bpe($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
