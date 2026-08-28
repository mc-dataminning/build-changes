import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bzk {
   public static <E extends buv> bxz<E> a(List<Pair<? extends cae<? super E>, Integer>> $$0) {
      return a($$0, bxc.a.b, bxc.b.a);
   }

   public static <E extends buv> bxz<E> a(List<Pair<? extends cae<? super E>, Integer>> $$0, bxc.a $$1, bxc.b $$2) {
      byx<cae<? super E>> $$3 = new byx<>();
      $$0.forEach($$1x -> $$3.a((cae<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cab.a((Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>>)($$3x -> $$3x.a((cae<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bxc.a.b) {
               $$3.a();
            }

            for (cae<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bxc.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
