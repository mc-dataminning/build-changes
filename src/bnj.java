import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bnj {
   public static <E extends biw> bly<E> a(List<Pair<? extends bod<? super E>, Integer>> $$0) {
      return a($$0, blc.a.b, blc.b.a);
   }

   public static <E extends biw> bly<E> a(List<Pair<? extends bod<? super E>, Integer>> $$0, blc.a $$1, blc.b $$2) {
      bmw<bod<? super E>> $$3 = new bmw<>();
      $$0.forEach($$1x -> $$3.a((bod<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return boa.a((Function<boa.b<E>, ? extends App<boa.c<E>, bod<E>>>)($$3x -> $$3x.a((bod<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == blc.a.b) {
               $$3.a();
            }

            for (bod<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == blc.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
