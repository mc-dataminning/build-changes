import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dvm extends dvq<jk> {
   protected dvm(String $$0, Collection<jk> $$1) {
      super($$0, jk.class, $$1);
   }

   public static dvm a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dvm a(String $$0, Predicate<jk> $$1) {
      return a($$0, Arrays.stream(jk.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dvm a(String $$0, jk... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dvm a(String $$0, Collection<jk> $$1) {
      return new dvm($$0, $$1);
   }
}
