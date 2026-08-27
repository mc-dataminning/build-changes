import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class btl {
   public static <E extends box> bsa<E> a(List<Pair<? extends buf<? super E>, Integer>> $$0) {
      return a($$0, brd.a.b, brd.b.a);
   }

   public static <E extends box> bsa<E> a(List<Pair<? extends buf<? super E>, Integer>> $$0, brd.a $$1, brd.b $$2) {
      bsy<buf<? super E>> $$3 = new bsy<>();
      $$0.forEach($$1x -> $$3.a((buf<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return buc.a((Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$3x -> $$3x.a((buf<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == brd.a.b) {
               $$3.a();
            }

            for (buf<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == brd.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
