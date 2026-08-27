import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bxf {
   public static <E extends bsq> bvu<E> a(List<Pair<? extends bxz<? super E>, Integer>> $$0) {
      return a($$0, bux.a.b, bux.b.a);
   }

   public static <E extends bsq> bvu<E> a(List<Pair<? extends bxz<? super E>, Integer>> $$0, bux.a $$1, bux.b $$2) {
      bws<bxz<? super E>> $$3 = new bws<>();
      $$0.forEach($$1x -> $$3.a((bxz<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bxw.a((Function<bxw.b<E>, ? extends App<bxw.c<E>, bxz<E>>>)($$3x -> $$3x.a((bxz<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bux.a.b) {
               $$3.a();
            }

            for (bxz<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bux.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
