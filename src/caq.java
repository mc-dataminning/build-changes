import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class caq {
   public static <E extends bwb> bzf<E> a(List<Pair<? extends cbk<? super E>, Integer>> $$0) {
      return a($$0, byi.a.b, byi.b.a);
   }

   public static <E extends bwb> bzf<E> a(List<Pair<? extends cbk<? super E>, Integer>> $$0, byi.a $$1, byi.b $$2) {
      cad<cbk<? super E>> $$3 = new cad<>();
      $$0.forEach($$1x -> $$3.a((cbk<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cbh.a((Function<cbh.b<E>, ? extends App<cbh.c<E>, cbk<E>>>)($$3x -> $$3x.a((cbk<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == byi.a.b) {
               $$3.a();
            }

            for (cbk<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == byi.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
