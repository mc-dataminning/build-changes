import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bss {
   public static <E extends bog> brh<E> a(List<Pair<? extends btm<? super E>, Integer>> $$0) {
      return a($$0, bqk.a.b, bqk.b.a);
   }

   public static <E extends bog> brh<E> a(List<Pair<? extends btm<? super E>, Integer>> $$0, bqk.a $$1, bqk.b $$2) {
      bsf<btm<? super E>> $$3 = new bsf<>();
      $$0.forEach($$1x -> $$3.a((btm<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return btj.a((Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$3x -> $$3x.a((btm<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bqk.a.b) {
               $$3.a();
            }

            for (btm<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bqk.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
