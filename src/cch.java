import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cch {
   public static <E extends bxu> caw<E> a(List<Pair<? extends cdb<? super E>, Integer>> $$0) {
      return a($$0, bzz.a.b, bzz.b.a);
   }

   public static <E extends bxu> caw<E> a(List<Pair<? extends cdb<? super E>, Integer>> $$0, bzz.a $$1, bzz.b $$2) {
      cbu<cdb<? super E>> $$3 = new cbu<>();
      $$0.forEach($$1x -> $$3.a((cdb<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return ccy.a((Function<ccy.b<E>, ? extends App<ccy.c<E>, cdb<E>>>)($$3x -> $$3x.a((cdb<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bzz.a.b) {
               $$3.a();
            }

            for (cdb<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bzz.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
