import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bnl {
   public static <E extends biy> bma<E> a(List<Pair<? extends bof<? super E>, Integer>> $$0) {
      return a($$0, ble.a.b, ble.b.a);
   }

   public static <E extends biy> bma<E> a(List<Pair<? extends bof<? super E>, Integer>> $$0, ble.a $$1, ble.b $$2) {
      bmy<bof<? super E>> $$3 = new bmy<>();
      $$0.forEach($$1x -> $$3.a((bof<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return boc.a((Function<boc.b<E>, ? extends App<boc.c<E>, bof<E>>>)($$3x -> $$3x.a((bof<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == ble.a.b) {
               $$3.a();
            }

            for (bof<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == ble.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
