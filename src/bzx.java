import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bzx {
   public static <E extends bvi> bym<E> a(List<Pair<? extends car<? super E>, Integer>> $$0) {
      return a($$0, bxp.a.b, bxp.b.a);
   }

   public static <E extends bvi> bym<E> a(List<Pair<? extends car<? super E>, Integer>> $$0, bxp.a $$1, bxp.b $$2) {
      bzk<car<? super E>> $$3 = new bzk<>();
      $$0.forEach($$1x -> $$3.a((car<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cao.a((Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>>)($$3x -> $$3x.a((car<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bxp.a.b) {
               $$3.a();
            }

            for (car<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bxp.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
