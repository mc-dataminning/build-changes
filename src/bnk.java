import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bnk {
   public static <E extends biy> blz<E> a(List<Pair<? extends boe<? super E>, Integer>> $$0) {
      return a($$0, bld.a.b, bld.b.a);
   }

   public static <E extends biy> blz<E> a(List<Pair<? extends boe<? super E>, Integer>> $$0, bld.a $$1, bld.b $$2) {
      bmx<boe<? super E>> $$3 = new bmx<>();
      $$0.forEach($$1x -> $$3.a((boe<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bob.a((Function<bob.b<E>, ? extends App<bob.c<E>, boe<E>>>)($$3x -> $$3x.a((boe<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bld.a.b) {
               $$3.a();
            }

            for (boe<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bld.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
