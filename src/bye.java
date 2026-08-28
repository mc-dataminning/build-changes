import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bye {
   public static <E extends btp> bwt<E> a(List<Pair<? extends byy<? super E>, Integer>> $$0) {
      return a($$0, bvw.a.b, bvw.b.a);
   }

   public static <E extends btp> bwt<E> a(List<Pair<? extends byy<? super E>, Integer>> $$0, bvw.a $$1, bvw.b $$2) {
      bxr<byy<? super E>> $$3 = new bxr<>();
      $$0.forEach($$1x -> $$3.a((byy<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return byv.a((Function<byv.b<E>, ? extends App<byv.c<E>, byy<E>>>)($$3x -> $$3x.a((byy<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bvw.a.b) {
               $$3.a();
            }

            for (byy<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bvw.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
