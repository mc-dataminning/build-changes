import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class cau {
   public static <E extends bwf> bzj<E> a(List<Pair<? extends cbo<? super E>, Integer>> $$0) {
      return a($$0, bym.a.b, bym.b.a);
   }

   public static <E extends bwf> bzj<E> a(List<Pair<? extends cbo<? super E>, Integer>> $$0, bym.a $$1, bym.b $$2) {
      cah<cbo<? super E>> $$3 = new cah<>();
      $$0.forEach($$1x -> $$3.a((cbo<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return cbl.a((Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$3x -> $$3x.a((cbo<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bym.a.b) {
               $$3.a();
            }

            for (cbo<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bym.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
