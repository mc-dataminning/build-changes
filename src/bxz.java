import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bxz {
   public static <E extends btk> bwo<E> a(List<Pair<? extends byt<? super E>, Integer>> $$0) {
      return a($$0, bvr.a.b, bvr.b.a);
   }

   public static <E extends btk> bwo<E> a(List<Pair<? extends byt<? super E>, Integer>> $$0, bvr.a $$1, bvr.b $$2) {
      bxm<byt<? super E>> $$3 = new bxm<>();
      $$0.forEach($$1x -> $$3.a((byt<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return byq.a((Function<byq.b<E>, ? extends App<byq.c<E>, byt<E>>>)($$3x -> $$3x.a((byt<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvr.a.b) {
               $$3.a();
            }

            for (byt<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvr.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
