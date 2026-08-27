import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bnu {
   public static <E extends bji> bmj<E> a(List<Pair<? extends boo<? super E>, Integer>> $$0) {
      return a($$0, bln.a.b, bln.b.a);
   }

   public static <E extends bji> bmj<E> a(List<Pair<? extends boo<? super E>, Integer>> $$0, bln.a $$1, bln.b $$2) {
      bnh<boo<? super E>> $$3 = new bnh<>();
      $$0.forEach($$1x -> $$3.a((boo<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bol.a((Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$3x -> $$3x.a((boo<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bln.a.b) {
               $$3.a();
            }

            for (boo<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bln.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
