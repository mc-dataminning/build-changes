import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class bvp<E extends bsa> extends bug<E> {
   public bvp(List<Pair<? extends btt<? super E>, Integer>> $$0) {
      this(ImmutableMap.of(), $$0);
   }

   public bvp(Map<cbd<?>, cbe> $$0, List<Pair<? extends btt<? super E>, Integer>> $$1) {
      super($$0, ImmutableSet.of(), bug.a.b, bug.b.a, $$1);
   }
}
