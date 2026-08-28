import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dte extends dti<jf> {
   protected dte(String $$0, Collection<jf> $$1) {
      super($$0, jf.class, $$1);
   }

   public static dte a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dte a(String $$0, Predicate<jf> $$1) {
      return a($$0, Arrays.stream(jf.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dte a(String $$0, jf... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dte a(String $$0, Collection<jf> $$1) {
      return new dte($$0, $$1);
   }
}
