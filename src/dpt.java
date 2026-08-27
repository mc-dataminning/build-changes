import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dpt extends dpx<ih> {
   protected dpt(String $$0, Collection<ih> $$1) {
      super($$0, ih.class, $$1);
   }

   public static dpt a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dpt a(String $$0, Predicate<ih> $$1) {
      return a($$0, Arrays.stream(ih.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dpt a(String $$0, ih... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dpt a(String $$0, Collection<ih> $$1) {
      return new dpt($$0, $$1);
   }
}
