import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class bml<E extends biy> extends bld<E> {
   public bml(List<Pair<? extends bkq<? super E>, Integer>> $$0) {
      this(ImmutableMap.of(), $$0);
   }

   public bml(Map<brz<?>, bsa> $$0, List<Pair<? extends bkq<? super E>, Integer>> $$1) {
      super($$0, ImmutableSet.of(), bld.a.b, bld.b.a, $$1);
   }
}
