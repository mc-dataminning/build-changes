import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dqs extends dqw<ir> {
   protected dqs(String $$0, Collection<ir> $$1) {
      super($$0, ir.class, $$1);
   }

   public static dqs a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dqs a(String $$0, Predicate<ir> $$1) {
      return a($$0, Arrays.stream(ir.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dqs a(String $$0, ir... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dqs a(String $$0, Collection<ir> $$1) {
      return new dqs($$0, $$1);
   }
}
