import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bxq {
   public static <E extends btb> bwf<E> a(List<Pair<? extends byk<? super E>, Integer>> $$0) {
      return a($$0, bvi.a.b, bvi.b.a);
   }

   public static <E extends btb> bwf<E> a(List<Pair<? extends byk<? super E>, Integer>> $$0, bvi.a $$1, bvi.b $$2) {
      bxd<byk<? super E>> $$3 = new bxd<>();
      $$0.forEach($$1x -> $$3.a((byk<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return byh.a((Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$3x -> $$3x.a((byk<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvi.a.b) {
               $$3.a();
            }

            for (byk<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvi.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
