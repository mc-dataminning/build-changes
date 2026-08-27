import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bqs {
   public static <E extends bmf> bph<E> a(List<Pair<? extends brm<? super E>, Integer>> $$0) {
      return a($$0, bok.a.b, bok.b.a);
   }

   public static <E extends bmf> bph<E> a(List<Pair<? extends brm<? super E>, Integer>> $$0, bok.a $$1, bok.b $$2) {
      bqf<brm<? super E>> $$3 = new bqf<>();
      $$0.forEach($$1x -> $$3.a((brm<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return brj.a((Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>>)($$3x -> $$3x.a((brm<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bok.a.b) {
               $$3.a();
            }

            for (brm<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bok.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
