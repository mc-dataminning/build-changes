import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bns {
   public static <E extends bjg> bmh<E> a(List<Pair<? extends bom<? super E>, Integer>> $$0) {
      return a($$0, bll.a.b, bll.b.a);
   }

   public static <E extends bjg> bmh<E> a(List<Pair<? extends bom<? super E>, Integer>> $$0, bll.a $$1, bll.b $$2) {
      bnf<bom<? super E>> $$3 = new bnf<>();
      $$0.forEach($$1x -> $$3.a((bom<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return boj.a((Function<boj.b<E>, ? extends App<boj.c<E>, bom<E>>>)($$3x -> $$3x.a((bom<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bll.a.b) {
               $$3.a();
            }

            for (bom<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bll.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
