import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bpk {
   public static <E extends bky> bnz<E> a(List<Pair<? extends bqe<? super E>, Integer>> $$0) {
      return a($$0, bnd.a.b, bnd.b.a);
   }

   public static <E extends bky> bnz<E> a(List<Pair<? extends bqe<? super E>, Integer>> $$0, bnd.a $$1, bnd.b $$2) {
      box<bqe<? super E>> $$3 = new box<>();
      $$0.forEach($$1x -> $$3.a((bqe<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bqb.a((Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$3x -> $$3x.a((bqe<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bnd.a.b) {
               $$3.a();
            }

            for (bqe<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bnd.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
