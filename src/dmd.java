import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dmd extends dmh<ie> {
   protected dmd(String $$0, Collection<ie> $$1) {
      super($$0, ie.class, $$1);
   }

   public static dmd a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dmd a(String $$0, Predicate<ie> $$1) {
      return a($$0, Arrays.stream(ie.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dmd a(String $$0, ie... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dmd a(String $$0, Collection<ie> $$1) {
      return new dmd($$0, $$1);
   }
}
