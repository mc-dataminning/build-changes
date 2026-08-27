import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bwo {
   public static <E extends bsa> bvd<E> a(List<Pair<? extends bxi<? super E>, Integer>> $$0) {
      return a($$0, bug.a.b, bug.b.a);
   }

   public static <E extends bsa> bvd<E> a(List<Pair<? extends bxi<? super E>, Integer>> $$0, bug.a $$1, bug.b $$2) {
      bwb<bxi<? super E>> $$3 = new bwb<>();
      $$0.forEach($$1x -> $$3.a((bxi<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bxf.a((Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$3x -> $$3x.a((bxi<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bug.a.b) {
               $$3.a();
            }

            for (bxi<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bug.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
