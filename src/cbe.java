import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cbe {
   public static <E extends bwr> bzt<E> a(List<Pair<? extends cby<? super E>, Integer>> $$0) {
      return a($$0, byw.a.b, byw.b.a);
   }

   public static <E extends bwr> bzt<E> a(List<Pair<? extends cby<? super E>, Integer>> $$0, byw.a $$1, byw.b $$2) {
      car<cby<? super E>> $$3 = new car<>();
      $$0.forEach($$1x -> $$3.a((cby<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cbv.a((Function<cbv.b<E>, ? extends App<cbv.c<E>, cby<E>>>)($$3x -> $$3x.a((cby<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == byw.a.b) {
               $$3.a();
            }

            for (cby<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == byw.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
