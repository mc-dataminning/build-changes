import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bto {
   private static final int a = 1;

   public static bsh<bqo> a(float $$0) {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$1 -> $$1.group($$1.a(bzr.n), $$1.c(bzr.m), $$1.b(bzr.s))
               .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$6.bO()) {
                        return false;
                     } else {
                        bpv $$8 = $$1.b($$4);
                        if ($$8.a($$6, 1.0)) {
                           $$6.n($$8);
                        } else {
                           $$2.a(new bsr($$8, true));
                           $$3.a(new bzu(new bsr($$8, false), $$0, 1));
                        }

                        return true;
                     }
                  }))
      );
   }
}
