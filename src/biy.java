import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class biy {
   private static final int a = 1;

   public static bhs<bfz> a(float $$0) {
      return bld.a(
         (Function<bld.b<bfz>, ? extends App<bld.c<bfz>, blg<bfz>>>)($$1 -> $$1.group($$1.a(bpb.n), $$1.c(bpb.m), $$1.b(bpb.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bM()) {
                        return false;
                     } else {
                        bfj $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.k($$8);
                        } else {
                           $$2.a(new bic($$8, true));
                           $$3.a(new bpe(new bic($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
