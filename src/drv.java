import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class drv extends drz<it> {
   protected drv(String $$0, Collection<it> $$1) {
      super($$0, it.class, $$1);
   }

   public static drv a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static drv a(String $$0, Predicate<it> $$1) {
      return a($$0, Arrays.stream(it.values()).filter($$1).collect(Collectors.toList()));
   }

   public static drv a(String $$0, it... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static drv a(String $$0, Collection<it> $$1) {
      return new drv($$0, $$1);
   }
}
