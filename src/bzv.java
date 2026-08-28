import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bzv {
   public static <E extends bvg> byk<E> a(List<Pair<? extends cap<? super E>, Integer>> $$0) {
      return a($$0, bxn.a.b, bxn.b.a);
   }

   public static <E extends bvg> byk<E> a(List<Pair<? extends cap<? super E>, Integer>> $$0, bxn.a $$1, bxn.b $$2) {
      bzi<cap<? super E>> $$3 = new bzi<>();
      $$0.forEach($$1x -> $$3.a((cap<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cam.a((Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$3x -> $$3x.a((cap<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bxn.a.b) {
               $$3.a();
            }

            for (cap<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bxn.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
