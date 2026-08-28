import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class byt {
   public static <E extends buf> bxi<E> a(List<Pair<? extends bzn<? super E>, Integer>> $$0) {
      return a($$0, bwl.a.b, bwl.b.a);
   }

   public static <E extends buf> bxi<E> a(List<Pair<? extends bzn<? super E>, Integer>> $$0, bwl.a $$1, bwl.b $$2) {
      byg<bzn<? super E>> $$3 = new byg<>();
      $$0.forEach($$1x -> $$3.a((bzn<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bzk.a((Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$3x -> $$3x.a((bzn<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bwl.a.b) {
               $$3.a();
            }

            for (bzn<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bwl.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
