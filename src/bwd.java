import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class bwd<E extends bso> extends buu<E> {
   public bwd(List<Pair<? extends buh<? super E>, Integer>> $$0) {
      this(ImmutableMap.of(), $$0);
   }

   public bwd(Map<cbr<?>, cbs> $$0, List<Pair<? extends buh<? super E>, Integer>> $$1) {
      super($$0, ImmutableSet.of(), buu.a.b, buu.b.a, $$1);
   }
}
