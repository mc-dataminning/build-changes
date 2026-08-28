import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cbw {
   public static <E extends bxj> cal<E> a(List<Pair<? extends ccq<? super E>, Integer>> $$0) {
      return a($$0, bzo.a.b, bzo.b.a);
   }

   public static <E extends bxj> cal<E> a(List<Pair<? extends ccq<? super E>, Integer>> $$0, bzo.a $$1, bzo.b $$2) {
      cbj<ccq<? super E>> $$3 = new cbj<>();
      $$0.forEach($$1x -> $$3.a((ccq<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return ccn.a((Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$3x -> $$3x.a((ccq<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bzo.a.b) {
               $$3.a();
            }

            for (ccq<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bzo.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
