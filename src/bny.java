import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bny {
   public static <E extends bjm> bmn<E> a(List<Pair<? extends bos<? super E>, Integer>> $$0) {
      return a($$0, blr.a.b, blr.b.a);
   }

   public static <E extends bjm> bmn<E> a(List<Pair<? extends bos<? super E>, Integer>> $$0, blr.a $$1, blr.b $$2) {
      bnl<bos<? super E>> $$3 = new bnl<>();
      $$0.forEach($$1x -> $$3.a((bos<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bop.a((Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$3x -> $$3x.a((bos<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == blr.a.b) {
               $$3.a();
            }

            for (bos<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == blr.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
