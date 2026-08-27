import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class bmt<E extends bjg> extends bll<E> {
   public bmt(List<Pair<? extends bky<? super E>, Integer>> $$0) {
      this(ImmutableMap.of(), $$0);
   }

   public bmt(Map<bsh<?>, bsi> $$0, List<Pair<? extends bky<? super E>, Integer>> $$1) {
      super($$0, ImmutableSet.of(), bll.a.b, bll.b.a, $$1);
   }
}
