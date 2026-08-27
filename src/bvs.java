import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bvs {
   public static <E extends bre> buh<E> a(List<Pair<? extends bwm<? super E>, Integer>> $$0) {
      return a($$0, btk.a.b, btk.b.a);
   }

   public static <E extends bre> buh<E> a(List<Pair<? extends bwm<? super E>, Integer>> $$0, btk.a $$1, btk.b $$2) {
      bvf<bwm<? super E>> $$3 = new bvf<>();
      $$0.forEach($$1x -> $$3.a((bwm<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bwj.a((Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$3x -> $$3x.a((bwm<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == btk.a.b) {
               $$3.a();
            }

            for (bwm<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == btk.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
