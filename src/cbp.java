import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cbp {
   public static <E extends bxc> cae<E> a(List<Pair<? extends ccj<? super E>, Integer>> $$0) {
      return a($$0, bzh.a.b, bzh.b.a);
   }

   public static <E extends bxc> cae<E> a(List<Pair<? extends ccj<? super E>, Integer>> $$0, bzh.a $$1, bzh.b $$2) {
      cbc<ccj<? super E>> $$3 = new cbc<>();
      $$0.forEach($$1x -> $$3.a((ccj<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return ccg.a((Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$3x -> $$3x.a((ccj<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bzh.a.b) {
               $$3.a();
            }

            for (ccj<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bzh.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
