import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bpx {
   public static <E extends bll> bom<E> a(List<Pair<? extends bqr<? super E>, Integer>> $$0) {
      return a($$0, bnq.a.b, bnq.b.a);
   }

   public static <E extends bll> bom<E> a(List<Pair<? extends bqr<? super E>, Integer>> $$0, bnq.a $$1, bnq.b $$2) {
      bpk<bqr<? super E>> $$3 = new bpk<>();
      $$0.forEach($$1x -> $$3.a((bqr<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bqo.a((Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$3x -> $$3x.a((bqr<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bnq.a.b) {
               $$3.a();
            }

            for (bqr<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bnq.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
