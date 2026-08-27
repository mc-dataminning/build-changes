import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bqy {
   public static <E extends bml> bpn<E> a(List<Pair<? extends brs<? super E>, Integer>> $$0) {
      return a($$0, boq.a.b, boq.b.a);
   }

   public static <E extends bml> bpn<E> a(List<Pair<? extends brs<? super E>, Integer>> $$0, boq.a $$1, boq.b $$2) {
      bql<brs<? super E>> $$3 = new bql<>();
      $$0.forEach($$1x -> $$3.a((brs<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return brp.a((Function<brp.b<E>, ? extends App<brp.c<E>, brs<E>>>)($$3x -> $$3x.a((brs<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == boq.a.b) {
               $$3.a();
            }

            for (brs<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == boq.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
