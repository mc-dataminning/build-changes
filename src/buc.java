import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class buc {
   public static <E extends bpo> bsr<E> a(List<Pair<? extends buw<? super E>, Integer>> $$0) {
      return a($$0, bru.a.b, bru.b.a);
   }

   public static <E extends bpo> bsr<E> a(List<Pair<? extends buw<? super E>, Integer>> $$0, bru.a $$1, bru.b $$2) {
      btp<buw<? super E>> $$3 = new btp<>();
      $$0.forEach($$1x -> $$3.a((buw<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return but.a((Function<but.b<E>, ? extends App<but.c<E>, buw<E>>>)($$3x -> $$3x.a((buw<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bru.a.b) {
               $$3.a();
            }

            for (buw<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bru.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
