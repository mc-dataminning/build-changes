import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class bsm<E extends box> extends brd<E> {
   public bsm(List<Pair<? extends bqq<? super E>, Integer>> $$0) {
      this(ImmutableMap.of(), $$0);
   }

   public bsm(Map<bya<?>, byb> $$0, List<Pair<? extends bqq<? super E>, Integer>> $$1) {
      super($$0, ImmutableSet.of(), brd.a.b, brd.b.a, $$1);
   }
}
