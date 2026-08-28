import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bzt {
   public static <E extends bve> byi<E> a(List<Pair<? extends can<? super E>, Integer>> $$0) {
      return a($$0, bxl.a.b, bxl.b.a);
   }

   public static <E extends bve> byi<E> a(List<Pair<? extends can<? super E>, Integer>> $$0, bxl.a $$1, bxl.b $$2) {
      bzg<can<? super E>> $$3 = new bzg<>();
      $$0.forEach($$1x -> $$3.a((can<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cak.a((Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$3x -> $$3x.a((can<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bxl.a.b) {
               $$3.a();
            }

            for (can<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bxl.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
