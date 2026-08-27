import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class bsw {
   public static <E extends boi> brl<E> a(List<Pair<? extends btq<? super E>, Integer>> $$0) {
      return a($$0, bqo.a.b, bqo.b.a);
   }

   public static <E extends boi> brl<E> a(List<Pair<? extends btq<? super E>, Integer>> $$0, bqo.a $$1, bqo.b $$2) {
      bsj<btq<? super E>> $$3 = new bsj<>();
      $$0.forEach($$1x -> $$3.a((btq<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return btn.a((Function<btn.b<E>, ? extends App<btn.c<E>, btq<E>>>)($$3x -> $$3x.a((btq<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bqo.a.b) {
               $$3.a();
            }

            for (btq<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bqo.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
