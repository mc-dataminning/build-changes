import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class byg {
   public static <E extends btr> bwv<E> a(List<Pair<? extends bza<? super E>, Integer>> $$0) {
      return a($$0, bvy.a.b, bvy.b.a);
   }

   public static <E extends btr> bwv<E> a(List<Pair<? extends bza<? super E>, Integer>> $$0, bvy.a $$1, bvy.b $$2) {
      bxt<bza<? super E>> $$3 = new bxt<>();
      $$0.forEach($$1x -> $$3.a((bza<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return byx.a((Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>>)($$3x -> $$3x.a((bza<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvy.a.b) {
               $$3.a();
            }

            for (bza<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvy.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
