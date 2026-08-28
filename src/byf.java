import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class byf {
   public static <E extends btq> bwu<E> a(List<Pair<? extends byz<? super E>, Integer>> $$0) {
      return a($$0, bvx.a.b, bvx.b.a);
   }

   public static <E extends btq> bwu<E> a(List<Pair<? extends byz<? super E>, Integer>> $$0, bvx.a $$1, bvx.b $$2) {
      bxs<byz<? super E>> $$3 = new bxs<>();
      $$0.forEach($$1x -> $$3.a((byz<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return byw.a((Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$3x -> $$3x.a((byz<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvx.a.b) {
               $$3.a();
            }

            for (byz<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvx.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
