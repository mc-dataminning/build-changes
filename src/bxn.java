import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxn {
   private static final int a = 10;
   private static final int b = 7;

   public static bvu<bsz> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static bvu<bsz> a(float $$0, int $$1, int $$2) {
      return bxw.a((Function<bxw.b<bsz>, ? extends App<bxw.c<bsz>, bxz<bsz>>>)($$3 -> $$3.group($$3.c(cbu.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               io $$7 = $$5.dp();
               eum $$8;
               if ($$4.c($$7)) {
                  $$8 = cdo.a($$5, $$1, $$2);
               } else {
                  jq $$9 = jq.a($$7);
                  jq $$10 = bul.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cdl.a($$5, $$1, $$2, eum.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cdo.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cbx($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
