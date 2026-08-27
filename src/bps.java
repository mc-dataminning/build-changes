import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bps {
   public static <E extends blg> boh<E> a(List<Pair<? extends bqm<? super E>, Integer>> $$0) {
      return a($$0, bnl.a.b, bnl.b.a);
   }

   public static <E extends blg> boh<E> a(List<Pair<? extends bqm<? super E>, Integer>> $$0, bnl.a $$1, bnl.b $$2) {
      bpf<bqm<? super E>> $$3 = new bpf<>();
      $$0.forEach($$1x -> $$3.a((bqm<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bqj.a((Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$3x -> $$3x.a((bqm<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bnl.a.b) {
               $$3.a();
            }

            for (bqm<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bnl.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
