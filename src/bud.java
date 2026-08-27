import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bud {
   public static <E extends bpp> bss<E> a(List<Pair<? extends bux<? super E>, Integer>> $$0) {
      return a($$0, brv.a.b, brv.b.a);
   }

   public static <E extends bpp> bss<E> a(List<Pair<? extends bux<? super E>, Integer>> $$0, brv.a $$1, brv.b $$2) {
      btq<bux<? super E>> $$3 = new btq<>();
      $$0.forEach($$1x -> $$3.a((bux<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return buu.a((Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$3x -> $$3x.a((bux<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == brv.a.b) {
               $$3.a();
            }

            for (bux<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == brv.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
