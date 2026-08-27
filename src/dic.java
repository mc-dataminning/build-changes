import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dic extends dig<hx> {
   protected dic(String $$0, Collection<hx> $$1) {
      super($$0, hx.class, $$1);
   }

   public static dic a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dic a(String $$0, Predicate<hx> $$1) {
      return a($$0, Arrays.stream(hx.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dic a(String $$0, hx... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dic a(String $$0, Collection<hx> $$1) {
      return new dic($$0, $$1);
   }
}
