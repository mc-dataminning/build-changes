import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dtf extends dtj<jf> {
   protected dtf(String $$0, Collection<jf> $$1) {
      super($$0, jf.class, $$1);
   }

   public static dtf a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dtf a(String $$0, Predicate<jf> $$1) {
      return a($$0, Arrays.stream(jf.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dtf a(String $$0, jf... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dtf a(String $$0, Collection<jf> $$1) {
      return new dtf($$0, $$1);
   }
}
