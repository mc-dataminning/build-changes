import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class djj extends djn<ia> {
   protected djj(String $$0, Collection<ia> $$1) {
      super($$0, ia.class, $$1);
   }

   public static djj a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static djj a(String $$0, Predicate<ia> $$1) {
      return a($$0, Arrays.stream(ia.values()).filter($$1).collect(Collectors.toList()));
   }

   public static djj a(String $$0, ia... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static djj a(String $$0, Collection<ia> $$1) {
      return new djj($$0, $$1);
   }
}
