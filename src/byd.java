import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class byd {
   public static <E extends btn> bws<E> a(List<Pair<? extends byx<? super E>, Integer>> $$0) {
      return a($$0, bvv.a.b, bvv.b.a);
   }

   public static <E extends btn> bws<E> a(List<Pair<? extends byx<? super E>, Integer>> $$0, bvv.a $$1, bvv.b $$2) {
      bxq<byx<? super E>> $$3 = new bxq<>();
      $$0.forEach($$1x -> $$3.a((byx<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return byu.a((Function<byu.b<E>, ? extends App<byu.c<E>, byx<E>>>)($$3x -> $$3x.a((byx<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvv.a.b) {
               $$3.a();
            }

            for (byx<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvv.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
