import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bov {
   public static <E extends bkj> bnk<E> a(List<Pair<? extends bpp<? super E>, Integer>> $$0) {
      return a($$0, bmo.a.b, bmo.b.a);
   }

   public static <E extends bkj> bnk<E> a(List<Pair<? extends bpp<? super E>, Integer>> $$0, bmo.a $$1, bmo.b $$2) {
      boi<bpp<? super E>> $$3 = new boi<>();
      $$0.forEach($$1x -> $$3.a((bpp<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bpm.a((Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$3x -> $$3x.a((bpp<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bmo.a.b) {
               $$3.a();
            }

            for (bpp<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bmo.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
