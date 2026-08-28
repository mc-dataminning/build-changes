import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bzw {
   public static <E extends bvh> byl<E> a(List<Pair<? extends caq<? super E>, Integer>> $$0) {
      return a($$0, bxo.a.b, bxo.b.a);
   }

   public static <E extends bvh> byl<E> a(List<Pair<? extends caq<? super E>, Integer>> $$0, bxo.a $$1, bxo.b $$2) {
      bzj<caq<? super E>> $$3 = new bzj<>();
      $$0.forEach($$1x -> $$3.a((caq<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return can.a((Function<can.b<E>, ? extends App<can.c<E>, caq<E>>>)($$3x -> $$3x.a((caq<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bxo.a.b) {
               $$3.a();
            }

            for (caq<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bxo.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
