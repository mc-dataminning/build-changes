import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cbr {
   public static <E extends bxe> cag<E> a(List<Pair<? extends ccl<? super E>, Integer>> $$0) {
      return a($$0, bzj.a.b, bzj.b.a);
   }

   public static <E extends bxe> cag<E> a(List<Pair<? extends ccl<? super E>, Integer>> $$0, bzj.a $$1, bzj.b $$2) {
      cbe<ccl<? super E>> $$3 = new cbe<>();
      $$0.forEach($$1x -> $$3.a((ccl<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cci.a((Function<cci.b<E>, ? extends App<cci.c<E>, ccl<E>>>)($$3x -> $$3x.a((ccl<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bzj.a.b) {
               $$3.a();
            }

            for (ccl<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bzj.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
