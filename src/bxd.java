import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bxd {
   public static <E extends bso> bvs<E> a(List<Pair<? extends bxx<? super E>, Integer>> $$0) {
      return a($$0, buv.a.b, buv.b.a);
   }

   public static <E extends bso> bvs<E> a(List<Pair<? extends bxx<? super E>, Integer>> $$0, buv.a $$1, buv.b $$2) {
      bwq<bxx<? super E>> $$3 = new bwq<>();
      $$0.forEach($$1x -> $$3.a((bxx<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bxu.a((Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$3x -> $$3x.a((bxx<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == buv.a.b) {
               $$3.a();
            }

            for (bxx<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == buv.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
