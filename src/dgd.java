import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dgd extends dgh<hc> {
   protected dgd(String $$0, Collection<hc> $$1) {
      super($$0, hc.class, $$1);
   }

   public static dgd a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dgd a(String $$0, Predicate<hc> $$1) {
      return a($$0, Arrays.stream(hc.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dgd a(String $$0, hc... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dgd a(String $$0, Collection<hc> $$1) {
      return new dgd($$0, $$1);
   }
}
