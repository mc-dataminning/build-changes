import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cam {
   public static <E extends bvx> bzb<E> a(List<Pair<? extends cbg<? super E>, Integer>> $$0) {
      return a($$0, bye.a.b, bye.b.a);
   }

   public static <E extends bvx> bzb<E> a(List<Pair<? extends cbg<? super E>, Integer>> $$0, bye.a $$1, bye.b $$2) {
      bzz<cbg<? super E>> $$3 = new bzz<>();
      $$0.forEach($$1x -> $$3.a((cbg<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cbd.a((Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$3x -> $$3x.a((cbg<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bye.a.b) {
               $$3.a();
            }

            for (cbg<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bye.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
