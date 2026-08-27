import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dfs extends dfw<hb> {
   protected dfs(String $$0, Collection<hb> $$1) {
      super($$0, hb.class, $$1);
   }

   public static dfs a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dfs a(String $$0, Predicate<hb> $$1) {
      return a($$0, Arrays.stream(hb.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dfs a(String $$0, hb... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dfs a(String $$0, Collection<hb> $$1) {
      return new dfs($$0, $$1);
   }
}
