import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class duu extends duy<jj> {
   protected duu(String $$0, Collection<jj> $$1) {
      super($$0, jj.class, $$1);
   }

   public static duu a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static duu a(String $$0, Predicate<jj> $$1) {
      return a($$0, Arrays.stream(jj.values()).filter($$1).collect(Collectors.toList()));
   }

   public static duu a(String $$0, jj... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static duu a(String $$0, Collection<jj> $$1) {
      return new duu($$0, $$1);
   }
}
