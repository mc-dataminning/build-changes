import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bzp {
   public static <E extends bva> bye<E> a(List<Pair<? extends caj<? super E>, Integer>> $$0) {
      return a($$0, bxh.a.b, bxh.b.a);
   }

   public static <E extends bva> bye<E> a(List<Pair<? extends caj<? super E>, Integer>> $$0, bxh.a $$1, bxh.b $$2) {
      bzc<caj<? super E>> $$3 = new bzc<>();
      $$0.forEach($$1x -> $$3.a((caj<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cag.a((Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$3x -> $$3x.a((caj<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bxh.a.b) {
               $$3.a();
            }

            for (caj<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bxh.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
