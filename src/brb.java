import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class brb {
   public static <E extends bmo> bpq<E> a(List<Pair<? extends brv<? super E>, Integer>> $$0) {
      return a($$0, bot.a.b, bot.b.a);
   }

   public static <E extends bmo> bpq<E> a(List<Pair<? extends brv<? super E>, Integer>> $$0, bot.a $$1, bot.b $$2) {
      bqo<brv<? super E>> $$3 = new bqo<>();
      $$0.forEach($$1x -> $$3.a((brv<? super E>)$$1x.getFirst(), (Integer)$$1x.getSecond()));
      return brs.a((Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$3x -> $$3x.a((brv<E>)(($$3xx, $$4, $$5) -> {
            if ($$1 == bot.a.b) {
               $$3.a();
            }

            for (brv<? super E> $$6 : $$3) {
               if ($$6.trigger($$3xx, $$4, $$5) && $$2 == bot.b.a) {
                  break;
               }
            }

            return true;
         }))));
   }
}
