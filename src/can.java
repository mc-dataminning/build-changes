import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class can {
   public static <E extends bvy> bzc<E> a(List<Pair<? extends cbh<? super E>, Integer>> $$0) {
      return a($$0, byf.a.b, byf.b.a);
   }

   public static <E extends bvy> bzc<E> a(List<Pair<? extends cbh<? super E>, Integer>> $$0, byf.a $$1, byf.b $$2) {
      caa<cbh<? super E>> $$3 = new caa<>();
      $$0.forEach($$1x -> $$3.a((cbh<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cbe.a((Function<cbe.b<E>, ? extends App<cbe.c<E>, cbh<E>>>)($$3x -> $$3x.a((cbh<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == byf.a.b) {
               $$3.a();
            }

            for (cbh<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == byf.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
