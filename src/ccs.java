import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class ccs {
   public static <E extends byf> cbh<E> a(List<Pair<? extends cdm<? super E>, Integer>> $$0) {
      return a($$0, cak.a.b, cak.b.a);
   }

   public static <E extends byf> cbh<E> a(List<Pair<? extends cdm<? super E>, Integer>> $$0, cak.a $$1, cak.b $$2) {
      ccf<cdm<? super E>> $$3 = new ccf<>();
      $$0.forEach($$1x -> $$3.a((cdm<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cdj.a((Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$3x -> $$3x.a((cdm<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == cak.a.b) {
               $$3.a();
            }

            for (cdm<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == cak.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
