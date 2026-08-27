import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dqc extends dqg<ij> {
   protected dqc(String $$0, Collection<ij> $$1) {
      super($$0, ij.class, $$1);
   }

   public static dqc a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dqc a(String $$0, Predicate<ij> $$1) {
      return a($$0, Arrays.stream(ij.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dqc a(String $$0, ij... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dqc a(String $$0, Collection<ij> $$1) {
      return new dqc($$0, $$1);
   }
}
