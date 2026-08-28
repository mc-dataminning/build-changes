import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class ccj {
   public static <E extends bxw> cay<E> a(List<Pair<? extends cdd<? super E>, Integer>> $$0) {
      return a($$0, cab.a.b, cab.b.a);
   }

   public static <E extends bxw> cay<E> a(List<Pair<? extends cdd<? super E>, Integer>> $$0, cab.a $$1, cab.b $$2) {
      cbw<cdd<? super E>> $$3 = new cbw<>();
      $$0.forEach($$1x -> $$3.a((cdd<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cda.a((Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$3x -> $$3x.a((cdd<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == cab.a.b) {
               $$3.a();
            }

            for (cdd<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == cab.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
