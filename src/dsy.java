import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dsy extends dtc<je> {
   protected dsy(String $$0, Collection<je> $$1) {
      super($$0, je.class, $$1);
   }

   public static dsy a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dsy a(String $$0, Predicate<je> $$1) {
      return a($$0, Arrays.stream(je.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dsy a(String $$0, je... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dsy a(String $$0, Collection<je> $$1) {
      return new dsy($$0, $$1);
   }
}
