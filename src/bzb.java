import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bzb {
   public static <E extends bun> bxq<E> a(List<Pair<? extends bzv<? super E>, Integer>> $$0) {
      return a($$0, bwt.a.b, bwt.b.a);
   }

   public static <E extends bun> bxq<E> a(List<Pair<? extends bzv<? super E>, Integer>> $$0, bwt.a $$1, bwt.b $$2) {
      byo<bzv<? super E>> $$3 = new byo<>();
      $$0.forEach($$1x -> $$3.a((bzv<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bzs.a((Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$3x -> $$3x.a((bzv<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bwt.a.b) {
               $$3.a();
            }

            for (bzv<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bwt.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
