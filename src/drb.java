import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class drb extends drf<is> {
   protected drb(String $$0, Collection<is> $$1) {
      super($$0, is.class, $$1);
   }

   public static drb a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static drb a(String $$0, Predicate<is> $$1) {
      return a($$0, Arrays.stream(is.values()).filter($$1).collect(Collectors.toList()));
   }

   public static drb a(String $$0, is... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static drb a(String $$0, Collection<is> $$1) {
      return new drb($$0, $$1);
   }
}
