import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dvi extends dvm<jj> {
   protected dvi(String $$0, Collection<jj> $$1) {
      super($$0, jj.class, $$1);
   }

   public static dvi a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dvi a(String $$0, Predicate<jj> $$1) {
      return a($$0, Arrays.stream(jj.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dvi a(String $$0, jj... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dvi a(String $$0, Collection<jj> $$1) {
      return new dvi($$0, $$1);
   }
}
