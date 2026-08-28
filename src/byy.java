import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class byy {
   public static <E extends buk> bxn<E> a(List<Pair<? extends bzs<? super E>, Integer>> $$0) {
      return a($$0, bwq.a.b, bwq.b.a);
   }

   public static <E extends buk> bxn<E> a(List<Pair<? extends bzs<? super E>, Integer>> $$0, bwq.a $$1, bwq.b $$2) {
      byl<bzs<? super E>> $$3 = new byl<>();
      $$0.forEach($$1x -> $$3.a((bzs<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bzp.a((Function<bzp.b<E>, ? extends App<bzp.c<E>, bzs<E>>>)($$3x -> $$3x.a((bzs<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bwq.a.b) {
               $$3.a();
            }

            for (bzs<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bwq.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
