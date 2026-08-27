import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bkm {
   public static <E extends bfz> bjb<E> a(List<Pair<? extends blg<? super E>, Integer>> $$0) {
      return a($$0, bif.a.b, bif.b.a);
   }

   public static <E extends bfz> bjb<E> a(List<Pair<? extends blg<? super E>, Integer>> $$0, bif.a $$1, bif.b $$2) {
      bjz<blg<? super E>> $$3 = new bjz<>();
      $$0.forEach($$1x -> $$3.a((blg<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bld.a((Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$3x -> $$3x.a((blg<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bif.a.b) {
               $$3.a();
            }

            for (blg<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bif.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
