import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byj {
   private static final int a = 10;
   private static final int b = 7;

   public static bwq<btu> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bwq<btu> a(float $$0, int $$1, int $$2) {
      return bys.a((Function<bys.b<btu>, ? extends App<bys.c<btu>, byv<btu>>>)($$3 -> $$3.group($$3.c(ccq.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               jd $$7 = $$5.dq();
               eww $$8;
               if ($$4.c($$7)) {
                  $$8 = cek.a($$5, $$1, $$2);
               } else {
                  kf $$9 = kf.a($$7);
                  kf $$10 = bvh.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = ceh.a($$5, $$1, $$2, eww.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cek.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cct($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
