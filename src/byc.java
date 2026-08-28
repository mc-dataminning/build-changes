import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class byc {
   public static <E extends btn> bwr<E> a(List<Pair<? extends byw<? super E>, Integer>> $$0) {
      return a($$0, bvu.a.b, bvu.b.a);
   }

   public static <E extends btn> bwr<E> a(List<Pair<? extends byw<? super E>, Integer>> $$0, bvu.a $$1, bvu.b $$2) {
      bxp<byw<? super E>> $$3 = new bxp<>();
      $$0.forEach($$1x -> $$3.a((byw<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return byt.a((Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$3x -> $$3x.a((byw<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvu.a.b) {
               $$3.a();
            }

            for (byw<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvu.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
