import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bxn {
   public static <E extends bsy> bwc<E> a(List<Pair<? extends byh<? super E>, Integer>> $$0) {
      return a($$0, bvf.a.b, bvf.b.a);
   }

   public static <E extends bsy> bwc<E> a(List<Pair<? extends byh<? super E>, Integer>> $$0, bvf.a $$1, bvf.b $$2) {
      bxa<byh<? super E>> $$3 = new bxa<>();
      $$0.forEach($$1x -> $$3.a((byh<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bye.a((Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$3x -> $$3x.a((byh<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvf.a.b) {
               $$3.a();
            }

            for (byh<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvf.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
