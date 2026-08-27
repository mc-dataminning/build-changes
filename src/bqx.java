import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bqx {
   public static <E extends bmk> bpm<E> a(List<Pair<? extends brr<? super E>, Integer>> $$0) {
      return a($$0, bop.a.b, bop.b.a);
   }

   public static <E extends bmk> bpm<E> a(List<Pair<? extends brr<? super E>, Integer>> $$0, bop.a $$1, bop.b $$2) {
      bqk<brr<? super E>> $$3 = new bqk<>();
      $$0.forEach($$1x -> $$3.a((brr<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bro.a((Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>>)($$3x -> $$3x.a((brr<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bop.a.b) {
               $$3.a();
            }

            for (brr<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bop.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
