import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bvk {
   private static final int a = 10;
   private static final int b = 7;

   public static btr<bqw> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static btr<bqw> a(float $$0, int $$1, int $$2) {
      return bvt.a((Function<bvt.b<bqw>, ? extends App<bvt.c<bqw>, bvw<bqw>>>)($$3 -> $$3.group($$3.c(bzr.m)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
               ib $$7 = $$5.dm();
               esa $$8;
               if ($$4.c($$7)) {
                  $$8 = cbl.a($$5, $$1, $$2);
               } else {
                  je $$9 = je.a($$7);
                  je $$10 = bsi.a($$4, $$9, 2);
                  if ($$10 != $$9) {
                     $$8 = cbi.a($$5, $$1, $$2, esa.c($$10.q()), (float) (Math.PI / 2));
                  } else {
                     $$8 = cbl.a($$5, $$1, $$2);
                  }
               }

               $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new bzu($$1xxxx, $$0, 0)));
               return true;
            })));
   }
}
