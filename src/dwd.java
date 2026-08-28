import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dwd extends dwh<jm> {
   protected dwd(String $$0, List<jm> $$1) {
      super($$0, jm.class, $$1);
   }

   public static dwd a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dwd a(String $$0, Predicate<jm> $$1) {
      return a($$0, Arrays.stream(jm.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dwd a(String $$0, jm... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dwd a(String $$0, List<jm> $$1) {
      return new dwd($$0, $$1);
   }
}
