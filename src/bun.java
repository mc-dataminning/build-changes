import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bun {
   public static btr<bqo> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static btr<bqo> a(Predicate<bqo> $$0, Function<bqo, Float> $$1, int $$2) {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$3 -> $$3.group($$3.c(bzr.m), $$3.b(bzr.n)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  if (!$$0.test($$7)) {
                     return false;
                  } else {
                     $$4.a(new bzu($$3.b($$5), $$1.apply($$7), $$2));
                     return true;
                  }
               }))
      );
   }
}
