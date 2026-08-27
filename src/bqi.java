import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bqi {
   public static <E extends blv> box<E> a(List<Pair<? extends brc<? super E>, Integer>> $$0) {
      return a($$0, boa.a.b, boa.b.a);
   }

   public static <E extends blv> box<E> a(List<Pair<? extends brc<? super E>, Integer>> $$0, boa.a $$1, boa.b $$2) {
      bpv<brc<? super E>> $$3 = new bpv<>();
      $$0.forEach($$1x -> $$3.a((brc<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bqz.a((Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$3x -> $$3x.a((brc<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == boa.a.b) {
               $$3.a();
            }

            for (brc<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == boa.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
