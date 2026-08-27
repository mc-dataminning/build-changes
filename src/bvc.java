import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bvc {
   public static <E extends bqo> btr<E> a(List<Pair<? extends bvw<? super E>, Integer>> $$0) {
      return a($$0, bsu.a.b, bsu.b.a);
   }

   public static <E extends bqo> btr<E> a(List<Pair<? extends bvw<? super E>, Integer>> $$0, bsu.a $$1, bsu.b $$2) {
      bup<bvw<? super E>> $$3 = new bup<>();
      $$0.forEach($$1x -> $$3.a((bvw<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bvt.a((Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$3x -> $$3x.a((bvw<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bsu.a.b) {
               $$3.a();
            }

            for (bvw<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bsu.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
