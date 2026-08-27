import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bnn {
   public static <E extends bjb> bmc<E> a(List<Pair<? extends boh<? super E>, Integer>> $$0) {
      return a($$0, blg.a.b, blg.b.a);
   }

   public static <E extends bjb> bmc<E> a(List<Pair<? extends boh<? super E>, Integer>> $$0, blg.a $$1, blg.b $$2) {
      bna<boh<? super E>> $$3 = new bna<>();
      $$0.forEach($$1x -> $$3.a((boh<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return boe.a((Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$3x -> $$3x.a((boh<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == blg.a.b) {
               $$3.a();
            }

            for (boh<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == blg.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
