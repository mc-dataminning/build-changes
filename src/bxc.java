import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bxc {
   public static <E extends bso> bvr<E> a(List<Pair<? extends bxw<? super E>, Integer>> $$0) {
      return a($$0, buu.a.b, buu.b.a);
   }

   public static <E extends bso> bvr<E> a(List<Pair<? extends bxw<? super E>, Integer>> $$0, buu.a $$1, buu.b $$2) {
      bwp<bxw<? super E>> $$3 = new bwp<>();
      $$0.forEach($$1x -> $$3.a((bxw<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bxt.a((Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$3x -> $$3x.a((bxw<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == buu.a.b) {
               $$3.a();
            }

            for (bxw<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == buu.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
