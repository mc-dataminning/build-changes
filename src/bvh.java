import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bvh {
   public static <E extends bqt> btw<E> a(List<Pair<? extends bwb<? super E>, Integer>> $$0) {
      return a($$0, bsz.a.b, bsz.b.a);
   }

   public static <E extends bqt> btw<E> a(List<Pair<? extends bwb<? super E>, Integer>> $$0, bsz.a $$1, bsz.b $$2) {
      buu<bwb<? super E>> $$3 = new buu<>();
      $$0.forEach($$1x -> $$3.a((bwb<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bvy.a((Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$3x -> $$3x.a((bwb<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bsz.a.b) {
               $$3.a();
            }

            for (bwb<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bsz.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
