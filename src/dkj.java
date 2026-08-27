import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dkj extends dkn<ic> {
   protected dkj(String $$0, Collection<ic> $$1) {
      super($$0, ic.class, $$1);
   }

   public static dkj a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dkj a(String $$0, Predicate<ic> $$1) {
      return a($$0, Arrays.stream(ic.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dkj a(String $$0, ic... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dkj a(String $$0, Collection<ic> $$1) {
      return new dkj($$0, $$1);
   }
}
