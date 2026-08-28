import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bzu {
   public static <E extends bvf> byj<E> a(List<Pair<? extends cao<? super E>, Integer>> $$0) {
      return a($$0, bxm.a.b, bxm.b.a);
   }

   public static <E extends bvf> byj<E> a(List<Pair<? extends cao<? super E>, Integer>> $$0, bxm.a $$1, bxm.b $$2) {
      bzh<cao<? super E>> $$3 = new bzh<>();
      $$0.forEach($$1x -> $$3.a((cao<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cal.a((Function<cal.b<E>, ? extends App<cal.c<E>, cao<E>>>)($$3x -> $$3x.a((cao<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bxm.a.b) {
               $$3.a();
            }

            for (cao<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bxm.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
