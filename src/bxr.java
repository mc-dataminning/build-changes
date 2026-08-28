import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bxr {
   public static <E extends btc> bwg<E> a(List<Pair<? extends byl<? super E>, Integer>> $$0) {
      return a($$0, bvj.a.b, bvj.b.a);
   }

   public static <E extends btc> bwg<E> a(List<Pair<? extends byl<? super E>, Integer>> $$0, bvj.a $$1, bvj.b $$2) {
      bxe<byl<? super E>> $$3 = new bxe<>();
      $$0.forEach($$1x -> $$3.a((byl<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return byi.a((Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$3x -> $$3x.a((byl<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvj.a.b) {
               $$3.a();
            }

            for (byl<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvj.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
