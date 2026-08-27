import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bte {
   private static id a(bqv $$0, id $$1) {
      axt $$2 = $$0.dM().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(axt $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bqv> btw<E> a(bzw<id> $$0, int $$1, float $$2) {
      return bvy.a(
         (Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bzw.o), $$3.c(bzw.m), $$3.a(bzw.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     id $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dm(), (double)$$1);
                     if (!$$8) {
                        bsn.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
