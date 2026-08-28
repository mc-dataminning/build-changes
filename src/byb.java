import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class byb {
   public static <E extends btl> bwq<E> a(List<Pair<? extends byv<? super E>, Integer>> $$0) {
      return a($$0, bvt.a.b, bvt.b.a);
   }

   public static <E extends btl> bwq<E> a(List<Pair<? extends byv<? super E>, Integer>> $$0, bvt.a $$1, bvt.b $$2) {
      bxo<byv<? super E>> $$3 = new bxo<>();
      $$0.forEach($$1x -> $$3.a((byv<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return bys.a((Function<bys.b<E>, ? extends App<bys.c<E>, byv<E>>>)($$3x -> $$3x.a((byv<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvt.a.b) {
               $$3.a();
            }

            for (byv<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvt.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
