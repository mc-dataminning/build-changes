import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cav {
   public static <E extends bwg> bzk<E> a(List<Pair<? extends cbp<? super E>, Integer>> $$0) {
      return a($$0, byn.a.b, byn.b.a);
   }

   public static <E extends bwg> bzk<E> a(List<Pair<? extends cbp<? super E>, Integer>> $$0, byn.a $$1, byn.b $$2) {
      cai<cbp<? super E>> $$3 = new cai<>();
      $$0.forEach($$1x -> $$3.a((cbp<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cbm.a((Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$3x -> $$3x.a((cbp<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == byn.a.b) {
               $$3.a();
            }

            for (cbp<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == byn.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
