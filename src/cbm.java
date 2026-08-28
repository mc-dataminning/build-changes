import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cbm {
   public static <E extends bwz> cab<E> a(List<Pair<? extends ccg<? super E>, Integer>> $$0) {
      return a($$0, bze.a.b, bze.b.a);
   }

   public static <E extends bwz> cab<E> a(List<Pair<? extends ccg<? super E>, Integer>> $$0, bze.a $$1, bze.b $$2) {
      caz<ccg<? super E>> $$3 = new caz<>();
      $$0.forEach($$1x -> $$3.a((ccg<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return ccd.a((Function<ccd.b<E>, ? extends App<ccd.c<E>, ccg<E>>>)($$3x -> $$3x.a((ccg<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bze.a.b) {
               $$3.a();
            }

            for (ccg<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bze.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
