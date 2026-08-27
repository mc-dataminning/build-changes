import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxl {
   private static final int a = 10;
   private static final int b = 7;

   public static bvs<bsx> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bvs<bsx> a(float $$0, int $$1, int $$2) {
      return bxu.a((Function<bxu.b<bsx>, ? extends App<bxu.c<bsx>, bxx<bsx>>>)($$3 -> $$3.group($$3.c(cbs.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               io $$7 = $$5.dp();
               euk $$8;
               if ($$4.c($$7)) {
                  $$8 = cdm.a($$5, $$1, $$2);
               } else {
                  jq $$9 = jq.a($$7);
                  jq $$10 = buj.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cdj.a($$5, $$1, $$2, euk.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cdm.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cbv($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
